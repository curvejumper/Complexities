package com.curvejumper.ohmythisbetterwork;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;


public class SearchingActivity extends ActionBarActivity {

    String[] searching = new String[] {"Algorithm", "Best-Case Runtime", "Avg/Expected Case Runtime",
            "Depth-First Search", "-", "O(|E| + |V|)", "Breath First Search", "-", "O(|E| + |V|",
            "Binary Search", "O(log(n))", "O(log(n))", "Linear Search", "O(n)", "O(n)", "Shortest Path Dijkstra",
            "O((|V| + |E|) log |V|)", "O((|V| + |E|) log |V|)", "Shortest Path Dijkstra", "O(|V^2|)", "O(|V^2|",
            "Shortest Path by Bellman-Ford", "O(|V||E|)", "O(|V||E|)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching);
        GridView gridView = (GridView) findViewById(R.id.searching_gridView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, searching);
        gridView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_searching, menu);
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
}
