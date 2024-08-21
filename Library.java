class User{
String name, dateOfBirth;
String userId;
}
class Book{
String authorName;
String publishYear;
String ReturnDate;
}
class Card{
  String cardnumber;
 String CardDate;
}
class Remainder{
 String setRemain;
}
public class Library{
public static void main(String[] args){
System.out.println("**User Details**");
User identity=new User();
identity.name="sharmila";
identity.dateOfBirth="09-10-2003";
identity.userId="102";
System.out.println("User name:" + identity.name);
System.out.println("D-O-B:" + identity.dateOfBirth);
System.out.println("UserId:" + identity.userId);
System.out.println("**Author Details**");
Book Value=new Book();
Value.authorName="William";
Value.publishYear="2024";
Value.ReturnDate="12-02-2025";
System.out.println("author:" + Value.authorName);
System.out.println("publishYear:" + Value.publishYear);
System.out.println("returndate:" + Value.ReturnDate);
System.out.println("**Card Details**");
Card num=new Card();
num.cardnumber="50";
num.CardDate="12-10-2020";
System.out.println("cardnum:" +num.cardnumber);
System.out.println("cardDate:" + num.CardDate);
System.out.println("**Remainder message**");
Remainder message=new Remainder();
message.setRemain="please renual the book before 12-02-2025";
System.out.println("Remainder:" + message.setRemain);
}
}

