package shoppingpackage.shopping.entity;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Balance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private long amount;
	
	private LocalDateTime date;
	public Balance() {
		// TODO Auto-generated constructor stub
	}
	
	public Balance(long amount, LocalDateTime date) {
		this.amount = amount;
		this.date = LocalDateTime.now();
	}
	
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
	
		return ((Long)amount).toString();
		
	}

}
