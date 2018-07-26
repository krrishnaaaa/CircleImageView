package de.hdodenhof.circleimageview.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCircleImageView(View view) {
        startActivity(new Intent(this, CircleImageViewDemoActivity.class));
    }

    public void openRoundedCornerImageView(View view) {
        startActivity(new Intent(this, RoundedCornerImageViewDemoActivity.class));
    }
}
