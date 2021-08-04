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

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewHolder> {
    private ArrayList<Film> listJudul;

    public CardViewAdapter(ArrayList<Film> list){
        this.listJudul= list;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewAdapter.CardViewHolder holder, int position) {
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

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCover;
        TextView tvJudul, tvSinopsis;

        CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCover = itemView.findViewById(R.id.img_cover);
            tvJudul = itemView.findViewById(R.id.tv_judul);
            tvSinopsis = itemView.findViewById(R.id.tv_sinopsis);
        }
    }
}
