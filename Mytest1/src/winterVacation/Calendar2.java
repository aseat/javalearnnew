package winterVacation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Calendar2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int year = getValidatedYear(bufferedReader);
		int month = 0;
		int dayOfweek = 0;
		int lastOfdate = 0;
		String[][][] dateText = new String[12][6][7];

		for (int monthOfYear = 0; monthOfYear < 12; monthOfYear++) {
			Calendar calendar = Calendar.getInstance();
			calendar.set(year, month, 1);

			month = calendar.get(Calendar.MONTH);
			dayOfweek = calendar.get(Calendar.DAY_OF_WEEK) - 1;

			calendar.add(Calendar.MONTH, 1);
			calendar.add(Calendar.DATE, -1);
			lastOfdate = calendar.get(Calendar.DATE);

			month = getDayOfYear(month, dayOfweek, lastOfdate, dateText, monthOfYear);
		}

		int printMonthTitle = 1;

		for (int printCalendar = 0; printCalendar < 12; printCalendar += 4) {
			printLine();

			printMonthTitle = printMonthTitle(printMonthTitle);

			printLine();

			printDayOfWeekLabel();

			printDay(dateText, printCalendar);

			printLine();
		}

	}

	private static void printDay(String[][][] dateText, int monthYear) {
		for (int row = 0; row < 6; row++) {
			for (int currentmonth = 0; currentmonth < 4; currentmonth++) {
				for (int printDay = 0; printDay < 7; printDay++) {
					System.out.print(dateText[monthYear + currentmonth][row][printDay]);
				}
			}
			System.out.print("\n");
		}
	}

	private static int printMonthTitle(int printMonthTitle) {
		for (int monthTitle = 1; monthTitle <= 4; monthTitle++) {
			if (printMonthTitle <= 9) {
				System.out.print("         " + printMonthTitle + "月         ");
			} else {
				System.out.print("        " + printMonthTitle + "月         ");
			}
			printMonthTitle++;
		}
		System.out.print("\n");
		return printMonthTitle;
	}

	private static int getDayOfYear(int month, int dayOfweek, int lastOfdate, String[][][] dateText, int monthOfYear) {
		int day = 1;
		for (int row = 0; row < 6; row++) {
			for (int column = 0; column < 7; column++) {
				if (isEmptyColumn(dayOfweek, row, column)) {
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
		return month;
	}

	private static boolean isEmptyColumn(int dayOfweek, int row, int column) {
		return column < dayOfweek && row == 0;
	}

	private static void printDayOfWeekLabel() {
		String[] week = { "日", "月", "火", "水", "木", "金", "土" };
		for (int weeks = 1; weeks <= 4; weeks++) {
			for (int dayOfweeks = 0; dayOfweeks < week.length; dayOfweeks++) {
				System.out.print(week[dayOfweeks] + " ");
			}
		}
		System.out.print("\n");
	}

	private static void printLine() {
		String line = "-------------------- ";
		for (int lines = 1; lines <= 4; lines++) {
			System.out.print(line);
		}
		System.out.print("\n");
	}

	private static int getValidatedYear(BufferedReader bufferedReader) throws IOException {
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
		return year;
	}

}
