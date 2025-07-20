class A {
int i=10;
void print()
{
System.out.println("Super class print");
}
}
class B extends A
{
int i=20; // this hides the i in A
void print()
{
// super.print();
System.out.println("Sub class print");
System.out.println("Super class i="+super.i);
System.out.println("Sub class i="+i);
}
}
class SuperDemo
{
public static void main(String ar[])
{
B b = new B();
b.print();
}
}