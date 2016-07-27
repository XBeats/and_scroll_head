package com.aitangba.scrollhead;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aitangba.scrollhead.collapsing.CollapsingToolbarActivity;
import com.aitangba.scrollhead.custombehavior.CustomBehaviorActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCustomBehavior(View v) {
        startActivity(new Intent(this, CustomBehaviorActivity.class));
    }

    public void onClickCollapsing(View v) {
        startActivity(new Intent(this, CollapsingToolbarActivity.class));
    }
}
