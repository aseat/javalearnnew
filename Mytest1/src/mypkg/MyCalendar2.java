package mypkg;
import java.io.*;
import java.util.Calendar;

class MyCalendar2{
	public static void main(String[] args)throws IOException{
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	
		//曜日ラベル
		String[] week = {"日","月","火","水","木","金","土"};
		
		//年の入力
		System.out.print("年を入力してください");
		String stryear = br.readLine();
		int year = Integer.parseInt(stryear);
		
		//月の入力
		System.out.print("月を入力してください");
		String strmonth = br.readLine();
		int month = Integer.parseInt(strmonth);
		
		//Calendarクラスのインスタンスを生成
		Calendar cal = Calendar.getInstance();
		
		//入力された年月の1日を設定
		cal.set(year,month-1,1);
		
		//入力された年月の1日の曜日を取得
		int iweek = cal.get(Calendar.DAY_OF_WEEK);
		
		//最終日を取得
		cal.add(Calendar.MONTH,1);
		cal.add(Calendar.DATE,-1);
		int maxdate = cal.get(Calendar.DATE);
		
		//カレンダーのタイトルを表示
		System.out.println(year+"年"+month+"月のカレンダー");
		
		//曜日ラベルを表示
		for(int j=0; j<week.length; j++){
			System.out.print(week[j]+"　");
		}
		
		//改行
		System.out.print("\n");
		
		//日付部分
		int day=0;
		for(int rowweek=0; rowweek<6; rowweek++){
			for(int colweek=1; colweek<=7; colweek++){
				//スペース表示
				if(colweek<iweek && rowweek==0){
					System.out.print("   ");
				}else{
					if(day<9){
						//10日より小さい場合は10の位を半角スペース1つで補完
						System.out.print(" ");
					}
					if(day<maxdate){
						//日付表示
						System.out.print(day+1);
						System.out.print(" ");
						day++;
					}
				}
			}
			//最終日より小さいなら改行
			if(day<maxdate){
				System.out.print("\n");
			}
		}
	}
}