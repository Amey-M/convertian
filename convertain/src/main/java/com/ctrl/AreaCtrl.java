package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.SimpleModel;

import codes.Area;
@Controller
public class AreaCtrl {
	@RequestMapping(path="areaprocess")
	public String toMm2(Model model, @RequestParam("from") double uservalue,@RequestParam("area") String from,@RequestParam("areato") String to) {
		
		System.out.println("user has entered this value "+ uservalue+"   "+"option"+"   "+from+"  "+"optionsecond"+" "+to);
		SimpleModel s= new SimpleModel();
		s.setFrom(uservalue);
		Area a=new Area();
		double result = 1;
		if(to.equals("mm2"))
		{
			result=a.toMm2(uservalue,from);
			
		}
		else if(to.equals("cm2"))
		{
			result=a.toCm2(uservalue,from);
			
		}
		else if(to.equals("km2"))
		{
			result=a.toKm2(uservalue,from);
			
		}
		else if(to.equals("acre"))
		{
			result=a.toAcre(uservalue,from);
			
		}
		else if(to.equals("hect"))
		{
			result=a.toHect(uservalue,from);
			
		}
	
		
		
		System.out.println("value after conversion is:"+result);
		s.setTo(result);
		
		/*model.addAttribute("model",s);*/
		model.addAttribute("to",result);
		model.addAttribute("from",uservalue);
		model.addAttribute("area",from);
		model.addAttribute("areato",to);
		
		
	
		return "areaSuc";
}
}
