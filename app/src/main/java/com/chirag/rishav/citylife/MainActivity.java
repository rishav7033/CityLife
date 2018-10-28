package com.chirag.rishav.citylife;

import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv ;
    int value=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        tv = findViewById( R.id.textView );
    }

    public void AddMe(View view) {
        value++;
        tv.setText( String.valueOf( value ) );
    }
}
