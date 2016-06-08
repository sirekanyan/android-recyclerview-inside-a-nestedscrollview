package me.vadik.recyclerviewinsidenestedscrollview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import me.vadik.recyclerviewinsidenestedscrollview.adapter.MyHelper;

public class SlowScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slow_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = MyHelper.setupRecyclerView(this, 1000);
        recyclerView.setNestedScrollingEnabled(false);
    }
}
