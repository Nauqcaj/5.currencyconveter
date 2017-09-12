package com.jacquan.a5currencyconveter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void showCurrency (View view) {

        EditText myCurrency = (EditText) findViewById(R.id.currency);
        String stringAmount = myCurrency.getText().toString();

        Integer amount = Integer.parseInt(stringAmount);
        Toast.makeText(getApplicationContext(), "$" + (109.75 * amount) + " Yen.", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
