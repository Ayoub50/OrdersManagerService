package troller.testServer.RestaurantOrdersApiSystem.model;

import javax.persistence.*;


@Entity
@Table(name = "orders")
public class Orders {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    @Column(name = "fk_meal")
    private long mealId;
	@Column(name = "mealDesc")
    private String mealDesc; 
    @Column(name = "qty")
    private long qty; 
    @Column(name = "fk_table")
    private Long table;

    @Override
	public String toString() {
		return String.format("Order id: %s/n Meal id: %s/n Meal desc: %s/n qty: %s/n Table: %s ", this.id, this.mealId, this.mealDesc, this.qty, this.table);
	}

    // GETTERS
    public long getMealId(){
        return this.mealId;
    }
    public String getMealDesc(){
        return this.mealDesc;
    }
    public long getQty(){
        return this.qty;
    }
    public long getTable(){
        return this.table;
    }
    //

    // SETTERS
    public void setMealId(long mealId){
        this.mealId = mealId;
    }
    public void setMealDesc(String mealDesc){
        this.mealDesc = mealDesc;
    }
    public void setQty(long qty){
        this.qty = qty;
    }
    public void setTable(long table){
        this.table = table;
    }
    //



}
