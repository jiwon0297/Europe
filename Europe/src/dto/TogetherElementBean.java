package dto;

public class TogetherElementBean implements java.io.Serializable{
	private int number;
	private String country;
	private String name;
	private String title;
	private String detail;
	// default constructor
	   public TogetherElementBean() {
	      this(-1,null,null,null,null);
	   }
	//constructor
	   public TogetherElementBean(int number,String country,String name, String title, String detail) {
		   super();
		   this.number= number;
		   this.country= country;
		   this.name = name;
		   this.title = title;
		   this.detail = detail;
	   }
	   
	//getter& setter
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	@Override
	public String toString() {
		return "TogetherElementBean [number=" + number + ", country=" 
	+ country + ", name=" + name + ", title=" + title + ", detail=" + detail + "]";
	}
	   
}
