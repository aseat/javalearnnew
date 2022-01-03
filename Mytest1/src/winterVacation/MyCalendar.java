package winterVacation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class MyCalendar {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // �j�����x��
        String[] week = { "��", "��", "��", "��", "��", "��", "�y" };

        // �N�̓���
        int year = 0;
        try {
            System.out.print("�N����͂��Ă��������B");
            String stringYear = bufferedReader.readLine();
            year = Integer.parseInt(stringYear);

            if (year < 2000 || 9999 < year) {
                throw new IllegalArgumentException();
            }

        } catch (NumberFormatException error) {
            System.out.println("�G���[�ł��B�����œ��͂��Ă��������B");
            System.out.println("�ŏ������蒼���Ă��������B");
            System.exit(0);
        } catch (IllegalArgumentException error) {
            System.out.println("�G���[�ł��B�N��2000�`9999�͈̔͂œ��͂��Ă��������B");
            System.out.println("�ŏ������蒼���Ă��������B");
            System.exit(0);
        }

        // ���̓���
        int month = 0;
        try {
            System.out.print("������͂��Ă��������B");
            String stringMonth = bufferedReader.readLine();
            month = Integer.parseInt(stringMonth);

            if (month < 1 || 12 < month) {
                throw new IllegalArgumentException();
            }

        } catch (NumberFormatException error) {
            System.out.println("�G���[�ł��B�����œ��͂��Ă��������B");
            System.out.println("�ŏ������蒼���Ă��������B");
            System.exit(0);
        } catch (IllegalArgumentException error) {
            System.out.println("�G���[�ł��B����1�`12�͈̔͂œ��͂��Ă��������B");
            System.out.println("�ŏ������蒼���Ă��������B");
            System.exit(0);
        }

        // Calendar�N���X�̃C���X�^���X�𐶐�
        Calendar calendar = Calendar.getInstance();

        // ���͂��ꂽ�N����1����ݒ�
        calendar.set(year, month - 1, 1);

        // ���͂��ꂽ�N����1���̗j�����擾
        int dayOfweek = calendar.get(Calendar.DAY_OF_WEEK);

        // �ŏI�����擾
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DATE, -1);
        int maxdate = calendar.get(Calendar.DATE);

        // �J�����_�[�̃^�C�g����\��
        System.out.println(year + "�N" + month + "���̃J�����_�[");

        // �j�����x����\��
        for (int j = 0; j < week.length; j++) {
            System.out.print(week[j] + " ");
        }

        // ���s
        System.out.print("\n");

        // ���t����
        int day = 0;
        for (int rowweek = 0; rowweek < 6; rowweek++) {
            for (int columnweek = 1; columnweek <= 7; columnweek++) {
                // �X�y�[�X�\��
                if (columnweek < dayOfweek && rowweek == 0) {
                    System.out.print("   ");
                } else {
                    if (day < 9) {
                        // 10����菬�����ꍇ��10�̈ʂ𔼊p�X�y�[�X1�ŕ⊮
                        System.out.print(" ");
                    }
                    if (day < maxdate) {
                        // ���t�\��
                        System.out.print(day + 1);
                        System.out.print(" ");
                        day++;
                    }
                }
            }
            // �ŏI����菬�����Ȃ���s
            if (day < maxdate) {
                System.out.print("\n");
            }
        }
    }
}