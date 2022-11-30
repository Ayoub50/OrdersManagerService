package troller.testServer.RestaurantOrdersApiSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "food_type")
public class FoodType {
    
    @Id
    @Column(name= "code_food_type")
    private String codeFoodType;
    
    @Column(name= "food_type")
    private String foodTypeDesc;

    @Override
	public String toString() {
		return String.format("Food type code: %s/n Food type description: %s/n ", this.codeFoodType, this.foodTypeDesc);
	}

    // GETTERS
    public String getCodeFoodType(){
        return this.codeFoodType;
    }
    public String getFoodTypeDesc(){
        return this.foodTypeDesc;
    }
    //

    // SETTERS
    public void setCodeFoodType(String codeFoodType){
        this.codeFoodType = codeFoodType;
    }
    public void setFoodTypeDesc(String foodTypeDesc){
        this.foodTypeDesc = foodTypeDesc;
    }
    //
}
