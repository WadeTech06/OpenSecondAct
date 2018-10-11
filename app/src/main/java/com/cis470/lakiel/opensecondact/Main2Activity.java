package com.cis470.lakiel.opensecondact;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {
    String tag = "Lifecycle Step";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(tag, "Main2Activity: In the onCreate() event");
    }
    public void onClick(View view)
    {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void onStart()
    {
        super.onStart();
        Log.d(tag, "Main2Activity: In the onStart() event");
    }
    public void onRestart()
    {
        super.onRestart();
        Log.d(tag, "Main2Activity: In the onRestart() event");
    }
    public void onResume()
    {
        super.onResume();
        Log.d(tag, "Main2Activity: In the onResume() event");
    }
    public void onPause()
    {
        super.onPause();
        Log.d(tag, "Main2Activity: In the onPause() event");
    }
    public void onStop()
    {
        super.onStop();
        Log.d(tag, "Main2Activity: In the onStop() event");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag, "Main2Activity: In the onDestroy() event");
    }

}
