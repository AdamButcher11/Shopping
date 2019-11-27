package shoppingpackage.shopping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import shoppingpackage.shopping.initialize.CategoryInit;
import shoppingpackage.shopping.repository.CategoryRepository;
import shoppingpackage.shopping.service.TransactionService;

@SpringBootApplication
public class ShoppingApplication {

	 @Autowired
	    CategoryInit categoryInit;
	 
	 @Autowired
	 TransactionService transactionService;
	 
	 
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ShoppingApplication.class, args);
		ShoppingApplication app = context.getBean(ShoppingApplication.class);
		
		app.categoryInit.createInitData();
		
		
			}

}
