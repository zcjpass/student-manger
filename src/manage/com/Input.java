package manage.com;

import java.util.Scanner;

import model.Student;

public class Input {
	
	
	//��������
	public static void password(Scanner input) {
		
		System.out.println("����������");
		String password = input.next();
		while(password.equals("12345678") == false) {
			System.out.println("���������������");
			System.out.println("��������������");
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
				System.out.println("������������");
				System.out.println("����������");
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
		System.out.println("������ѧ������");
		stu.setStuName(input.next());
		System.out.println("������ѧ��ѧ��");
		stu.setStuNo(input.next());
		System.out.println("������ѧ������");
		stu.setAge(input.nextInt());
		System.out.println("�������Ա�");
		stu.setGender(input.next());
		System.out.println("�������ͥ��ַ");
		stu.setHome(input.next());
		System.out.println("������ѧ���绰����");
		stu.setPhoneNo(input.next());
		
		return stu;
	}
	
	public static Student changeInput(Scanner input) {
		
		System.out.println("��������Ҫ���ĵ�ѧ���ı��");
		String str = input.next();
		Student stu = Inquire.stuNoToStu(str);
		if(stu == null) {
			return null;
		}
		System.out.println("��ѡ����Ҫ�޸ĵ�ѧ����Ϣ");
		Menu.printChooseMenu();
		int i = input.nextInt();
		while(true) {
			switch(i) {
			case 1:
				System.out.println("�������޸ĺ��ѧ������");
				stu.setStuName(input.next());
				break;
			case 2:
				System.out.println("�������޸ĺ��ѧ���Ա�");
				stu.setGender(input.next());
				break;
			case 3:
				System.out.println("�������޸ĺ��ѧ������");
				stu.setAge(input.nextInt());
				break;
			case 4:
				System.out.println("�������޸ĺ�ѧ���ľ�ס��ַ");
				stu.setHome(input.next());
				break;
			case 5:
				System.out.println("�������޸ĺ�ѧ���ĵ绰����");
				stu.setPhoneNo(input.next());
			default:
				System.out.println("�������1����");
				System.out.println("������������Ҫ�޸ĵ�ѧ����Ϣ��");
				Menu.printChooseMenu();
				i = input.nextInt();
			}
			break;
		}
		return stu;
	}
	
	public static Student InputTosu(Scanner input) {
		System.out.println("������Ҫɾ����ѧ�����");
		String str = input.next();
		Student stu = Inquire.stuNoToStu(str);
		
		return stu;
	}
	
	public static Student findInput(Scanner input) {
		System.out.println("������Ҫ��ӡ��ѧ�����");
		String str = input.next();
		Student stu = Inquire.stuNoToStu(str);
		
		return stu;
	}
	
	public static boolean returnJudge(Scanner input) {
		
		int i = input.nextInt();
        while (i != 1 && i != 2) {
            System.out.println("������������!");
            System.out.println("���������룺");
            i = input.nextInt();
        }
        if (i == 1) {
            Menu.printMainMenu();
            return true;
        }
        return false;
	}
	
}
