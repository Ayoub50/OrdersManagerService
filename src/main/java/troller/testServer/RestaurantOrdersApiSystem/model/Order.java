package troller.testServer.RestaurantOrdersApiSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order{
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(name = "fk_table")
    private EatingTable table;
    
    @Column(name = "total_price")
    private float totalPrice;

    @Override
	public String toString() {
		return String.format("order id: %s/n total price description: %s/n ", this.id, this.totalPrice);
	}

    public void setId(Long id){
        this.id = id;
    }

    public void setEatingTable(EatingTable table){
        this.table = table;
    }

    public Long getId(){
        return this.id;
    }

    public EatingTable getEatingTable(){
        return this.table;
    }

}
