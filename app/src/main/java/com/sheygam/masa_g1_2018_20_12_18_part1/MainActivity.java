package com.sheygam.masa_g1_2018_20_12_18_part1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.root,new FirstFragment())
                .commit();
//
//        LinearLayout ll = new LinearLayout(this);
//        ll.addView(ll);
//
//        View view = getLayoutInflater().inflate(R.layout.fragment_first,ll, false);
//        int count = ((ViewGroup)view).getChildCount();
//        int countLL = ll.getChildCount();
//        Log.d("MY_TAG", "onCreate: " + view.getClass().getSimpleName() + " " + count + " countLL = " + countLL);

    }
}
