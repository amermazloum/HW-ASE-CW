package dataClasses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;

import dataClasses.Carrier;
import dataClasses.Booking;
import dataClasses.Passenger;
import exception.InvalidDataException;


public class DataLoad {
	private HashMap<String,Booking> bookingList;
	private HashMap<String,Flight> flightList;
	
	private String bookingfilePath;
	private String flightfilePath;
	
	public DataLoad(String bookingfilePath,String flightfilePath) {
		super();
		if(bookingfilePath.trim().length() == 0 || flightfilePath.trim().length() == 0) 
		{
			
			throw new IllegalArgumentException("the files path Cannot be blank");
		}
		this.bookingfilePath=bookingfilePath;
		this.flightfilePath=flightfilePath;
	}



	public HashMap<String, Booking> getBookingList() {
		return bookingList;
	}



	public HashMap<String, Flight> getFlightList() {
		return flightList;
	}



	public void PopulateAllBookings() {

		int PassengerId = 0;
		BufferedReader buff = null;
		String data[] = new String[4];
		Passenger PassengerData;
		
		try {
			buff = new BufferedReader(new FileReader(bookingfilePath));
			String inputLine = null;
			while ((inputLine = buff.readLine()) != null) {
				data = inputLine.split(",");
				/* Added by Faisal */
				int variableCount = data.length;
				if (variableCount == 10) {
					

				try {
					String bookingReference = bookingReference(data[0]);
					Date   bookingDate = parseDate(data[1]);

					String  PassengerFName = data[2].length() == 0 ? "" : data[2];
					String  PassengerLName = data[3].length() == 0 ? "" : data[3];
					String  Passport = data[4].length() == 0 ? "" : data[4];
					String  address= data[5].length() == 0 ? "" : data[5];
				    String  mobileNumber= data[6].length() == 0 ? "" : data[6];
					Date    DOB=parseDate(data[7]);
					
					
					PassengerId+=1;
					PassengerData = new Passenger(PassengerId, Passport, PassengerFName, PassengerLName, address, mobileNumber, DOB);
					
					String FlightCode = flightReference(data[8]);
					Date FlightDate = parseDate(data[9]);
					Flight FlightData=new Flight(FlightCode, FlightDate);
					
					
					Booking newBooking = new Booking(bookingReference, bookingDate,PassengerData,FlightData);
				
					if (newBooking.IsValidBookingReference(bookingReference)){
						
					 bookingList.put(bookingReference, newBooking);
					}
					
				} catch (InvalidDataException e) {
					continue;
				} catch (ParseException e) {
					continue;
				}
			}
				else 
				{
				continue;
			}

		} 
		} 
		catch(FileNotFoundException e) {System.out.println(e.getMessage());}
		catch(IllegalArgumentException e) 
		{

			e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Booking found with in valid parametes","Alert", JOptionPane.ERROR_MESSAGE);
	
			
		}
		catch(IOException e){e.printStackTrace();}

	}
	public void PopulateAllFlight()
	{
		
		Carrier carrierData;
		int carrierId=0;
		
		BufferedReader buff=null;
		String data []=new String[4];
		
		try {
			buff = new BufferedReader(new FileReader(flightfilePath));
			String inputLine = null;
			while ((inputLine = buff.readLine()) != null) {
				data = inputLine.split(",");
				/* Added by Faisal */
				int variableCount = data.length;
				if (variableCount == 6) {
					continue;
				}

				try {
					
					String FlightCode = flightReference(data[0]);
					Date FlightDate = parseDate(data[1]);
					String CarrierName = data[2].length() == 0 ? "" : data[2];
					carrierId+=1;
					carrierData = new Carrier(carrierId,CarrierName );
					
					
					String MaxAllowedWeight = data[3].length() == 0 ? "" : data[3];	
					String ExtraChargePerKg = data[4].length() == 0 ? "" : data[4];
					
					Flight FlightData=new Flight(FlightCode, FlightDate, carrierData, Integer.parseInt(MaxAllowedWeight), Integer.parseInt(ExtraChargePerKg));
					
					if (FlightData.IsValidFlightCode(FlightCode)){
						
						flightList.put(FlightCode, FlightData);
					}
					
				} catch (InvalidDataException e) {
					continue;
				} catch (ParseException e) {
					continue;
				}
			}

		} 
		catch(FileNotFoundException e) {System.out.println(e.getMessage());}
		catch(IllegalArgumentException e) 
		{

			e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Booking found with in valid parametes","Alert", JOptionPane.ERROR_MESSAGE);
	
			
		}
		catch(IOException e){e.printStackTrace();}
	}
	
	
	private Date parseDate(String date) throws ParseException, InvalidDataException {
		if(date == null || date.isEmpty())
			throw new InvalidDataException("Invalid Date format.");
		SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD-HH:MM");
		return formatter.parse(date);
		
	}
	private String bookingReference(String bookingReference) throws  InvalidDataException {
		if(bookingReference.trim().length() == 0 ) throw new InvalidDataException("Booking Reference Cannot be blank");
		if(!bookingReference.toUpperCase().matches("^[A-Za-z]{3}[0-9]{3}\\z")) throw new InvalidDataException("Booking Reference must be 3 characters followed by 3 digits");
		
		return bookingReference;
		
	}
	
	private String flightReference(String bookingReference) throws  InvalidDataException {
		if(bookingReference.trim().length() == 0 ) throw new InvalidDataException("Booking Reference Cannot be blank");
		if(!bookingReference.toUpperCase().matches("^[A-Za-z]{3}[0-9]{3}\\z")) throw new InvalidDataException("Booking Reference must be 3 characters followed by 3 digits");
		
		return bookingReference;
		
	}
	
	
	
}
