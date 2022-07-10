
public class MagicCalculator extends Calculator {
	
	public double squareRoot(double num1, double num2)
	{
		return (Math.pow(num1, num2));
	}
	
	public double squareRoot(double num)
	{
		return (Math.sqrt(num));
	}
	
	public double sin(double num)
	{
		return (Math.sin(num));
	}
	
	public double cos(double num)
	{
		return (Math.cos(num));
	}
	
	public double tan(double num)
	{
		return (Math.tan(num));
	}
	
	public long factorial(long num)
	{
				
		for(long i = num-1; i >= 0; i--)
			num = (num * i);
		return num;
		
	}
}
