import java.util.Scanner;
public class Large{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int a,b,c;
System.out.println("enter first number:");
a=scanner.nextInt();
System.out.println("enter second number:");
b=scanner.nextInt();
System.out.println("enter third number:");
c=scanner.nextInt();
if((a>b) && (a>c)){
System.out.println("A is greater");
}
else if((b>a) && (b>c)){
System.out.println("B is greater");
}
else{
System.out.println("C is greater");
}
}
}
