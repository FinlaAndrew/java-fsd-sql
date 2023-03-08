package cafe;

public class Food {
	private String foodname;
	private int price,id;
	
	public Food(int id,String foodname, int price) {
		super();
		this.foodname = foodname;
		this.price = price;
		this.id = id;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Food [foodname=" + foodname + ", price=" + price + ", id=" + id + "]";
	}
	

	
}
