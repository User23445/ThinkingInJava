package objects;

public class Main6 {
	public static void main(String []args) {
		class Storage {
		int storage(String s) {
			return s.length() * 2; 
			}
		}
		Storage x = new Storage();
		System.out.println(x.storage("hi"));
		
	}

}
