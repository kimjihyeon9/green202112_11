package notice_view;

import notice.R;
import notice_model.NoticeVo;

public class SearchByName extends NoticeView {
	@Override
	public void display() {
		System.out.println("SEARCH -----------------------------------------------------");
		System.out.print("검색할 이름>> ");
		String name = scan.next();
		R.noticeVo = new NoticeVo(0, name, null, null);
		
	}
}
