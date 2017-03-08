package com.example.android.inclassassignment06;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private EditText name;
    private EditText calories;
    private CheckBox tasty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name = (EditText) findViewById(R.id.name_of_meal);
        calories = (EditText) findViewById(R.id.calories);
        tasty = (CheckBox) findViewById(R.id.tasty);
    }

    public void submitMeal(View view) {

        String submitName = name.getText().toString();
        int submitCal = Integer.parseInt(calories.getText().toString());
        boolean submitTaste = tasty.isChecked();

        Meal meal = new Meal(submitName, submitCal, submitTaste);

        Intent data = new Intent();
        data.putExtra(Keys.MEAL, meal);
        setResult(RESULT_OK, data);
        finish();
    }

}

