package com.example.jobhunt.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.jobhunt.Model.JobPostDetails;
import com.example.jobhunt.R;
import java.util.List;

public class JobPostDetailsAdapter extends RecyclerView.Adapter<JobPostDetailsAdapter.ViewHolder> {
    Context context;
    List<JobPostDetails> jobPostDetailsList;

    public JobPostDetailsAdapter(List<JobPostDetails> jobPostDetailsList, Context context)
    {
        this.jobPostDetailsList = jobPostDetailsList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType)
    {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.job_postdetails_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int position) {
        viewHolder.tvPositionId.setText(jobPostDetailsList.get(position).getJobpostingId());
        viewHolder.tvStartDate.setText(jobPostDetailsList.get(position).getJobPostingStartDate());
        viewHolder.tvCompany.setText(jobPostDetailsList.get(position).getCompany());
        viewHolder.tvEndDate.setText(jobPostDetailsList.get(position).getJobPostingEndDate());
        viewHolder.tvDepartment.setText(jobPostDetailsList.get(position).getDepartment());
        viewHolder.tvRank.setText(jobPostDetailsList.get(position).getRank());
        viewHolder.tvtypeOfShip.setText(jobPostDetailsList.get(position).getTypeOfShip());
        viewHolder.tvNationality.setText(jobPostDetailsList.get(position).getNationality());
        viewHolder.tvPosts.setText(jobPostDetailsList.get(position).getNoOfPosts());
        viewHolder.tvSalary.setText(jobPostDetailsList.get(position).getSalary());
        viewHolder.tvBenefits.setText(jobPostDetailsList.get(position).getOtherBenefits());
    }

    @Override
    public int getItemCount()
    {
        return jobPostDetailsList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvPositionId,tvCompany,tvStartDate,tvEndDate,tvDepartment,
                tvRank,tvtypeOfShip,tvNationality,tvPosts,tvSalary,tvBenefits;

        public ViewHolder(View view)
        {
            super(view);
            tvPositionId = view.findViewById(R.id.tvPositionId);
            tvStartDate = view.findViewById(R.id.tvStartDate);
            tvEndDate = view.findViewById(R.id.tvEndDate);
            tvCompany = view.findViewById(R.id.tvCompany);
            tvDepartment = view.findViewById(R.id.tvDepartment);
            tvRank = view.findViewById(R.id.tvRank);
            tvtypeOfShip = view.findViewById(R.id.tvtypeOfShip);
            tvNationality = view.findViewById(R.id.tvNationality);
            tvPosts = view.findViewById(R.id.tvPosts);
            tvSalary = view.findViewById(R.id.tvSalary);
            tvBenefits = view.findViewById(R.id.tvBenefits);
        }
    }
}
