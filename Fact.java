import java.util.Scanner;
public class Fact{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int n,i,fact=1;
System.out.println("enter a number:");
n=scanner.nextInt();
for(i=1;i<=n;i++){
fact*=i;

}
System.out.println(fact);
}
}

