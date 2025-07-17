package test4.sub3;

public class MovieTicket {
	
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	
	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		this.isBooked = false;
	}
	
	public void bookTicket() {
		
		if(isBooked = true) {
			System.out.println("이미 예매됨");
			return; 
		}
		
		isBooked = true;
		System.out.println(movieTitle+", "+ screenTime+", "+ seatNumber + " 예매 완료");
	}
	
	public void cancelBooking() {

		
		isBooked = false;
		System.out.println(movieTitle+", "+ screenTime+", "+ seatNumber + " 취소 완료");
		
		if (isBooked = false) {
			System.out.println("아직 예매 안됨");
			return;
		}
	}
	
	public void printTicketInfo() {
		System.out.println("영화제목 : " + movieTitle);
		System.out.println("상영시간 : " + screenTime);
		System.out.println("좌석번호 : " + seatNumber);
		System.out.println("예매여부 : " + (isBooked ? "YES" : "No"));
		
	}

}
