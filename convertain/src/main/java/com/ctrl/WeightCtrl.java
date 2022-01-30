package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.SimpleModel;

import codes.Weight;

@Controller

public class WeightCtrl 
{
	@RequestMapping(path="weightprocess")
	public String toInr(Model model, @RequestParam("from") double uservalue,@RequestParam("weight") String from,@RequestParam("weightto") String to) {
		
		System.out.println("user has entered this value "+ uservalue+"   "+"option"+"   "+from+"  "+"optionsecond"+" "+to);
		SimpleModel s= new SimpleModel();
		s.setFrom(uservalue);
		Weight w=new Weight();
		double result = 1;
		if(to.equals("mg"))
		{
			result=w.toMg(uservalue,from);
			
		}
		else if(to.equals("g"))
		{
			result=w.toG(uservalue,from);
			
		}
		else if(to.equals("kg"))
		{
			result=w.toKg(uservalue,from);
			
		}
		else if(to.equals("ton"))
		{
			result=w.toTon(uservalue,from);
			
		}
		else if(to.equals("lbs"))
		{
			result=w.toPd(uservalue,from);
			
		}
		else if(to.equals("quint"))
		{
			result=w.toQunit(uservalue,from);
			
		}
		
		System.out.println("value after conversion is:"+result);
		s.setTo(result);
		
		/*model.addAttribute("model",s);*/
		model.addAttribute("to",result);
		model.addAttribute("from",uservalue);
		model.addAttribute("weight",from);
		model.addAttribute("weightto",to);
		
		return "weightSuc";
	}
}