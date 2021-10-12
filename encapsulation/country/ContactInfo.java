import java.util.*;
class ContactInfo
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
System.out.print("enter id: ");
byte id=sc.nextByte();
System.out.print("enter name: ");
String name=sc.next();
System.out.print("enter email id: ");
String email=sc.next();
System.out.print("enter contact no: ");
long contact=sc.nextLong();

Wolken wolken=new Wolken();
Wolken wolken1=new Wolken(id,name);
Wolken wolken2=new Wolken(id,name,email,contact);

wolken.defaultParam();
wolken1.singleParam();
wolken2.allParam();
}
}