package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.SimpleModel;

import codes.Power;

@Controller
public class PowerCtrl {
	@RequestMapping(path="powerprocess")
	public String topw(Model model, @RequestParam("from") double uservalue,@RequestParam("power") String from,@RequestParam("powerto") String to) {
		
		System.out.println("user has entered this value "+ uservalue+"   "+"option"+"   "+from+"  "+"optionsecond"+" "+to);
		SimpleModel s= new SimpleModel();
		s.setFrom(uservalue);
		Power p=new Power();
		double result = 1;
		if(to.equals("mw"))
		{
			result=p.toMw(uservalue,from);
			
		}
		else if(to.equals("w"))
		{
			result=p.toW(uservalue,from);
			
		}
		else if(to.equals("gw"))
		{
			result=p.toGw(uservalue,from);
			
		}
		else if(to.equals("tw"))
		{
			result=p.toTw(uservalue,from);
			
		}
		else if(to.equals("hp"))
		{
			result=p.toHp(uservalue,from);
			
		}
		
		System.out.println("value after conversion is:"+result);
		s.setTo(result);
		
		/*model.addAttribute("model",s);*/
		model.addAttribute("to",result);
		model.addAttribute("from",uservalue);
		model.addAttribute("power",from);
		model.addAttribute("powerto",to);
	
		return "powerSuc";
	}

}