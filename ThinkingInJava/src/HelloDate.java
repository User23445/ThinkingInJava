//HelloDate.java
import java.util.*;

public class HelloDate {
	static long BeforeTime = -1; 
	public static void main(String []args) {
		BeforeTime = System.currentTimeMillis();
		System.out.println("Exercise: maim(): program started");
		System.out.println("Hello, today: ");
		System.out.println (new Date());
		System.out.println("Exercise: main(): program finished");
		System.out.println("Exercise: main(): millis passed = "  + (System.currentTimeMillis() - BeforeTime));
		
	}

}
