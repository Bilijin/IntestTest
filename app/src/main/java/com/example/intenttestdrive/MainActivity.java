package com.example.intenttestdrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mOpenWedsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mOpenWedsite = findViewById(R.id.website);
    }

    public void OpenWebsite(View view) {
        String url = mOpenWedsite.getText().toString();
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        else {
            Log.d("openwebsite","can't open website");
        }
    }

}
