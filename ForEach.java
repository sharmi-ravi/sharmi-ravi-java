import java.util.Scanner;
public class ForEach{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int arr[]={1,2,3,4,5};
int sum=0;
for(int x:arr){
 sum+=x;}

System.out.println(sum);

}}