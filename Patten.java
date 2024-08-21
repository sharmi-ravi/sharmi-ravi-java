import java.util.Scanner;
public class Pattern{
  public class static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int n,i;
n=scanner.nextInt();
for(i=1;i<=n;i++){
 for(j=1;j<=n;j++){
if(i%2==0)
{
continue;
}
System.out.println("*");
}
}
}
