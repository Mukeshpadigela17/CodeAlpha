import java.util.*;
public class SimpleChatbot 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Hello! I'm your friendly chatbot. Type 'quit' to exit.");
while(true) 
{
System.out.print("You:");
String userMessage=sc.nextLine().trim().toLowerCase();
if(userMessage.equals("quit")) 
{
System.out.println("Chatbot: Goodbye! Have a great day.");
break;
} 
else 
{
System.out.println("Chatbot: You said:"+userMessage);
}
}
sc.close();
}
}
