package notice_view;

import notice.R;

public class MenuView extends NoticeView {
	@Override
	public void display() {
		System.out.println("MENU -------------------------------------------------------");
		
		int no = 0;
		try {
			System.out.println("1.입력 2.출력 3.검색(이름) 4.검색(메모) 5.수정 6.삭제 7.종료");
			System.out.print("선택>> ");
			no = scan.nextInt();
			while(no > 7 || no < 1) {
				System.out.println("입력하신 숫자는 범위에 없습니다.");
				System.out.println("1.입력 2.출력 3.검색(이름) 4.검색(메모) 5.수정 6.삭제 7.종료");
				System.out.print("선택>> ");
				no = scan.nextInt();
			}
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요!");
			scan.next();
		}
		R.no = no;
	}
}
