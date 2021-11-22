package com.example.jobhunt.Fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.jobhunt.Adapter.HomeAdapter;
import com.example.jobhunt.Model.Home;
import com.example.jobhunt.R;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    RecyclerView rv_job;
    HomeAdapter homeAdapter;
    List<Home> homeList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        rv_job=view.findViewById(R.id.rv_job);
        homeList=new ArrayList<>();
        addItemsToRecyclerViewArrayList();

        homeAdapter = new HomeAdapter(homeList,getActivity());
        LinearLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        rv_job.setLayoutManager(layoutManager);
        rv_job.setAdapter(homeAdapter);

        return view;
    }
    public void addItemsToRecyclerViewArrayList()
    {
        Home home=new Home("Chief Engineer",(204));//JBL C100SI In-Ear Headphones with Mic(Red)
        homeList.add(home);
        home=new Home("Second Engineer",(128));
        homeList.add(home);
        home=new Home("Master",(124));
        homeList.add(home);
        home=new Home("Chief Officer",(113));
        homeList.add(home);
    }
}