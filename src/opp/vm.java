package opp;

import javax.swing.JOptionPane;

public class vm {
	
	public static void main(String[] args) {
		
		int money=0;
		money = Integer.parseInt(JOptionPane.showInputDialog("콜라[1000원]  사이다[800원]  커피[600원]\n "
			+"돈을 넣어주세요.\n" + "(선택가능한 음료수는 *음료수 명* 으로 표시)\n"));
	
		JOptionPane.showMessageDialog(null,"현재금액은 "+money+"원입니다.\n");
		int money2 = 0;

		while(money<600){
			money2 =Integer.parseInt(JOptionPane.showInputDialog("추가로 돈을 넣어주세요."));
			money=money+money2;
			JOptionPane.showMessageDialog(null,"현재금액은 "+money+"원입니다.\n");
		}

		money=menuselect(money); //추가적인 음료수 뽑기 여부 확인
	
	
		String add = "n";
		while(money>=600){
			
			add = JOptionPane.showInputDialog("다른 음료수를 뽑겠습니까?(y/n)");
		
			if(add.equals("y")){
				money=menuselect(money);
				JOptionPane.showMessageDialog(null,"현재금액은 "+money+"원입니다.\n");
				}
			else if(add.equals("n"))
				break;
			else{
				Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요."));
				}          

		}
		change(money); 

	}
	
	public static int menuselect(int money){

		menuprint(money); 
		int select = Integer.parseInt(JOptionPane.showInputDialog("마실 음료수를 선택하세요. ( 콜라=1 , 사이다=2, 커피=3 )"));
		switch(select){
		case 1:
			if(money-1000>=0){
				JOptionPane.showMessageDialog(null,"콜라\n");
				money=money-1000;
			}
			else{
				JOptionPane.showMessageDialog(null,"금액이 모자랍니다.");
			}
			break;
		case 2:
			if(money-800>=0){
				JOptionPane.showMessageDialog(null,"사이다\n");
				money=money-800;
			}
			else{
				JOptionPane.showMessageDialog(null,"금액이 모자랍니다.");
			}
			break;
		case 3:
			if(money-600>=0){
				JOptionPane.showMessageDialog(null,"커피\n");
				money=money-600;
			}
			else{
				JOptionPane.showMessageDialog(null,"금액이 모자랍니다.");
			}
			break;
		case 0:
			break;
		default:
			JOptionPane.showMessageDialog(null,"종료\n");
			break;
		}
		return money;
	} //메뉴 선택 메소드

	public static int menuprint(int money){
		if (money>=1000) {
			JOptionPane.showMessageDialog(null,"*콜라[1000] *  *사이다[800] *  *커피[600]*\n");
			return 1;
		}
		else if (money>=800)
		{
			JOptionPane.showMessageDialog(null,"콜라[1000]  *사이다[800]*  *커피[600]*\n");
			return 2;
		}
		else if(money>=600)
		{
			JOptionPane.showMessageDialog(null,"콜라[1000]  사이다[800]  *커피[600]*\n");
			return 3;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"금액이 모자랍니다.");
			return 4;
		}
	} //메뉴를 출력하는 메소드

	public static int change(int money){
		int unit=1000, num, sw=1;
		
		while(unit>=100){           
			num=money/unit;
			money=money-unit*num;
			
			if(num!=0){
				JOptionPane.showMessageDialog(null,"거스름돈: " + unit*num +"원");
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
	} //거스름돈 메소드
}