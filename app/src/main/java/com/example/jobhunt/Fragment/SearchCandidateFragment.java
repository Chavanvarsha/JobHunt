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

import com.example.jobhunt.Adapter.SearchCandidateAdapter;
import com.example.jobhunt.MainActivity;
import com.example.jobhunt.Model.JobPost;
import com.example.jobhunt.Model.SearchCandidate;
import com.example.jobhunt.R;

import java.util.ArrayList;
import java.util.List;

public class SearchCandidateFragment extends Fragment {
    RecyclerView rV_searchCandidate;
    List<SearchCandidate>searchCandidateList;
    SearchCandidateAdapter msearchCandidateAdapter;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainActivity)
        {
            ((MainActivity) context).setToolbarTitle(getResources().getString(R.string.menu_search_for_candidate));
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_search_candidate, container, false);
        rV_searchCandidate=view.findViewById(R.id.rV_searchCandidate);
        searchCandidateList=new ArrayList<>();
        addList();
        msearchCandidateAdapter=new SearchCandidateAdapter(searchCandidateList,getActivity());
        rV_searchCandidate.setLayoutManager(new LinearLayoutManager(getActivity()));
        rV_searchCandidate.setAdapter(msearchCandidateAdapter);
        return view;
    }
    private void addList()
    {
        SearchCandidate msearchCandidate=new SearchCandidate("NNA7262193443","Indian / Age : 37 Years","2nd Officer, 2nd Officer, 2nd Officer, 2nd Officer, 2nd Officer, / Type of Ships: Bulk Carrier, Bulk Carrier, Bulk Carrier, Container Ship, General Cargo",
                "2nd Officer ,3 Yrs & 5 Months [Actual Sailing Experience]","Chief Officer for Bulk Carrier [Navigation Department Section]","26-Jul-2021");
        searchCandidateList.add(msearchCandidate);
        msearchCandidate=new SearchCandidate("NNA7262193443","Indian / Age : 37 Years","2nd Officer, 2nd Officer, 2nd Officer, 2nd Officer, 2nd Officer, / Type of Ships: Bulk Carrier, Bulk Carrier, Bulk Carrier, Container Ship, General Cargo",
                "2nd Officer ,3 Yrs & 5 Months [Actual Sailing Experience]","Chief Officer for Bulk Carrier [Navigation Department Section]","26-Jul-2021");
        searchCandidateList.add(msearchCandidate);
        msearchCandidate=new SearchCandidate("NNA7262193443","Indian / Age : 37 Years","2nd Officer, 2nd Officer, 2nd Officer, 2nd Officer, 2nd Officer, / Type of Ships: Bulk Carrier, Bulk Carrier, Bulk Carrier, Container Ship, General Cargo",
            "2nd Officer ,3 Yrs & 5 Months [Actual Sailing Experience]","Chief Officer for Bulk Carrier [Navigation Department Section]","26-Jul-2021");
        searchCandidateList.add(msearchCandidate);
    }
}