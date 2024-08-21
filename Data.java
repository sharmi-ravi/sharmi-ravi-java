
import java.util.Scanner;


public class Data{
public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Sum=scanner.nextInt();
        System.out.println(Sum);
        byte Value=scanner.nextByte();
        System.out.println(Value);
        boolean True=scanner.nextBoolean();
        System.out.println(True);
        short num=scanner.nextShort();
        System.out.println(num);
        long val=scanner.nextLong();
        System.out.println(val);
        char c=scanner.next().charAt(0);
        System.out.println(c);
        float number=scanner.nextFloat();
        System.out.println(number);
        double result=scanner.nextDouble();
        System.out.println(result);
        String name=scanner.nextLine();
        System.out.println(name);
    }
}