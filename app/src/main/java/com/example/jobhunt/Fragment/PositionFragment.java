package com.example.jobhunt.Fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.jobhunt.Adapter.PositionAdapter;
import com.example.jobhunt.Model.PositionPage;
import com.example.jobhunt.R;
import java.util.ArrayList;
import java.util.List;

public class PositionFragment extends Fragment {
    PositionAdapter mpositionAdapter;
    List<PositionPage> positionPageList;
    RecyclerView rv_position;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_position, container, false);
        rv_position=view.findViewById(R.id.rv_position);
        positionPageList=new ArrayList<>();
        addPositionArrayList();
        mpositionAdapter=new PositionAdapter(positionPageList,getActivity());
        rv_position.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv_position.setAdapter(mpositionAdapter);
        return view;
    }
    public void addPositionArrayList()
    {
        PositionPage positionPage=new PositionPage("TOP URGENT! CE - AHTS - 280-300 USD p/d","Chief Engineer for AHTS","Alpha Crew Ltd","Starting"+"15.07.2019");//JBL C100SI In-Ear Headphones with Mic(Red)
        positionPageList.add(positionPage);
        positionPage=new PositionPage("Chief Engineer on Bulk Carrier","Chief Engineer for Bulk Carrier","UAMAX Shipmanagement","Starting"+"15.07.2019");
        positionPageList.add(positionPage);
        positionPage=new PositionPage("CH ENG ON FERRY","Chief Engineer for Ferry","Marine MAN Ltd","Starting"+"13.07.2019");
        positionPageList.add(positionPage);
        positionPage=new PositionPage("CH ENG ON GC","Chief Engineer for General Carrier","Marine MAN Ltd","Starting"+"27.07.2019");
        positionPageList.add(positionPage);
    }
}