 
public class Person {
   	
   	protected String name = "Name";
   	protected String address = "Address";
   	protected String phonenum = "Phone Number";
   	protected String email = "Email";
   	
   	public Person(){
   	}
   	
   	public Person(String address, String phonenum, String email){
         	this();
         	this.address = address;
         	this.phonenum = phonenum;
         	this.email = email;
   	}
 
   	public String getAddress() {
         	return address;
   	}
 
   	public String getPhonenum() {
         	return phonenum;
   	}
 
   	public String getEmail() {
         	return email;
   	}
 
   	public void setAddress(String address) {
         	this.address = address;
   	}
 
   	public void setPhonenum(String phonenum) {
         	this.phonenum = phonenum;
   	}
 
   	public void setEmail(String email) {
         	this.email = email;
   	}
   	
   	public String toString(){
         	return "Person[ Name: "+this.name+"Address: "+this.address+", Phone Number: "
                             	+this.phonenum+", Email: "+this.email+"]";
 
   	}
}
 
 
 
public class Student extends Person {
   	
   	private String name = "John Doe";
   	private String status = "Sophomore";
   	private String address = "12 not st. Ghost Town, NJ 26598";
   	private String phonenum = "(555) 555-3408";
   	private String email = "JohnDoe@fakeemail.com";
   	
   	public Student(){
   	}
   	
   	public Student(String name, String status, String address, String phonenum, String email){
         	super();
         	this.name = name;
         	this.status = status;
         	this.address = address;
         	this.phonenum = phonenum;
         	this.email = email;
   	}
   	
   	@Override
   	public String toString(){
return "Name: "+this.name+", Status: "+this.status+", Address: "+this.address+", Phone Number: “+this.phonenum+", Email: "+this.email;
 
   	}
}
 
 
import java.util.Date;
 
 
public class Employee extends Person {
   	
   	private String name = "Jane Doe";
   	private String address = "21 well st. host Town, NJ 26599";
   	private String phonenum = "(555) 555-3589";
   	private String email = "JaneDoe@fakeemail.com";
   	private String office = "211";
   	private String salary = "55,000";
   	private Date dateHired;
   	
   	public Employee(){
         	this.dateHired = new Date();
   	}
         	
   	public Employee(String name, String status, String address, String phonenum,
                                    	String email, String office, String Salary){
         	super();
         	this.name = name;
         	this.address = address;
         	this.phonenum = phonenum;
         	this.email = email;
         	this.office = office;
         	this.salary = salary;
         	
   	}
   	
   	@Override
   	public String toString(){
         	return "Name: "+this.name+", Address: "+this.address+", Phone Number: "
+this.phonenum+", Email: "+this.email+", Office: "+this.office+", Salary: "+this.salary+
                             	", Date Hired: "+this.dateHired;
   	}
}
 
 
import java.util.Date;
         	
public class Faculty extends Employee {
   	
   	private String name = "Julie Doe";
   	private String address = "1 bell st. post Town, NJ 26597";
   	private String phonenum = "(555) 555-3591";
   	private String email = "JulieDoe@fakeemail.com";
   	private String office = "112";
   	private String officehr = "Mon & Tues 11:00am to 3:00pm";
   	private String salary = "75,000";
   	private String rank = "Department Head";
   	private Date dateHired;
         	
   	public Faculty(){
         	this.dateHired = new Date();
   	}
                       	
   	public Faculty(String name, String status, String address, String phonenum, String email,
                                    	String office, String officehr, String Salary, String rank){
         	super();
         	this.name = name;
         	this.address = address;
         	this.phonenum = phonenum;
         	this.email = email;
         	this.office = office;
         	this.officehr = officehr;
         	this.salary = salary;
         	this.rank = rank;
   	}
   	
   	@Override
   	public String toString(){
         	return "Name: "+this.name+", Address: "+this.address+", Phone Number: "
+this.phonenum+", Email: "+this.email+", Office: "+this.office+", Office Hours: "
+this.officehr+", Salary: "+this.salary+", Rank: "+this.rank+", Date Hired: “+this.dateHired;
   	}
}
 
 
import java.util.Date;
 
public class Staff extends Employee {
         	
   	private String name = "Juan Doe";
   	private String address = "5 yell st. tost Town, NJ 26592";
   	private String phonenum = "(555) 555-3999";
   	private String email = "JuanDoe@fakeemail.com";
   	private String office = "B2";
   	private String salary = "35,000";
   	private String title = "Supervisor";
   	private Date dateHired;
                	
   	public Staff(){
         	this.dateHired = new Date();
   	}
                       	
   	public Staff(String name, String status, String address, String phonenum,
                                                 	String email, String office, String Salary, String title){
         	super();
         	this.name = name;
         	this.address = address;
         	this.phonenum = phonenum;
         	this.email = email;
         	this.office = office;
         	this.salary = salary;
         	this.title = title;
   	}
   	
   	@Override
   	public String toString(){
return "Name: "+this.name+", Address: "+this.address+", Phone Number:    "+this.phonenum+", Email: "+this.email+", Office: "+this.office+", Salary: "+this.salary+", Title: "+this.title+", Date Hired: "+this.dateHired;
   	}
}
   	
         	
 
 

