import java.util.Scanner;
public class Perfect{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int n;
System.out.println("enter a number:");
n=scanner.nextInt();
double root=Math.sqrt(n);
int val= (int)Math.floor(root)+1;
int res=val*val;
System.out.println(res);
}
}
