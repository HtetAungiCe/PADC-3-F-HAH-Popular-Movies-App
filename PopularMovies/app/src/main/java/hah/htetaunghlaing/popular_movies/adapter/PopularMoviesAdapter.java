package hah.htetaunghlaing.popular_movies.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hah.htetaunghlaing.popular_movies.R;
import hah.htetaunghlaing.popular_movies.viewholder.MoviesViewHolder;

/**
 * Created by Htet Aung Hlaing on 12/7/2017.
 */

public class PopularMoviesAdapter extends RecyclerView.Adapter{
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View moviesView=inflater.inflate(R.layout.item_popular_movies,parent,false);
        MoviesViewHolder moviesViewHolder=new MoviesViewHolder(moviesView);



        return moviesViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 16;
    }
}
