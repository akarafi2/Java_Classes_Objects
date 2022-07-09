
public class Lawnmower {

	private String brandName;
	private String type;
	private int engineSize;

	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public int getEngineSize() {
		return engineSize;
	}
	
	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
	
	public Lawnmower()
	{
		
	}
	
	public Lawnmower(String brandName, String type)
	{
		this.setBrandName(brandName);
		this.setType(type);
	}
	
	public Lawnmower(String brandName, String type, int engineSize)
	{
		this.setBrandName(brandName);
		this.setType(type);
		this.setEngineSize(engineSize);
	}
	
	public boolean isRunning()
	{
		return true;
	}
	
	public String modelNumber()
	{
		return "My model number is located below the gas tank";
	}

	
	
}
