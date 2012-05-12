package no.oxycoon.android.rebus;

//TODO: Kanskje ubrukelig
public class Track {
	private int id;
	private String trackName, winner, creator;
	private long start_ts, stop_ts;
	
	/**
	 * @param id
	 * @param trackName
	 * @param creator
	 * @param winner
	 * @param startTime
	 * @param stopTime
	 */
	public Track(int id, String trackName, String creator, String winner, long startTime, long stopTime){
		this.id = id;
		this.trackName = trackName;
		this.winner = winner;
		this.creator = creator;
		this.start_ts = startTime;
		this.stop_ts = stopTime;
	}
	
	/**
	 * @param id
	 * @param trackName
	 * @param creator
	 * @param startTime
	 * @param stopTime
	 */
	public Track(int id, String trackName, String creator, long startTime, long stopTime){
		this.id = id;
		this.trackName = trackName;
		this.winner = null;
		this.start_ts = startTime;
		this.stop_ts = stopTime;
	}
	
	/**
	 * @return
	 */
	public int Id(){ return id; }
	
	/**
	 * @return
	 */
	public String Name(){ return trackName; }
	
	/**
	 * @return
	 */
	public String Creator(){ return creator; }
	
	/**
	 * @return
	 */
	public String Winner(){ return winner; }
	
	/**
	 * @return
	 */
	public long Start_ts(){ return start_ts; }
	
	/**
	 * @return
	 */
	public long Stop_ts(){ return stop_ts; }
}
