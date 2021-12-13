package practice;

import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

    public void selfAid() {
        if(this.mp>=5) {
        	System.out.println(this.name + "はセルフエイドを唱えた！");
            this.mp -= 5;
            this.hp= this.MAX_HP;
            System.out.println("HPが全回復した");
        }else{
            System.out.println("MPが足りないため回復できません");
        }
    }

    public int pray(int sec) {
        System.out.println(this.name + "は" + sec + "秒間天に祈った！");

        // 回復量を乱数を用いて決定する
        int recover = new Random().nextInt(3) + sec;

        // 実際の回復量を計算する
        int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

        this.mp += recoverActual;

        System.out.println("MPが"+recoverActual+"、回復した");
        
        return recoverActual;
    }
}