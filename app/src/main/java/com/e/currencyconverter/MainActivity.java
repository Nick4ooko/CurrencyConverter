package com.e.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView screen;
    private EditText enteramount;
    private Button convertshillingtodollar;
    private Button convertdollartoshilling;
    private Button converteurotoshilling;
    private Button convertshillingtoeuro;
    private Button convertdollartoeuro;
    private Button converteurotodollar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void dollarsMethod(View view) {

        TextView screen = (TextView) findViewById(R.id.tv_screen_id);
        EditText entermount = (EditText) findViewById(R.id.et_enter_amount);

        Double shillingsamount = Double.parseDouble(entermount.getText().toString());

        Double dollarsamount = shillingsamount / 112;

        screen.setText(dollarsamount  + "");

    }


    public void shillingsMethod(View view) {

        TextView screen = (TextView) findViewById(R.id.tv_screen_id);
        EditText enteramount = (EditText) findViewById(R.id.et_enter_amount);

        Double dollar = Double.parseDouble(enteramount.getText().toString());

        Double shilling = dollar * 112;

        screen.setText(shilling  +"");


    }


    public void euroMethod(View view) {

        TextView screen = (TextView) findViewById(R.id.tv_screen_id);
        EditText enteramount = (EditText) findViewById(R.id.et_enter_amount);

        Double shillingsamount = Double.parseDouble(enteramount.getText().toString());

        Double euroamount = shillingsamount * 115;

        screen.setText(euroamount  + "");


    }


    public void shMethod(View view) {

        TextView screen = (TextView) findViewById(R.id.tv_screen_id);
        EditText enteramount = (EditText) findViewById(R.id.et_enter_amount);

        Double shillingamount = Double.parseDouble(enteramount.getText().toString());

        Double euroamount = shillingamount / 115;

        screen.setText(euroamount  + "");


    }


    public void eurotodollarMethod(View view) {

        TextView screen = (TextView) findViewById(R.id.tv_screen_id);
        EditText enteramount = (EditText) findViewById(R.id.et_enter_amount);
        Double shillingamount = Double.parseDouble(enteramount.getText().toString());

        Double euroamount = shillingamount * 1.1268;

        screen.setText(euroamount  + "");


    }


    public void dollartoeuroMethod(View view) {

        TextView screen = (TextView) findViewById(R.id.tv_screen_id);
        EditText enteramount = (EditText) findViewById(R.id.et_enter_amount);

        Double shillingsamount = Double.parseDouble(enteramount.getText().toString());

        Double euroamount = shillingsamount / 1.1268;

        screen.setText(euroamount  + "");


    }

}


































