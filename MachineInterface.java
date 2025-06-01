
public interface MachineInterface {
	public abstract void setProduct(); //id, pw 확인후 관리자 메뉴 상품등록
	public abstract int menuPrint(); //계산메뉴 선택시 실행, 4번에서 두번째
	public abstract int calSum(int selNo, int num); //수량입력받고 금액 계산. 
	public abstract void adminMenu();
}
