class Triangle
{
	float base,perpendicular,hypotenuse;
	Triangle()
	{
		base= 16.8f ;
		perpendicular=  20.4f;
		hypotenuse= 25.2f;
	}
	Triangle (float bas, float perp, float hyp)
	{
		base= bas;
		perpendicular= perp;
		hypotenuse = hyp;
	}
	float sin()
	{
		return perpendicular/hypotenuse;
	}
	float cos()
	{
		return base/hypotenuse;
	}
	float tan()
	{
		return perpendicular/base;
	}
}