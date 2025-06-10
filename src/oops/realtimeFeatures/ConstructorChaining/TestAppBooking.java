package oops.realtimeFeatures.ConstructorChaining;

public class TestAppBooking {
	
	public static void main(String[] args) {
		MovieTicket movie = new MovieTicket("Mission Impossible: Final Reckoning",35,320.0,"6:45PM");
		movie.displayDetails();
	}

}
