package restuarent;

public class Minmax {
	private String hotelname,location;
	private int budget,id;
	public Minmax(String hotelname, String location, int budget,int id) {
		super();
		this.hotelname = hotelname;
		this.location = location;
		this.budget = budget;
		this.id = id;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "[hotelname=" + hotelname + ", location=" + location + ", budget=" + budget + ", id=" + id + "]";
	}

	

}
