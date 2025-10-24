package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ClickedCityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicked_city);

        // Get the city name from the intent
        String cityName = getIntent().getStringExtra("cityName");

        // Find the TextView and set the text
        TextView cityTextView = findViewById(R.id.city_name_text);
        Button backButton = findViewById(R.id.back_button);

        // Get the city name passed from MainActivity
        cityTextView.setText("You clicked: " + cityName);

        // 🔙 Back button — go back to MainActivity
        backButton.setOnClickListener(v -> {
            finish(); // closes this activity and returns to MainActivity
        });
    }
}
