package com.example.jobhunt.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jobhunt.MainActivity;
import com.example.jobhunt.R;


public class MemberShipDetailsFragment extends Fragment {
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainActivity)
        {
            ((MainActivity) context).setToolbarTitle(getResources().getString(R.string.menu_membership_details));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_member_ship_details, container, false);


        return view;
    }
}