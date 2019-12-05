class HW9_2{
	public static void main(String [] args){
		Subject [] subjectsOfkwons = {new Korean(100), new English(), new Mathematics(), new Science(100) };// ����� ����1: ���� Ŭ������ �ϳ��� �迭�� �׷�ȭ ����!!
		//����� ���� ������ 100������, ����, ���� ������ ������ ������ ����
		
		Student kwon = new Student();
		//�л� �Ѹ� ���� 
		for(Subject s: subjectsOfkwons)
			kwon.report(s);
		
	}
}
class Student{
	public void report(Subject s){//����� ����2: �� ���� ���� report()�޼ҵ带 ������ �ʾƵ� ��.
	//	���� ��� ������ �θ� Ŭ������ Subject Ŭ������ �Ű������� �޴� �޼ҵ� �ϳ��� ����� ��. 
		System.out.printf("%s ������ ������ %d�Դϴ�.\n", s.getClass().getName(), s.getScore());
	}	
}

class Subject{//����
	private int score;//private �ʵ� ���� 
	
	public Subject(){ //������ �������� �ʰ� ������ ������ ��� ������ �����ϰ� ����
		this.score = (int)(Math.random()*101);
	}
	
	public Subject(int score){//������ �����Ͽ� ������ ������ ��� ���� �ʵ带 �ش� ������ ����
		this.score = score;
	}
	
	public int getScore(){
		return score;
	}
}
class Korean extends Subject{
	//������ ���ϸ� �θ�Ŭ������ Subject�� private �ʵ� score�� �����ޱ� ������ getter�� ���� ���� �� �� ����. 
	
	public Korean(){
		//super();//���� ����. ��¥�� �θ�Ŭ������ �����ڸ� ȣ�� ���� ���� ��� ����Ʈ �����ڸ� ȣ���ϹǷ�. 
	}
	
	public Korean(int score){
		super(score);
	}
}
class English extends Subject{
	
	public English(){
	}
	
	public English(int score){
		super(score);
	}
}
class Mathematics extends Subject{
	
	public Mathematics(){
	}
	
	public Mathematics(int score){
		super(score);
	}
}
class Science extends Subject{
	
	public Science(){
	}
	
	public Science(int score){
		super(score);
	}
}