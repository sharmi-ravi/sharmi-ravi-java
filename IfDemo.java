import java.util.Scanner;


public class IfDemo{
public static void main(String[] args){
int num;
Scanner scanner=new Scanner(System.in);
num=scanner.nextInt();
System.out.println("The given number is:" +num);
if(num>0){
System.out.println("The number is positive");
}
else if(num==0){
System.out.println("The number is zero");
}
else
System.out.println("The number is negative");

}
}