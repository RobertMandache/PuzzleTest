package org.worldsproject.puzzle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        int[] mImageIds = { R.drawable.image1 };

        Intent intent = new Intent(this, PuzzleSelectActivity.class);
        intent.putExtra("images", mImageIds);

        this.startActivity(intent);
    }
}
