package com.hami.grid_view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridAdapter  extends BaseAdapter {
    private Context context;
    private ArrayList<gridItem> gridItems;

    GridAdapter(Context context, ArrayList<gridItem> gridItems){
        this.context = context;
        this.gridItems = gridItems;
    }

    @Override
    public int getCount() {
        return gridItems.size();
    }

    @Override
    public Object getItem(int i) {
        return gridItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View gridItemView = view;
        if(gridItemView == null){
            gridItemView = View.inflate(context, R.layout.grid_item, null);
        }
        gridItem currentItem = gridItems.get(i);

        ImageView imageView = gridItemView.findViewById(R.id.grid_item_image);
        TextView textView = gridItemView.findViewById(R.id.grid_item_text);

        imageView.setImageResource(currentItem.getImage());
        textView.setText(currentItem.getName());

        return gridItemView;
    }
}
