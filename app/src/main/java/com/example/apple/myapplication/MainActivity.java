package com.example.apple.myapplication;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    EditText user_name;
    TextView message;
    Button hello_button;
    String say1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user_name = (EditText)findViewById(R.id.userName);
        message = (TextView)findViewById(R.id.textView);
        hello_button = (Button)findViewById(R.id.button);

        user_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message.setText(getResources().getString(R.string.wait));
                user_name.setText("");
            }
        });

    }

    public void show(View m){
        say1 = getResources().getString(R.string.hey)+" "+user_name.getText();
        message.setText(say1);
        m.setBackgroundColor(Color.RED);
        message.setBackgroundColor(Color.GRAY);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }
}
