package com.example.jandroid.cookies;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jandroid.cookies.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        ImageView imageView=(ImageView) findViewById(R.id.android_cookie_image_view);
        imageView.setImageResource(R.drawable.after_cookie);
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        TextView textView=(TextView) findViewById(R.id.status_text_view);
        textView.setText("I'm so full");

        // TODO: Find a reference to the TextView in the layout. Change the text.

    }
}