package com.example.jobhunt.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.jobhunt.Activity.JobPostActivity;
import com.example.jobhunt.Model.JobPost;
import com.example.jobhunt.Model.SearchCandidate;
import com.example.jobhunt.R;

import java.util.List;


public class SearchCandidateAdapter extends RecyclerView.Adapter<SearchCandidateAdapter.ViewHolder> {
    Context context;
    List<SearchCandidate> searchCandidateList;

    public SearchCandidateAdapter(List<SearchCandidate> searchCandidateList, Context context)
    {
        this.searchCandidateList = searchCandidateList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType)
    {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_candidate_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int position) {
        viewHolder.tvRefId.setText(searchCandidateList.get(position).getRefId());
        viewHolder.tvNationality.setText(searchCandidateList.get(position).getNationality());
        viewHolder.tvExperience.setText(searchCandidateList.get(position).getExperience());
        viewHolder.tvRank.setText(searchCandidateList.get(position).getRankExp());
        viewHolder.tvPost.setText(searchCandidateList.get(position).getAppliedPost());
        viewHolder.tvFromDate.setText(searchCandidateList.get(position).getFromDate());

    }

    @Override
    public int getItemCount()
    {
        return searchCandidateList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvRefId,tvNationality,tvExperience,tvRank,tvPost,tvFromDate,view_Btn;

        public ViewHolder(View view)
        {
            super(view);
            tvRefId = view.findViewById(R.id.tvRefId);
            tvNationality = view.findViewById(R.id.tvNationality);
            tvExperience = view.findViewById(R.id.tvExperience);
            tvRank = view.findViewById(R.id.tvRank);
            tvPost = view.findViewById(R.id.tvPost);
            tvFromDate = view.findViewById(R.id.tvFromDate);

//            view_Btn = view.findViewById(R.id.view_Btn);
//            view_Btn.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.view_Btn:
//                    Intent intent=new Intent(context, JobPostActivity.class);
//                    context.startActivity(intent);
            }
        }
    }
}
