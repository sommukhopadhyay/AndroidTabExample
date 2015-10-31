package com.somitsolutions.training.android.androidtabexample;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TabHost tabHost = getTabHost();
        
        TabSpec tab1 = tabHost.newTabSpec("First Tab");
        TabSpec tab2 = tabHost.newTabSpec("Second Tab");
        TabSpec tab3 = tabHost.newTabSpec("Third Tab");
        
       tab1.setIndicator("Tab 1");
       tab2.setIndicator("Tab 2");
       tab3.setIndicator("Tab 3");
       
       Intent i1 = new Intent(this, Activity1.class);
       Intent i2 = new Intent(this, Activity2.class);
       Intent i3 = new Intent(this, Activity3.class);
       
       
       tab1.setContent(i1);
       tab2.setContent(i2);
       tab3.setContent(i3);
       
       tabHost.addTab(tab1);
       tabHost.addTab(tab2);
       tabHost.addTab(tab3);
        
	}
}
