package manage.com;

import java.util.Scanner;

import model.Student;

public class Input {
	
	
	//输入密码
	public static void password(Scanner input) {
		
		System.out.println("请输入密码");
		String password = input.next();
		while(password.equals("12345678") == false) {
			System.out.println("您输入的密码有误");
			System.out.println("请重新输入密码");
			password = input.next();
		}
		mainMenuJudge(input);
	}
	
	public static void mainMenuJudge(Scanner input) {
		
		Menu.printMainMenu();
		int i = input.nextInt();
		while(true) {
			switch(i) {
			case 1:
				Inquire.addStu(Input.addInput(input));
				break;
			case 2:
				Inquire.changeStu(Input.changeInput(input));
				break;
			case 3:
				Inquire.delteStu(Input.InputTosu(input));
				break;
			case 4:
				Inquire.printOne(Input.findInput(input));
				break;
			case 5:
				Inquire.printAll();
				break;
			case 6: 
				break;
			default:
				System.out.println("您的输入有误");
				System.out.println("请重新输入");
				i = input.nextInt();
			}
			if(i == 6) {
				break;
			}else {
				Menu.returnMenu();
				if(Input.returnJudge(input) == true) {
					i = input.nextInt();
				}else {
					break;
				}
			}
		}
	}
	
	public static Student addInput(Scanner input) {
		
		Student stu = new Student();
		System.out.println("请输入学生姓名");
		stu.setStuName(input.next());
		System.out.println("请输入学生学号");
		stu.setStuNo(input.next());
		System.out.println("请输入学生年龄");
		stu.setAge(input.nextInt());
		System.out.println("请输入性别");
		stu.setGender(input.next());
		System.out.println("请输入家庭地址");
		stu.setHome(input.next());
		System.out.println("请输入学生电话号码");
		stu.setPhoneNo(input.next());
		
		return stu;
	}
	
	public static Student changeInput(Scanner input) {
		
		System.out.println("请输入你要更改的学生的编号");
		String str = input.next();
		Student stu = Inquire.stuNoToStu(str);
		if(stu == null) {
			return null;
		}
		System.out.println("请选择你要修改的学生信息");
		Menu.printChooseMenu();
		int i = input.nextInt();
		while(true) {
			switch(i) {
			case 1:
				System.out.println("请输入修改后的学生姓名");
				stu.setStuName(input.next());
				break;
			case 2:
				System.out.println("请输入修改后的学生性别");
				stu.setGender(input.next());
				break;
			case 3:
				System.out.println("请输入修改后的学生年龄");
				stu.setAge(input.nextInt());
				break;
			case 4:
				System.out.println("请输入修改后学生的居住地址");
				stu.setHome(input.next());
				break;
			case 5:
				System.out.println("请输入修改后学生的电话号码");
				stu.setPhoneNo(input.next());
			default:
				System.out.println("你的输入1有误！");
				System.out.println("请重新输入你要修改的学生信息：");
				Menu.printChooseMenu();
				i = input.nextInt();
			}
			break;
		}
		return stu;
	}
	
	public static Student InputTosu(Scanner input) {
		System.out.println("请输入要删除的学生编号");
		String str = input.next();
		Student stu = Inquire.stuNoToStu(str);
		
		return stu;
	}
	
	public static Student findInput(Scanner input) {
		System.out.println("请输入要打印的学生编号");
		String str = input.next();
		Student stu = Inquire.stuNoToStu(str);
		
		return stu;
	}
	
	public static boolean returnJudge(Scanner input) {
		
		int i = input.nextInt();
        while (i != 1 && i != 2) {
            System.out.println("您的输入有误!");
            System.out.println("请重新输入：");
            i = input.nextInt();
        }
        if (i == 1) {
            Menu.printMainMenu();
            return true;
        }
        return false;
	}
	
}
