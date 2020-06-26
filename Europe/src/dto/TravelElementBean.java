package dto;


public class TravelElementBean implements java.io.Serializable{
	private int number;
	private String userId;
	private String country;
	private int nights;
	private int days;
	private String startDate;
	
	// default constructor
	   public TravelElementBean() {
	      this(-1,null,null,-1,-1,null);
	   }
	   
	   public TravelElementBean(int number, String userId, String country, int nights, int days, String startDate) {
			super();
			this.number = number;
			this.userId = userId;
			this.country = country;
			this.nights = nights;
			this.days = days;
			this.startDate = startDate;
		}
	   
	   @Override
		public String toString() {
			return "TravelElementBean [number=" + number + ", id=" + userId + ", country=" + country + ", nights=" + nights + ", days="
					+ days + ", startDate" + startDate + "]";
		}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNights() {
		return nights;
	}

	public void setNights(int nights) {
		this.nights = nights;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	   
	   
}
