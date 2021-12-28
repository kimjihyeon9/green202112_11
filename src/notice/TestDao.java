package notice;

import notice_model.NoticeDao;
import notice_model.NoticeVo;

public class TestDao {
	public static NoticeDao dao = new NoticeDao();

	public static void test_selectAll(String[] args) {
		// DAO 테스트 selectAll

		NoticeVo[] NoticeArr = dao.selectAll();
		for (NoticeVo saram : NoticeArr) {
			System.out.println(saram);
		}
	}

	public static void test_selectOne(String[] args) {
		NoticeVo vo = new NoticeVo(0, "LEE", null, null);
		NoticeVo notice = dao.selectOne(vo);
		System.out.println(notice);
	}
	
	public static void test_selectByNo(String[] args) {
		NoticeVo notice = dao.selectByNo(3);
		System.out.println(notice);
	}

	public static void test_update(String[] args) {
		NoticeVo vo = dao.selectByNo(1);
		vo.setUser("kim");
		vo.setMessage("HI!");
		vo.setRegDate("20211219");
		dao.update(vo);
		
		NoticeVo notice = dao.selectOne(new NoticeVo(0, "kim", null, null));
		System.out.println(notice);
	}
	
	public static void test_delete(String[] args) {
		dao.delete(new NoticeVo(2, null, null, null));
		test_selectAll(null);
	}

}
