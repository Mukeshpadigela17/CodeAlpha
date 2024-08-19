import java.util.*;
class Hotel 
{
private Map<Integer,Boolean> rooms;
public Hotel(int numRooms) 
{
rooms=new HashMap<>();
for(int i=1;i<=numRooms;i++) 
{
rooms.put(i,true); 
}
}
public boolean bookRoom(int roomNumber) 
{
if(rooms.containsKey(roomNumber)&&rooms.get(roomNumber)) 
{
rooms.put(roomNumber,false); 
return true;
}
return false; 
}
public boolean cancelBooking(int roomNumber) 
{
if(rooms.containsKey(roomNumber)&&!rooms.get(roomNumber)) 
{
rooms.put(roomNumber, true); 
return true;
}
return false;
}
}
public class HotelReservationSystem 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of rooms in the hotel:");
int numRooms=sc.nextInt();
Hotel hotel=new Hotel(numRooms);
while(true) 
{
System.out.println("\nMenu:");
System.out.println("1. Book a room");
System.out.println("2. Cancel booking");
System.out.println("3. Exit");
System.out.print("Enter your choice: ");
int choice=sc.nextInt();
if(choice==1) 
{
System.out.print("Enter room number to book:");
int roomNumber=sc.nextInt();
if(hotel.bookRoom(roomNumber)) 
{
System.out.println("Room"+roomNumber+"booked successfully!");
} 
else 
{
System.out.println("Room "+roomNumber+"is not available.");
}
} 
else if(choice==2) 
{
System.out.print("Enter room number to cancel booking:");
int roomNumber=sc.nextInt();
if(hotel.cancelBooking(roomNumber)) 
{
System.out.println("Booking for room"+roomNumber+"canceled.");
} 
else 
{
System.out.println("Room"+roomNumber+"was not booked.");
}
} 
else if(choice==3) 
{
System.out.println("Exiting. Have a great day!");
break;
} 
else 
{
System.out.println("Invalid choice. Try again.");
}
}
sc.close();
}
}
