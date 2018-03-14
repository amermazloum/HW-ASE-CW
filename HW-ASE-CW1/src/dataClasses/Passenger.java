package dataClasses;

import java.util.Date;
/*Added By Amer*/ 
public class Passenger {
	
	private Integer passengerId;
	private String  passengerFName;
	private String  passengerLName;
	private String  Passport;
	private String  address;
	private String  mobileNumber;
	private Date  DOB;
	
	public Passenger(Integer passengerId, String passengerLName, String Passport) throws IllegalArgumentException{
		super();
		if(passengerId == 0 || passengerLName.trim().length() == 0
				|| Passport.trim().length() == 0) 
		{
			
			throw new IllegalArgumentException("passenger Id, Passport and passenger Last Name  Cannot be blank");
		}
		this.passengerId = passengerId;
		this.passengerLName = passengerLName;
		this.Passport = Passport;
	}

	public Passenger(Integer passengerId , String Passport, String passengerFName, String passengerLName, String address,
			String mobileNumber, Date dOB) throws IllegalArgumentException {
		super();
		
	
		if(passengerId == 0 || passengerLName.trim().length() == 0
				|| Passport.trim().length() == 0) 
		{
			
			throw new IllegalArgumentException("passenger Id, Passport and passenger Last Name  Cannot be blank");
		}
		this.passengerId = passengerId;
		this.passengerFName = passengerFName;
		this.passengerLName = passengerLName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		DOB = dOB;
	}

	
	public String getPassport() {
		return Passport;
	}

	public void setPassport(String passport) {
		Passport = passport;
	}


	
	
	public Integer getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerFName() {
		return passengerFName;
	}
	public String getPassengerFullName() {
		return passengerFName+" " + passengerLName;
	}
	public void setPassengerFName(String passengerFName) {
		this.passengerFName = passengerFName;
	}

	public String getPassengerLName() {
		return passengerLName;
	}

	public void setPassengerLName(String passengerLName) {
		this.passengerLName = passengerLName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}




}
