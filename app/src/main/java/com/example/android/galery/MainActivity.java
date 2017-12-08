package com.example.android.galery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    /*int[] imageId = {
            R.drawable.fluffy_not_fat,
            R.drawable.one_sister,
            R.drawable.pringles_holder,
            R.drawable.pumpkin,
            R.drawable.stayin_alive,
            R.drawable.true_friendship
    };
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("My Gallery");
        setContentView(R.layout.activity_main);
    }

    public void imageClick(View view) {
        //Implement image click function
        setTitle("Detail");
        setContentView(R.layout.image_detail);
    }

}
