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
    public void add_to_list(View view) {
        if(view ==findViewById(R.id.pizzaButton) ){
            choices= choices+"pizza"+"\n";
            price = price+18000;
        }
        else if(view ==findViewById(R.id.burgerButton) ){
            choices= choices+"burger"+"\n";
            price = price+15000;
        }
        else if(view ==findViewById(R.id.burgerButton) ){
            choices= choices+"burger"+"\n";
            price = price+12000;
        }
    }

    public void placeorder(View view) {
     Intent i = new Intent( MainActivity.this,OrderDetails.class);
     Bundle bundle = new Bundle();
     bundle.putString("choices",choices);
     bundle.putDouble("prices",price);
     i.putExtras(bundle);
     startActivity(i);



    }
}