package com.example.womandressdesigns;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;


import com.example.womandressdesigns.Adapter.FavImageAdapter;
import com.example.womandressdesigns.Model.FavImageModel;
import com.example.womandressdesigns.databinding.ActivityFavShowBinding;

import java.util.ArrayList;

public class FavShowActivity extends AppCompatActivity {


    ActivityFavShowBinding binding;
    ArrayList<FavImageModel> list;
    DatabaseHelper myDb;


    FavImageAdapter adapter;
    FavImageModel modelclass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityFavShowBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list=new ArrayList<>();

        binding.favImageRecycler.setLayoutManager(new LinearLayoutManager(this));

        myDb = new DatabaseHelper(this);

        myDb.getWritableDatabase();


        Cursor cursor = myDb.getAllData();



        if(cursor.getCount() == 0 )
        {
            Toast.makeText(this, "data not found", Toast.LENGTH_SHORT).show();

            return;
        }

        StringBuffer buffer = new StringBuffer();

        while (cursor.moveToNext())
        {


            modelclass= new FavImageModel(cursor.getString(0),
                    cursor.getString(1));





            list.add(modelclass);
            adapter = new FavImageAdapter(list);
            binding.favImageRecycler.setAdapter(adapter);

        }






        // showMessage("Data",buffer.toString());
    }









    }
