package me.vadik.recyclerviewinsidenestedscrollview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void example1(View view) {
        startActivity(new Intent(this, ScrollingActivity.class));
    }

    public void example2(View view) {
        startActivity(new Intent(this, SlowScrollingActivity.class));
    }
}
