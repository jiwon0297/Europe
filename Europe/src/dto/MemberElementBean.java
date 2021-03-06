package dto;

public class MemberElementBean implements java.io.Serializable {
   private String id;
   private String password;
   private String name;
   private String phone;
   private String email;
   private String address;
   private String nickname;
   private String gender;
   
   
   // default constructor
   public MemberElementBean() {
      this(null,null,null,null,null,null,null,null);
   }
   
   // constructor
   public MemberElementBean(String id, String password,String name, String phone,String email,String address,String nickname, String gender) {
      super();
      this.id = id;
      this.password = password;
      this.name = name;
      this.phone= phone;
      this.email = email;
      this.address = address;
      this.nickname = nickname;
      this.gender = gender;
   }

   // getter & setter
   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }
   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }
   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }
   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }
   public String getNickname() {
      return nickname;
   }

   public void setNickname(String nickname) {
      this.nickname = nickname;
   }
   
   public String getGender() {
	  return gender;
   }

   public void setGender(String gender) {
	  this.gender = gender;
   }


   
   @Override
   public String toString() {
      return "MemberElementBean [id=" + id + ", password=" + password + ", name=" + name + ", phone=" + phone + ", email=" + email
            + ", email=" + email + ", address=" + address
            + ", nickname=" + nickname +", gender=" + gender + "]";
   }

}