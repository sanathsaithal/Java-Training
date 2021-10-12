class Wolken
{
byte id;
String name;
String email;
long contact;

Wolken()
{
}
void defaultParam()
{
	System.out.println("Default Constructor:");
	System.out.println("id: "+id);
	System.out.println("name: "+name);
	System.out.println("email: "+email);
	System.out.println("contact: "+contact);
}	

Wolken(byte id)
{
this.id=id;
}
void singleParam()
{
	System.out.println("Single Parameter Constructor:");
	System.out.println("id: "+id);
	System.out.println("name: "+name);
	System.out.println("email: "+email);
	System.out.println("contact: "+contact);
}

Wolken(byte id,String name,String email,long contact)
{
this(id);
this.name=name;
this.email=email;
this.contact=contact;
}
void allParam()
{
	System.out.println("All Parameter Constructor:");
	System.out.println("id: "+id);
	System.out.println("name: "+name);
	System.out.println("email: "+email);
	System.out.println("contact: "+contact);
}
}