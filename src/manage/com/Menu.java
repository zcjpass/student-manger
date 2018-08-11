package manage.com;

public class Menu {
	
	 //打印主菜单 
	public static void printMainMenu() {
		
		System.out.println("请选择操作：");
		System.out.println("     1.添加学生信息");
		System.out.println("     2.修改学生信息");
		System.out.println("     3.删除学生信息");
		System.out.println("     4.查找学生信息");
		System.out.println("     5.打印所有学生信息");
		System.out.println("     6.退出");
	}
	
	//打印选择菜单
	public static void printChooseMenu() {
		
		System.out.println("      1.姓名");
		System.out.println("      2.性别");
		System.out.println("      3.年龄");
		System.out.println("      4.居住地址");
		System.out.println("      5.电话号码");
	}
	
	//返回菜单
	public static void returnMenu() {
		
		System.out.println("请您选择接下来要进行的操作：");
		System.out.println("     1.返回主菜单");
		System.out.println("     2.退出");
	}
}
