package dataClasses;

import java.util.Date;

import exception.*;
public class Booking {
	
	
	private String  BookingReference;
	private Date    BookingDate;
    private Passenger passenger;
	private Flight  flight;
	
	
	private boolean CheckIn;
	private Date  CheckInTime;

	private Integer CheckedInWeight;
	private String  BaggageDimension;
	
	
	
	
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Date getBookingDate() {
		return BookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		BookingDate = bookingDate;
	}
	public boolean isCheckIn() {
		return CheckIn;
	}
	public void setCheckIn(boolean checkIn) {
		CheckIn = checkIn;
	}
	
	public Date getCheckInTime() {
		return CheckInTime;
	}
	public void setCheckInTime(Date checkInTime) {
		CheckInTime = checkInTime;
	}
	public void setBookingReference(String bookingReference) {
		BookingReference = bookingReference;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	


	public Booking(String BookingReference,Date BookingDate, Passenger PassengerData,
			Flight flight) throws IllegalArgumentException
	{
		
		/* Added by Faisal*/
		if(BookingReference.trim().length() == 0 || PassengerData == null
				|| flight == null) 
		{			
			throw new IllegalArgumentException("Booking Reference, Passenger Name & Flight Code Cannot be blank");
		}	
		
		this.BookingReference = BookingReference;
		this.BookingDate = BookingDate;
		this.passenger = PassengerData;
		this.flight = flight;
		
				
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
	
	
	public Booking IsValidBooking(String BookingReference,String PassengerLName) throws  IllegalStateException
	{		
		if(BookingReference.trim().length()==0 || !BookingReference.toUpperCase().matches("^[A-Za-z]{3}[0-9]{3}\\z"))
		{
			throw new IllegalStateException("Booking Reference must be 3 characters followed by 3 digits");
			
		}
		
			/* Modified by Amer*/
			if (this.IsCheckedIn()==false) {
				
			if(this.getPassenger().getPassengerLName().toLowerCase().equals(PassengerLName.toLowerCase()))
			{
				return this;		
			}
			else
			{
				throw new IllegalStateException("Not a valid passenger name");
			}}else
			{
				throw new IllegalStateException("passenger has already checked-in");
			}
		
		
		
	}
	/* Added by Amer*/
	public boolean  IsValidBookingReference(String BookingReference) throws  IllegalStateException
	{		
		if(BookingReference.trim().length()==0 || !BookingReference.toUpperCase().matches("^[A-Za-z]{3}[0-9]{3}\\z"))
		{
			throw new IllegalStateException("Booking Reference must be 3 characters followed by 3 digits");
			
		}
		
		
		return true;
		
	}
	

}
