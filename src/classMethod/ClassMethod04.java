package classMethod;

import classMethod.human.Human04;

public class ClassMethod04 {
	public static void main(String[] args) {
		Human04 yamada = new Human04("山田");
		Human04 sato = new Human04("佐藤");
		Human04 suzuki = new Human04("鈴木");

		Human04.staticMethodPrint();

		System.out.println(Human04.GREETING);

		yamada.instanceMethodPrint();
		sato.instanceMethodPrint();
		suzuki.instanceMethodPrint();
	}
}
