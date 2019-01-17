package com.mca.amalz.mark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Start extends AppCompatActivity {
EditText s1m,s1t,s2m,s2t,s3m,s3t;
Button but1;
String s1,s2,s3,s4,s5,s6,g1,g2,g3;
Integer n1,n2,n3,n4,n5,n6,grd1,grd2,grd3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        s1m=(EditText)findViewById(R.id.sub1mark);
        s1t=(EditText)findViewById(R.id.sub1tot);
        s2m=(EditText)findViewById(R.id.sub2mark);
        s2t=(EditText)findViewById(R.id.sub2tot);
        s3m=(EditText)findViewById(R.id.sub3mark);
        s3t=(EditText)findViewById(R.id.sub3tot);
        but1=(Button)findViewById(R.id.butt);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=s1m.getText().toString();
                s2=s1t.getText().toString();
                s3=s2m.getText().toString();
                s4=s2t.getText().toString();
                s5=s3m.getText().toString();
                s6=s3t.getText().toString();
                n1=Integer.parseInt(s1);
                n2=Integer.parseInt(s2);
                n3=Integer.parseInt(s3);
                n4=Integer.parseInt(s4);
                n5=Integer.parseInt(s5);
                n6=Integer.parseInt(s6);
                grd1=((n1*100)/n2);

                 if(grd1>=90) {
                     g1 = "A";
                 }
                else if(grd1>80){
                    g1="B";
                }
                else if(grd1>70){
                    g1="C";
                }
                else if(grd1>60){
                    g1="D";
                }
                else if(grd1>50){
                    g1="E";
                }
                else {
                    g1="F";

                }

                grd2=((n3*100)/n4);

                if(grd2>=90) {
                    g2 = "A";
                }
                else if(grd2>80){
                    g2="B";
                }
                else if(grd2>70){
                    g2="C";
                }
                else if(grd2>60){
                    g2="D";
                }
                else if(grd2>50){
                    g2="E";
                }
                else {
                    g2="F";

                }

                grd3=((n5*100)/n6);
                if(grd3>=90) {
                    g3 = "A";
                }
                else if(grd3>85){
                    g3="B";
                }
                else if(grd3>70){
                    g3="C";
                }
                else if(grd3>60){
                    g3="D";
                }
                else if(grd3>50){
                    g3="E";
                }
                else {
                    g3="F";

                }
                Toast.makeText(getApplicationContext(),g1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),g2,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),g3,Toast.LENGTH_SHORT).show();


                if((g1.equals("F"))||(g2.equals("F"))||(g3.equals("F"))) {
                Toast.makeText(getApplicationContext(), "Sorry you are Failed", Toast.LENGTH_SHORT).show();

            }
            else {
                Toast.makeText(getApplicationContext(),"Congrats you are Passed",Toast.LENGTH_LONG).show();
            }

            }
        });
    }
}
