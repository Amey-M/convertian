package convertain;

class Area {
	static double tomm(double v,String key)
	{
		if(key=="cm")
		{
			return v/10000;
		}
		else if(key=="km")
		{
			return v*1000000;
		}
		else if(key=="acre")
		{
			return v*4047;
		}
		else if(key=="hect")
		{
			return v*10000;
		}
		return 0.0;
	}
	static double tocm(double v,String key)
	{
		if(key=="mm")
		{
			return v*10000;
		}
		else if(key=="km")
		{
			return v*10000000000.0;
		}
		else if(key=="acre")
		{
			return v*4.047*10000000;
		}
		else if(key=="hect")
		{
			return v*100000000;
		}
		return 0.0;
	}
	static double tokm(double v,String key)
	{
		if(key=="mm")
		{
			return v/1000000;
		}
		else if(key=="cm")
		{
			return v/10000000000.0;
		}
		else if(key=="acre")
		{
			return v/247;
		}
		else if(key=="hect")
		{
			return v/100;
		}
		return 0.0;
	}
	static double toacre(double v,String key)
	{
		if(key=="mm")
		{
			return v/4047;
		}
		else if(key=="cm")
		{
			return v/(4.047*10000000);
		}
		else if(key=="km")
		{
			return v*247;
		}
		else if(key=="hect")
		{
			return v*2.471;
		}
		return 0.0;
	}
	static double tohect(double v,String key)
	{
		if(key=="mm")
		{
			return v/10000;
		}
		else if(key=="cm")
		{
			return v/100000000;
		}
		else if(key=="km")
		{
			return v*100;
		}
		else if(key=="acre")
		{
			return v/2.471;
		}
		return 0.0;
	}
public static void main(String args[])
{
  System.out.println(tohect(1000,"acre"));
}

}