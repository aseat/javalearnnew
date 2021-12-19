package winterVacation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class YearCalendar {
	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

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

		
		Calendar calendar = Calendar.getInstance();

		String line = "------------------- ";
		int printMonth = 1;
		int month = 0;
		int dayOfweek = 0;
		int lastOfdate = 0;
		String[][][] dateText = new String[12][6][7];

		for (int monthOfYear = 0; monthOfYear < 12; monthOfYear++) {
			calendar.set(year, month, 1);

			month = calendar.get(Calendar.MONTH);
			dayOfweek = calendar.get(Calendar.DAY_OF_WEEK) - 1;

			calendar.add(Calendar.MONTH, 1);
			calendar.add(Calendar.DATE, -1);
			
			lastOfdate = calendar.get(Calendar.DATE);
			int day = 1;
			for (int row = 0; row < 6; row++) {
				for (int column = 0; column < 7; column++) {
					if (column < dayOfweek && row == 0) {
						dateText[monthOfYear][row][column] = "   ";
					} else {
						if (day <= 9) {
							dateText[monthOfYear][row][column] = " " + day + " ";
							day++;
						} else if (day <= lastOfdate && 10 <= day) {
							dateText[monthOfYear][row][column] = day + " ";
							day++;
						} else if (lastOfdate < day) {
							dateText[monthOfYear][row][column] = "   ";
						}
					}
				}
			}
			month++;
		}

		String[] week = { "日", "月", "火", "水", "木", "金", "土" };

		for (int monthYear = 0; monthYear < 12; monthYear += 4) {
			for (int lines = 1; lines <= 4; lines++) {
				System.out.print(line);
			}
			System.out.print("\n");

			for (int monthTitle = 1; monthTitle <= 4; monthTitle++) {
				if (printMonth <= 9) {
					System.out.print("         " + printMonth + "月        ");
				} else {
					System.out.print("         " + printMonth + "月        ");
				}
				printMonth++;
			}
			System.out.print("\n");

			for (int lines = 1; lines <= 4; lines++) {
				System.out.print(line);
			}
			System.out.print("\n");
			for (int weeks = 1; weeks <= 4; weeks++) {
				for (int dayOfweeks = 0; dayOfweeks < week.length; dayOfweeks++) {
					System.out.print(week[dayOfweeks] + " ");
				}
				System.out.print(" ");
			}
			System.out.print("\n");
			for (int getRow = 0; getRow < 6; getRow++) {
				for (int getMonth = 0; getMonth < 4; getMonth++) {
					for (int printDay = 0; printDay < 7; printDay++) {
						System.out.print(dateText[monthYear + getMonth][getRow][printDay]);
					}
				}
				System.out.print("\n");
			}
			for (int lines = 1; lines <= 4; lines++) {
				System.out.print(line);
			}
			System.out.print("\n");
		}

	}

}
