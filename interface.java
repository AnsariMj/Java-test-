interface Shape 
{ 
float PI= 3.1415f;
float  findArea();
}
class Circle implements Shape 
{
     int r;
     Circle(int x)
    { 
	r=x; 
    }
     public float findArea()
    {
	return PI * r * r;
    }
}
class interface
{ 
	public static void main (String[] args)
	{
	   Circle c1 = new Circle(3);
	   float area = c1.findArea();
	   System.out.println(" Area = " + area );
	}
}