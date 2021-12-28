package notice_controller;

import notice.R;
import notice.ViewContainer;
import notice_model.NoticeDao;

public class NoticeController {
	private ViewContainer vc = new ViewContainer();
	private NoticeDao dao = new NoticeDao();

	public void action() {
		if (R.no == 0) {
			vc.run(R.menuView);
		}

		switch (R.no) {
		case 1:
			vc.run(R.insertView);
			dao.insert(R.noticeVo);
			break;
		case 2:
			R.noticeArr = dao.selectAll();
			vc.run(R.listView);
			break;
		case 3:
			vc.run(R.searchByName);
			R.noticeVo = dao.selectOne(R.noticeVo);
			vc.run(R.detail);
			break;
		case 4:
			vc.run(R.noticeByMessage);
			R.noticeVo = dao.selectMessage(R.noticeVo);
			vc.run(R.detail);
			break;
		case 5:
			vc.run(R.searchByName);
			R.noticeVo = dao.selectOne(R.noticeVo);
			vc.run(R.editView);
			if(R.noticeVo != null) {
				dao.update(R.noticeVo);
			}
			break;
		case 6:
			vc.run(R.searchByName);
			R.noticeVo = dao.selectOne(R.noticeVo);
			vc.run(R.delete);
			if(R.noticeVo != null) {
				dao.delete(R.noticeVo);
			}
			break;
		case 7:
			System.out.println("프로그램 종료!");
			System.exit(0);
			break;
		default:
			System.out.println("입력하신 번호의 기능이 없습니다.");
			break;
		}
		
		R.no = 0;
		action();
	}
}
