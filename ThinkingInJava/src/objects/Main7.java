package objects;
class StaticTest {
		static int i = 47;
	}
class Incrementable {
		static void increment() {
			StaticTest.i++;
			} 
	}

public class Main7 {
	static long BeforeTime = -1;
	public static void main(String []args) {
		BeforeTime = System.currentTimeMillis();
		System.out.println("Exercise 7; main(); program started");
		System.out.println("StaticTest st1 = " + StaticTest.i);
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		Incrementable sf = new Incrementable();
		sf.increment();
		System.out.println("ѕосле увеличени€ параметра i на единицу:");
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st1.i);
		Incrementable.increment();
		System.out.println("ѕосле увеличени€ параметра еще i на единицу:");
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st1.i);
		System.out.println("Exercise 7; main(); program finished");
		System.out.println("Exercise 7; main(); TimeMillis: " + (System.currentTimeMillis() - BeforeTime));
	}
}