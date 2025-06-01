import java.util.Scanner;

public class MainUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		MyPOS MyVendingMachine = new MyPOS();
		
		int choice;
		do {
			System.out.print("\n1. 계산\n2. 관리자\n3. 종료\n--> ");
			choice = scn.nextInt();
			if(choice==1) {
				int selNo=MyVendingMachine.menuPrint();
				System.out.print("수량 : \n");
				int num = scn.nextInt();
				MyVendingMachine.calSum(selNo, num);
			}
			if(choice==2)
				MyVendingMachine.setProduct();
			}while(choice!=3);
				System.out.println("프로그램을 종료합니다.");
		scn.close();
	}
}

	
	


