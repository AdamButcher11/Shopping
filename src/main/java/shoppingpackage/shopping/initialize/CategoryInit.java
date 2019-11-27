package shoppingpackage.shopping.initialize;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shoppingpackage.shopping.entity.Category;
import shoppingpackage.shopping.entity.CategoryName;
import shoppingpackage.shopping.entity.Transactions;
import shoppingpackage.shopping.repository.BalanceRepository;
import shoppingpackage.shopping.repository.CategoryRepository;
import shoppingpackage.shopping.repository.TransactionsRepository;

@Service
public class CategoryInit {

	//@Autowired
	//BalanceRepository balanceRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	//@Autowired
	//TransactionsRepository transactionsRepository;

	
	
	public void createInitData() {
		
		
		Category category1 = new Category(CategoryName.HOME);

		Category category2 = new Category(CategoryName.FOOD);
		
		Category category3 = new Category(CategoryName.ENTERTAINMENT);
		
		Category category4 = new Category(CategoryName.SHOPPING);
		
		Category category5 = new Category(CategoryName.TRAVEL);
		
		Category category6 = new Category(CategoryName.SUBSCRIPTIONS);
		
		Category category7 = new Category(CategoryName.CAR);
		
		Category category8 = new Category(CategoryName.OTHER);
		
		categoryRepository.save(category1);

		categoryRepository.save(category2);

		categoryRepository.save(category3);

		categoryRepository.save(category4);
		
		categoryRepository.save(category5);

		categoryRepository.save(category6);

		categoryRepository.save(category7);
		
		categoryRepository.save(category8);
		
		//Transactions transactions = new Transactions(LocalDateTime.now(), 222, "asss", category1);
	
		//transactionsRepository.save( transactions );
		
		
		
		//SSystem.out.println( ( ( Transactions) ((List )transactionsRepository .findByCategoryId(new Long(1) ) ).get(0) ).getDescription() );
	}
	
}
