package com.random.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.random.service.RandomNumberSer;

@Controller
public class FindRandomNumberController {
	Integer count=0;
	@Autowired
	private RandomNumberSer serv;
	@GetMapping("/startgame")
	public String LoadPage(Model model)
	{
		return"index";
	}
	@PostMapping("/findnumber")
	public String FindRandNumber(@RequestParam("number")String number ,Model model)
	{
		
		Integer input=Integer.parseInt(number);
		Integer randnumber=serv.findRandom();
		if(randnumber==input)
		{
			model.addAttribute("msg", "Congratulations!You guess the number");
			
		}
	    else if(randnumber>input)
		{
			model.addAttribute("msg", "Too High.Try with Low Number!");
			
		}else if(randnumber<input)
		{
			model.addAttribute("msg", "Too Low.Try with High Number!");
			
		}
		count+=1;
		if(count>5)
		{
			model.addAttribute("alert","Game is Over!!!");
			return "endgame";
		}
		return "index";
	}

}
