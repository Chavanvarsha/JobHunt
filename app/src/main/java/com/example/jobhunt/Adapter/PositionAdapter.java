package com.example.jobhunt.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.jobhunt.Model.PositionPage;
import com.example.jobhunt.R;
import java.util.List;


public class PositionAdapter extends RecyclerView.Adapter<PositionAdapter.ViewHolder> {
    Context context;
    List<PositionPage> pageList;

    public PositionAdapter(List<PositionPage> pageList, Context context)
    {
        this.pageList = pageList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType)
    {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.position_page_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int position) {
        viewHolder.tvTitle.setText(pageList.get(position).getJobTitle());
        viewHolder.tvVesselType.setText(pageList.get(position).getVesselType());
        viewHolder.tvDate.setText(pageList.get(position).getDate());
        viewHolder.tvCompanyName.setText(pageList.get(position).getCompanyName());
    }

    @Override
    public int getItemCount()
    {
        return pageList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvVesselType, tvDate, tvCompanyName;

        public ViewHolder(View view) {
            super(view);
            tvTitle = view.findViewById(R.id.tvTitle);
            tvVesselType = view.findViewById(R.id.tvVesselType);
            tvDate = view.findViewById(R.id.tvDate);
            tvCompanyName = view.findViewById(R.id.tvCompanyName);
        }
    }
}
