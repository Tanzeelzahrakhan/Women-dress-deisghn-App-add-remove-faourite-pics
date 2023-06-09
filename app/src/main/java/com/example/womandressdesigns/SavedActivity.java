package com.example.womandressdesigns;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Toast;

import com.example.womandressdesigns.Adapter.FavImageAdapter;
import com.example.womandressdesigns.Model.FavImageModel;
import com.example.womandressdesigns.databinding.ActivitySavedBinding;
import com.smarteist.autoimageslider.IndicatorView.animation.data.Value;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class SavedActivity extends AppCompatActivity {

ActivitySavedBinding binding;
    private boolean isFavorite = false;
    String value;
    Bitmap bitmap;


    DatabaseHelper myDb;

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved);
        binding=ActivitySavedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        myDb = new DatabaseHelper(this);

        myDb.getWritableDatabase();
/*
        int saveImg=getIntent().getIntExtra("key",0);
        binding.imageView1.setImageResource(saveImg);*/

       value = getIntent().getStringExtra("key");
        binding.imageView1.setImageResource(Integer.parseInt(value));

        bitmap = BitmapFactory.decodeResource(getResources(), Integer.parseInt(value));

        binding.Save.setOnClickListener(view -> {
            String displayName = "MyImage.jpg";
            String mimeType = "image/jpeg";

            ContentValues values = new ContentValues();
            values.put(MediaStore.Images.Media.DISPLAY_NAME, displayName);
            values.put(MediaStore.Images.Media.MIME_TYPE, mimeType);

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

                values.put(MediaStore.Images.Media.RELATIVE_PATH, Environment.DIRECTORY_PICTURES);
            } else {
                String imagePath = Environment.getExternalStorageDirectory().toString() + File.separator + Environment.DIRECTORY_PICTURES;
                values.put(MediaStore.Images.Media.DATA, imagePath);
            }

            ContentResolver resolver = getContentResolver();
            Uri imageUri = resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);

            OutputStream outputStream;
            try {
                outputStream = resolver.openOutputStream(imageUri);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
           Toast.makeText(SavedActivity.this, "Saved Image in Gellary", Toast.LENGTH_SHORT).show();
        });

        binding.fvrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleFavorite();

            }
        });

    }



    private void toggleFavorite() {
        isFavorite = !isFavorite;
        if (isFavorite) {
            binding.fvrt.setImageResource(R.drawable.baseline_favorite);
         binding.fvrt.setEnabled(false);
            boolean IsInserted= myDb.insertData(Integer.parseInt(value));



            if(IsInserted==true)
            {

                Toast.makeText(this, "Add to favorite", Toast.LENGTH_SHORT).show();
            }
            else {


                Toast.makeText(SavedActivity.this, "Data Not Inserted", Toast.LENGTH_SHORT).show();
            }

        }

        else {

            binding.fvrt.setImageResource(R.drawable.baseline_non_favorite);
            Toast.makeText(this, "Remove to favorite", Toast.LENGTH_SHORT).show();
        }
    }


}