package quanao.webmvc.service; 
 
import java.util.List;

import quanao.webmvc.model.Admin; 
public interface AdminService { 
	void insert(Admin admin); 
 
	void edit(Admin admin); 

	void delete(String id); 
 
	Admin get(int id); 
	 
	Admin get(String name); 
 
	List<Admin> getAll(); 
 
} 
