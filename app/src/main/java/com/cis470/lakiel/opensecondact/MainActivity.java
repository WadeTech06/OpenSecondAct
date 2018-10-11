package com.cis470.lakiel.opensecondact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static int buttonCounter = 0;
    String tag = "Lifecycle Step";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.ButtonCounter);
        textView.setText("Button Counter" + buttonCounter);
        Log.d(tag, "MainActivity: In the onCreate() event");
    }

    public void onClick(View view)
    {
        buttonCounter++;
        startActivity(new Intent(this, Main2Activity.class));
    }
    public void onStart()
    {
        super.onStart();
        Log.d(tag, "MainActivity: In the onStart() event");
    }
    public void onRestart()
    {
        super.onRestart();
        Log.d(tag, "MainActivity: In the onRestart() event");
    }
    public void onResume()
    {
        super.onResume();
        TextView textView = (TextView) findViewById(R.id.ButtonCounter);
        textView.setText("Button Counter: " + buttonCounter);
        Log.d(tag, "MainActivity: In the onResume() event");
    }
    public void onPause()
    {
        super.onPause();
        Log.d(tag, "MainActivity: In the onPause() event");
    }
    public void onStop()
    {
        super.onStop();
        Log.d(tag, "MainActivity: In the onStop() event");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag, "MainActivity: In the onDestroy() event");
    }
}
