package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.SimpleModel;

import codes.Angle;


@Controller
public class AngleCtrl {
	@RequestMapping(path="angleprocess")
	public String toInr(Model model, @RequestParam("from") double uservalue,@RequestParam("angle") String from,@RequestParam("angleto") String to) {
		
		System.out.println("user has entered this value "+ uservalue+"   "+"option"+"   "+from+"  "+"optionsecond"+" "+to);
		SimpleModel s= new SimpleModel();
		s.setFrom(uservalue);
		Angle a=new Angle();
		double result = 1;
		if(to.equals("deg"))
		{
			result=a.toDegree(uservalue,from);
			
		}
		else if(to.equals("rev"))
		{
			result=a.toRev(uservalue,from);
			
		}
		else if(to.equals("rad"))
		{
			result=a.toRadian(uservalue,from);
			
		}
		
		System.out.println("value after conversion is:"+result);
		s.setTo(result);
		
		/*model.addAttribute("model",s);*/
		model.addAttribute("to",result);
		model.addAttribute("from",uservalue);
		model.addAttribute("angle",from);
		model.addAttribute("angleto",to);
		return "angleSuc";
	}

}