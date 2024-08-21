import java.util.Scanner;
public class Sum{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int n,sum=0,i;
System.out.println("enter a number:");
n=scanner.nextInt();

for(i=1;i<n;i++){
  sum+=i;}

System.out.println(sum);

}
}

