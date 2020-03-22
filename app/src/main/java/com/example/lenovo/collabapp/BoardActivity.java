package com.example.lenovo.collabapp;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

public class BoardActivity extends AppCompatActivity {

    private DrawerLayout mDrawLayout;
    private ActionBarDrawerToggle mToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);
        mDrawLayout=(DrawerLayout)findViewById(R.id.drawLayout);
        mToggle=new ActionBarDrawerToggle(this,mDrawLayout,R.string.open,R.string.close);
        mDrawLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        RecyclerView prog= findViewById(R.id.progList);
        prog.setLayoutManager(new GridLayoutManager(this,4));
        String[] lang={"untitled1","untitled2","untitled3","untitled4","untitled5"};
        prog.setAdapter(new ProgramAdaptor(lang));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
