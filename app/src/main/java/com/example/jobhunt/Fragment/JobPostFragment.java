package com.example.jobhunt.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.jobhunt.Adapter.JobPostAdapter;
import com.example.jobhunt.DialogFragment.AddJobPostDialog;
import com.example.jobhunt.MainActivity;
import com.example.jobhunt.Model.JobPost;
import com.example.jobhunt.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public class JobPostFragment extends Fragment {
    RecyclerView jobPost_rV;
    FloatingActionButton buttonAdd;
    List<JobPost>jobPostList;
    JobPostAdapter mjobPostAdapter;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainActivity)
        {
            ((MainActivity) context).setToolbarTitle(getResources().getString(R.string.menu_post_job));
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_post_job, container, false);
        jobPost_rV=view.findViewById(R.id.jobPost_rV);
        buttonAdd=view.findViewById(R.id.buttonAdd);
        jobPostList=new ArrayList<>();
        addItemsToList();
        mjobPostAdapter=new JobPostAdapter(jobPostList,getActivity());
        jobPost_rV.setLayoutManager(new LinearLayoutManager(getActivity()));
        jobPost_rV.setAdapter(mjobPostAdapter);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddJobPostDialog maddJobPostDialog=new AddJobPostDialog();
                maddJobPostDialog.show(getParentFragmentManager(),"Dialog");
            }
        });

        return view;
    }
    public void addItemsToList()
    {
        JobPost mjobPost=new JobPost("J5608","01-Jul-2021","31-Jul-2021","Active");
        jobPostList.add(mjobPost);
        mjobPost=new JobPost("J5487","31-May-2021","30-Jun-2021","Active");
        jobPostList.add(mjobPost);
        mjobPost=new JobPost("J5358","30-Apr-2021","30-May-2021","Inactive");
        jobPostList.add(mjobPost);
    }
}