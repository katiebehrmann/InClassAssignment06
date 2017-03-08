package com.example.android.inclassassignment06;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MealPlanner extends AppCompatActivity {

    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_planner);

        displayText = (TextView) findViewById(R.id.display_text);
    }

    public void addMeal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, RequestCodes.ADD_MEAL);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RequestCodes.ADD_MEAL && resultCode == RESULT_OK) {
            Meal meal = (Meal) data.getSerializableExtra(Keys.MEAL);
            displayText.setText(meal.toString() + displayText.getText().toString());
        }

    }
}
