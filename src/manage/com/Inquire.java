package manage.com;

import model.Student;

public class Inquire {
	
	private static Student stus[] = new Student[20];
	private static int dataIndex = 0;
	
	//添加学生信息
	public static void addStu(Student stu){
		
		if(dataIndex > stus.length) {
			Student[] tempIndex = new Student[dataIndex];//超过设定数组后产生一个新对象
			for(int i = 0; i < stus.length; i++) {
				tempIndex[i] = stus[i];//进行信息复制
			}
			stus = tempIndex;//新对想赋值给原先对象
		}
		stus[dataIndex] = stu;//实现扩容
		dataIndex++;
	}
	
	//修改学生信息
	public static Student changeStu(Student stu) {
		
		if(stu == null) {
			return null;
		}
		for(int i = 0; i < dataIndex; i++) {
			if(stu.getStuNo().equals(stus[i].getStuNo())) {
				return stu;
			}
		}
		return null;
	}
	
	//删除学生信息
	public static void delteStu(Student stu) {
		
		boolean cmp = false;
		for(int i = 0; i < dataIndex; i++) {
			if(stu.getStuNo().equals(stus[i].getStuNo())) {
				cmp = true;
			}
			if(cmp) {
				stus[i] = stus[i+1];
			}
		}
		if(cmp) {
			System.out.println("删除成功");
		}
		dataIndex--;
	}
	
	//按学号查找学生信息
	public static Student stuNoToStu(String stuNo) {
			
		for(int i = 0; i < dataIndex; i++) {
			if(stuNo.equals(stus[i].getStuNo())) {
				return stus[i];
			}
		}
		System.out.println("查不到此学生");
		return null;
	}
	
	//打印单个学生信息
	public static void printOne(Student stu) {
		
		System.out.println("姓名：" + stu.getStuName());
		System.out.println("学号：" + stu.getStuNo());
		System.out.println("年龄：" + stu.getAge());
		System.out.println("性别：" + stu.getGender());
		System.out.println("家庭住址：" + stu.getHome());
		System.out.println("电话号码：" + stu.getPhoneNo());
	}
	
	//打印全体学生信息
	public static void printAll(){
		
		for(int i = 0; i < dataIndex; i++) {
			Inquire.printOne(stus[i]);
			System.out.println("\n");
		}
	}
}





