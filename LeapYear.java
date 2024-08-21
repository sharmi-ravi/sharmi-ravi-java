import java.util.Scanner;
public class LeapYear{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int Year;
Year=scanner.nextInt();
if (Year<0){
System.out.println("enter valid year");
}
else if((Year%400==0) || (Year%100!=0 && Year%4==0))
{
System.out.println("It is leap year");
}
else{
System.out.println("It is not leap year");
}
}
}
