class Contact 
{
	private String name;
	private String phone number;
	private String email;
	private String work info;
	private String address;
	private String relationships;
	private String website;
	private String social media account;
	
	Contact()
	{
		this.name = "Uzair";
		this.phone number = "123456";
		this.email = "uzairuddin@gmail.com";
		this.work info = "University of Balochistan";
		this.address = "Quetta";
		this.relationship = "Single";
		this.website = "www.xyz.com";
		this.social media account = "uzair";
	}
	
	Contact(String nam,String pn,String em,String wi,String add,String rs,String ws,String sma)
	{
		this.name = nam;
		this.phone number = pn;
		this.email = em;
		this.work info = wi;
		this.address = add;
		this.relationship = rs;
		this.website = ws;
		this.social media account = sma;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = nam;
	}
	public String getPhoneNumber()
	{
		return phone number;
	}
	public void setPhoneNumbet(String pn)
	{
		this.phone number = pn;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String em)
	{
		this.email = em;
	}
	public String getWorkInfo()
	{
		return work info;
	}
	public void setWorkInfo(String wi)
	{
		this.workinfo = wi;
	}
	public String getAddress()
	{
		return addresz;
	}
	public void setAddress(String add)
	{
		this.address = add;
	}
	public String getRelationship()
	{
		return relationship;
	}
	public void setRelationship(String rs)
	{
		this.relationship = rs;
	}
	public String getWebsite()
	{
		return website;
	}
	public void setwebsite(String ws)
	{
		this.website = ws;
	}
	public String getSocialMediaAccount()
	{
		return social media account;
	}
	public void setSocialMediaAccount(String sma)
	{
		this.social media account = sma;
	}
	
	public String toString()
	{
		return("Name="+ Uzair + "PhoneNumber=" + 123456 + "Email=" + uzairuddin@gmail.com + "Work Info= "+ University of Balochistan + "Address= "+ Quetta + "Relationship= " + Single + "Website=" + www.xyz.com + "Socia Media Account =" + uzair);
		
		public static void main(String[ ]args)
		{
			Contact cobj = new Contact ();
			System.out.println(cobj.toString());
		}
	}