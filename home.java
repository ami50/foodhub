package com.example.tofi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button pizzaButton,burgerButton,pastryButton;
    //Declaring a String to take choices in it;
    String choices = "";
    Double price = 0.00;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pizzaButton = (Button) findViewById(R.id.pizzaButton);
        burgerButton = (Button) findViewById(R.id.burgerButton);
        pastryButton = (Button) findViewById(R.id.pastryButton);
    }
// we made the string for list  of cart with price
    

    public void placeorder(View view) {
     Intent i = new Intent(c1.this,package com.example.tofi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                                                   
// This code for intent used to move from MainActivity1 to the MainActivity
  

    public void get_started(View view) {
     Intent i = new Intent( MainActivity1.this, MainActivity.class);
     startActivity(i);



    }
}