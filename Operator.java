public class Operator{
public static void main(String[] args){
int a=2,b=3;
int sum,diff,mul,div,mod,val;
sum=a+b;
diff=a-b;
mul=a*b;
div=a/b;
mod=a%b;
System.out.println("sum:" + sum);
System.out.println("diff:" + diff);
System.out.println("mul:" + mul);
System.out.println("div:" + div);
System.out.println("mod:" + mod);
a+=a;
System.out.println(a);
a++;
System.out.println(a);

}
}