package quanao.webmvc.dao;

import java.util.List;

import quanao.webmvc.model.User;

public interface UserDao {
	
	void insert(User user);

	void edit(User user);
	
	void delete(int id);

	User get(String name);

	User get(int id);
	
	List<User> getAll();
}
