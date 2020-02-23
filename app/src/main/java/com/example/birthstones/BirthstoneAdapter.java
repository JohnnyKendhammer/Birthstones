package com.example.birthstones;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BirthstoneAdapter extends RecyclerView.Adapter<BirthstoneAdapter.BirthstoneViewHolder> {

    //List of Birthstone Objects
    private ArrayList<Birthstone> birthstones;
    private Context context;

    public BirthstoneAdapter(ArrayList<Birthstone> birthstones) {
        this.birthstones = birthstones;
    }

    @NonNull
    @Override
    public BirthstoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.birthstone_layout, parent, false);

        return new BirthstoneViewHolder(view);
    }

    public void onBindViewHolder(@NonNull BirthstoneViewHolder holder, final int position) {
        final Birthstone birthstone = birthstones.get(position);
        holder.ivBirthstoneImage.setImageResource(birthstone.getImageResourceID());
        holder.tvBirthstoneName.setText(birthstone.getBirthStoneName());

        holder.birthstoneLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, BirthstoneDescriptionActivity.class);

                intent.putExtra("Image", birthstone.getImageResourceID());
                intent.putExtra("Name", birthstone.getBirthStoneName());
                intent.putExtra("Description", birthstone.getDescription());
                //finally start the activity
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return birthstones.size();
    }

    class BirthstoneViewHolder extends RecyclerView.ViewHolder {

        private TextView tvBirthstoneName;
        private ImageView ivBirthstoneImage;
        private ConstraintLayout birthstoneLayout;

        public BirthstoneViewHolder(@NonNull View itemView) {
            super(itemView);
            birthstoneLayout = itemView.findViewById(R.id.birthstoneParentLayout);
            tvBirthstoneName = itemView.findViewById(R.id.tvBirthstoneName);
            ivBirthstoneImage = itemView.findViewById(R.id.ivBirthstoneImage);
        }
    }



}
