# Java_Practice9
1. main() 메소드가 아래와 같을 때, 동물, 고양이, 돌고래, 비둘기 클래스를 작성하시오.
- main 메서드:
Animal animal[]={new Cat(), new Dolphin(), new Dove()};
for(Animal a: animal) a.move();
- 출력:
나는 Cat이고, 달립니다.
나는 Dolphin이고, 수영합니다.
나는 Dove이고, 날아다닙니다.
2. 아래 조건에 맞게 학생, 국어, 영어, 수학, 과학 클래스를 작성하시오(필요하다면 클래스를 더
만들어서 작성할 것).
- 모든 과목 클래스는 점수 필드(private)를 가진다. 디폴트 생성자를 통해 과목을 생성할
경우 점수는 0-100 점사이의 임의의 정수로 랜덤하게 설정된다.
- 학생 클래스는 report()라는 메소드를 가지는데, 이 메소드는 과목을 매개변수로 받아
해당 과목의 점수를 출력한다.
