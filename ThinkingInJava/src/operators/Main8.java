package operators;
import java.util.*;

/**
 * @author dbavc
 * �������: �������� ���������, ������������ ������ �������.
 */

public class Main8 {
	public static void main(String []args) {
		Random rand = new Random();
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		System.out.println("int i = " + i);
		System.out.println("int j = " + j);
		System.out.println("�����: " + (i > j));
		System.out.println("����: " + (j > i));

	}

}
