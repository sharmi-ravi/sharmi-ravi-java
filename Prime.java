import java.util.Scanner;
public class Prime{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    int n;
    System.out.println("enter a number:");
    n=scanner.nextInt();
    boolean isPrime=true;
if(n<=1){
   isPrime=false;
}else{
for(int i=2;i<=Math.sqrt(n);i++){
   if(n%i==0){
  isPrime=false;
break;
}
}
}
if (isPrime){
System.out.println(n + " is prime number");
}
else{
System.out.println(n + " is not a prime");
}
}
}
      

