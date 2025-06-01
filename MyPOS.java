import java.util.Scanner;

public class MyPOS implements MachineInterface{
	private int profit; //판매 총 금액 변수
	final int numberOfProduct = 3;
	public Product productList[] = new Product[numberOfProduct];
	Admin manager = new Admin();
	Scanner scn = new Scanner(System.in);
	
	public MyPOS() {
		System.out.println("----------------------\n[POS Start!]\n----------------------");
		manager.SetAdmin();
	}
	
	public void setProduct() {
		while(manager.checkAdmin()==false)
			System.out.print("\nid나 pw가 틀렸습니다.");
		adminMenu();
	}
	
	public int menuPrint() {
		System.out.println("\n구매할 제품의 번호를 입력하세요.");
		for(int i=0; i<numberOfProduct; i++)
			System.out.print((i+1)+". "+productList[i].productName+"  "+productList[i].price+"\n");
		System.out.print("--> ");
		return scn.nextInt();
	}
	
	public int calSum(int selNo, int num) {
		int total=0;
		Product choose = productList[selNo-1];
		
		if(choose.sellProduct(num) == true) {
			total = (choose.price)*num;
			System.out.println(choose.productName+"을/를 "+num+"개 선택하셨습니다.");
			System.out.println("총 금액 : "+total+"원");
			profit +=total;
			return total;
			}
		else {
			System.out.println("재고보다 구매 수량이 더 많습니다.");
			return total;}
	}
	
	public void adminMenu() {
		int getNum;
		do{
			System.out.print("\n1. 제품 등록\n2. 매출 확인\n3. 이전 메뉴\n--> ");
			getNum = scn.nextInt();
			if(getNum == 1) {
				System.out.println("\n3개의 제품을 입력하셔야 합니다.");
				for(int i = 0; i<numberOfProduct; i++) {
					System.out.print("\n****"+(i+1)+"번째 제품****\n제품 이름: ");
					String productName = scn.next();
					System.out.print("제품 가격: ");
					int price = scn.nextInt();
					System.out.print("제품 개수: ");
					int stock = scn.nextInt();
					productList[i]=new Product(productName, price, stock);
					}
				}
			if(getNum == 2)
				System.out.println("\n현재 총 매출액: "+profit+"원");
		}while(getNum!=3);
	}

}
