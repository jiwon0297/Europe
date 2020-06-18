package dto;

import java.sql.Date;

public class CommentElementBean implements java.io.Serializable {
	   private int num;
	   private String id;
	   private String content;
	   private Date reg;
	   private int ref;
	   private int comment_parent;
	   
	   // default constructor
	   public CommentElementBean() {
	      this(-1,null,null,null,-1,-1);
	   }
	   
	   public CommentElementBean(int num, String id, String content, Date reg, int ref, int comment_parent) {
		super();
		this.num = num;
		this.id = id;
		this.content = content;
		this.reg = reg;
		this.ref = ref;
		this.comment_parent = comment_parent;
	}

	@Override
	public String toString() {
		return "CommentElementBean [num=" + num + ", id=" + id + ", content=" + content + ", reg=" + reg + ", ref="
				+ ref + ", comment_parent=" + comment_parent + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getReg() {
		return reg;
	}

	public void setReg(Date reg) {
		this.reg = reg;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getComment_parent() {
		return comment_parent;
	}

	public void setComment_parent(int comment_parent) {
		this.comment_parent = comment_parent;
	}
}
