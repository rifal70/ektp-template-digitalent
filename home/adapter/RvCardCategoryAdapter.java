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

public class RvCardCategoryAdapter extends RecyclerView.Adapter<RvCardCategoryAdapter.ViewHolder> {

    private ArrayList<String> mtitle;
    private ArrayList<String> mdesc;
    private ArrayList<String> mbutton;
    private Context mContext;

    public RvCardCategoryAdapter(Context mContext, ArrayList<String> mtitle, ArrayList<String> mdesc, ArrayList<String> mbutton) {
        this.mtitle = mtitle;
        this.mdesc = mdesc;
        this.mbutton = mbutton;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem_category, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv_cardtitle.setText(mtitle.get(position));
        holder.tv_carddesc.setText((mdesc.get(position)));
        holder.btn_cardview.setText((mbutton.get(position)));
        holder.btn_cardview.setOnClickListener(v -> {
            Toast.makeText(mContext, "button clicked", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return mtitle.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_cardtitle, tv_carddesc;
        Button btn_cardview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_cardtitle = itemView.findViewById(R.id.tv_cardtitle);
            tv_carddesc = itemView.findViewById(R.id.tv_carddesc);
            btn_cardview = itemView.findViewById(R.id.btn_cardview);

        }
    }
}
