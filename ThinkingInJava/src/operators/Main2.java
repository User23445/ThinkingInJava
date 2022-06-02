package operators;
/**
 * 
 * @author dbavc
 * Задание 2: Создайте класс с полем типа float. Используйте его для демонстрации совмещения имен.
 */

class Tank {
	float level;
}
public class Main2 {
	public static void main(String []args) {
	Tank t1 = new Tank();
	Tank t2 = new Tank();
	t1.level = 34;
	t2.level = 54;
	System.out.println("1: t1.level = " + t1.level + "t2.level = " + t2.level);	
	t1 = t2;
	System.out.println("2: t1.level = " + t1.level + "t2.level = " + t2.level);	
	t1.level = 44;
	System.out.println("t1.level + " + t1.level + "t2.level = " + t2.level);	
	}
	
}
