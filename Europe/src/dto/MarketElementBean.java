package dto;

public class MarketElementBean implements java.io.Serializable{
	private int number;
	private String country;
	private String cate3;
	private String name;
	private String title;
	private String detail;
	// default constructor
	   public MarketElementBean() {
	      this(-1,null,null,null,null,null);
	   }
	//constructor
	   public MarketElementBean(int number,String country, String cate3, String name, String title, String detail) {
		   super();
		   this.number= number;
		   this.country= country;
		   this.cate3 = cate3;
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
	public String getCate3() {
		return cate3;
	}
	public void setCate3(String cate3) {
		this.cate3 = cate3;
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
		return "MarketElementBean [number=" + number + ", country=" 
	+ country + ", cate3=" + cate3 + ", name=" + name + ", title=" + title + ", detail=" + detail + "]";
	}
	   
}

