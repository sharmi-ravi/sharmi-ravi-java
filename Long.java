import java.util.Scanner;

public class Long{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
long a=scanner.nextInt();
long b=scanner.nextInt();
long sum,diff,mul,div,mod;
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
}
}