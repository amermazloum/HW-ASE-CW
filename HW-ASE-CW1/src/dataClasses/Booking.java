package dataClasses;

import exception.*;
public class Booking {
	
	
	private String  BookingReference;
	
	private String  BookingDate;

	private Passenger passenger;
//	private String  FlightCode;
	private Flight  flight;
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	private boolean CheckIn;
	
	private String  CheckInDate;
	private String  CheckInTime;
	
	private Integer CheckedInWeight;
	private String  BaggageDimension;
	
	public String getBookingDate() {
		return BookingDate;
	}
	public void setBookingDate(String bookingDate) {
		BookingDate = bookingDate;
	}
	public boolean isCheckIn() {
		return CheckIn;
	}
	public void setCheckIn(boolean checkIn) {
		CheckIn = checkIn;
	}
	public String getCheckInDate() {
		return CheckInDate;
	}
	public void setCheckInDate(String checkInDate) {
		CheckInDate = checkInDate;
	}
	public String getCheckInTime() {
		return CheckInTime;
	}
	public void setCheckInTime(String checkInTime) {
		CheckInTime = checkInTime;
	}
	public void setBookingReference(String bookingReference) {
		BookingReference = bookingReference;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	


	public Booking(String BookingReference, Passenger PassengerData,
			Flight flight,boolean CheckIn) throws IllegalArgumentException
	{
		
		/* Added by Faisal*/
		if(BookingReference.trim().length() == 0 || PassengerData == null
				|| flight == null) 
		{			
			throw new IllegalArgumentException("Booking Reference, Passenger Name & Flight Code Cannot be blank");
		}	
		
		this.BookingReference = BookingReference;
		this.passenger = PassengerData;
		this.flight = flight;
		this.CheckIn = CheckIn;		
				
	}
	public boolean IsCheckedIn() {		
		return CheckIn;
		
	}
	
	
	
	/*Added By Faisal*/
	public void SetCheckedIn(Integer CheckedInWeight,String BaggageDimension ) throws InValidCheckInException
	{			
	

			Integer length,breadth,height;
		if(BaggageDimension.matches("\\d{2}x\\d{2}x\\d{2}"))
		{
			String[] dimension=BaggageDimension.split("x");
		 	length =Integer.parseInt(dimension[0]); // l
			breadth =Integer.parseInt(dimension[1]); // b
			height =Integer.parseInt(dimension[2]); // h 
			
			if(length > 20 || breadth > 20 || height > 20 || CheckedInWeight > 100)
			{

				throw new InValidCheckInException();
			}
			else
			{	this.CheckIn=true;
			this.CheckedInWeight=CheckedInWeight;
			this.BaggageDimension=BaggageDimension;
			}
		}
		else
		{

			throw new InValidCheckInException();
		}
			
					
				
	}

	
	public String getBookingReference() {		
		return BookingReference;
		
	}
	public Passenger getPassenger() {		
		return passenger;
		
	}
	
	
	public Integer getCheckedInWeight() {
		return CheckedInWeight;
	}
/*Added By Faisal*/
	public void setCheckedInWeight(Integer checkedInWeight) throws InValidCheckInException {
		
			if(checkedInWeight == 0)
			{
				throw new InValidCheckInException();
			}			
			else
			{
				CheckedInWeight = checkedInWeight;
			
			}
	}

	public String getBaggageDimension() {
		return BaggageDimension;
	}

	public void setBaggageDimension(String baggageDimension) {
		
		BaggageDimension = baggageDimension;
	}
	
	
	
	

}
