package java11.question3;

public class PercentageCoupon implements Coupon{
	double rate;
	
	public PercentageCoupon(double rate){
		this.rate = rate;
	}
	
	public int discount(int amounto) {
		double price = amounto * rate;
		return (int)price;
	}
}
