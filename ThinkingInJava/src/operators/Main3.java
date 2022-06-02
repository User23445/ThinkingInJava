package operators;
/**
 * @author dbavc
 * Задание: Создайте класс с полем типа float. Используйте его для демонстрации совмещения имен при вызове методо
 */

class Letter {
	float c;
}

class PassObject {
	
}
public class Main3 {
	static void f (Letter y) {
		y.c = 'z';
	}
	public static void main(String []args) {
		Letter x = new Letter();
		x.c = 'a';
		System.out.println("1: x.c = " + x.c);
		f(x);
		System.out.println("2: x.c = " + x.c);
	}

}
