package objects;
/**
 * @author dbavc
 * Цель: создать программу Hello World
 * <img src = "docfiles" alt>
 */
import java.util.*;

public class Main2 {
	static long BeforeTime = -1;
	public static void main(String []args) {
		BeforeTime = System.currentTimeMillis();
		System.out.println("Exercise 2; main(); program started");
		System.out.println("Hello World!");
		System.out.println("Today: " + new Date());
		System.out.println("Exercise 2; main(); program finished");
		System.out.println("Exercise; main(); TimeMillis: " + (System.currentTimeMillis() - BeforeTime));
	}

}
