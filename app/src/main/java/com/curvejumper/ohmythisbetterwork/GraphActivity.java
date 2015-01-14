package com.curvejumper.ohmythisbetterwork;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;


public class GraphActivity extends ActionBarActivity {

    char greekOp = 0x0398;
    String[] sorting = new String[]{"Algorithm", "Worst-case run time", "Average/Expected run time", "Insertion Sort",
            greekOp+"(n^2)", greekOp+"(n^2)", "Merge Sort", greekOp+"(n lg n)", greekOp+"(n lg n)", "HeapSort", "O(n lg n)", "--",
            "QuickSort", greekOp+"(n^2)", greekOp+"(n lg n)", "Counting sort", greekOp+"(k + n)", greekOp+"(k + n)", "Radix Sort",
            greekOp+"(d(n + k))", greekOp+"(d(n+k)", "Bucket Sort", greekOp+"(n^2)", greekOp+"(n)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        LinearLayout layout = (LinearLayout) findViewById(R.id.graph_linLay);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sorting);

        final int adapterCount = adapter.getCount();

        for (int i = 0; i < adapterCount; i++) {
            View item = adapter.getView(i, null, null);
            layout.addView(item);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_graph, menu);
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
