package winterVacation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class MyCalendar {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // 曜日ラベル
        String[] week = { "日", "月", "火", "水", "木", "金", "土" };

        // 年の入力
        int year = 0;
        try {
            System.out.print("年を入力してください。");
            String stringYear = bufferedReader.readLine();
            year = Integer.parseInt(stringYear);

            if (year < 2000 || 9999 < year) {
                throw new IllegalArgumentException();
            }

        } catch (NumberFormatException error) {
            System.out.println("エラーです。数字で入力してください。");
            System.out.println("最初からやり直してください。");
            System.exit(0);
        } catch (IllegalArgumentException error) {
            System.out.println("エラーです。年は2000～9999の範囲で入力してください。");
            System.out.println("最初からやり直してください。");
            System.exit(0);
        }

        // 月の入力
        int month = 0;
        try {
            System.out.print("月を入力してください。");
            String stringMonth = bufferedReader.readLine();
            month = Integer.parseInt(stringMonth);

            if (month < 1 || 12 < month) {
                throw new IllegalArgumentException();
            }

        } catch (NumberFormatException error) {
            System.out.println("エラーです。数字で入力してください。");
            System.out.println("最初からやり直してください。");
            System.exit(0);
        } catch (IllegalArgumentException error) {
            System.out.println("エラーです。月は1～12の範囲で入力してください。");
            System.out.println("最初からやり直してください。");
            System.exit(0);
        }

        // Calendarクラスのインスタンスを生成
        Calendar calendar = Calendar.getInstance();

        // 入力された年月の1日を設定
        calendar.set(year, month - 1, 1);

        // 入力された年月の1日の曜日を取得
        int dayOfweek = calendar.get(Calendar.DAY_OF_WEEK);

        // 最終日を取得
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DATE, -1);
        int maxdate = calendar.get(Calendar.DATE);

        // カレンダーのタイトルを表示
        System.out.println(year + "年" + month + "月のカレンダー");

        // 曜日ラベルを表示
        for (int j = 0; j < week.length; j++) {
            System.out.print(week[j] + " ");
        }

        // 改行
        System.out.print("\n");

        // 日付部分
        int day = 0;
        for (int rowweek = 0; rowweek < 6; rowweek++) {
            for (int columnweek = 1; columnweek <= 7; columnweek++) {
                // スペース表示
                if (columnweek < dayOfweek && rowweek == 0) {
                    System.out.print("   ");
                } else {
                    if (day < 9) {
                        // 10日より小さい場合は10の位を半角スペース1つで補完
                        System.out.print(" ");
                    }
                    if (day < maxdate) {
                        // 日付表示
                        System.out.print(day + 1);
                        System.out.print(" ");
                        day++;
                    }
                }
            }
            // 最終日より小さいなら改行
            if (day < maxdate) {
                System.out.print("\n");
            }
        }
    }
}