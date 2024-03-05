package com.student.Controller;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.Entity.Data;
import com.student.Entity.StudentDetails;
import com.student.Entity.SubjectsAndMarks;
import com.student.Entity.TeachersLoginData;
import com.student.Repository.StudentDetailsRepository;
import com.student.Repository.SubjectsAndMarksRepository;
import com.student.Repository.TeachersLoginRepository;

@Controller
public class StudentController {
	@Autowired
	private StudentDetailsRepository stdrepo;   //Here  we inject the StudentDetailsRepository object
	@Autowired
	private TeachersLoginRepository loginrepo;  //Here  we inject the StudentDetailsRepository object
	@Autowired
	private SubjectsAndMarksRepository subjrepo; //Here  we inject the StudentDetailsRepository object

	@GetMapping("/login") // Load the Login Page to Login the Teachers to enter marks
	public String TeacherLogin(Model model)
	{
		return "login";
	}
	@GetMapping("/registration") //Load the TeacherRegistration form for Teacher Registration 
	public String TeacherRegistration(Model model)
	{
		model.addAttribute("tdata",new TeachersLoginData());
		return "TeacherRegistration";
	}
	@GetMapping("/loginvalidation") //It check the Login Data If Valid or Invalid
	public String LoginValidation(@RequestParam("gmail")String gmail,@RequestParam("password") String password,Model model)
	{
		TeachersLoginData d=loginrepo.Validation(gmail, password);
		if(d !=null)
		{
			return "MarksFillingForm";
		}
		else
		{
			model.addAttribute("msg","Invalid gmail or password");
			return "login";
		}
	}
	@PostMapping("insertlogindata") //It is Used to save the TeachersLogin data These can be done if TeacherLogin is not exist
	public String InsertTeachersLoginData(@ModelAttribute("tdata")TeachersLoginData data,Model model)
	{
		loginrepo.save(data);
		return "redirect:/login";
	}
    @PostMapping("/insertdata") //These is used to Insert the student marks based on subject wise Every subject be evaluated 100 marks
    public String Insert(@RequestParam("studentname")String studentname,
    		@RequestParam("rollnumber") String rollnumber,@RequestParam("subject1") String subject1,
    		@RequestParam("subject2") String subject2,@RequestParam("subject3") String subject3,
    		@RequestParam("subject4")String subject4,@RequestParam("subject5") String subject5,
    		@RequestParam("subject6") String subject6,
    		@RequestParam("marks1") String marks1,@RequestParam("marks2") String marks2,@RequestParam("marks3") String marks3,
    		@RequestParam("marks4") String marks4,@RequestParam("marks5") String marks5,@RequestParam("marks6") String marks6,
    		@RequestParam("totalMarks1") String totalMarks1,@RequestParam("totalMarks2") String totalMarks2,@RequestParam("totalMarks3") String totalMarks3,
    		@RequestParam("totalMarks4") String totalMarks4,@RequestParam("totalMarks5") String totalMarks5,@RequestParam("totalMarks6") String totalMarks6,
    		Model model)
    {
    	Double Marks1=Double.parseDouble(marks1);
    	Double Marks2=Double.parseDouble(marks2);
    	Double Marks3=Double.parseDouble(marks3);
    	Double Marks4=Double.parseDouble(marks4);
    	Double Marks5=Double.parseDouble(marks5);
    	Double Marks6=Double.parseDouble(marks6);
    	
    	Double TotalMarks1=Double.parseDouble(totalMarks1);
    	Double TotalMarks2=Double.parseDouble(totalMarks2);
    	Double TotalMarks3=Double.parseDouble(totalMarks3);
    	Double TotalMarks4=Double.parseDouble(totalMarks4);
    	Double TotalMarks5=Double.parseDouble(totalMarks5);
    	Double TotalMarks6=Double.parseDouble(totalMarks6);
    	
    	
    	
    	
    	
    	SubjectsAndMarks sam1=new SubjectsAndMarks();
    	sam1.setSno(sam1.getSno());
    	sam1.setSubjectname(subject1);
    	sam1.setObtainedmarks(Marks1);
    	sam1.setTotalmarks(TotalMarks1);
    	if(Marks1<45)
        {
   	      sam1.setSubjectwisegrade("F");
        }else if(Marks1>=45 && Marks1<=65)
        {
         sam1.setSubjectwisegrade("E");
        }else if(Marks1>=65 && Marks1<=70)
        {
         sam1.setSubjectwisegrade("D");
        }else if(Marks1>=70 && Marks1<=75)
        {
        	sam1.setSubjectwisegrade("C");
        }else if(Marks1>=75 &&Marks1<=80)
        {
        	sam1.setSubjectwisegrade("B");
        }else if(Marks1>=80 && Marks1<=100)
        {
        	sam1.setSubjectwisegrade("A");
        }
    		
    		
    		
    		
    		
    		
    	SubjectsAndMarks sam2=new SubjectsAndMarks();
    	sam2.setSno(sam2.getSno());
    	sam2.setSubjectname(subject2);
    	sam2.setObtainedmarks(Marks2);
    	sam2.setTotalmarks(TotalMarks2);
    	
    	if(Marks2<45)
        {
   	      sam2.setSubjectwisegrade("F");
        }else if(Marks2>=45 && Marks2<=65)
        {
         sam2.setSubjectwisegrade("E");
        }else if(Marks2>=65 && Marks2<=70)
        {
         sam2.setSubjectwisegrade("D");
        }else if(Marks2>=70 && Marks2<=75)
        {
        	sam2.setSubjectwisegrade("C");
        }else if(Marks2>=75 &&Marks2<=80)
        {
        	sam2.setSubjectwisegrade("B");
        }else if(Marks2>=80 && Marks2<=100)
        {
        	sam2.setSubjectwisegrade("A");
        }
    	
    	
    	SubjectsAndMarks sam3=new SubjectsAndMarks();
    	sam3.setSno(sam3.getSno());
    	sam3.setSubjectname(subject3);
    	sam3.setObtainedmarks(Marks3);
    	sam3.setTotalmarks(TotalMarks3);
    	
    	if(Marks3<45)
        {
   	      sam3.setSubjectwisegrade("F");
        }else if(Marks3>=45 && Marks3<=65)
        {
         sam3.setSubjectwisegrade("E");
        }else if(Marks3>=65 && Marks3<=70)
        {
         sam3.setSubjectwisegrade("D");
        }else if(Marks3>=70 && Marks3<=75)
        {
        	sam3.setSubjectwisegrade("C");
        }else if(Marks3>=75 &&Marks3<=80)
        {
        	sam3.setSubjectwisegrade("B");
        }else if(Marks3>=80 && Marks3<=100)
        {
        	sam3.setSubjectwisegrade("A");
        }
    	
    	
    	SubjectsAndMarks sam4=new SubjectsAndMarks();
    	sam4.setSno(sam4.getSno());
    	sam4.setSubjectname(subject4);
    	sam4.setObtainedmarks(Marks4);
    	sam4.setTotalmarks(TotalMarks4);
    	
    	if(Marks4<45)
        {
   	      sam4.setSubjectwisegrade("F");
        }else if(Marks4>=45 && Marks4<=65)
        {
         sam4.setSubjectwisegrade("E");
        }else if(Marks4>=65 && Marks4<=70)
        {
         sam4.setSubjectwisegrade("D");
        }else if(Marks4>=70 && Marks4<=75)
        {
        	sam4.setSubjectwisegrade("C");
        }else if(Marks4>=75 &&Marks4<=80)
        {
        	sam4.setSubjectwisegrade("B");
        }else if(Marks4>=80 && Marks4<=100)
        {
        	sam4.setSubjectwisegrade("A");
        }
    	
    	
    	
    	SubjectsAndMarks sam5=new SubjectsAndMarks();
    	sam5.setSno(sam5.getSno());
    	sam5.setSubjectname(subject5);
    	sam5.setObtainedmarks(Marks5);
    	sam5.setTotalmarks(TotalMarks5);
    	
    	
    	if(Marks5<45)
        {
   	      sam5.setSubjectwisegrade("F");
        }else if(Marks5>=45 && Marks5<=65)
        {
         sam5.setSubjectwisegrade("E");
        }else if(Marks5>=65 && Marks5<=70)
        {
         sam5.setSubjectwisegrade("D");
        }else if(Marks5>=70 && Marks5<=75)
        {
        	sam5.setSubjectwisegrade("C");
        }else if(Marks5>=75 &&Marks5<=80)
        {
        	sam5.setSubjectwisegrade("B");
        }else if(Marks5>=80 && Marks5<=100)
        {
        	sam5.setSubjectwisegrade("A");
        }
    	
    	
    	
    	SubjectsAndMarks sam6=new SubjectsAndMarks();
    	sam6.setSno(sam6.getSno());
    	sam6.setSubjectname(subject6);
    	sam6.setObtainedmarks(Marks6);
    	sam6.setTotalmarks(TotalMarks6);
    	
    	if(Marks6<45)
        {
   	      sam6.setSubjectwisegrade("F");
        }else if(Marks6>=45 && Marks6<=65)
        {
         sam6.setSubjectwisegrade("E");
        }else if(Marks6>=65 && Marks6<=70)
        {
         sam6.setSubjectwisegrade("D");
        }else if(Marks6>=70 && Marks6<=75)
        {
        	sam6.setSubjectwisegrade("C");
        }else if(Marks6>=75 &&Marks6<=80)
        {
        	sam6.setSubjectwisegrade("B");
        }else if(Marks6>=80 && Marks6<=100)
        {
        	sam6.setSubjectwisegrade("A");
        }
    	
    	
    	
    	StudentDetails details=new StudentDetails();
    	details.setRollnumber(rollnumber);
    	details.setStudentname(studentname);
    	List<SubjectsAndMarks> list=new ArrayList<>();
    	list.add(sam1);
    	list.add(sam2);
    	list.add(sam3);
    	list.add(sam4);
    	list.add(sam5);
    	list.add(sam6);
    	details.setData(list);
    	int count=0;
    	for(SubjectsAndMarks sub:list)
    	{
    		
    		if(sub.getObtainedmarks()>35)
    		{
    			count++;
    		}
    		
    			
    	}
    	if(count==6)
    	{
    		DecimalFormat df=new DecimalFormat("#.##");
    	Double p=  ((Marks1+Marks2+Marks3+Marks4+Marks5+Marks6)/(600))*100;
    	String percentage=df.format(p);
    	Double per=Double.parseDouble(percentage);
    	
        details.setPercentage(per);
            if(per<45)
             {
        	    details.setGrade("F");
             }else if(per>=45 && per<=65)
             {
            	 details.setGrade("E");
             }else if(per>=65 && per<=70)
             {
            	 details.setGrade("D");
             }else if(per>=70 && per<=75)
             {
            	 details.setGrade("C");
             }else if(per>=75 &&per<=80)
             {
            	 details.setGrade("B");
             }else if(per>=80 && per<=100)
             {
            	 details.setGrade("A");
             }
    	}
    	else
    	{
    		details.setPercentage(0.0);
    		details.setGrade("F");
    	}
    	stdrepo.save(details);
    	model.addAttribute("msg", "Data saved");		
    	return "marksFillingForm";
    }
    @GetMapping("/getData") //These is used to get the student details
    public String GetData(Model model)
    {
    	List<Data>dlist=stdrepo.StudentMarksData();
    	String stname=dlist.get(0).getStudentname();
    	String srollno=dlist.get(0).getRollnumber();
    	model.addAttribute("listofData", dlist);
    	model.addAttribute("stname", stname);
    	model.addAttribute("srollno", srollno);
    	System.out.println(dlist);
    	
    	return "getStudentData";
    }
    @PostMapping("/delete") //These is used to Delete the data
    public String delete(@RequestParam("sno") Integer sno,Model model)
    {
    	subjrepo.deleteById(sno);
    	List<Data> dlist=stdrepo.StudentMarksData();
    	String stname=dlist.get(0).getStudentname();
    	String srollno=dlist.get(0).getRollnumber();
    	model.addAttribute("listofData", dlist);
    	model.addAttribute("stname", stname);
    	model.addAttribute("srollno", srollno);
    	
    	return "getStudentData";
    }
    @PostMapping("/edit") //These is used to edit the existing data
    public String editSubject(@RequestParam("sno") Integer sno, Model model) {
        Optional<SubjectsAndMarks> subjectOptional = subjrepo.findById(sno);
        if (subjectOptional.isPresent()) {
            SubjectsAndMarks subject = subjectOptional.get();
            model.addAttribute("subject", subject);
            return "edit"; // This should be the name of your edit HTML page
        } 
        else
        {
        	return "edit";
        }
    }

    @PostMapping("/update") // These is used to update the data
    public String updateSubject(@ModelAttribute("subject") SubjectsAndMarks subject) {
        // Perform validation and update subject details in the database
    	SubjectsAndMarks updateddata=new SubjectsAndMarks();
    	updateddata.setSno(subject.getSno());
    	updateddata.setSubjectname(subject.getSubjectname());
    	updateddata.setObtainedmarks(subject.getObtainedmarks());
    	updateddata.setTotalmarks(subject.getTotalmarks());
    	 if(subject.getObtainedmarks()<45)
         {
    		 updateddata.setSubjectwisegrade("F");
         }else if(subject.getObtainedmarks()>=45 && subject.getObtainedmarks()<=65)
         {
        	 updateddata.setSubjectwisegrade("E");
         }else if(subject.getObtainedmarks()>=65 && subject.getObtainedmarks()<=70)
         {
        	 updateddata.setSubjectwisegrade("D");
         }else if(subject.getObtainedmarks()>=70 && subject.getObtainedmarks()<=75)
         {
        	 updateddata.setSubjectwisegrade("C");
         }else if(subject.getObtainedmarks()>=75 &&subject.getObtainedmarks()<=80)
         {
        	 updateddata.setSubjectwisegrade("B");
         }else if(subject.getObtainedmarks()>=80 && subject.getObtainedmarks()<=100)
         {
        	 updateddata.setSubjectwisegrade("A");
         }
        
        subjrepo.save(updateddata);
        return "redirect:/getData"; // Redirect to the page displaying all subjects
    }
    @PostMapping("/search") // Through this we can search Data based on rollNumber
    public String SearchData(@RequestParam("keyword") String keyword,Model model)
    {
    	List<Data> dlist=stdrepo.searchByName(keyword);
    	String stname=dlist.get(0).getStudentname();
    	String srollno=dlist.get(0).getRollnumber();
    	String grade=dlist.get(0).getGrade();
    	Double Percentage=dlist.get(0).getPercentage();
    	List<String> allgrades=new ArrayList<>();
    	for(Data d:dlist)
    	{
    		allgrades.add(d.getSubjectwisegrade());
    	
    	}
    	if(allgrades.contains("F"))
    	{
    		model.addAttribute("overallgrade", "FAIL");
    		model.addAttribute("percentage", "FAIL");
    	}else
    		{
    			model.addAttribute("overallgrade", grade);
        		model.addAttribute("percentage", Percentage);
    		}
    	
    	
    		
    	
    	model.addAttribute("listofData", dlist);
    	model.addAttribute("stname", stname);
    	model.addAttribute("srollno", srollno);
    	
    	System.out.println(dlist);
    	return "Search";
    	
    }

}
