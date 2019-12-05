class Animal{}
class Cat extends Animal{}
class Dog extends Animal{}
class InstanceOfTestSolution{
	public static void main(String [] args){
		Cat c = new Cat();
		Animal a = new Cat();
		
		//c�� ����̷� ����Ǿ����Ƿ�(�����ǰ� �����Ƿ�) System.out.println(c instanceof Dog)�� ������ �Ұ���
		//���� ����� �ּ� ó�� ����
		System.out.println(c instanceof Animal); //true: c�� new Cat()�� ���� �����Ǿ����Ƿ� ������ �����! ����̴� ������ �����̱� ������ true
		System.out.println(c instanceof Cat); //true
		//System.out.println(c instanceof Dog); //������ �Ұ�
		
		
		//a�� ������ ����Ǿ����Ƿ�(�����ǰ� �����Ƿ�) �Ʒ� ��� ������ ����
		System.out.println(a instanceof Animal); //true
		System.out.println(a instanceof Cat); //true
		System.out.println(a instanceof Dog); //false
		
		/*
		��������� 
		�������� instanceof Ŭ������
		�� ����� ������ �Ұ�/true/false �� ���� �� �ֽ��ϴ�. 
		
		1. ������ ���δ� ����� �ڷ���: 
				���� ���
					Animal a = new Cat();
				�� ��쿡�� a�� �ڷ����� Animal��.
		�� ���� �Ǵ��մϴ�. ��Ӱ��谡 ���� ��� �������� �ǰ�, ��Ӱ��谡 ���ٸ� �������� ���� �ʽ��ϴ�. 
		
		2. true/false�� � �����ڸ� ���� ������ ��ü������ ���� �Ǵ��� �մϴ�. ���� ��� 
					Animal a = new Cat(); ���� 
					 - a instanceof Animal �� ����� a�� �����δ� ������̰�, ����̴� ������ �����̱� ������ ����� true�� ������ ���Դϴ�. 
					 - a instanceof Cat �� ����� a�� �����δ� ������̰�, ����̴� �翬�� ������� �����̱� ������ ����� true�Դϴ�. 
					 - a instanceof Dog �� ����� a�� ������ ������ε�, ����̴� �������� ������ �ƴϱ� ������ ����� false�� ������ �Ǵ� ���Դϴ�. 
			
		
		*/			
		//Ȥ�� ���ص��� �ʴ� �κ� �����ø� heyjk90@gmail.com���� ���� �ֽñ� �ٶ��ϴ�.
		
	}
}
