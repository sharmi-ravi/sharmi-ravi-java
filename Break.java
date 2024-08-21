import java.util.Scanner;
public class Break{
  public static void main(String[] args){
     Scanner scanner=new Scanner(System.in);
int n;
System.out.println("Enter a number:");
n=scanner.nextInt();

while(n>=0){
  if(n%10==0){
  System.out.println(n);
break;
}
n--;
}
}
}
