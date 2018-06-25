package com.skills.interapt.pokemonretrofitworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.name_edittext)
    protected EditText pokemonName = findViewById(R.id.name_edittext);


    @BindView(R.id.next_button)
    protected Button nextButton= findViewById(R.id.next_button);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.next_button)
    protected void nextClicked() {
        if (pokemonName.getText().toString().isEmpty()) {
            //handle if there is missing input
            Toast.makeText(this, "All fields are required!", Toast.LENGTH_SHORT).show();
            //TODO when button is clicked, pass on info to fragment
        }

    }
}
