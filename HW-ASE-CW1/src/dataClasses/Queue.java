package dataClasses;

public class Queue {
private Integer QueueNumber;
private Booking  booking;


public Booking getBooking() {
	return booking;
}
public void setBooking(Booking booking) {
	this.booking = booking;
}
public Integer getQueueNumber() {
	return QueueNumber;
}
public void setQueueNumber(Integer queueNumber) {
	QueueNumber = queueNumber;
}


}
