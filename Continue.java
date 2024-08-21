import java.util.Scanner;
public class Continue{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int n,i;
System.out.println("enter a number:");
n=scanner.nextInt();
for(i=1;i<=n;i++){
if(i==5)
continue;
System.out.println(i);
}
}
}
