package no.oxycoon.android.rebus;

import com.google.android.maps.*;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.content.*;
import android.location.*;

public class RebusMap extends MapActivity{
	private MapView mapView;
    private MyLocationOverlay myLocOverlay;
    private LocationManager locationManager;
    private Location location;
    private MapController controller;
	private GeoPoint point;
    
	private String providerName;
	
	private Double lat = 68.439167 * 1E6;
	private Double lng = 17.427778 * 1E6;
	
	public static long minimum_distance_for_update = 5; // meters
	public static long minimum_time_for_update = 5000; // milliseconds
	
	private static long radius_for_point = 5; // meters
	private static long prox_alert_expiration = -1;
	private boolean prox_alert_active;
	
	private static final String PROX_ALERT_INTENT = "no.oxycoon.android.rebus.ProximityAlert"; 
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rebusmap);
		
		initializeMap();
		initializeLocation();
	}
	
	private void initializeMap(){
		mapView = (MapView)findViewById(R.id.mapview_view);
		mapView.displayZoomControls(true);
		mapView.setSatellite(false);
	}
	
	private void initializeLocation(){
		
		locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		providerName = LocationManager.GPS_PROVIDER;
		location = locationManager.getLastKnownLocation(providerName);
		// -------------------------------------

		controller = mapView.getController();
		point = new GeoPoint(lat.intValue(), lng.intValue());
		controller.setCenter(point);
		controller.setZoom(18);

	}
	
	public void initializeRace(Post currentPost){
		lat = currentPost.Latitude();
		lng = currentPost.Longitude();
		prox_alert_active = true;
	}
	
	public void stopRace(){
		prox_alert_active = false;
	}
	
	
	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

}
