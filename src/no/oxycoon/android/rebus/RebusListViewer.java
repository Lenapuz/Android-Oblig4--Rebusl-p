package no.oxycoon.android.rebus;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class RebusListViewer extends ListActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//TODO: get information from server
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);

		String s = (String) this.getListAdapter().getItem(position);
		Intent result = new Intent();

		//TODO: give detailed information about selected racec
		
		result.putExtra("returnResult", s);
		setResult(RESULT_OK, result);
		finish();
	}
}
