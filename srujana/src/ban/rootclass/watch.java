package ban.rootclass;

public class watch 
{
	int hour;
	int minute;
	int seconds;
	
	public watch(int hour,int minute,int seconds)
	{
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}
	
	@override
	public boolean equals(Object Obj)
	{
		watch w = (watch) Obj;
		return this.hour == (w.hour)&& this.minute == (w.minute)&& this.seconds == (w.seconds);
	}
	
	@override
	public String toString()
	{
		return "hour = "+this.hour+"minute = "+this.minute+"seconds = "+seconds;
	}

}
