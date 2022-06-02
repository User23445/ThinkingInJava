package operators;
/**
 * 
 * @author dbavc
 * Задание 5: Создайте класс Dog, содержащий два поля типа String: name и says. 
 * В методе main() создайте два объекта Dog с разными именами (spot и scruffy) и сообщениями. 
 * Выведите значения обоих полей для каждого из объектов
 * 
 * Задание 6: В упражнении 5 создайте новую ссылку на Dog и присвойте ее объекту spot.  
 * Сравните ссылки оператором == и методом equals().
 * 
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
		spot.setSays("Гав! Гав!");
		
		Dog scruffy  = new Dog();
		scruffy.setName("Scruffy");
		scruffy.setSays("Вуф!");
		
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
		System.out.println("Comparison: ");
		scooby = spot;
		System.out.println("Scooby == Spot: " + (scooby==spot));
		System.out.println("Scooby.equals(Spot):" + scooby.equals(spot));
		scooby.showName();
		scooby.speak();
	}
	
}
