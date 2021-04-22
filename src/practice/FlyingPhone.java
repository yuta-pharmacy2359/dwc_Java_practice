package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
	private int flyingTime;

	public FlyingPhone(int flyingTime) {
		this.flyingTime = flyingTime;
	}

	public void fly() {
		System.out.println(this.flyingTime + " 分間、飛びます");
	}

	public void call(String number) {
		System.out.println(number + " に電話します。通話できるのは飛んでいる間だけです。");
	}

	@Override
	public void powerOff() {
		Flying.super.powerOff();
	}
}
