package dto;

public class LocationElementBean implements java.io.Serializable {
	private int number;
	private int countryNumber;
	private String location;
	
	// default constructor
	   public LocationElementBean() {
	      this(-1,-1,null);
	   }
	   
	   public LocationElementBean(int number, int countryNumber, String location) {
			super();
			this.number= number;
			this.countryNumber = countryNumber;
			this.location = location;
		}
	   
	   @Override
		public String toString() {
			return "LocationElementBean [number=" + number + ", countryNumber=" + countryNumber + ", location=" + location + "]";
		}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCountryNumber() {
		return countryNumber;
	}

	public void setCountryNumber(int countryNumber) {
		this.countryNumber = countryNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	   
	   

}
