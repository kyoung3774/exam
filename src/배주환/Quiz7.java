package 배주환;

import java.util.ArrayList;

public class Quiz7 {

	public static void main(String[] args) {
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(new Human());
		list.add(new Tiger());
		
		for(Animal a : list) {
			if(a instanceof Human) {
				Human human = (Human) a;
				human.sleep();
				human.move();
				human.book();
			}
		}
		System.out.println();
		
		for(Animal a : list) {
			if(a instanceof Tiger) {
				Tiger tiger = (Tiger)a;
				tiger.sleep();
				tiger.move();
				tiger.hunting();
			}
		}
		
	}

}

// 동물 클래스
abstract class Animal {
	
	public abstract void sleep();
	
	public abstract void move();
}

// 사람 클래스
class Human extends Animal{

	@Override
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
	}

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void book() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

// 호랑이 클래스
class Tiger extends Animal {

	@Override
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
	}

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}