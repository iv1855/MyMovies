package com.example.mymovies;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieAdapter {
    class MovieViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewSmallPoster;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
