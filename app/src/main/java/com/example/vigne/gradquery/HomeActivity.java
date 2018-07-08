package com.example.vigne.gradquery;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView loancard,ideacard,schoolcard,updatecard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        loancard=(CardView)findViewById(R.id.loancardId);
        ideacard=(CardView)findViewById(R.id.ideacardId);
        schoolcard=(CardView)findViewById(R.id.schoolcardId);
        updatecard=(CardView)findViewById(R.id.updatecardId);
        //Define Listener
        loancard.setOnClickListener(this);
        ideacard.setOnClickListener(this);
        schoolcard.setOnClickListener(this);
        updatecard.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        Intent i;
        switch(view.getId()){
            case R.id.schoolcardId: i = new Intent(this, MainActivity.class);startActivity(i);break;
            case R.id.updatecardId: i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.usnews.com/best-colleges"));startActivity(i);break;
            case R.id.loancardId: i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.discover.com/student-loans/"));startActivity(i);break;
            case R.id.ideacardId: i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.quora.com/How-do-I-start-preparing-for-the-GRE-TOEFL-and-IELTS"));startActivity(i);break;
            default:break;

        }
    }
}
