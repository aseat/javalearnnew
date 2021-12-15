package java11.question3;

public class Main {
    public static void main(String[] args) {
        PercentageCoupon coupon1 = new PercentageCoupon(0.3);
        VolumeCoupon coupon2 = new VolumeCoupon(1000);
        System.out.println(Casher.payment(5000, coupon1));
        System.out.println(Casher.payment(5000, coupon2));


        PercentageCoupon coupon3 = new PercentageCoupon(0.5);
        VolumeCoupon coupon4 = new VolumeCoupon(1500);
        System.out.println(Casher.payment(5000, coupon3));
        System.out.println(Casher.payment(5000, coupon4));
        //①変数coupon3を宣言します。5割引のクーポンを生成し代入します。
        //②変数coupon4を宣言します。1500円引のクーポンを生成し代入します。
        //③Casherのpaymentメソッドを呼び出し、5000円に対してcoupon3を適用した結果を表示します。
        //④Casherのpaymentメソッドを呼び出し、5000円に対してcoupon4を適用した結果を表示します。
    }
}