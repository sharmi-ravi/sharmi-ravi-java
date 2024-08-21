import java.util.Scanner;


public class Mark{
public static void main(String[] args){
int mark;
Scanner scanner=new Scanner(System.in);
System.out.println("enter the number");
mark=scanner.nextInt();
System.out.println("The given number is:" +mark);
if(mark>=90){
System.out.println("A Grade");
}
else if(mark>=80 && mark<=89){
System.out.println("B Grade");
}
else if(mark>=70 && mark<=79){
System.out.println("C Grade");
}
else if(mark>=60 && mark<=69){
System.out.println("D Grade");
}
else{
System.out.println("E Grade");
}

}
}