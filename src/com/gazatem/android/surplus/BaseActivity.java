package com.gazatem.android.surplus;
  
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
 

public class BaseActivity extends Activity {
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		if (item.getItemId() == R.id.add_item) {
			Intent i = new Intent(BaseActivity.this, CreateItemActivity.class);
			startActivity(i);
		} else if (item.getItemId() == R.id.list_items) {
			Intent i = new Intent(BaseActivity.this, MainActivity.class);
			startActivity(i);
		} else if (item.getItemId() == R.id.search_items) {
			Intent i = new Intent(BaseActivity.this, MainActivity.class);
			startActivity(i); 
		} else {
 
		}

		return super.onOptionsItemSelected(item);
	}
}
