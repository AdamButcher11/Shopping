package shoppingpackage.shopping.repository;

import org.springframework.data.repository.CrudRepository;

import shoppingpackage.shopping.entity.Balance;

public interface BalanceRepository extends CrudRepository<Balance, Long>  {
	
}
