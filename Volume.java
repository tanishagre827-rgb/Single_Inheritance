import java.lang.*;
class Sphere
{
int r;
float pi;
Sphere(int r, float pi)
{
this.r=r;
this.pi=pi;
}
void volume()
{
float v=(4*pi*r*r*r)/3;
System.out.println("Volume of Sphere is:"+v);
}
}
class Hemisphere extends Sphere
{
int a;
Hemisphere(int r, float pi, int a)
{
super(r,pi);
this.a=a;
}
void volume()
{
super.volume();
float v=(a*pi*r*r*r)/6;
System.out.println("Volume of Hemisphere is:"+v);
}
}
public class Volume
{
public static void main(String args[])
{
Hemisphere h1=new Hemisphere(10,3.14f,2);
h1.volume();
}
}