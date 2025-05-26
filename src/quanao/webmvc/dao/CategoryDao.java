package quanao.webmvc.dao;

import java.util.List;

import quanao.webmvc.model.Catalog;
import quanao.webmvc.model.Product;

public interface CategoryDao {
	void insert(Catalog category);

	void edit(Catalog category);

	void delete(String id);

	Catalog get(int id);
	
	Catalog get(String name);

	List<Catalog> getAll();
	
	List<Catalog> getCateByProduct(int id);

}
