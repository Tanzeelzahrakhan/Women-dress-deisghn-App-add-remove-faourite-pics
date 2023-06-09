package com.example.womandressdesigns.Adapter;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.womandressdesigns.DatabaseHelper;
import com.example.womandressdesigns.FavShowActivity;
import com.example.womandressdesigns.Model.FavImageModel;
import com.example.womandressdesigns.R;
import com.example.womandressdesigns.databinding.ItemListBinding;

import java.util.ArrayList;

public class FavImageAdapter extends RecyclerView.Adapter<FavImageAdapter.ViewHolder> {

    ArrayList<FavImageModel> mylist;
    DatabaseHelper myDb;

    public FavImageAdapter(ArrayList<FavImageModel> mylist) {
        this.mylist = mylist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.binding.rcImage.setImageResource(Integer.parseInt(mylist.get(position).getName()));

        holder.binding.ButtonFvrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                myDb = new DatabaseHelper(v.getContext());

                myDb.getWritableDatabase();

                Integer deletedRow =  myDb.deleteData(mylist.get(position).getId());

                if(deletedRow>0)
                {
                    Toast.makeText(v.getContext(), "Remove from Favourite", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(v.getContext(), FavShowActivity.class);
                    holder.binding.ButtonFvrt.getContext().startActivity(intent);
                    ((Activity)holder.binding.rcImage.getContext()).finish();


                }
                else
                {
                    Toast.makeText(v.getContext(), "Data not Found", Toast.LENGTH_SHORT).show();
                }





            }
        });

    }




    @Override
    public int getItemCount() {
        return mylist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ItemListBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding=ItemListBinding.bind(itemView);
        }
    }

}
