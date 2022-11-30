package troller.testServer.RestaurantOrdersApiSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table")
public class EatingTable {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(name = "table_number")
    private String tableNumber;

    @Override
	public String toString() {
		return String.format("table id: %s/n table number: %s/n value: %s/n ", this.id, this.tableNumber);
	}

    public void setId(Long id){
        this.id = id;
    }

    public void setTableNumber(String tableNumber){
        this.tableNumber = tableNumber;
    }

    public Long getId(){
         return this.id;
    }

    public String getTableNumber(){
        return this.tableNumber;
    }

}
