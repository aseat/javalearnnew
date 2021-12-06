package mypkg;
import java.io.*;
import java.util.Calendar;

class MyCalendar2{
	public static void main(String[] args)throws IOException{
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	
		//�j�����x��
		String[] week = {"��","��","��","��","��","��","�y"};
		
		//�N�̓���
		System.out.print("�N����͂��Ă�������");
		String stryear = br.readLine();
		int year = Integer.parseInt(stryear);
		
		//���̓���
		System.out.print("������͂��Ă�������");
		String strmonth = br.readLine();
		int month = Integer.parseInt(strmonth);
		
		//Calendar�N���X�̃C���X�^���X�𐶐�
		Calendar cal = Calendar.getInstance();
		
		//���͂��ꂽ�N����1����ݒ�
		cal.set(year,month-1,1);
		
		//���͂��ꂽ�N����1���̗j�����擾
		int iweek = cal.get(Calendar.DAY_OF_WEEK);
		
		//�ŏI�����擾
		cal.add(Calendar.MONTH,1);
		cal.add(Calendar.DATE,-1);
		int maxdate = cal.get(Calendar.DATE);
		
		//�J�����_�[�̃^�C�g����\��
		System.out.println(year+"�N"+month+"���̃J�����_�[");
		
		//�j�����x����\��
		for(int j=0; j<week.length; j++){
			System.out.print(week[j]+"�@");
		}
		
		//���s
		System.out.print("\n");
		
		//���t����
		int day=0;
		for(int rowweek=0; rowweek<6; rowweek++){
			for(int colweek=1; colweek<=7; colweek++){
				//�X�y�[�X�\��
				if(colweek<iweek && rowweek==0){
					System.out.print("   ");
				}else{
					if(day<9){
						//10����菬�����ꍇ��10�̈ʂ𔼊p�X�y�[�X1�ŕ⊮
						System.out.print(" ");
					}
					if(day<maxdate){
						//���t�\��
						System.out.print(day+1);
						System.out.print(" ");
						day++;
					}
				}
			}
			//�ŏI����菬�����Ȃ���s
			if(day<maxdate){
				System.out.print("\n");
			}
		}
	}
}