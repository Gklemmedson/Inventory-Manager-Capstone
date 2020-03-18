package restaurant.org;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Product {
    private Long id;
    private String Item_Description;
    private String Date_of_Purchase;
    private int Amount_in_Stock;
    private int Amount_to_Order;
    private float Price;
    private int Time_to_Order;
 
    protected Product() {
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItem_Description() {
		return Item_Description;
	}

	public void setItem_Description(String Item_Description) {
		this.Item_Description = Item_Description;
	}

	public String getDate_of_Purchase() {
		return Date_of_Purchase;
	}

	public void setDate_of_Purchase(String Date_of_Purchase) {
		this.Date_of_Purchase = Date_of_Purchase;
	}

	public int getAmount_in_Stock() {
		return Amount_in_Stock;
	}

	public void setAmount_in_Stock(int Amount_in_Stock) {
		this.Amount_in_Stock = Amount_in_Stock;
	}
	
	public int getAmount_to_Order() {
		return Amount_to_Order;
	}

	public void setAmount_to_Order(int Amount_to_Order) {
		this.Amount_to_Order = Amount_to_Order;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float Price) {
		this.Price = Price;
	}
	
	public int getTime_to_Order() {
		return Time_to_Order;
	}

	public void setTime_to_Order(int Time_to_Order) {
		this.Time_to_Order = Time_to_Order;
	}

    }
     
