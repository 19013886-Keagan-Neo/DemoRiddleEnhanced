package sg.edu.rp.c346.id19013886.demoriddleenhanced;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Event Handling Step 1
    TextView tvAnswer;
    Button btnReveal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Event Handling Step 2
        tvAnswer = findViewById(R.id.textViewQ1);
        tvAnswer = findViewById(R.id.textViewQ2);
        btnReveal = findViewById(R.id.buttonRevealQ1);
        btnReveal = findViewById(R.id.buttonRevealQ2);

        // Event Handling Step 3
        btnReveal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity.class);
                intent.putExtra("Question", "Q1");
                intent.putExtra("Question", "Q2");
                startActivity(intent);
            }
        });

    }
}