package com.example.nilotpalkumarghosh.higherorlowergame;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int num;

    public void getToast(String string){
        Toast.makeText(MainActivity.this, string,Toast.LENGTH_SHORT).show();
    }
    public void guess(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        TextView textView = (TextView) findViewById(R.id.textView);
        Log.i("g-button", "clicked");
        int guesint = Integer.parseInt(editText.getText().toString());

        if(guesint>num)
        {
            getToast("Lower");
            editText.getText().clear();
        }

        else if(guesint<num)
        {
            getToast("Higher");
            editText.getText().clear();
        }
        else
        {
            getToast("Correct");
            editText.getText().clear();
        }
    }
    public void tryagain(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        Random rand = new Random();
        num = rand.nextInt(20)+1;
        editText.getText().clear();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        num = rand.nextInt(20)+1;
    }



}
