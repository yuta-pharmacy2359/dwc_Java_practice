package extend.animal;

public class Frog extends Animal {

	public Frog() {
		this.name = "蛙";
	}

	public void cry() {
		System.out.println(this.name + "が鳴きました。ゲロゲロ!");
	}
}
