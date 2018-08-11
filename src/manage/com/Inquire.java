package manage.com;

import model.Student;

public class Inquire {
	
	private static Student stus[] = new Student[20];
	private static int dataIndex = 0;
	
	//���ѧ����Ϣ
	public static void addStu(Student stu){
		
		if(dataIndex > stus.length) {
			Student[] tempIndex = new Student[dataIndex];//�����趨��������һ���¶���
			for(int i = 0; i < stus.length; i++) {
				tempIndex[i] = stus[i];//������Ϣ����
			}
			stus = tempIndex;//�¶��븳ֵ��ԭ�ȶ���
		}
		stus[dataIndex] = stu;//ʵ������
		dataIndex++;
	}
	
	//�޸�ѧ����Ϣ
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
	
	//ɾ��ѧ����Ϣ
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
			System.out.println("ɾ���ɹ�");
		}
		dataIndex--;
	}
	
	//��ѧ�Ų���ѧ����Ϣ
	public static Student stuNoToStu(String stuNo) {
			
		for(int i = 0; i < dataIndex; i++) {
			if(stuNo.equals(stus[i].getStuNo())) {
				return stus[i];
			}
		}
		System.out.println("�鲻����ѧ��");
		return null;
	}
	
	//��ӡ����ѧ����Ϣ
	public static void printOne(Student stu) {
		
		System.out.println("������" + stu.getStuName());
		System.out.println("ѧ�ţ�" + stu.getStuNo());
		System.out.println("���䣺" + stu.getAge());
		System.out.println("�Ա�" + stu.getGender());
		System.out.println("��ͥסַ��" + stu.getHome());
		System.out.println("�绰���룺" + stu.getPhoneNo());
	}
	
	//��ӡȫ��ѧ����Ϣ
	public static void printAll(){
		
		for(int i = 0; i < dataIndex; i++) {
			Inquire.printOne(stus[i]);
			System.out.println("\n");
		}
	}
}





