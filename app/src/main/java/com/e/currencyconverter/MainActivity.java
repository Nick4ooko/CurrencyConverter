package com.e.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView amountdollars;
    private EditText enteramountshillings;
    private Button converttodollars;
    private Button converttoshillings;
    private Button convert_e_shillings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void dollarsMethod(View view) {

        TextView amountdollars = (TextView) findViewById(R.id.tv_screen_id);
        EditText entermountshillings = (EditText) findViewById(R.id.et_enter_amount);

        Double shillingsamount = Double.parseDouble(entermountshillings.getText().toString());

        Double dollarsamount = shillingsamount / 112;

        amountdollars.setText(shillingsamount / 112 + "");

    }


    public void shillingsMethod(View view) {

        TextView amountdollars = (TextView) findViewById(R.id.tv_screen_id);
        EditText entermountshillings = (EditText) findViewById(R.id.et_enter_amount);

        Double shillingsamount = Double.parseDouble(entermountshillings.getText().toString());

        Double dollarsamount = shillingsamount * 112;

        amountdollars.setText(shillingsamount * 112 + "");


    }


    public void euroMethod(View view) {

        TextView amountdollars = (TextView) findViewById(R.id.tv_screen_id);
        EditText entermountshillings = (EditText) findViewById(R.id.et_enter_amount);

        Double shillingsamount = Double.parseDouble(entermountshillings.getText().toString());

        Double euroamount = shillingsamount * 115;

        amountdollars.setText(shillingsamount * 115 + "");


    }


    public void shMethod(View view) {

        TextView amountdollars = (TextView) findViewById(R.id.tv_screen_id);
        EditText entermountshillings = (EditText) findViewById(R.id.et_enter_amount);

        Double shillingsamount = Double.parseDouble(entermountshillings.getText().toString());

        Double euroamount = shillingsamount / 115;

        amountdollars.setText(shillingsamount / 115 + "");


    }


    public void eurotodollarMethod(View view) {

        TextView amountdollars = (TextView) findViewById(R.id.tv_screen_id);
        EditText entermountshillings = (EditText) findViewById(R.id.et_enter_amount);

        Double shillingsamount = Double.parseDouble(entermountshillings.getText().toString());

        Double euroamount = shillingsamount / 1.1268;

        amountdollars.setText(shillingsamount / 1.1268 + "");


    }


    public void dollartoeuroMethod(View view) {

        TextView amountdollars = (TextView) findViewById(R.id.tv_screen_id);
        EditText entermountshillings = (EditText) findViewById(R.id.et_enter_amount);

        Double shillingsamount = Double.parseDouble(entermountshillings.getText().toString());

        Double euroamount = shillingsamount * 1.1268;

        amountdollars.setText(shillingsamount * 1.1268 + "");


    }

}


































