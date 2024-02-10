package pojo;

public class UserLibrary 
{
	//Step 1:- Declare variable globally
	String name;
	String job;
	//Step 2:- Create constructor to initailize variable
	public UserLibrary(String name, String job) {
		this.name = name;
		this.job = job;
	}
	//Step 3:- Provide getter and setter method to access the variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	

}
