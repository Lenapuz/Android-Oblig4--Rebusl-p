package no.oxycoon.android.rebus;

import android.app.Activity;
import android.os.Bundle;

import android.content.*;
import android.widget.*;
import android.view.*;

public class RebusActivity extends Activity {
	private Button startMapView;
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        startMapView = (Button)findViewById(R.id.main_button_startmap);
        
        startMapView.setOnClickListener(new ButtonHandler());
    }
    
    public void startMapView(){
    	startActivity(new Intent(RebusActivity.this, RebusMap.class));
    }
    
    private class ButtonHandler implements View.OnClickListener{

		public void onClick(View arg0) {
			if (arg0.getId() == R.id.main_button_startmap){
//				Toast test = Toast.makeText(RebusActivity.this, "Button", 10);
//				test.show();
				
				startMapView();
			}
		}
    	
    }
}