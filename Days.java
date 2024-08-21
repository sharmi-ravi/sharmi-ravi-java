import java.util.Scanner;
public class Days{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
String day;
System.out.println(" choose that 1,2,3,4,5,6,7");
day=scanner.nextLine();


switch(day){
case "1":
System.out.println("1:" +"monday");
break;
case "2":
System.out.println("2:"+"tuesday");
break;
case "3":
System.out.println("3:"+"wednesday");
break;
case "4":
System.out.println("4:"+"thursday");
break;
case "5":
System.out.println("5:"+"friday");
break;
case "6":
System.out.println("6:"+"Saturday");
break;
case "7":
System.out.println("7:"+"sunday");
break;
default:
System.out.println("choose from 1 t0 7 ");
}
}
}