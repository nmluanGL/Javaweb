package quanao.webmvc.dao;
import java.util.List;

import quanao.webmvc.model.Transactions;


public interface TransactionDao {
	void insert(Transactions transaction); 
	 
	void edit(Transactions admin); 
	
	void delete(String id); 
 
	Transactions get(int id); 
	 
	Transactions get(String name); 
 
	List<Transactions> getAll(); 
	
	
}
