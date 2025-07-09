import java.util.Scanner;
import java.util.ArrayList;
public class busResv
{
    public static void main(String arg[])
    {
        ArrayList<Bus> Buses=new ArrayList<Bus>();
        ArrayList<Booking>bookings=new ArrayList<Booking>();

        Buses.add(new Bus(1,true,2));
        Buses.add(new Bus(2,false,60));
        Buses.add(new Bus(3,true,40));
        for(Bus b:Buses)
        {
            b.dispalyBusInfo();
        }
        Scanner s=new Scanner(System.in);
        int userOpt=1;
        while(userOpt==1)
        {
           System.out.println("Enter 1 to Book or 2 to Exit");
           userOpt=s.nextInt();
           if(userOpt==1){
            Booking booking=new Booking();
            if(booking.isAvailable(bookings,Buses)){
                System.out.println("Your booking is confirmed.");
            }
            else{
                System.out.println("Sorry! Bus is full. Try another bus or date.");
            }
           }
        }
        

    }
}

