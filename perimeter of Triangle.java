public class Triangle
{
	    int base;
	    int perpendicular;
	    int hypotenuse;
	    
	    Triangle(int a, int b, int c)
	    {
	    	base=a;
	    	perpendicular=b;
	    	hypotenuse=c;
	    }
	    int perimeter()
	    {
	    	return (a + b + c)
	    }

	    
             public satic void main(String[]args)
            {
              Triangle t=new Traingle(12,35,20);
              System.out.println("perimeter=" + t.perimeter());
}
