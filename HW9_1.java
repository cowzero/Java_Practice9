public class HW9_1{
	public static void main(String [] args){
		Animal animal[]={new Cat(), new Dolphin(), new Dove()};
		for(Animal a: animal) a.move();
	}
}

class Animal{
	public Animal(){
	}
	
	public void move(){
		System.out.printf("���� %s�̰�, ", this.getClass().getName());
	}
}
class Cat extends Animal{
	public Cat(){
	}
	@Override
	public void move(){
		super.move();
		System.out.println("�޸��ϴ�.");
	}
	
}
class Dolphin extends Animal{
	public Dolphin(){
	}
	
	@Override
	public void move(){
		super.move();
		System.out.println("�����մϴ�.");
	}
	
}
class Dove extends Animal{
	public Dove(){
	}
	
	@Override
	public void move(){
		super.move();
		System.out.println("���ƴٴմϴ�.");
	}
	
}