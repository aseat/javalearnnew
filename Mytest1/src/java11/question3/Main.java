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
        //�@�ϐ�coupon3��錾���܂��B5�����̃N�[�|���𐶐���������܂��B
        //�A�ϐ�coupon4��錾���܂��B1500�~���̃N�[�|���𐶐���������܂��B
        //�BCasher��payment���\�b�h���Ăяo���A5000�~�ɑ΂���coupon3��K�p�������ʂ�\�����܂��B
        //�CCasher��payment���\�b�h���Ăяo���A5000�~�ɑ΂���coupon4��K�p�������ʂ�\�����܂��B
    }
}