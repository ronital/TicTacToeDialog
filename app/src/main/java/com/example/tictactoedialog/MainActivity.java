package com.example.tictactoedialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Controller controller;
    private LinearLayout llMain;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llMain = findViewById(R.id.mainBoard);
        // TODO - start controller object
        // TODO - imageView still null!!!!
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
    }

    public void select(View v)
    {
        int loc = Integer.parseInt(v.getTag().toString());
        Toast.makeText(this, "Click "+loc, Toast.LENGTH_SHORT).show();

        Button b = (Button)v; // v is button
        b.setEnabled(false); // can't press this button again

        // TODO - update player image
        // TODO - check game over
        // TODO -


    }

    public void startGame(View view) {
        newGame();
    }

    private void newGame() {
        //TODO - clear all button
        //TODO - enable all button
        imageView.setImageResource(R.drawable.x);
        Button b= llMain.findViewWithTag("0");
        b.setText(" ");

    }
}
