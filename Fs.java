package classpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fs {
public void show() {
	Students a=new Students();
	 Teacher b=new Teacher();
	 Course c=new Course("程序设计基础");
	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	 	a.setNumber("20202546240");	
		a.setName("szh");
		a.setSex("man");
		b.setNumber("202055534");
		b.setName("白老师");
		b.setInstruction("大学英语");
		c.setNumber("102");
		c.setPalce("教学楼16#402");
		c.setTeacher("王达");
		int id = 0;
		String mName = a.getName();
		String mNumber = a.getNumber();
	    String mSex = a.getSex();
		mName = a.getName();
		mNumber = a.getNumber();
		mSex = a.getSex();
		String teachernumber=b.getNumber();
		String teachername = b.getName();
		String teacherclass =b.getInstruction();
		teachername = b.getName();
		teachernumber=b.getNumber();
		teacherclass=b.getInstruction();
		String coursenumber =c.getNumber();
		String courseplace =c.getPalce();
		String courseteacher=c.getTeacher();
		coursenumber =c.getNumber();
		courseplace =c.getPalce();
		courseteacher=c.getTeacher();
		System.out.println("学生选课系统");
		System.out.println("Serial number is : " + mNumber);
		System.out.println("Name is : " + mName);
		System.out.println("Gerder is :" + mSex);
		a.setClasss("java");
		String mClass = a.getClasss();
	    System.out.println("elective is :" + mClass);
		System.out.println("lecture teacher code is :"+teachernumber);
		System.out.println("lecture teacher is ："+teachername);
		System.out.println("place location is :"+teacherclass);
		System.out.println("The course number :"+coursenumber);
        System.out.println("The course name :"+c); //课程名
		System.out.println("Course plance :"+courseplace);
		System.out.println("sclooltime is :"+df.format(new Date()));
		System.out.println("lecture teacher name is :"+courseteacher);
        System.out.println("------------------------------------------");
       
		c.xuanke(id);
        System.out.println("------------------------------------------");
	    c.duike(id);
}
}
