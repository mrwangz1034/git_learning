package dao;

import domin.Admin;

public interface AdminMapper {
	public Admin getAdmin(Integer id);
	public int deleteAdmin(Integer id);
	public int insertAdmin(Admin admin);
}
