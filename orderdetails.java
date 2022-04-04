package com.example.tofi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class OrderDetails extends AppCompatActivity {
TextView listView,priceView;
String list_choices;
Double price_bd,price_usd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        listView = (TextView)findViewById(R.id.listview);
        priceView = (TextView)findViewById(R.id.priceview);
        // Getting the passed value from MainActivity
        Bundle bundle = getIntent().getExtras();
        list_choices = bundle.getString("choices");
        price_bd = bundle.getDouble("price");
        listView.setText("list_choices");
        priceView.setText(price_bd.toString());
    }
}