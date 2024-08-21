import java.util.Scanner;
public class Switch{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int a,b;
System.out.println("enter a:");
a=scanner.nextInt();
System.out.println("enter b:");
b=scanner.nextInt();
System.out.println("choose one +,-,*,/,%");
char Operator;
Operator=scanner.next().charAt(0);
switch(Operator){
case '+':
System.out.println("a+b=" + (a+b));
break;
case '-':
System.out.println("a-b=" +(a-b));
break;
case '*':
System.out.println("a*b=" + (a*b));
break;
case '/':
System.out.println("a/b=" + (a/b));
break;
case '%':
System.out.println("a%b=" +(a%b));
break;
default:
System.out.println("Incorrect choose");
}
}
}