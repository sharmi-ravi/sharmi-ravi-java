import java.util.Scanner;
public class Nodd{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int n,i;
System.out.println("enter a number:");
n=scanner.nextInt();
for(i=1;i<=n;i++){
if(i%2!=0){
System.out.println(i);
}
}
}
}