import java.util.Scanner;
public class OddEven{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int num;
num=scanner.nextInt();
System.out.println("enter the number:" +num);
if(num%2==0){
System.out.println("it is a even number");
}
else{
System.out.println("it is odd number");
}
}
}