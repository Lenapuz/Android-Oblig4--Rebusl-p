package no.oxycoon.android.rebus;

public class Post {
	private int trackId, postId;
	private double radius, lng, lat;
	private String hint;
	private boolean visited;
	
	public Post(int trackId, int postId, double radius, double lng, double lat, String hint){
		this.trackId = trackId;
		this.postId = postId;
		this.radius = radius;
		this.lng = lng;
		this.lat = lat;
		this.hint = hint;
		this.visited = false;
	}
	
	public void SetVisited(boolean visited){ this.visited= visited; } 
	
	public int TrackId(){ return trackId; }
	public int PostId(){ return postId; }
	public double Radius(){ return radius; }
	public double Latitude(){ return lat; }
	public double Longitude(){ return lng; }
	public String Hint(){ return hint; }
	public boolean Visited(){ return visited; }

}
