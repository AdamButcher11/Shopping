package shoppingpackage.shopping.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import shoppingpackage.shopping.entity.Category;
import shoppingpackage.shopping.entity.Transactions;

public interface TransactionsRepository extends CrudRepository<Transactions, Long>  {

	List<Transactions> findByCategory(Category category);

	List<Transactions> findByCategoryId(Long id);
	
	
}

