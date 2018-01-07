package com.example.lenovo.laboratoriumpum3;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by LENOVO on 19.12.2017.
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder>
{
private ArrayList<Place> miejsca = new ArrayList<>();
private  OnClickPlace listener;



    public PlaceAdapter(ArrayList<Place> miejsca, OnClickPlace listener) {
        this.miejsca=miejsca;
        this.listener = listener;
    }

    @Override
public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
{
    View itemLayoutView = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.activity_item, null);

    return new ViewHolder(itemLayoutView, listener);
}

@Override
public void onBindViewHolder(ViewHolder holder, int position)
{
    holder.setMiastoItem(miejsca.get(position).getPleaceName());
    holder.setInfoItem(miejsca.get(position).getInformation() + "");
}

@Override
public int getItemCount()
{
    return miejsca.size();
}

 public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    @BindView(R.id.name)
    TextView nameItem;

    @BindView(R.id.information)
    TextView infoItem;

    private OnClickPlace listener;

    public ViewHolder(View itemView, OnClickPlace listener) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        this.listener = listener;
        itemView.setOnClickListener(this);
    }

    private void setMiastoItem(String miasto) {
        nameItem.setText(miasto);
    }
    private void setInfoItem(String info) {
        infoItem.setText(info);
    }


    @Override
    public void onClick(View view) {
        listener.onClickPlace(view, getAdapterPosition());
    }
}
}
