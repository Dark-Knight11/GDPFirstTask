package com.sies.gdpfirsttask;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private final String[][] details;
    private final int[] drawables;

    Context context;

    public RecyclerAdapter(String[][] details, int[] drawables) {
        this.details = details;
        this.drawables = drawables;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        context = parent.getContext();
        return new ViewHolder(view);
    }

    @SuppressLint({"SetTextI18n", "ResourceAsColor"})
    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull RecyclerAdapter.ViewHolder holder, int position) {
        String rating = details[1][position];
        int i = Integer.parseInt(String.valueOf(rating.charAt(0)));
        if (i < 2)
            holder.rating.setBackgroundColor(this.context.getResources().getColor(R.color.one_star));
        else if (i < 3)
            holder.rating.setBackgroundColor(this.context.getResources().getColor(R.color.two_star));
        else if (i < 4)
            holder.rating.setBackgroundColor(this.context.getResources().getColor(R.color.three_star));
        else if (i < 5)
            holder.rating.setBackgroundColor(this.context.getResources().getColor(R.color.four_star));
        else
            holder.rating.setBackgroundColor(this.context.getResources().getColor(R.color.five_star));
        holder.rating.setText(rating);
        holder.timing.setText(details[2][position]);
        holder.hotelName.setText(details[0][position]);
        holder.address.setText(details[3][position]);
        holder.foodType.setText(details[4][position]);
        holder.poster.setImageResource(drawables[position]);
    }

    @Override
    public int getItemCount() {
        return details[0].length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView poster;
        TextView timing, hotelName, address, foodType;
        Button rating;
        public ViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);

            poster = itemView.findViewById(R.id.poster);
            timing = itemView.findViewById(R.id.timing);
            hotelName = itemView.findViewById(R.id.hotelName);
            address = itemView.findViewById(R.id.address);
            foodType = itemView.findViewById(R.id.foodType);
            rating = itemView.findViewById(R.id.rating);
        }
    }
}
