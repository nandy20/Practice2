package com.example.nandhini.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button;
    static int c=0;
    int finalvalue=0;

    public void tic(View view){
        int s=Integer.parseInt(view.getTag().toString());
        if(c%2==0) {
            if(s==1) {
                Button b = (Button) findViewById(R.id.button1);
                b.setText("X");
            }
            else if(s==2){
                Button b = (Button) findViewById(R.id.button2);
                b.setText("X");
            }
            else if(s==3){
                Button b = (Button) findViewById(R.id.button3);
                b.setText("X");
            }
            else if(s==4){
                Button b = (Button) findViewById(R.id.button4);
                b.setText("X");
            }
            else if(s==5){
                Button b = (Button) findViewById(R.id.button5);
                b.setText("X");
            }
            else if(s==6){
                Button b = (Button) findViewById(R.id.button6);
                b.setText("X");
            }
            else if(s==7){
                Button b = (Button) findViewById(R.id.button7);
                b.setText("X");
            }
            else if(s==8){
                Button b = (Button) findViewById(R.id.button8);
                b.setText("X");
            }
            else if(s==9){
                Button b = (Button) findViewById(R.id.button9);
                b.setText("X");
            }
        }
        else{
            if(s==1) {
                Button b = (Button) findViewById(R.id.button1);
                b.setText("O");
            }
            else if(s==2){
                Button b = (Button) findViewById(R.id.button2);
                b.setText("O");
            }
            else if(s==3){
                Button b = (Button) findViewById(R.id.button3);
                b.setText("O");
            }
            else if(s==4){
                Button b = (Button) findViewById(R.id.button4);
                b.setText("O");
            }
            else if(s==5){
                Button b = (Button) findViewById(R.id.button5);
                b.setText("O");
            }
            else if(s==6){
                Button b = (Button) findViewById(R.id.button6);
                b.setText("O");
            }
            else if(s==7){
                Button b = (Button) findViewById(R.id.button7);
                b.setText("O");
            }
            else if(s==8){
                Button b = (Button) findViewById(R.id.button8);
                b.setText("O");
            }
            else if(s==9){
                Button b = (Button) findViewById(R.id.button9);
                b.setText("O");
            }

        }
            String b1=button1.getText().toString();
            String b2=button2.getText().toString();
            String b3=button3.getText().toString();
            String b4=button4.getText().toString();
            String b5=button5.getText().toString();
            String b6=button6.getText().toString();
            String b7=button7.getText().toString();
            String b8=button8.getText().toString();
            String b9=button9.getText().toString();
            if (b1.equals("X")&& b2.equals("X")&& b3.equals("X")) {
                TextView e=(TextView)findViewById(R.id.textView2);
                e.setText("X won");
                finalvalue=1;
            }
            else if (b1.equals("X")&& b4.equals("X")&& b7.equals("X")) {
                TextView e=(TextView)findViewById(R.id.textView2);
                e.setText("X won");
                finalvalue=1;
            }
            else if (b1.equals("X")&& b5.equals("X")&& b9.equals("X")) {
                TextView e=(TextView)findViewById(R.id.textView2);
                e.setText("X won");
                finalvalue=1;
            }
            else if (b7.equals("X")&& b8.equals("X")&& b9.equals("X")) {
                TextView e=(TextView)findViewById(R.id.textView2);
                e.setText("X won");
                finalvalue=1;
            }
            else if (b3.equals("X")&& b5.equals("X")&& b7.equals("X")) {
                TextView e=(TextView)findViewById(R.id.textView2);
                e.setText("X won");
                finalvalue=1;
            }
            else if (b1.equals("O")&& b2.equals("O")&& b3.equals("O")) {
                TextView e=(TextView)findViewById(R.id.textView2);
                e.setText("O won");
                finalvalue=1;
            }
            else if (b1.equals("O")&& b4.equals("O")&& b7.equals("O")) {
                TextView e=(TextView)findViewById(R.id.textView2);
                e.setText("O won");
                finalvalue=1;
            }
            else if (b3.equals("O")&& b6.equals("O")&& b9.equals("O")) {
                TextView e=(TextView)findViewById(R.id.textView2);
                e.setText("O won");
                finalvalue=1;
            }
            else if (b7.equals("O")&& b8.equals("O")&& b9.equals("O")) {
                TextView e=(TextView)findViewById(R.id.textView2);
                e.setText("O won");
                finalvalue=1;
            }
            else if (b1.equals("O")&& b5.equals("O")&& b9.equals("O")) {
                TextView e=(TextView)findViewById(R.id.textView2);
                e.setText("O won");
                finalvalue=1;
            }
            else if (b3.equals("O")&& b5.equals("O")&& b7.equals("O")) {
                TextView e=(TextView)findViewById(R.id.textView2);
                e.setText("O won");
                finalvalue=1;
            }
            else if (b2.equals("X")&& b5.equals("X")&& b8.equals("X")) {
                TextView e=(TextView)findViewById(R.id.textView2);
                e.setText("X won");
                finalvalue=1;
            }
            else if (b2.equals("O")&& b5.equals("O")&& b8.equals("O")) {
                TextView e=(TextView)findViewById(R.id.textView2);
                e.setText("O won");
                finalvalue=1;
            }
            else  if (b4.equals("X")&& b5.equals("X")&& b6.equals("X")) {
                TextView e=(TextView)findViewById(R.id.textView2);
                e.setText("X won");
                finalvalue=1;
            }
            else  if (b4.equals("O")&& b5.equals("O")&& b6.equals("O")) {
                TextView e=(TextView)findViewById(R.id.textView2);
                e.setText("O won");
                finalvalue=1;
            }
            if(finalvalue==1){
                button1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                button4.setVisibility(View.INVISIBLE);
                button5.setVisibility(View.INVISIBLE);
                button6.setVisibility(View.INVISIBLE);
                button7.setVisibility(View.INVISIBLE);
                button8.setVisibility(View.INVISIBLE);
                button9.setVisibility(View.INVISIBLE);
            }
        c++;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);

    }
}
