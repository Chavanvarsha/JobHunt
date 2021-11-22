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
import com.example.jobhunt.R;
import java.util.List;


public class JobPostAdapter extends RecyclerView.Adapter<JobPostAdapter.ViewHolder> {
    Context context;
    List<JobPost> jobPostList;

    public JobPostAdapter(List<JobPost> jobPostList, Context context)
    {
        this.jobPostList = jobPostList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.job_post_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int position) {
        viewHolder.tvPositionId.setText(jobPostList.get(position).getPostingId());
        viewHolder.tvStartDate.setText(jobPostList.get(position).getStartDate());
        viewHolder.tvEndDate.setText(jobPostList.get(position).getEndDate());
        viewHolder.tvStatus.setText(jobPostList.get(position).getStatus());
    }

    @Override
    public int getItemCount()
    {
        return jobPostList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvPositionId,tvStartDate,tvEndDate,tvStatus,view_Btn;

        public ViewHolder(View view)
        {
            super(view);
            tvPositionId = view.findViewById(R.id.tvPositionId);
            tvStartDate = view.findViewById(R.id.tvStartDate);
            tvEndDate = view.findViewById(R.id.tvEndDate);
            tvStatus = view.findViewById(R.id.tvStatus);
            view_Btn = view.findViewById(R.id.view_Btn);
            view_Btn.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.view_Btn:
                    Intent intent=new Intent(context, JobPostActivity.class);
                    context.startActivity(intent);
            }
        }
    }
}
