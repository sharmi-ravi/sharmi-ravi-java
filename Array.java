import java.util.Scanner;
public class Array{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int a[]=new int[6];
System.out.print("Enter the value:");
for(int i=0;i<a.length;i++){
a[i]=scanner.nextInt();}
System.out.println("The array values are:");
for( int i=0;i<a.length;i++){

   System.out.println(a[i]+ "\t");}
}
}
