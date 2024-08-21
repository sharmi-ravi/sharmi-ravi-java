public class Increment{
public static void main(String[] args){
int a=3,b=4,c,d,e;
c=a+b+a++ + b++ + ++a + ++b;
System.out.println(c);
d=--a*--b*--a*b--;
System.out.println(d);

}
}
