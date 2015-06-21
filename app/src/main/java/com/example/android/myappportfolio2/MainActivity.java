package com.example.android.myappportfolio2;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class    M ainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user touches the button */
    public void showSpotifyStreamerApp(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will open 'SPOTIFY STREAMER'";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void showScoresApp(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will open 'SCORES APP'";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void showLibraryApp(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will open 'LIBRARY APP'";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void showBuildItBiggerApp(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will open 'BUILD IT BIGGER'";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void showXYZReaderApp(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will open 'XYZ READER'";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void showCapstoneApp(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will open 'CAPSTONE: MY OWN APP'";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }



}
