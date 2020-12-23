package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import javax.xml.transform.Result;

import static android.graphics.Color.parseColor;
import static android.widget.Toast.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        final   EditText x = findViewById(R.id.quiz);
        final EditText y = findViewById(R.id.home);
       final EditText z = findViewById(R.id.mid);
       final EditText w = findViewById(R.id.final1);
        TextView result1 = findViewById(R.id.result);
Button button = findViewById(R.id.check);
Button button2 =findViewById(R.id.reset);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {

                                          int x1 = Integer.parseInt(x.getText().toString());
                                          int y1 = Integer.parseInt(y.getText().toString());
                                          int z1 = Integer.parseInt(z.getText().toString());
                                          int w1 = Integer.parseInt(w.getText().toString());
                                          double result = Double.parseDouble(String.valueOf(x1 + y1 + z1 + w1));


                                          result1.setText(result + "");
                                          result1.setTextColor(parseColor("#FF0000"));
                                          char grade;
                                          if(result >=90){
                                              grade = 'A';
                                          }else if(result>=89 && result<80){
                                              grade = 'B';
                                          }
                                          else if(result>=790 && result<70){
                                              grade = 'C';
                                          }
                                          else if(result>=69 && result<60) {
                                              grade = 'D';
                                          }else{
                                              grade = 'F';
                                          }

                                          switch(grade) {
                                              case 'A' :
                                                  Toast.makeText(MainActivity.this, "Your grade is A", LENGTH_LONG).show();
                                                  break;
                                              case 'B' :
                                              case 'C' :
                                                  Toast.makeText(MainActivity.this, "Your grade is B", LENGTH_LONG).show();
                                                  break;
                                              case 'D' :
                                                  Toast.makeText(MainActivity.this, "Your grade is C", LENGTH_LONG).show();
                                              case 'F' :
                                                  Toast.makeText(MainActivity.this, "Your grade is F", LENGTH_LONG).show();
                                                  break;
                                              default :
                                                  Toast.makeText(MainActivity.this, "invalid grade", LENGTH_LONG).show();
                                          }
                                          Toast.makeText(MainActivity.this, "Your grade is F", LENGTH_LONG).show();
                                      }

/*
                                          if ( result >= 90) {
                                              Toast.makeText(MainActivity.this, "Your grade is A", LENGTH_LONG).show();
                                         } else if ((result >= 89)  {
                                              Toast.makeText(MainActivity.this, "Your grade is B", LENGTH_LONG).show();
                                          }
                                          else if ( result >= 70) {
                                              Toast.makeText(MainActivity.this, "Your grade is C", LENGTH_LONG).show();
                                          } else if ( result >= 69) {
                                              Toast.makeText(MainActivity.this, "Your grade is D", LENGTH_LONG).show();
                                          }
                                        else if (result < 60) {
                                              Toast.makeText(MainActivity.this, "Your grade is F", LENGTH_LONG).show();
                                          }
                                      }*/
                                  });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                x.setText("");
                y.setText("");
                z.setText("");
                w.setText("");
                result1.setText("");

            }
        });
        }
    }
