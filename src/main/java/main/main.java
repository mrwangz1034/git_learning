package main;

import org.apache.ibatis.session.SqlSession;

import dao.AdminMapper;
import domin.Admin;
import utils.SqlSessionFactoryUtil;

public class main {
	public static void main(String[] args) throws Exception{
		
		SqlSession sqlSession = null;
		try {
			sqlSession = SqlSessionFactoryUtil.openSession();
			AdminMapper adminMapper = sqlSession.getMapper(AdminMapper.class);
			Admin admin = adminMapper.getAdmin(2);
			System.out.println(admin);
			sqlSession.commit();
		} catch (Exception e) {
			System.out.println(e);
			sqlSession.rollback();
		}finally{
			if(sqlSession != null)
				sqlSession.close();
		}
	}
}
