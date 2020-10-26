package project;

public class Person {
	private int id;
	private String name;
	private String sex;
	private int age;

}
class teather extends Person{
	String teathcourse;
	int phone;
	public void setTeathcourse(String tc){
		teathcourse = tc;
	}
	public String getTesthcourse(){
		return teathcourse;
		
	}
	public void setPhone(int p){
		phone = p;
	}
	public int getPhone(){
		return phone;
	}
		
	
}
class student extends Person{
	String choosecourse;
	public void setChoosecourse(String cc){
		choosecourse = cc;
	}
	public String getChoosecourse(){
		return choosecourse;
		
	}
}

