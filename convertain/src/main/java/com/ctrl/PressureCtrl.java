package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.SimpleModel;

import codes.Pressure;
@Controller
public class PressureCtrl {
	@RequestMapping(path="pressureprocess")
	public String topa(Model model, @RequestParam("from") double uservalue,@RequestParam("pressure") String from,@RequestParam("pressureto") String to) {
		
		System.out.println("user has entered this value "+ uservalue+"option"+from+"option2"+to);

		SimpleModel s= new SimpleModel();
		s.setFrom(uservalue);
		Pressure p=new Pressure();
		double result = 1;
		if(to.equals("psi"))
		{
			result=p.toPsi(uservalue,from);
			
		}
		else if(to.equals("pa"))
		{
			result=p.toPa(uservalue,from);
			
		}
		else if(to.equals("kpa"))
		{
			result=p.toKpa(uservalue,from);
			
		}
		else if(to.equals("barr"))
		{
			result=p.toBarr(uservalue,from);
			
		}
		else if(to.equals("atm"))
		{
			result=p.toAtm(uservalue,from);
			
		}
		else if(to.equals("torr"))
		{
			result=p.toTorr(uservalue,from);
			
		}
		
		System.out.println("value after conversion is:"+result);
		s.setTo(result);
		
		/*model.addAttribute("model",s);*/
		model.addAttribute("to",result);
		model.addAttribute("from",uservalue);
		model.addAttribute("pressure",from);
		model.addAttribute("pressureto",to);
		
		return "pressureSuc";
	}
}	