public class Bus{
      private int busNo;
      private boolean ac;
      private int capacity;
      private int bookedSeats = 0;
      Bus(int no,boolean ac,int cap)
       {
        this.busNo=no;
        this.ac=ac;
        this.capacity=cap;
       }
      public int getBusNo()
      {
        return busNo;
      } 
      public int getCapacity()
      {
        return capacity;
      }
      public void setCapacity(int cap)
      {
        capacity=cap;
      }
      public boolean isAc()
      {
        return ac;
      }
      public void setAc(boolean a)
      {
        ac=a;
      }
      public boolean isAvailable() {
        return bookedSeats < capacity;
      }

    public boolean bookSeat() {
        if (isAvailable()) {
            bookedSeats++;
            return true;
        }
        return false;
    }
      public void dispalyBusInfo()
      {
        System.out.println("Bus No:"+ busNo+" Ac:"+ac+" Total Capacity:"+ capacity);
      }
}