package opp;

import javax.swing.JOptionPane;

public class vm {
	
	public static void main(String[] args) {
		
		int money=0;
		money = Integer.parseInt(JOptionPane.showInputDialog("�ݶ�[1000��]  ���̴�[800��]  Ŀ��[600��]\n "
			+"���� �־��ּ���.\n" + "(���ð����� ������� *����� ��* ���� ǥ��)\n"));
	
		JOptionPane.showMessageDialog(null,"����ݾ��� "+money+"���Դϴ�.\n");
		int money2 = 0;

		while(money<600){
			money2 =Integer.parseInt(JOptionPane.showInputDialog("�߰��� ���� �־��ּ���."));
			money=money+money2;
			JOptionPane.showMessageDialog(null,"����ݾ��� "+money+"���Դϴ�.\n");
		}

		money=menuselect(money); //�߰����� ����� �̱� ���� Ȯ��
	
	
		String add = "n";
		while(money>=600){
			
			add = JOptionPane.showInputDialog("�ٸ� ������� �̰ڽ��ϱ�?(y/n)");
		
			if(add.equals("y")){
				money=menuselect(money);
				JOptionPane.showMessageDialog(null,"����ݾ��� "+money+"���Դϴ�.\n");
				}
			else if(add.equals("n"))
				break;
			else{
				Integer.parseInt(JOptionPane.showInputDialog("���� �Է��ϼ���."));
				}          

		}
		change(money); 

	}
	
	public static int menuselect(int money){

		menuprint(money); 
		int select = Integer.parseInt(JOptionPane.showInputDialog("���� ������� �����ϼ���. ( �ݶ�=1 , ���̴�=2, Ŀ��=3 )"));
		switch(select){
		case 1:
			if(money-1000>=0){
				JOptionPane.showMessageDialog(null,"�ݶ�\n");
				money=money-1000;
			}
			else{
				JOptionPane.showMessageDialog(null,"�ݾ��� ���ڶ��ϴ�.");
			}
			break;
		case 2:
			if(money-800>=0){
				JOptionPane.showMessageDialog(null,"���̴�\n");
				money=money-800;
			}
			else{
				JOptionPane.showMessageDialog(null,"�ݾ��� ���ڶ��ϴ�.");
			}
			break;
		case 3:
			if(money-600>=0){
				JOptionPane.showMessageDialog(null,"Ŀ��\n");
				money=money-600;
			}
			else{
				JOptionPane.showMessageDialog(null,"�ݾ��� ���ڶ��ϴ�.");
			}
			break;
		case 0:
			break;
		default:
			JOptionPane.showMessageDialog(null,"����\n");
			break;
		}
		return money;
	} //�޴� ���� �޼ҵ�

	public static int menuprint(int money){
		if (money>=1000) {
			JOptionPane.showMessageDialog(null,"*�ݶ�[1000] *  *���̴�[800] *  *Ŀ��[600]*\n");
			return 1;
		}
		else if (money>=800)
		{
			JOptionPane.showMessageDialog(null,"�ݶ�[1000]  *���̴�[800]*  *Ŀ��[600]*\n");
			return 2;
		}
		else if(money>=600)
		{
			JOptionPane.showMessageDialog(null,"�ݶ�[1000]  ���̴�[800]  *Ŀ��[600]*\n");
			return 3;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"�ݾ��� ���ڶ��ϴ�.");
			return 4;
		}
	} //�޴��� ����ϴ� �޼ҵ�

	public static int change(int money){
		int unit=1000, num, sw=1;
		
		while(unit>=100){           
			num=money/unit;
			money=money-unit*num;
			
			if(num!=0){
				JOptionPane.showMessageDialog(null,"�Ž�����: " + unit*num +"��");
			}
			if(sw==1){
				unit=unit/2;
				sw=sw*(-1);
			}
			else{
				unit=unit/5;
				sw=sw*(-1);
			}
		}
		System.out.println();
		return 0;
	} //�Ž����� �޼ҵ�
}