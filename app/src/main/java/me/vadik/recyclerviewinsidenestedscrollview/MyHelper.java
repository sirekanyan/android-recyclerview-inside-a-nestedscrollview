package me.vadik.recyclerviewinsidenestedscrollview;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import me.vadik.recyclerviewinsidenestedscrollview.adapter.MyAdapter;

/**
 * User: vadik
 * Date: 6/8/16
 */
public class MyHelper {

    protected static RecyclerView setupRecyclerView(Activity context, int count) {
        RecyclerView mRecyclerView = (RecyclerView) context.findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(setupAdapter(count));
        return mRecyclerView;
    }

    private static MyAdapter setupAdapter(int count) {
        String[] items = new String[count];
        for (int i = 0; i < count; i++) {
            items[i] = "Item " + String.valueOf(i);
        }
        return new MyAdapter(items);
    }
}
