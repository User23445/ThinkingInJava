package objects;

public class Main3 {
	public static void main(String []args) {
		class ATypeName {
			int a;
			int b;
			int c;
			void show() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
		}
		ATypeName a = new ATypeName();
			a.a = 15;
			a.b = 17;
			a.c = 100;
			a.show();
			
	}

}
