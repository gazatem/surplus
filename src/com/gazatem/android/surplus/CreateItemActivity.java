package com.gazatem.android.surplus;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CreateItemActivity extends BaseActivity {
	
	String searchTerm;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_item);
		
		Bundle extras = getIntent().getExtras();
		searchTerm = extras.getString("searchTerm");

		//searchlist = (ListView) findViewById(R.id.book_search_list);
		if (searchTerm.length() > 3 &&  searchTerm.length() < 15 ){
			//new SearchAsyncTask().execute(searchTerm);
		}else{
			Intent intent = new Intent(this, MainActivity.class);
			startActivity(intent);
		}

	}
	
	

}
