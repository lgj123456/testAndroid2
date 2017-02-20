package com.example.yhdj.ad0220;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder>{

    private List<Dog> mDogList;

    public Myadapter(List<Dog> mDogList){
        this.mDogList = mDogList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dog_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Dog dog = mDogList.get(position);
        holder.mImageView.setImageResource(dog.dogId);
        holder.mTextView.setText(dog.name);
    }

    @Override
    public int getItemCount() {
        return mDogList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView mTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.dogImage);
            mTextView = (TextView) itemView.findViewById(R.id.dogName);
        }
    }
}
