package notice;

import notice_controller.NoticeController;
import notice_model.NoticeVo;
import notice_view.Delete;
import notice_view.Detail;
import notice_view.Edit;
import notice_view.InsertView;
import notice_view.MenuView;
import notice_view.NoticeByMessage;
import notice_view.NoticeListView;
import notice_view.NoticeView;
import notice_view.SearchByName;

public class R {
	public static int no;
	public static NoticeVo noticeVo;
	public static NoticeVo[] noticeArr;
	
	public static final NoticeView menuView = new MenuView();
	
	public static final NoticeView insertView = new InsertView();
	public static final NoticeView listView = new NoticeListView();
	public static final NoticeView detail = new Detail();
	public static final NoticeView editView = new Edit(); 
	public static final NoticeView delete = new Delete();
	
	public static final NoticeView searchByName = new SearchByName();
	
	public static NoticeView noticeByMessage = new NoticeByMessage();
	
	public static TestDate date = new TestDate();
	
	public static final NoticeController noticeController = new NoticeController();
	
}
