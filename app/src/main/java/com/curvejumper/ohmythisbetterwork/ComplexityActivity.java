package com.curvejumper.ohmythisbetterwork;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Switch;


public class ComplexityActivity extends ActionBarActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complexity);
        supplySpinnerWithArray();
    }

    private void supplySpinnerWithArray(){
        spinner = (Spinner) findViewById(R.id.algorithm_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.algorithms_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_complexity, menu);
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

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selection = parent.getItemAtPosition(position).toString();
        switch (selection){
            case "Sorting":
                intent = new Intent(this, SortingActivity.class);
                //if needed, this is the time to pass other data to new activity
                //for this project, I do not need to so I will just activate new intent

                //used to reset the Spinner gui!
                supplySpinnerWithArray();

                startActivity(intent);
                break;
            case "Searching":
                intent = new Intent(this, SearchingActivity.class);
                //used to reset the Spinner gui!
                supplySpinnerWithArray();
                startActivity(intent);
                break;
            case "Data Structure":
                intent = new Intent(this, DataStructureActivity.class);
                //used to reset the Spinner gui!
                supplySpinnerWithArray();
                startActivity(intent);
                break;
            case "Graph":
                intent = new Intent(this, GraphActivity.class);
                //used to reset the Spinner gui!
                supplySpinnerWithArray();
                startActivity(intent);
                break;
            default:
                //do nothing
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
