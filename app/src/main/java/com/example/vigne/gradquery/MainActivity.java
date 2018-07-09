package com.example.vigne.gradquery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.text.Editable;
import android.text.TextWatcher;
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

    /////////////////////////////////////////////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Verbal= (EditText)findViewById(R.id.editText_Verbal);
        Quant=(EditText)findViewById(R.id.editText8);
        Toefl=(EditText)findViewById(R.id.editText_Toefl);
        Submit_Button=(Button)findViewById(R.id.button_Submit);

        Verbal.addTextChangedListener(userScore);
        Quant.addTextChangedListener(userScore);
        Toefl.addTextChangedListener(userScore);

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

    private TextWatcher userScore= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String verbal_score=Verbal.getText().toString();
            String quant_score=Quant.getText().toString();
            String toefl_score=Toefl.getText().toString();
            Submit_Button.setEnabled(!verbal_score.isEmpty()&& !quant_score.isEmpty() && !toefl_score.isEmpty());

            if(!verbal_score.isEmpty()&& !quant_score.isEmpty() &&!toefl_score.isEmpty())
            Submit_Button.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            else if(verbal_score.isEmpty()||quant_score.isEmpty() || toefl_score.isEmpty())
                Submit_Button.setBackgroundColor(getResources().getColor(R.color.silver));


        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };


}
