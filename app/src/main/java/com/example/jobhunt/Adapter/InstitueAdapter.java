package com.example.jobhunt.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.jobhunt.Model.Institue;
import com.example.jobhunt.R;
import java.util.List;


public class InstitueAdapter extends RecyclerView.Adapter<InstitueAdapter.ViewHolder> {
    Context context;
    List<Institue> institueList;

    public InstitueAdapter(List<Institue> institueList, Context context)
    {
        this.institueList = institueList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType)
    {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.institute_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int position) {
        viewHolder.tvInstiuteName.setText(institueList.get(position).getInstitueName());
        viewHolder.tvAddress.setText(institueList.get(position).getAddress());

    }

    @Override
    public int getItemCount()
    {
        return institueList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvInstiuteName,tvAddress;
        public ViewHolder(View view)
        {
            super(view);
            tvInstiuteName = view.findViewById(R.id.tvInstiuteName);
            tvAddress = view.findViewById(R.id.tvAddress);
        }
    }
}
