package dto;

public class NewsElementBean implements java.io.Serializable{
	private int number;
	private String title;
	private String detail;
	private String writer;
	
	// default constructor
	   public NewsElementBean() {
	      this(-1,null,null,null);
	   }
	//constructor
	   public NewsElementBean(int number,String title,String detail,String writer) {
		   super();
		   this.number= number;
		   this.title= title;
		   this.detail = detail;
		   this.writer = writer;
	   }
	   
	//getter & setter
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		return "NewsElementBean [number=" + number + ", title=" 
	+ title + ", detail=" + detail + ", writer=" + writer + "]";
	}
	   

}
