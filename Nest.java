import java.util.Scanner;
public class Nest{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int n,i,j;
System.out.println("enter n:");
n=scanner.nextInt();
for(i=1;i<=n;i++){
  for(j=1;j<=i;j++){
     System.out.print("*");
}
System.out.println("\n");
}
}
}