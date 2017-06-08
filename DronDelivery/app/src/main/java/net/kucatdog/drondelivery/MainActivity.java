package net.kucatdog.drondelivery;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
{
    public int DESIRED_TEMP = 41;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //if button clicked, change background based on input text
    public void changeBackground(View v)
    {
        LinearLayout curtempBox = (LinearLayout)findViewById(R.id.current_temp_box);
        EditText currtemp = (EditText)findViewById(R.id.current_temp);

        //get input value and convert it to int
        String temp = currtemp.getText().toString();
        int inttemp = Integer.parseInt(temp);

        //
        if (inttemp > DESIRED_TEMP)
        {
            curtempBox.setBackgroundColor(Color.RED);
        }
        else if (inttemp == DESIRED_TEMP)
        {
            curtempBox.setBackgroundColor(Color.YELLOW);
        }
        else
        {
            curtempBox.setBackgroundColor(Color.BLUE);
        }

    }

    //change drone's location if button clicked, and reset when delivery is done
    public void delivery(View v)
    {


    }

}
