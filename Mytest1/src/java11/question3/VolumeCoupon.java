package java11.question3;

public class VolumeCoupon implements Coupon{
	int volume;
	
	public VolumeCoupon(int volume) {
		this.volume=volume;
	}
	
	public int discount(int amount) {
		int price = amount-volume;
		return price;
	}
}
