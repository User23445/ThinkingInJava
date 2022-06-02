package objects;

public class Main5 {
	public static void main(String []args) {
		class DataOnly {
			int d;
			double e;
			boolean f;
			void show() {
				System.out.println(d);
				System.out.println(e);
				System.out.println(f);
			}
		}
		DataOnly data = new DataOnly();
		data.d = 155;
		data.e = 90.5;
		data.f = true;
		data.show();
	}

}
