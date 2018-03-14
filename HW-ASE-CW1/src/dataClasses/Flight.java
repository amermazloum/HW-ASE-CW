package dataClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import exception.InvalidDataException;

/*Added By Faisal*/
public class Flight {
	
	private String  FlightCode;
	private Date  FlightDate;
	
	private Carrier  carrier;
	private Integer MaxAllowedWeight;	
	private Integer ExtraChargePerKg;
	
	
	public Flight(String FlightCode,Date FlightDate)  throws IllegalArgumentException, ParseException, InvalidDataException
	{
		
		/* Added by Faisal*/
		if(FlightCode.trim().length() == 0 ) throw new IllegalArgumentException("FlighCode, Cannot be blank");
		if(IsvalidDateTime(FlightDate)!=true)  throw new IllegalArgumentException("Flight Date, Carrier Name & Flight Time Cannot be blank");
		this.FlightCode = flightReference(FlightCode);
		this.FlightDate = FlightDate;
		
		
	}
	
	public Flight(String FlightCode,Date FlightDate, Carrier Carrier,
			int MaxAllowedWeight,Integer ExtraChargePerKg)  throws IllegalArgumentException, ParseException, InvalidDataException
	{
		
		/* Added by Faisal*/
		if(FlightCode.trim().length() == 0 || Carrier ==null) throw new IllegalArgumentException("FlighCode, Carrier Name  Cannot be blank");
		if(IsvalidDateTime(FlightDate)!=true)  throw new IllegalArgumentException("Flight Date, Carrier Name & Flight Time Cannot be blank");
		this.FlightCode = flightReference(FlightCode);
		this.carrier = Carrier;
		this.FlightDate = FlightDate;
		this.MaxAllowedWeight = MaxAllowedWeight;	
		this.ExtraChargePerKg = ExtraChargePerKg;
		
	}
	
	public String getFlightCode() {		
		return FlightCode;		
	}

	public Carrier getCarrier() {		
		return carrier;
		
	}
	
	
	public Integer getMaxAllowedWeight() {		
		return MaxAllowedWeight;		
	}
	
	public Integer getExtraChargePerKg() 
	{
		return ExtraChargePerKg;
	}
	public Date getFlightDate() {
		return FlightDate;
	}

	public void setFlightDate(Date flightDate) {
		FlightDate = flightDate;
	}
	public boolean  IsValidFlightCode(String FlightCode) throws  IllegalStateException
	{		
		if(FlightCode.trim().length()==0 || !FlightCode.toUpperCase().matches("^[A-Za-z]{2}[0-9]{3}\\z"))
		{
			throw new IllegalStateException("Flight Code must be 2 characters followed by 3 digits");
			
		}
		
		
		return true;
		
	}
	private boolean IsvalidDateTime(Date flightDate) throws ParseException, InvalidDataException {
		if(flightDate.toLocaleString()!="YYYY-MM-DD-HH:MM")
			throw new InvalidDataException("Invalid Date format.");
		
		return true;
		
	}
	private String flightReference(String bookingReference) throws  InvalidDataException {
		if(bookingReference.trim().length() == 0 ) throw new InvalidDataException("Booking Reference Cannot be blank");
		if(!bookingReference.toUpperCase().matches("^[A-Za-z]{3}[0-9]{3}\\z")) throw new InvalidDataException("Booking Reference must be 3 characters followed by 3 digits");
		
		return bookingReference;
		
	}
}
