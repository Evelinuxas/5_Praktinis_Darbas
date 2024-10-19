package com.example.a2_praktinis_darbas;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edUserInput;
    private TextView tvResult;
    private Spinner spCountOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edUserInput = findViewById(R.id.edUserInput);
        this.tvResult = findViewById(R.id.tvResult);

        this.spCountOptions = findViewById(R.id.spCountOptions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.counting_options,  // Naudojame string-array išteklių
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spCountOptions.setAdapter(adapter);
    }

    public void onBtnCountClick(View view) {
        String userInputPhrase = this.edUserInput.getText().toString().trim();

        // Tikriname, ar įvesties laukas tuščias
        if (userInputPhrase.isEmpty()) {
            Toast.makeText(this, getString(R.string.empty_input_message), Toast.LENGTH_SHORT).show(); // Naudojame pranešimą iš strings.xml
            return; // Išeiname iš funkcijos, jei laukas tuščias
        }

        // Tikriname pasirinkimą iš Spinner
        String selectedOption = this.spCountOptions.getSelectedItem().toString();
        if (selectedOption.equals(getString(R.string.chars_options))) {
            // Skaičiuojame simbolius
            int result = TextCounter.getCharsCount(userInputPhrase);
            this.tvResult.setText(String.valueOf(result)); // Rodo simbolių skaičių
        } else if (selectedOption.equals(getString(R.string.words_options))) {
            // Skaičiuojame žodžius
            int result = TextCounter.getWordsCount(userInputPhrase);
            this.tvResult.setText(String.valueOf(result)); // Rodo žodžių skaičių
        } else {
            // Atsarginis pranešimas
            this.tvResult.setText(R.string.message_not_implemented);
        }
    }
}

