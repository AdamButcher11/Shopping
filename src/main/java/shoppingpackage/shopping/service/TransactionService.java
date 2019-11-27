package shoppingpackage.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shoppingpackage.shopping.entity.Balance;
import shoppingpackage.shopping.entity.Category;
import shoppingpackage.shopping.entity.Transactions;
import shoppingpackage.shopping.repository.BalanceRepository;
import shoppingpackage.shopping.repository.CategoryRepository;
import shoppingpackage.shopping.repository.TransactionsRepository;

@Service
public class TransactionService {

	
	@Autowired
	BalanceRepository balanceRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	TransactionsRepository transactionsRepository;

	
	
	public List<Balance> getAllBalance(){
		
		return (List)balanceRepository.findAll();
		
	}
	
	public List<Transactions> getTransactionsById(Long id)
	{
		return (List) transactionsRepository.findByCategoryId(id);
		
	}
	
	public void saveBalance(Balance balance)
	{
		
		balanceRepository.save(balance);
	}
	
	public void saveTransaction(Transactions transactions)
	{
		
		transactionsRepository.save(transactions);
	}
	
	public Category getCategoryById( Long id) {
		
		return (categoryRepository.findById(id) ).get();
	}
	
	public List<Transactions> getAllTransactions()
	{
		return (List) transactionsRepository.findAll();
		
	}
}
