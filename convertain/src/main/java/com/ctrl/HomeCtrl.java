package com.ctrl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {
	@RequestMapping("/home")
	public String home(Model model)
	{
		return "home";
	}
	@RequestMapping("/currency")
	public String currency()
	{
		return "currency";
	}
	@RequestMapping("/length")
	public String length()
	{
		return "length";
	}
	@RequestMapping("/area")
	public String area()
	{
		return "area";
	}
	@RequestMapping("/volume")
	public String volume()
	{
		return "volume";
	}
	@RequestMapping("/temperature")
	public String temperature()
	{
		return "temperature";
	}
	@RequestMapping("/pressure")
	public String pressure()
	{
		return "pressure";
	}
	@RequestMapping("/numbersystems")
	public String numberssystems()
	{
		return "numbersystems";
	}
	@RequestMapping("/power")
	public String power()
	{
		return "power";
	}
	@RequestMapping("/angle")
	public String ange()
	{
		return "angle";
	}
	@RequestMapping("/weight")
	public String weight()
	{
		return "weight";
	}
	@RequestMapping("/imgtopdf")
	public String imgtopdf()
	{
		return "imgtopdf";
	}
	@RequestMapping("/signin")
	public String Signin()
	{
		System.out.println("hi");
		return "Signin";
	}
	
}

