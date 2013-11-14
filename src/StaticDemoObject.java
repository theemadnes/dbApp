
public class StaticDemoObject {
	
	// instance variables
	private String property1;
	private String property2;
	private int property3;
	
	// class variables
	private static int instanceCount = 0;
	
	public StaticDemoObject(String property1, String property2)
	{
		this(property1, property2, 0);
	}
	
	public StaticDemoObject(String property1, String property2, int property3)
	{
		this.property1 = property1;
		this.property2 = property2;
		this.property3 = property3;
		
		// each instance that's created, bump up the count by one
		instanceCount++;
	}
	
	public StaticDemoObject(StaticDemoObject objToCopy)
	{
		this.property1 = objToCopy.getProperty1();
		this.property2 = objToCopy.getProperty2();
		this.property3 = objToCopy.property3;
		
	}
	
	public String getProperty1 ()
	{
		return property1;
	}

	public String getProperty2 ()
	{
		return property2;
	}

	public int getProperty3 ()
	{
		return property3;
	}

	public void setProperty1 (String property1)
	{
		this.property1 = property1;
	}

	public void setProperty2 (String property2)
	{
		this.property2 = property2;
	}

	public void setProperty3 (int property3)
	{
		this.property3 = property3;
	}
	
	public int getInstanceCount ()
	{
		return instanceCount;
	}
	
	public static int testStaticMethod (int testVal)
	{
		return 10 * testVal;
	}
	
	public String toString()
	{
		String str = "Property1: " + property1 + " Property 2: " + property2 + " Property 3: " + property3; 
		
		return str;
	}
	
	public boolean equals(StaticDemoObject otherObject)
	{
		boolean isEquals;
		
		if (property1.equals(otherObject.getProperty1()) && property2.equals(otherObject.property2) && (property3 == otherObject.property3))
			isEquals = true;
		else
			isEquals = false;
		
		return isEquals;
	}
	
	public StaticDemoObject copy ()
	{
		StaticDemoObject copyObject = new StaticDemoObject(property1, property2, property3);
		return copyObject;
	}

}
