package operators;
import java.util.*;
/**
 * 
 * @author dbavc
 * �������: �������� ���������, ������������ ������ �������.
 */


public class Main7 {
	static int i;
	static int j;
	public static void main(String []args) {
		Random rand = new Random(47);
		i = rand.nextInt(100);
		j = rand.nextInt(100);
		if (i > j) {
			System.out.println("����!");
			if (j < i) {
				System.out.println("�����!");
				
			}

		}
		
	}

}
