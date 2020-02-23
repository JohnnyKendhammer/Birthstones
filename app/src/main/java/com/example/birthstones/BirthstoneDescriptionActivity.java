package com.example.birthstones;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BirthstoneDescriptionActivity extends AppCompatActivity {

    private TextView tvDescriptionText;
    private ImageView ivImage;
    private TextView tvBirthstoneName;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthstone);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        //get the current intent
        Intent intent = getIntent();
        //get the attached extras from the intent
        //we should use the same key as we used to attach the data.
        int birthstoneImage = intent.getIntExtra("Image", 0);
        String birthstoneName = intent.getStringExtra("Name");
        String birthstoneDescription = intent.getStringExtra("Description");
        setLayout(birthstoneImage, birthstoneName, birthstoneDescription);
    }

    public void setLayout(int image, String birthstoneName, String description){
        ivImage = findViewById(R.id.ivBirthstone);
        ivImage.setImageResource(image);

        tvBirthstoneName = findViewById(R.id.tvBirthstoneName);
        tvBirthstoneName.setText(birthstoneName);

        tvDescriptionText = findViewById(R.id.tvDescription);
        tvDescriptionText.setText(description);
    }
}
