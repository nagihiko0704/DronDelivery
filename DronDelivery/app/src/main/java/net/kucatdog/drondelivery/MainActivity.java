package net.kucatdog.drondelivery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View state = (View) getLayoutInflater().inflate(R.layout.state, null);
        View location = (View) getLayoutInflater().inflate(R.layout.location, null);
        View temperature = (View) getLayoutInflater().inflate(R.layout.temperature, null);



    }


}
