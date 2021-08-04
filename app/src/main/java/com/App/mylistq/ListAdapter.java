package com.App.mylistq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {

    private ArrayList<Film> listJudul;
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ListViewHolder holder, int position) {
        Film film = listJudul.get(position);
        Glide.with(holder.itemView.getContext())
                .load(film.getCover())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgCover);
        holder.tvJudul.setText(film.getJudul());
        holder.tvSinopsis.setText(film.getSinopsis());
    }

    @Override
    public int getItemCount() {
        return listJudul.size();
    }

    public ListAdapter(ArrayList<Film> list) {
        this.listJudul = list;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {


        ImageView imgCover;
        TextView tvJudul, tvSinopsis;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCover = itemView.findViewById(R.id.img_cover);
            tvJudul = itemView.findViewById(R.id.tv_judul);
            tvSinopsis = itemView.findViewById(R.id.tv_sinopsis);
        }
    }
}
