package com.example.androkado;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androkado.ArticleFragment.OnListFragmentInteractionListener;
import com.example.androkado.entities.Article;

import java.util.List;

public class MyArticleRecyclerViewAdapter extends RecyclerView.Adapter<MyArticleRecyclerViewAdapter.ViewHolder> {

    private final List<Article> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyArticleRecyclerViewAdapter(List<Article> articles, OnListFragmentInteractionListener listener) {
        mValues = articles;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_article, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.mItem = mValues.get(position);
        holder.mDescription.setText(mValues.get(position).getDescription());
        holder.mLibelle.setText(mValues.get(position).getLibelle());



        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
                Intent navigation = new Intent(holder.mView.getContext(), DetailArticleActivity.class);
                navigation.putExtra("myArticle", mValues.get(position));
                // on utilise MainActivity.this devant le this car on est dans une fonction anonyme
                holder.mView.getContext().startActivity( navigation );
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mLibelle;
        public final TextView mDescription;
        public Article mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = view.findViewById(R.id.item_number);
            mLibelle = view.findViewById(R.id.content);
            mDescription = view.findViewById(R.id.articleDescription);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mLibelle.getText() + "'";
        }
    }
}
