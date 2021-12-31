
public class Ride {
	
	private String title;
	private String source;
	private String Description;
	private String destinaion; 
	private int timeToLeave;
	private int cost;
	private int rating = 0;

	
	//driver creating a ride
	public Ride(String title, String source, String description, String destinaion, int timeToLeave, int cost) {
		this.title = title;
		this.source = source;
		Description = description;
		this.destinaion = destinaion;
		this.timeToLeave = timeToLeave;
		this.cost = cost;
	}
	//rider requesting a ride so only these 2 attributes are needed
	public Ride(String source,String destinaion) {
		this.source = source;
		this.destinaion = destinaion;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getDestinaion() {
		return destinaion;
	}
	public void setDestinaion(String destinaion) {
		this.destinaion = destinaion;
	}
	public int getTimeToLeave() {
		return timeToLeave;
	}
	public void setTimeToLeave(int timeToLeave) {
		this.timeToLeave = timeToLeave;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
