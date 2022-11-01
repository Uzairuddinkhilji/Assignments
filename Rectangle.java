public  class Rectangle
{
	    int length,width;
	    Rectangle() 
	    {
	    	length= 12;
	    	width= 3;
	    }
	    Rectangle(int lnt,int wid)
	    {
	    	length= lnt;
	    	width= wid;
	    }
	    int area()
	    {
	    	return width*length;
	    }
	    int perimeter()
	    {
	    	return 2*(length+width);
	    }
}