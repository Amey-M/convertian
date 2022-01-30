package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.SimpleModel;


import codes.Length;

@Controller
public class LengthCtrl {
	@RequestMapping(path="lengthprocess")
	public String toM(Model model, @RequestParam("from") double uservalue,@RequestParam("Length") String from,@RequestParam("Lengthto") String to) {
		
		System.out.println("user has entered this value "+ uservalue+"   "+"option"+"   "+from+"  "+"optionsecond"+" "+to);
		SimpleModel s= new SimpleModel();
		s.setFrom(uservalue);
		Length l=new Length();
		double result = 1;
		if(to.equals("cm"))
		{
			result=l.toCm(uservalue,from);
			
		}
		else if(to.equals("m"))
		{
			result=l.toM(uservalue,from);
			
		}
		else if(to.equals("km"))
		{
			result=l.toKm(uservalue,from);
			
		}
		else if(to.equals("mile"))
		{
			result=l.toMile(uservalue,from);
			
		}
		else if(to.equals("yard"))
		{
			result=l.toYd(uservalue,from);
			
		}
		else if(to.equals("feet"))
		{
			result=l.toFt(uservalue,from);
			
		}
		else if(to.equals("inch"))
		{
			result=l.toInch(uservalue,from);
			
		}
		else if(to.equals("light"))
		{
			result=l.toLightyear(uservalue,from);
			
		}
		model.addAttribute("to",result);
		model.addAttribute("from",uservalue);
		model.addAttribute("Length",from);
		model.addAttribute("Lengthto",to);

		
		
	
		return "lengthSuc";
	}
}	