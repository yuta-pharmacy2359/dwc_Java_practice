
public class Chapter07 {
	public static void main(String[] args) {
		int length = 13;
		if (length <= 5) {
			System.out.println("とても近いです");
		} else if (length <= 10) {
			System.out.println("近いです");
		} else if (length <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}

		String signal = "yellow";
		switch (signal) {
		case "red":
			System.out.println("赤信号です。進んではいけません");
			break;
		case "yellow":
			System.out.println("黄信号です。進んではいけませんが、止まれない場合は進んでもよいです");
			break;
		case "blue":
			System.out.println("青信号です。進んでもよいです");
			break;
		default:
			System.out.println("そのような信号の色はありません");
		}
	}
}
