package com.example.jobhunt.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.jobhunt.Adapter.InstitueAdapter;
import com.example.jobhunt.Model.Institue;
import com.example.jobhunt.Model.JobPost;
import com.example.jobhunt.R;

import java.util.ArrayList;
import java.util.List;

public class InstituesListActivity extends AppCompatActivity {
    RecyclerView institutes_rV;
    InstitueAdapter minstitueAdapter;
    List<Institue>institueList;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institues_list);
        institutes_rV=findViewById(R.id.institutes_rV);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Institute List");
        setSupportActionBar(toolbar);

        final Drawable upArrow = getResources().getDrawable(R.drawable.ic_arrow_back_24dp);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        institueList=new ArrayList<>();
        addItemsToList();
        minstitueAdapter=new InstitueAdapter(institueList,getApplicationContext());
        institutes_rV.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        institutes_rV.setAdapter(minstitueAdapter);

    }
    public void addItemsToList()
    {
        Institue minstitue=new Institue("Aditya Training & Maritime Services","105, Kartik Complex, Opp.Laxmi Industrial Estate,\n" +
                "New Link Road, Andheri (W),\n" +
                "Mumbai - 400 053");
        institueList.add(minstitue);
        minstitue=new Institue("Academy of Maritime Education & Training","3/4/5, Ambedkar Street, Gandhinagar,\n" +
                "Saligramam, Chennai - 600 093");
        institueList.add(minstitue);
        minstitue=new Institue("Bombay Marine Academy","6, ANAND, 424, Chitrakar Dhurandhar Marg,\n" +
                "Khar, Mumbai - 400 052");
        institueList.add(minstitue);
        minstitue=new Institue("B.P. Marine Academy","403, Sai Pooja Chambers, Plot 58,\n" +
                "Sector-11, CBD Belapur, Navi Mumbai - 400 614");
        institueList.add(minstitue);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //  System.out.println("landscape");
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            //  System.out.println("portrait");
        }
    }
}