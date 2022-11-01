class Triangle
{
	int base,perpendicular,hypotenuse;
	Triangle()
	{
		base= 5;
		perpendicular= 10;
		hypotenuse= 7;
	}
	
	Triangle(int bas,int perp,int hyp)
	{
		base= bas;
		perpendicular= perp;
		hypotenuse= hyp;
	}
	
	int area()
	{
		return (base*perpendicular)/2;
	}

	int perimeter()
	{
		return base+perpendicular+hypotenuse;
	}
}
			