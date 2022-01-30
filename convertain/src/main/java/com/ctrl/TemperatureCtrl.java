package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.SimpleModel;

import codes.Temperature;

@Controller
public class TemperatureCtrl {
	@RequestMapping(path="temperatureprocess")
	public String tok(Model model, @RequestParam("from") double uservalue,@RequestParam("temperature") String from,@RequestParam("temperatureto") String to) {
		
		System.out.println("user has entered this value "+ uservalue+"   "+"option"+"   "+from+"  "+"optionsecond"+" "+to);
		SimpleModel s= new SimpleModel();
		s.setFrom(uservalue);
		Temperature t=new Temperature();
		double result = 1;
		if(to.equals("c"))
		{
			result=t.toC(uservalue,from);
			
		}
		else if(to.equals("f"))
		{
			result=t.toF(uservalue,from);
			
		}
		else if(to.equals("k"))
		{
			result=t.toK(uservalue,from);
			
		}
		
		System.out.println("value after conversion is:"+result);
		s.setTo(result);
		
		/*model.addAttribute("model",s);*/
		model.addAttribute("to",result);
		model.addAttribute("from",uservalue);
		model.addAttribute("temperature",from);
		model.addAttribute("temperatureto",to);
		
		return "temperatureSuc";
	}
}