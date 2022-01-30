package codes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/Currency")
public class Ctrl {
	Currency currency;

	@RequestMapping("/toInr")
	public String toInr(double value, String str) {
		double answers = currency.toInr(value, str);

		return "currency?value=" + answers;
	}
	@RequestMapping(path="currencyprocess",method=RequestMethod.POST)
	public String toInr(HttpServletRequest request) {
		String value=request.getParameter("from");
		System.out.println("user has entered this value"+ value);
		return "";
	}
}