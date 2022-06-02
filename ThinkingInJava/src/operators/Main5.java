package operators;
/**
 * 
 * @author dbavc
 * ������� 5: �������� ����� Dog, ���������� ��� ���� ���� String: name � says. � ������ 
main() �������� ��� ������� Dog � ������� ������� (spot � scruffy) � �����������. 
�������� �������� ����� ����� ��� ������� �� ��������.
 * ������� 6: � ���������� 5 �������� ����� ������ �� Dog � ��������� �� ������� spot. 
�������� ������ ���������� == � ������� equals().
 */ 

class Dog {
	String name;
	String says;
	void setName(String n) {
		name = n;
	}
	
	void setSays(String s) {
		says  = s;
	}
	
	void showName() {
		System.out.println(name);
	}
	
	void speak() {
		System.out.println(says);
	}
}

public class Main5 {
	public static void main(String []args) {
		Dog spot = new Dog();
		spot.setName("Spot");
		spot.setSays("���! ���!");
		
		Dog scruffy  = new Dog();
		scruffy.setName("Scruffy");
		scruffy.setSays("���! ���!");
		
		spot.showName();
		spot.speak();
		scruffy.showName();
		scruffy.speak();
		
		System.out.println("It's time to create a new Dog");
		Dog scooby = new Dog();
		scooby.setName("Scooby");
		scooby.setSays("Scooby Dooby Doo!");
		scooby.showName();
		scooby.speak();
		System.out.println("�omparison: ");
		scooby = spot;
		System.out.println("Scooby == Spot: " + (scooby==spot));
		System.out.println("Scooby.equals(Spot):" + scooby.equals(spot));
		scooby.showName();
		scooby.speak();
	}
	
}
