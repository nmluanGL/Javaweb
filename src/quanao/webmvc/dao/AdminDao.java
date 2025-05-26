package quanao.webmvc.dao; 
 
import java.util.List;

import quanao.webmvc.model.Admin; 
 
public interface AdminDao { 
	void insert(Admin admin); 
 
	void edit(Admin admin); 
	
	void delete(String id); 
 
	Admin get(int id); 
	 
	Admin get(String name); 
 
	List<Admin> getAll(); 
	
} 
