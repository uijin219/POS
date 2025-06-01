import java.util.Scanner;

public class Admin {
	private int id=0;
	private String pw;
	Scanner scn = new Scanner(System.in);
	
	public void SetAdmin() {		
		System.out.print("관리자를 생성합니다.\n새로운 id를 생성하세요(숫자만 생성가능):");
		this.id = scn.nextInt();
		System.out.print("새로운 pw를 생성하세요(숫자, 영문_대소문자 생성가능):");
		this.pw = scn.next();
		
		int A = pw.length();
		String B = "*";
		for (int i=0;i<A-1;i++)
			B=B.concat("*");
		System.out.println("\n새로운 관리자 id: "+id+"    pw: "+B);
	}
	
	public boolean checkAdmin() {
		System.out.print("\n관리자 권한이 있어야 하는 메뉴입니다.\nid:");
		int a = scn.nextInt();
		System.out.print("pw:");
		String b = scn.next();
		if (id==a && pw.equals(b))
			return true;
		else
			return false;
	}

}
