package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText taille =null;
    private EditText poids =null;
    private Button btn =null;
    private TextView result =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taille=(EditText) findViewById(R.id.taille);
        poids=(EditText) findViewById(R.id.poids);
        result=(TextView) findViewById(R.id.result);
        btn=(Button) findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                double t=Integer.parseInt(taille.getText().toString());
                double p=Integer.parseInt(poids.getText().toString());

                double r=t/(p*p);
                String rest="";
                if (r>40){
                    rest="obesite morbide ou massive";
                    
                } else if (r<=40 && r>=35)  {
                    rest="obesite severe";

                } else if(r<35 && r>=30){
                    rest="obesite modere";
                }
                else if (r<30 && r>=25){
                    rest="surpoids";
                } else if (r<25 && r>=18.5) {
                    rest="corpulence normale";
                    
                } else if (r<18.5 && r>=16.5) {
                    rest="maigreur";
                }
                else {
                    rest="famine";
                }



                result.setText(rest);

            }
                               }


        );











    }
}