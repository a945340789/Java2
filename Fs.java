package classpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fs {
public void show() {
	Students a=new Students();
	 Teacher b=new Teacher();
	 Course c=new Course("������ƻ���");
	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
	 	a.setNumber("20202546240");	
		a.setName("szh");
		a.setSex("man");
		b.setNumber("202055534");
		b.setName("����ʦ");
		b.setInstruction("��ѧӢ��");
		c.setNumber("102");
		c.setPalce("��ѧ¥16#402");
		c.setTeacher("����");
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
		System.out.println("ѧ��ѡ��ϵͳ");
		System.out.println("Serial number is : " + mNumber);
		System.out.println("Name is : " + mName);
		System.out.println("Gerder is :" + mSex);
		a.setClasss("java");
		String mClass = a.getClasss();
	    System.out.println("elective is :" + mClass);
		System.out.println("lecture teacher code is :"+teachernumber);
		System.out.println("lecture teacher is ��"+teachername);
		System.out.println("place location is :"+teacherclass);
		System.out.println("The course number :"+coursenumber);
        System.out.println("The course name :"+c); //�γ���
		System.out.println("Course plance :"+courseplace);
		System.out.println("sclooltime is :"+df.format(new Date()));
		System.out.println("lecture teacher name is :"+courseteacher);
        System.out.println("------------------------------------------");
       
		c.xuanke(id);
        System.out.println("------------------------------------------");
	    c.duike(id);
}
}
