package com.example.jobhunt.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.example.jobhunt.Fragment.PositionFragment;
import com.example.jobhunt.Model.Home;
import com.example.jobhunt.R;
import java.util.List;


public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    Context context;
    List<Home> homeList;

    public HomeAdapter(List<Home> homeList, Context context)
    {
        this.homeList = homeList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType)
    {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_page_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int position) {
        viewHolder.tvPosition.setText(homeList.get(position).getPositionName());
        viewHolder.tvCount.setText(String.valueOf(homeList.get(position).getCount()));
    }

    @Override
    public int getItemCount()
    {
        return homeList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvPosition,tvCount;
        LinearLayout ll_Position;
        public ViewHolder(View view)
        {
            super(view);
            tvPosition = view.findViewById(R.id.tvPosition);
            tvCount = view.findViewById(R.id.tvCount);
            ll_Position = view.findViewById(R.id.ll_Position);
            ll_Position.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
               case  R.id.ll_Position:
                   Fragment fragment = new PositionFragment();
                   ((FragmentActivity)context).getSupportFragmentManager().beginTransaction()
                           .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                           .replace(R.id.nav_host_fragment_content_main, fragment)
                           .addToBackStack(null)
                           .commit();
               break;
            }
        }
    }


}
