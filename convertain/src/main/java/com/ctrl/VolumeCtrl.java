package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.SimpleModel;


import codes.Volume;

@Controller
public class VolumeCtrl {
	@RequestMapping(path="volumeprocess")
	public String toInr(Model model, @RequestParam("from") double uservalue,@RequestParam("volume") String from,@RequestParam("volumeto") String to) {
		
		System.out.println("user has entered this value "+ uservalue+"   "+"option"+"   "+from+"  "+"optionsecond"+" "+to);
		SimpleModel s= new SimpleModel();
		s.setFrom(uservalue);
		Volume v=new Volume();
		double result = 1;
		if(to.equals("l"))
		{
			result=v.toL(uservalue,from);
			
		}
		else if(to.equals("ml"))
		{
			result=v.toMl(uservalue,from);
			
		}
		else if(to.equals("gal"))
		{
			result=v.toGal(uservalue,from);
			
		}
		else if(to.equals("cc"))
		{
			result=v.toCc(uservalue,from);
			
		}
		else if(to.equals("m3"))
		{
			result=v.toM3(uservalue,from);
			
		}
		else if(to.equals("kl"))
		{
			result=v.toKl(uservalue,from);
			
		}
		
		System.out.println("value after conversion is:"+result);
		s.setTo(result);
		
		/*model.addAttribute("model",s);*/
		model.addAttribute("to",result);
		model.addAttribute("from",uservalue);
		model.addAttribute("volume",from);
		model.addAttribute("volumeto",to);
			
		return "volumeSuc";
	}
}	