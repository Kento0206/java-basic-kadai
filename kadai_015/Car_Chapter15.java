package text.kadai_015;

public class Car_Chapter15 {
	private int gear = 1;
	private int speed = 10;
	
	public Car_Chapter15(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void gearChange(int afterGear) {
		if((afterGear > 5) || (afterGear < 1)) {
			System.out.println("ギアは1から５までしか存在しません");
			return;
		}
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替わりました");
		this.gear = afterGear;
	}
	public void run() {
		
		this.speed = switch(this.gear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};
		System.out.println("速度は時速" + this.speed + "kmです");
	}

}
