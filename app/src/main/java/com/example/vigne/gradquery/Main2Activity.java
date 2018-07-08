package com.example.vigne.gradquery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.concurrent.ExecutionException;

public class Main2Activity extends AppCompatActivity {

    String verbalscore,quantscore,toeflscore;
    int verbal_int,quant_int,toefl_int;
    String[]num;
    public void init(){

        Bundle bundle= getIntent().getExtras();
        verbalscore=bundle.getString("verbal_score");
        verbal_int=Integer.parseInt(verbalscore);
         quantscore= bundle.getString("quant_score");
         quant_int=Integer.parseInt(quantscore);
         toeflscore=bundle.getString("toefl_score");
         toefl_int=Integer.parseInt(toeflscore);
        if(verbal_int>170 || quant_int>170|| toefl_int>120)
        {
            num=new String[]{"Please enter your valid score for", "GRE","TOEFL"};
        }
         else if(verbal_int>=165 && quant_int>=165 && toefl_int>=100)
        {
            num=new String[]{"Massachusetts Institute of Technology",
                    "Stanford University",
                    "University of California Berkeley"};
        }
        else if(verbal_int>=160 && quant_int>=160 && toefl_int>=90)
        {
            num=new String[]{"Carnegie Mellon University",
                    "Georgia Technological University",
                    "University of Texas Austin",
                    "University of Michigan Ann Arbor" ,
                    "Cornell University," ,
                    "Purdue University" ,
                    "University of Southern California" ,
                    "Texas A&M University" ,
                    "University of California San Diego" ,
                    "California Technological University",
                    "Princeton University",
                    "University of Wisconsin Madison",
                    "Columbia University" ,
                    "University of Maryland College" ,
                    "Northwestern University"};
        }
        else if (verbal_int>=150 && quant_int>=150 && toefl_int>=79){
            num=new String[]{"University of Washington",
                    "Duke University" ,
                    "North Carolina State University" ,
                    "University of Colorado Boulder" ,
                    "University of California Irvine" ,
                    "Arizona State University" ,
                    "Iowa State University",
                    "Northeastern University"};
        }

        else if(verbal_int>=145 &&quant_int>=145 && toefl_int>=75){
            num=new String[]{"Colorado State University" ,
                    "Illinois Institute of Technology" ,
                    "Clemson University" ,
                    "University of Central Florida" ,
                    "University of Cincinnati" ,
                    "Santa Clara University" ,
                    "Santa Clara University" ,
                    "Mississippi State University" ,
                    "University of North Carolina" ,
                    "Michigan Technological University" ,
                    "University of Texas Arlington"};
        }
        else if (verbal_int>140 && quant_int>140 && toefl_int<75){
            num=new String[]{"Sorry","Please consider retaking the exams!!"};
        }
        else if(verbal_int<130 || quant_int<130|| toefl_int<0)
        {
            num=new String[]{"Please enter your valid score for", "GRE","TOEFL"};
        }
        ArrayAdapter adapter= new ArrayAdapter<String>(this,R.layout.activity_listview,num);
        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();


    }


}
