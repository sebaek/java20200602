package chap07.lecture.polymorphism.sample2;

public class MyApp {
	public static void main(String[] args) {
		Enemy[] enemys = new Enemy[5];
		enemys[0] = new EnemyGun();
		enemys[1] = new EnemyArrow();
		enemys[2] = new EnemyGun();
		enemys[3] = new EnemyArrow();
		enemys[4] = new EnemyGun();
		
		for (Enemy e : enemys) {
			e.attack();
		}
		
	}
}






