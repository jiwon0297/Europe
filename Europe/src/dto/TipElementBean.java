package dto;

public class TipElementBean implements java.io.Serializable{
	private int number;
	private String country;
	private String cate2;
	private String name;
	private String title;
	private String detail;
	// default constructor
	   public TipElementBean() {
	      this(-1,null,null,null,null,null);
	   }
	//constructor
	   public TipElementBean(int number,String country, String cate2, String name, String title, String detail) {
		   super();
		   this.number= number;
		   this.country= country;
		   this.cate2 = cate2;
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
	public String getCate2() {
		return cate2;
	}
	public void setCate2(String cate2) {
		this.cate2 = cate2;
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
		return "TipElementBean [number=" + number + ", country=" 
	+ country + ", cate2=" + cate2 + ", name=" + name + ", title=" + title + ", detail=" + detail + "]";
	}
	   
}
