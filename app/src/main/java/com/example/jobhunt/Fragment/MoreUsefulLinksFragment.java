package com.example.jobhunt.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.jobhunt.Activity.CourseProvidersActivity;
import com.example.jobhunt.Activity.InstituesListActivity;
import com.example.jobhunt.MainActivity;
import com.example.jobhunt.R;

public class MoreUsefulLinksFragment extends Fragment {
     TextView tvcourseProviders,tvInstitutes;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainActivity)
        {
            ((MainActivity) context).setToolbarTitle(getResources().getString(R.string.menu_more_useful_links));
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_more_useful_linksk, container, false);
        tvcourseProviders=view.findViewById(R.id.tvcourseProviders);
        tvInstitutes=view.findViewById(R.id.tvInstitutes);
        tvcourseProviders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), CourseProvidersActivity.class);
                startActivity(intent);
            }
        });

        tvInstitutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), InstituesListActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}