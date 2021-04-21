package extend.animal;

public abstract class Animal {
	protected String name;

	public void eat() {
		System.out.println(name + "が食事をしました!");
	}

	public void swim() {
		System.out.println(name + "が泳ぎました!");
	}

	public abstract void cry();
}
