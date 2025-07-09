import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Booking{
    String passengerName;
    int busNo;
    Date date;

    Booking(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name of passenger: ");
        passengerName=s.nextLine();
        System.out.println("Enter Bus no: ");
        busNo=s.nextInt();
        s.nextLine();
        System.out.println("Enter Date dd-mm-yyyy: ");
        String dateinput=s.nextLine();
        SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
        try{
            date=dateformat.parse(dateinput);
        }catch(ParseException e){
            e.printStackTrace();
        }
    }
    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        for (Bus b : buses) {
            if (b.getBusNo() == busNo) {
                if (b.isAvailable()) {
                    b.bookSeat();       
                    bookings.add(this); 
                    return true;
                } else {
                    return false; 
                }
            }
        }
        return false; 
    }
}