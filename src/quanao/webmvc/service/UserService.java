package quanao.webmvc.service;

import java.util.List;

import quanao.webmvc.model.User;
public interface UserService {
	
void insert(User user);
	
	void edit(User user);
	
	void delete(int id);
	
	User get(int id);
	
	User get(String name);

	List<User> getAll();

}

