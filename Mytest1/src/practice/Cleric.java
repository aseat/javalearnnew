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
        	System.out.println(this.name + "�̓Z���t�G�C�h���������I");
            this.mp -= 5;
            this.hp= this.MAX_HP;
            System.out.println("HP���S�񕜂���");
        }else{
            System.out.println("MP������Ȃ����߉񕜂ł��܂���");
        }
    }

    public int pray(int sec) {
        System.out.println(this.name + "��" + sec + "�b�ԓV�ɋF�����I");

        // �񕜗ʂ𗐐���p���Č��肷��
        int recover = new Random().nextInt(3) + sec;

        // ���ۂ̉񕜗ʂ��v�Z����
        int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

        this.mp += recoverActual;

        System.out.println("MP��"+recoverActual+"�A�񕜂���");
        
        return recoverActual;
    }
}