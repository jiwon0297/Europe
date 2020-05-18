package dto;

public class ReviewElementBean implements java.io.Serializable{
	private int number;
	private String country;
	private String cate1;
	private String name;
	private String title;
	private String detail;
	// default constructor
	   public ReviewElementBean() {
	      this(-1,null,null,null,null,null);
	   }
	//constructor
	   public ReviewElementBean(int number,String country, String cate1, String name, String title, String detail) {
		   super();
		   this.number= number;
		   this.country= country;
		   this.cate1 = cate1;
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
	public String getCate1() {
		return cate1;
	}
	public void setCate1(String cate1) {
		this.cate1 = cate1;
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
		return "ReviewElementBean [number=" + number + ", country=" 
	+ country + ", cate1=" + cate1 + ", name=" + name + ", title=" + title + ", detail=" + detail + "]";
	}
	   
}
