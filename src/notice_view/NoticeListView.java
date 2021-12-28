package notice_view;

import notice.R;
import notice_model.NoticeVo;

public class NoticeListView extends NoticeView {
	@Override
	public void display() {
		System.out.println("NOTIC LIST -------------------------------------------------");
		for(NoticeVo notice : R.noticeArr) {
			System.out.println(notice);
		}
	}
}
