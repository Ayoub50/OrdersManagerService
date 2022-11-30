package troller.testServer.RestaurantOrdersApiSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "commons")
public class Commons {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(name = "key")
    private String key;

    @Column(name = "value")
    private String value;

    @Override
	public String toString() {
		return String.format("key id: %s/n key: %s/n value: %s/n ", this.id, this.key, this.value);
	}

    // SETTERS

    public void setId(Long id){
        this.id = id;
    }

    public void setKey(String key){
        this.key = key;
    }

    public void setValue(String value){
        this.value = value;
    }

    // GETTERS

    public Long getId(){
        return this.id;
    }

    public String getKey(){
        return this.key;
    }

    public String getValue(){
        return this.value;
    }

}
