class EvenOdd
{
public static void main(String[] args)
{
byte[] num={10,12,13,14,7};
for (int i=0;i<num.length;i++)
{
if(num[i]%2==0)
{
System.out.println(+num[i]+"even");
}
else
{
System.out.println(+num[i]+"odd");
}
}
}
}