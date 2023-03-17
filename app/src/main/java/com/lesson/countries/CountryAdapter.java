package com.lesson.countries;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Country> countries;

    public CountryAdapter(Context context, List<Country> countries) {
        this.inflater = LayoutInflater.from(context);
        this.countries = countries;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.country_list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Country country=countries.get(position);
        holder.flagView.setImageResource(country.getFlag());
        holder.nameView.setText(country.getName());
        holder.capitalView.setText(country.getCapital());
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        final ImageView flagView;
        final TextView nameView;
        final TextView capitalView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            flagView=itemView.findViewById(R.id.flag);
            nameView=itemView.findViewById(R.id.name);
            capitalView=itemView.findViewById(R.id.capital);
        }
    }
}
