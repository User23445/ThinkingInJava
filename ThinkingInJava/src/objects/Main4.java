package objects;

public class Main4 {
	public static void main(String []args) {
		class DataOnly {
			int a;
			double b;
			boolean c;
			void show() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
		}
		DataOnly data = new DataOnly();
		data.a = 47;
		data.b = 1.1;
		data.c = false;
		data.show();	
	}

}
