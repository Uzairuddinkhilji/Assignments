public class Circle
{
	    float radius;
	    Circle()
	    {
	    	radius= 4.0f;
	    }
	    Circle(float radius)
	    {
	    	this.radius= radius;
	    }
	    float area()
	    {
	    	return(float)Math.PI*(float)Math.pow(radius,2);
	    }
	    float circumference()
	    {
	    	return 2*22/7*radius;
	    }
}