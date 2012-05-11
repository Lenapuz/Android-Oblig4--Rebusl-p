package no.oxycoon.android.rebus;

public class Track {
	private int id;
	private String trackName, winner, creator;
	private long start_ts, stop_ts;
	
	public Track(int id, String trackName, String creator, String winner, long startTime, long stopTime){
		this.id = id;
		this.trackName = trackName;
		this.winner = winner;
		this.creator = creator;
		this.start_ts = startTime;
		this.stop_ts = stopTime;
	}
	
	public Track(int id, String trackName, String creator, long startTime, long stopTime){
		this.id = id;
		this.trackName = trackName;
		this.winner = null;
		this.start_ts = startTime;
		this.stop_ts = stopTime;
	}
	
	public int Id(){ return id; }
	public String Name(){ return trackName; }
	public String Creator(){ return creator; }
	public String Winner(){ return winner; }
	public long Start_ts(){ return start_ts; }
	public long Stop_ts(){ return stop_ts; }
}
