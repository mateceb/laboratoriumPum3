package com.example.lenovo.laboratoriumpum3;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by LENOVO on 19.12.2017.
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder>
{
private ArrayList<Place> miejsca = new ArrayList<>();
PlaceAdapter(ArrayList<Place> miejsca)
{
    this.miejsca=miejsca;
}

@Override
public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    return null;
}

@Override
public void onBindViewHolder(ViewHolder holder, int position)
{

}

@Override
public int getItemCount()
{
    return 0;
}

class ViewHolder extends RecyclerView.ViewHolder
{
    public ViewHolder(View itemView)
    {
        super(itemView);
    }
}
}
