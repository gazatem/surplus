package com.gazatem.android.surplus;

import com.gazatem.android.surplus.R.id;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends BaseActivity {


	Button searchQueryButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		searchQueryButton = (Button) findViewById(R.id.search_button);
		searchQueryButton.setOnClickListener(new OnClickListener() {

			 

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				EditText searchTerm = (EditText) findViewById(R.id.search_text);
				Intent i = new Intent(MainActivity.this, SearchActivity.class);
				i.putExtra("searchTerm", searchTerm.getText().toString());
				startActivity(i);
				
			}
		});				
		
	}
}
