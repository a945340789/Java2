# 计201 2020322073 宋子寒
# Java2
实验三面向对象编程之学生选课模拟系统

## 实验目的
1. 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
2. 掌握面向对象的类设计方法（属性、方法）；
3. 掌握类的继承用法，通过构造方法实例化对象；
4. 学会使用super()，用于实例化子类；
5. 掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 实验要求
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
对象示例：	人员（编号、姓名、性别……）
教师（编号、姓名、性别、所授课程、……）
			学生（编号、姓名、性别、所选课程、……）
			课程（编号、课程名称、上课地点、时间、授课教师、……）
以上属性仅为示例，同学们可以自行扩展（黄色背景的文字，不能原篇出现在实验报告中，需要进一步明确所有的属性）。
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。
## 实验过程
1. 构造出人员(Person)类，并表明属性和构造方法；
2. 将学生(Student)类和老师(Teather)类继承父类人员(Person)类，并实例化子类；
3. 构造课程(Course)类，并表明属性和构造方法；
4. 学生选课和退课系统，键盘输入数字1、2、3、4分别代表选课语文、java、计算机组成原理和ps教程，输入5、6、7、8分别表示语文退课、java退课、计算机组成原理退课和ps教程退课。
## 核心方法
构造方法变量初始化
```
public Personer(String number,String name,String sex) {
		this.number=number;
		this.name=name;
		this.sex=sex;
		}
```
switch语句
```

		switch(code) {
		case 1:
			System.out.println("你选择的是:语文");
			break;
		case 2:
			System.out.println("你选择的是:java");
			break;
		case 3:
			System.out.println("你选择的是:计算机组成原理");
			break;
		case 4:
			System.out.println("你选择的是:ps教程");
		 default:
	        System.out.println("输出错误");break;
		}
```
if语句
```
if(id1==5) {
			System.out.println("您要退的课程是语文");
		}else if(id1==6) {
			System.out.println("您要退的课程是java");
		}else if(id1==7) {
			System.out.println("您要退的课程是计算机组成原理");
		}else if(id1==8) {
			System.out.println("您要退的课程是ps教程");
		}else {
			System.out.println("操作错误");
		}
```
## 实验结果
```
学生选课系统
Serial number is : 202055534
Name is : 白老师
Gerder is :man
elective is :java
lecture teacher code is :202055534
lecture teacher is ：白老师
place location is :大学英语
The course number :102
The course name :程序设计基础
Course plance :教学楼16#402
sclooltime is :2020-11-01 23:07:12
lecture teacher name is :王达
------------------------------------------
张三  男  18
1:语文  2:java  3:计算机组成原理  4:ps教程
请输入你选修的课程编号
1
你选择的是:语文
------------------------------------------
退课系统
1:语文退课  2:java退课  3:计算机组成原理退课  4:ps教程退课
5
您要退的课程是语文
```
## 实验感想
1. 熟悉了继承的用法和父类方法的调用；
2. 学会了使用super()，用于实例化子类；
3. 掌握了面向对象的类设计方法（属性、方法）；
