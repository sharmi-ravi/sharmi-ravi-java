import java.util.Scanner;
public class Divisible{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int i,n;
System.out.println("enter a number:");
n=scanner.nextInt();
for(i=1;i<=n;i++)
{
if((i%4==0)||(i%6==0)){
continue;
}

System.out.println(i);
}
}
}