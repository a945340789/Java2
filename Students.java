package classpackage;

import java.util.Scanner;

class Personer{
	static String number;
	static String name=null;
	static String sex;
	public Personer(String number,String name,String sex) {
		this.number=number;
		this.name=name;
		this.sex=sex;
		
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
public class Students extends Personer{
	public Students(String number, String name, String sex) {
		super(number, name, sex);	
	}
	public Students() {
		super(number, name, sex);
	}
    String classs;
	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}
	
}
class Teacher extends Personer{
	public Teacher(String number, String name, String sex) {
		super(number, name, sex);
	}
	public Teacher() {
		super(number, name, sex);
	}
	String  instruction;

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	
}
class Course  {
	String Name=null;//�γ���
    int arress;
	String time;
	String number;
	String palce;
	String teacher;
	String [] a= {"java","java web","ps"};
	public Course(String name) {
		
		this.Name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPalce() {
		return palce;
	}
	public void setPalce(String palce) {
		this.palce = palce;
	}
	
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public void xuanke(int id){
		String ID;
		String course;
		String place;
		String time;
		System.out.println("����  "+"��  "+18);
        System.out.println("1:����  " + "2:java  " + "3:��������ԭ��  "+"4:ps�̳�");
		System.out.println("��������ѡ�޵Ŀγ̱��");
		Scanner sc=new Scanner(System.in);
		int code=sc.nextInt();
		
		switch(code) {
		case 1:
			System.out.println("��ѡ�����:����");
			break;
		case 2:
			System.out.println("��ѡ�����:java");
			break;
		case 3:
			System.out.println("��ѡ�����:��������ԭ��");
			break;
		case 4:
			System.out.println("��ѡ�����:ps�̳�");
		 default:
	        System.out.println("�������");break;
		}
		
		
	}
	public void duike(int id) {
		System.out.println("�˿�ϵͳ");
		System.out.println("1:�����˿�  " + "2:java�˿�  " + "3:��������ԭ���˿�  "+"4:ps�̳��˿�");
		Scanner sc=new Scanner(System.in);
		int id1=sc.nextInt();
		if(id1==5) {
			System.out.println("��Ҫ�˵Ŀγ�������");
		}else if(id1==6) {
			System.out.println("��Ҫ�˵Ŀγ���java");
		}else if(id1==7) {
			System.out.println("��Ҫ�˵Ŀγ��Ǽ�������ԭ��");
		}else if(id1==8) {
			System.out.println("��Ҫ�˵Ŀγ���ps�̳�");
		}else {
			System.out.println("��������");
		}
	}

}

