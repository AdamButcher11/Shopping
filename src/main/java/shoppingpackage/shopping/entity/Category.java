package shoppingpackage.shopping.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Enumerated(EnumType.STRING)
	private CategoryName name;

	public Category( CategoryName name) {
	
		this.name = name;
		
	}
	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}
	
	public CategoryName getName() {
		return name;
	}

	
	@Override
	public boolean equals(Object obj) {
		
		if(obj  instanceof Category ) 
		{
			return ((Category)obj ).getName().equals(this.name); 
		}
		return false;
	}
	
	@Override
	public String toString() {
	
		return name.toString();
	}
	
}
