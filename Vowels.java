import java.util.Scanner;

public class Vowels{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
char vowel;
System.out.println(" choose that a,e,i,o,u,A,E,I,O,U");
vowel=scanner.next().charAt(0);


switch(vowel){
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
System.out.println("It is vowel letter");
break;
default:
System.out.println("It is consonent letter");
}
}
}