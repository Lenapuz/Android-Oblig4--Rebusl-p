package no.oxycoon.android.rebus;

import com.google.android.maps.*;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.app.PendingIntent;
import android.content.*;
import android.location.*;

public class RebusMap extends MapActivity{
	private MapView mapView;
    private LocationManager locationManager;
    private Location location;
    private MapController controller;
	private GeoPoint point;
    
	private String providerName;
	
	private Double lng = 17.427678 * 1E6;
	private Double lat = 68.439267 * 1E6;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rebusmap);
		
		initializeMap();
		initializeLocation();
	}
	
	
	/**
	 * Private methods
	 **/
	
	/**
	 * Initializes the mapView
	 **/
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
	
	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

}
