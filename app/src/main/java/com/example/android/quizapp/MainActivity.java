package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String weLiveOnEarth;
    public String usaIsACountry;
    String isTheNameRight;
    String checkboxMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void yesRadioButtonCLicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        if (checked) {
            usaIsACountry = null;
            usaIsACountry = "Yes, you are right, USA is a country";
        } else {
            usaIsACountry = null;
            usaIsACountry = "You didn't choose the answer";
        }

    }

    public void noRadioButtonCLicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        if (checked) {
            usaIsACountry = null;
            usaIsACountry = "No, you are wrong, USA is actually a country";
        } else {
            usaIsACountry = null;
            usaIsACountry = "You didn't choose the answer";
        }
    }


    public void submitTheAnswerButton (View view) {
        EditText writeYourNameEditText = (EditText) findViewById(R.id.write_your_name_edit_text_view);
        String usersName = writeYourNameEditText.getText().toString();

        CheckBox weLiveonEarth = findViewById(R.id.do_we_live_on_the_earth_checkbox);
        CheckBox catsAndMice = findViewById(R.id.cats_eat_mice_checkbox);
        CheckBox cowsEatMeat = findViewById(R.id.cows_eat_meat);

        if (weLiveonEarth.isChecked() & catsAndMice.isChecked() & !cowsEatMeat.isChecked()) {
            checkboxMessage = "All your answers for Question 4 were right";
        } else {
            checkboxMessage = "One or more answers are incorrect";
        }

        isTheNameRight = null;
        EditText einsteinsName1 = (EditText) findViewById(R.id.einsteins_name_edit_text_view);
        if (einsteinsName1.getText().toString().equals("Albert")) {
            isTheNameRight = "Yes, his name was Albert";
        } else {
            isTheNameRight = "No, actually his name was Albert";
        }


        String finalMessage = "Dear " +usersName + ", "+ usaIsACountry + ". "+ isTheNameRight +  ". "  + checkboxMessage + ".";
        Toast toast = Toast.makeText(getApplicationContext(),
                finalMessage,
                Toast.LENGTH_LONG);

        toast.show();
    }
}
