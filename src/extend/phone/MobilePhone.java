package extend.phone;

public class MobilePhone implements Phone, Camera, Computer {
	private String number;

	public MobilePhone(String number) {
		this.number = number;
	}

	public void takePicture() {
		System.out.println("写真を撮ります。");
	}

	public void webBrowsing() {
		System.out.println("webを閲覧します。");
	}

	public void call(String number) {
		System.out.println(this.number + " から " + number + " に電話をかけます。");
	}
}
