package com.example.vigne.gradquery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {



    ////////////////////////////////////////////////////////////////////

    Button Submit_Button;
    EditText Verbal;
    EditText Quant;
    EditText Toefl;
    TextView mText;

    public void init(){
        Verbal= (EditText)findViewById(R.id.editText_Verbal);
        Quant=(EditText)findViewById(R.id.editText8);
        Toefl=(EditText)findViewById(R.id.editText_Toefl);

        Submit_Button=(Button)findViewById(R.id.button_Submit);
        Submit_Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String verbal_score=Verbal.getText().toString();
                String quant_score=Quant.getText().toString();
                String toefl_score=Toefl.getText().toString();
                String type="submit";

                //BackgroundWorker backgroundWorker = new BackgroundWorker(MainActivity.this);
                //backgroundWorker.execute(type, verbal_score,quant_score,toefl_score);
                Intent result= new Intent(MainActivity.this,Main2Activity.class);
                result.putExtra("verbal_score",verbal_score);
                result.putExtra("quant_score",quant_score);
                result.putExtra("toefl_score",toefl_score);
                result.putExtra("type",type);
                startActivity(result);

            }
        });



    }



    /////////////////////////////////////////////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

}
