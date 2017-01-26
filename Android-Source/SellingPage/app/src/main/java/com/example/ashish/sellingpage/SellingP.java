package com.example.ashish.sellingpage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SellingP extends AppCompatActivity implements View.OnClickListener {
    private static final int RESULT_LOAD_IMAGE = 1;
    ImageView imagetoupload;
    Button Bconfirm, Bcancel;


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selling_p);

        imagetoupload = (ImageView) findViewById(R.id.imagetoupload);

        Bconfirm = (Button) findViewById(R.id.Bconfirm);
        Bcancel = (Button) findViewById(R.id.Bcancel);

        imagetoupload.setOnClickListener(this);
        Bconfirm.setOnClickListener(this);
        Bcancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imagetoupload:
                Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(galleryIntent, RESULT_LOAD_IMAGE);
                break;
            case R.id.Bconfirm:
                Toast.makeText(getApplicationContext(), "Button not programmed yet", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Bcancel:
                Toast.makeText(getApplicationContext(), "Button not programmed yet", Toast.LENGTH_SHORT).show();
                break;

        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && data != null) {
            Uri selectedImage = data.getData();
            imagetoupload.setImageURI(selectedImage);
        }
    }

    //https://www.youtube.com/watch?v=TMnQJKtmOd4
}