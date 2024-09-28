package com.hami.grid_view;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    ArrayList<gridItem> gridItems = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        gridItems.add(new gridItem(R.drawable.camera, "Camera"));
        gridItems.add(new gridItem(R.drawable.camera_roll, "Camera Roll"));
        gridItems.add(new gridItem(R.drawable.my_videos, "My Videos"));
        gridItems.add(new gridItem(R.drawable.featured, "Featured"));
        gridItems.add(new gridItem(R.drawable.watch_later, "Watch Later"));
        gridItems.add(new gridItem(R.drawable.subscriptions, "subscriptions"));
        gridItems.add(new gridItem(R.drawable.stats, "Stats"));
        gridItems.add(new gridItem(R.drawable.help, "Help"));
        gridItems.add(new gridItem(R.drawable.unlikes, "Unlikes"));


        GridAdapter gridAdapter = new GridAdapter(this, gridItems);
        gridView.setAdapter(gridAdapter);

    }
}