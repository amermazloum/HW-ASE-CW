package dataClasses;

import java.util.HashMap;
import java.util.TreeMap;

import exception.*;

public class AllBooking {
	
private HashMap<String,Booking> bookingList;
	
	
	public AllBooking() 
	{
		bookingList = new HashMap<String,Booking>();
	}
		
	
	
	/* Added by Amer*/
	public boolean  IsValidFlightCode(String FlightCode) throws  IllegalStateException
	{		
		if(FlightCode.trim().length()==0 || !FlightCode.toUpperCase().matches("^[A-Za-z]{2}[0-9]{3}\\z"))
		{
			throw new IllegalStateException("Flight Code must be 2 characters followed by 3 digits");
			
		}
		
		
		return true;
		
	}
	
	public boolean UpdateCheckInStatus(String BookingReference,Integer CheckedInWeight,
							String BaggageDimension) throws InValidCheckInException
	{		
		Booking a = bookingList.get(BookingReference);
		if(a!=null)
		{
			bookingList.get(BookingReference).SetCheckedIn(CheckedInWeight,BaggageDimension);
			
			return true;
		}
		return false;
		
	}
	
	
	
	public String BookingDetails()
	{
		StringBuffer allEntries=new StringBuffer();
		
		for(Booking details : bookingList.values())
		{
			allEntries.append(details.getBookingReference() + "		" + details.getPassenger().getPassengerFName()+ " " + details.getPassenger().getPassengerLName() + "		" + details.IsCheckedIn());
			allEntries.append('\n');
		}
		return allEntries.toString();
		
		
	}
	
	public HashMap<String,Booking> getAllBookings() 
	{
		return bookingList;
	}

}
