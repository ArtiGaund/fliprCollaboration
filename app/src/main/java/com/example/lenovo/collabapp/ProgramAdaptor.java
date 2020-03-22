package com.example.lenovo.collabapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramAdaptor extends RecyclerView.Adapter<ProgramAdaptor.ProgramViewHolder> {
    @NonNull

    private String[] data;
    public ProgramAdaptor(String[] data){
        this.data=data;
    }
    @Override
    public ProgramViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.list_item_layout,viewGroup,false);
        return new ProgramViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramViewHolder programViewHolder, int i) {
        String name=data[i];
        programViewHolder.textView.setText(name);
    }

    @Override
    public int getItemCount() {
        return data.length  ;
    }

    public class ProgramViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ProgramViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.folder);
            textView=itemView.findViewById(R.id.foldername);
        }
    }
}
