package com.gazatem.android.surplus;

import com.gazatem.android.surplus.R.id;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView yazi = (TextView) findViewById(id.mesaj);
		yazi.setText("Selam nbr"); 
	}
}
