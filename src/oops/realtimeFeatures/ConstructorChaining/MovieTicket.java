package oops.realtimeFeatures.ConstructorChaining;

public class MovieTicket {
	
	String movieName;
	int seatNumber;
	double price;
	String bookingTime;
	
	//default constructor
	public MovieTicket() {
		
		// sets default value
		this.movieName = "Final Destination";
		this.seatNumber = 0;
		this.price = 0.0;
		this.bookingTime = "NA";
		System.out.println("Default constructor called");
		
	}
	
	//parametrized constructors
	public MovieTicket(String movieName, int seatNumber) {
		this();
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		System.out.println("Para constructor with two arguments called");
	}
	
	public MovieTicket(String movieName, int seatNumber, double price, String bookingTime) {
		this(movieName, seatNumber);
		this.price = price;
		this.bookingTime = bookingTime;
		System.out.println("Para constructor with four arguments called");
	}
	
	public void displayDetails() {
		System.out.println("---------Ticket Details--------");
		System.out.println("MovieName: "+movieName+"\n"+"Seat number: "+seatNumber+"\n"+"Price: "+price+"\n"+"Booking Time: "+bookingTime);
	}

}
