
public class Pet {

	private String name;
    private int age;
    private String location;
    private String type;
    
    public Pet()
    {

	}
    
    public Pet( String name, int age, String location, String type)
    {
    	this.setName(name);
    	this.setAge(age);
    	this.setLocation(location);
    	this.type = type;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
