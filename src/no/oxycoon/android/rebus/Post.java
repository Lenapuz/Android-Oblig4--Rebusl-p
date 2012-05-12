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
	
	/**
	 * @param visited
	 */
	public void SetVisited(boolean visited){ this.visited= visited; } 
	
	/**
	 * @return
	 */
	public int TrackId(){ return trackId; }
	
	/**
	 * @return
	 */
	public int PostId(){ return postId; }
	
	/**
	 * @return
	 */
	public double Radius(){ return radius; }
	
	/**
	 * @return
	 */
	public double Latitude(){ return lat; }
	
	/**
	 * @return
	 */
	public double Longitude(){ return lng; }
	
	/**
	 * @return
	 */
	public String Hint(){ return hint; }
	
	/**
	 * @return
	 */
	public boolean Visited(){ return visited; }

}
