package codes;

public class Number_System {
	
	
	public String toBinary(String v,String key)
	{
		if(key.equals("dec"))
		{
			return Integer.toBinaryString(Integer.valueOf(v));
		}

		else if(key.equals("oct"))
		{
			int a =Integer.parseInt(v, 8);
			return Integer.toBinaryString(a);
		}
		
		else if(key.equals("hex"))
		{
		String digits = "0123456789ABCDEF";
		v = v.toUpperCase();
        int val = 0;
        for (int i = 0; i < v.length(); i++)
        {
            char c = v.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        
        return Integer.toBinaryString(val);
		}
        
		
	return null;
	}
	public String toDecimal(String v,String key)
	{
		if(key.equals("bin"))
		{
			return Integer.toString(Integer.parseInt(v,2));
			
		}
		else if(key.equals("oct"))
		{
			return Integer.toString(Integer.parseInt(v,8));  
		}
		else if(key.equals("hex"))
		{
			return Integer.toString(Integer.parseInt(v,16));
		}
		return null;
	}
	
	
	
	
	
	public String toOctal(String v,String key)
	{
		if(key.equals("bin"))
		{
			int bnum = Integer.parseInt(v, 2);
			String str = Integer.toOctalString(bnum);
			return str;
		}
		else if(key.equals("dec"))
		{
			return Integer.toOctalString(Integer.valueOf(v)); 
		}
		else if(key.equals("hex"))
		{	
			int decimal = Integer.parseInt(v, 16);
            String octal = Integer.toOctalString(decimal);
            return octal;
		}
		return null;
	}
	public String toHexa(String v,String key)
	{
		if(key.equals("bin"))
		{
			int num = Integer.parseInt(v, 2);
			return (Integer.toHexString(num)).toUpperCase();
		}
		else if(key.equals("dec"))
		{
			return String.valueOf((Integer.parseInt(v,16))); 
		}
		else if(key.equals("oct"))
		{	
        	int decnum = Integer.parseInt(v, 8);
		    return Integer.toHexString(decnum).toUpperCase();
		}
		return null;
	}
}