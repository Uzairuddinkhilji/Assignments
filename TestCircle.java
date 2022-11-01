public class TestCircle
{
	 public static void main(String[] args) 
	  {
	  	Circle cobj= new Circle();
	  	System.out.println("Area="+ cobj.area());
	  	System.out.println("Circumference="+ cobj.circumference());
	  	Circle cobj2= new Circle(5.4f);
	  	System.out.println("Area="+ cobj2.area());
	  	System.out.println("Circumference="+ cobj2.circumference());
	    }
}