package no.oxycoon.android.rebus;

import com.google.android.maps.*;

import android.os.Bundle;
import android.content.*;
import android.location.*;

public class RebusMap extends MapActivity{
	private MapView mapView;
	private LocationManager locationManager;
	private Location location;
	private MapController mc;
	private GeoPoint point;
	
	private String providerName;
	
	private Double lat = 68.439167 * 1E6;
	private Double lng = 17.427778 * 1E6;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		mapView = (MapView) findViewById(R.id.mapview_view);
		mapView.setBuiltInZoomControls(true);
		mapView.setSatellite(false);

		// -------------------------------------
		// TODO: Finne n�v�rende posisjon ved oppstart, vet ikke om det virker
		locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		providerName = LocationManager.GPS_PROVIDER;
		location = locationManager.getLastKnownLocation(providerName);
		// -------------------------------------

		mc = mapView.getController();
		point = new GeoPoint(lat.intValue(), lng.intValue());
		mc.setCenter(point);
		mc.setZoom(18);
	}
	
	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

}
