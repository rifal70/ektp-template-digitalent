package com.digitalent.ektp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.digitalent.ektp.R;

import java.util.ArrayList;

public class RvCardNewsAdapter extends RecyclerView.Adapter<RvCardNewsAdapter.ViewHolder> {

    private ArrayList<String> mtitleN;
    private ArrayList<String> mdatetimeN;
    private ArrayList<String> mdescN;
    private ArrayList<String> mreadmoreN;

    private Context mContextN;

    public RvCardNewsAdapter(Context mContextN, ArrayList<String> mtitleN, ArrayList<String> mdatetimeN, ArrayList<String> mdescN, ArrayList<String> mreadmoreN) {
        this.mtitleN = mtitleN;
        this.mdatetimeN = mdatetimeN;
        this.mdescN = mdescN;
        this.mreadmoreN = mreadmoreN;
        this.mContextN = mContextN;
}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem_news, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv_cardtitle.setText(mtitleN.get(position));
        holder.tv_datetime.setText(mdatetimeN.get(position));
        holder.tv_carddesc.setText((mdescN.get(position)));
        holder.tv_readmore.setText((mreadmoreN.get(position)));

        holder.tv_readmore.setOnClickListener(v -> {
            Toast.makeText(mContextN, "readmore clicked", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return mtitleN.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_cardtitle, tv_carddesc, tv_datetime, tv_readmore;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_cardtitle = itemView.findViewById(R.id.tv_cardtitle);
            tv_datetime = itemView.findViewById(R.id.tv_datetime);
            tv_carddesc = itemView.findViewById(R.id.tv_carddesc);
            tv_readmore = itemView.findViewById(R.id.tv_readmore);

        }
    }
}
