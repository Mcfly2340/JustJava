package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int numberOfCoffees = 2;
    int costOfCoffee = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incriment(View view) {
        numberOfCoffees += 1;
        display(numberOfCoffees);
    }

    public void decriment(View view) {
        numberOfCoffees -= 1;
        display(numberOfCoffees);
    }

    public void submitOrder(View view) {
        display(numberOfCoffees);
        displayPrice(numberOfCoffees * costOfCoffee);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}