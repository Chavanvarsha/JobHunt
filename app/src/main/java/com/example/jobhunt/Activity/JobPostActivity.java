package com.example.jobhunt.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import com.example.jobhunt.Adapter.JobPostDetailsAdapter;
import com.example.jobhunt.Model.JobPostDetails;
import com.example.jobhunt.R;
import java.util.ArrayList;
import java.util.List;

public class JobPostActivity extends AppCompatActivity {
    RecyclerView job_rV;
    JobPostDetailsAdapter mjobPostDetailsAdapter;
    List<JobPostDetails>jobPostDetailsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_post);
        job_rV=findViewById(R.id.job_rV);
        setTitle(Html.fromHtml("<font color='#FFFFFF'><small>Job Posting Details</small></font>"));
        final Drawable upArrow = getResources().getDrawable(R.drawable.ic_baseline_arrow_back);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        jobPostDetailsList=new ArrayList<>();
        addItemsToList();
        mjobPostDetailsAdapter=new JobPostDetailsAdapter(jobPostDetailsList,getApplicationContext());
        job_rV.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        job_rV.setAdapter(mjobPostDetailsAdapter);

    }
    public void addItemsToList()
    {
        JobPostDetails jobPostDetails=new JobPostDetails("J5608","Dole Reefership Marine Services Ltd, India","02-Aug-2021","01-Sep-2021","Engng","Chief Engineer"
        ,"Reefer Vessel","India - Indian","1","","");
        jobPostDetailsList.add(jobPostDetails);
        jobPostDetails=new JobPostDetails("J5608","01-Jul-2021","31-Jul-2021","Active","Engng","Chief Engineer"
                ,"Reefer Vessel","India - Indian","1","","");
        jobPostDetailsList.add(jobPostDetails);
        jobPostDetails=new JobPostDetails("J5608","01-Jul-2021","31-Jul-2021","Active","Engng","Chief Engineer"
                ,"Reefer Vessel","India - Indian","1","","");
        jobPostDetailsList.add(jobPostDetails);

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
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