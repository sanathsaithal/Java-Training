class PMovieInfo
{
String name;
int time;
String director;
String type;

PMovieInfo(String n,int t,String d,String type)
{
name=n;
time=t;
director=d;
type=type;
}

void information()
{
System.out.println(name+"\t"+time+"\t"+director+"\t"+type);
}
}
