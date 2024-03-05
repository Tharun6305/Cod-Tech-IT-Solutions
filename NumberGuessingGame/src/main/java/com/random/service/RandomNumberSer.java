package com.random.service;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

@Service
public class RandomNumberSer {
   public Integer findRandom()
   {
	   Integer randnumber=ThreadLocalRandom.current().nextInt(1,100);
	   return randnumber;
   }
}
