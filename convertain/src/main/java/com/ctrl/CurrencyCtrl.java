package com.ctrl;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.SimpleModel;

import codes.Currency;
@Controller
public class CurrencyCtrl {
	@RequestMapping(path="currencyprocess")
	public String toInr(Model model, @RequestParam("from") double uservalue,@RequestParam("currency") String from,@RequestParam("currencyto") String to) {
		
		System.out.println("user has entered this value "+ uservalue+"   "+"option"+"   "+from+"  "+"optionsecond"+" "+to);
		SimpleModel s= new SimpleModel();
		s.setFrom(uservalue);
		Currency c=new Currency();
		double result = 1;
		if(to.equals("inr"))
		{
			result=c.toInr(uservalue,from);
			
		}
		else if(to.equals("usd"))
		{
			result=c.toUsd(uservalue,from);
			
		}
		else if(to.equals("eur"))
		{
			result=c.toEur(uservalue,from);
			
		}
		else if(to.equals("cad"))
		{
			result=c.toCad(uservalue,from);
			
		}
		else if(to.equals("aed"))
		{
			result=c.toAed(uservalue,from);
			
		}
		else if(to.equals("chf"))
		{
			result=c.toChf(uservalue,from);
			
		}
		else if(to.equals("jpy"))
		{
			result=c.toJpy(uservalue,from);
			
		}
		else if(to.equals("aud"))
		{
			result=c.toAud(uservalue,from);
			
		}
		else if(to.equals("gbp"))
		{
			result=c.toGbp(uservalue,from);
			
		}
		
		else if(to.equals("zar"))
		{
			result=c.toZar(uservalue,from);
			
		}
		
		
		System.out.println("value after conversion is:"+result);
		s.setTo(result);
		
		/*model.addAttribute("model",s);*/
		model.addAttribute("to",result);
		model.addAttribute("from",uservalue);
		model.addAttribute("currency",from);
		model.addAttribute("currencyto",to);
		
		
	

		
	
		return "currencySuc";
	}
}	