package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.SimpleModel1;

import codes.Number_System;

@Controller

public class Number_SystemCtrl {
	@RequestMapping(path="numbersystemprocess")
	public String tonum(Model model, @RequestParam("from") String uservalue,@RequestParam("numbersystem") String from,@RequestParam("numbersystemto") String to) {
		
		System.out.println("user has entered this value "+ uservalue+"   "+"option"+"   "+from+"  "+"optionsecond"+" "+to);
		SimpleModel1 s= new SimpleModel1();
		s.setFrom(uservalue);
		Number_System n=new Number_System();
		String result ="1";
		if(to.equals("bin"))
		{
			result=n.toBinary(uservalue,from);
			
		}
		else if(to.equals("dec"))
		{
			result=n.toDecimal(uservalue,from);
			
		}
		else if(to.equals("oct"))
		{
			result=n.toOctal(uservalue,from);
			
		}
		else if(to.equals("hex"))
		{
			result=n.toHexa(uservalue,from);
			
		}
		
		System.out.println("value after conversion is:"+result);
		s.setTo(result);
		
		/*model.addAttribute("model",s);*/
		model.addAttribute("to",result);
		model.addAttribute("from",uservalue);
		model.addAttribute("numbersystem",from);
		model.addAttribute("numbersystemto",to);
		
	
		return "numbersystemSuc";
	}

	
}