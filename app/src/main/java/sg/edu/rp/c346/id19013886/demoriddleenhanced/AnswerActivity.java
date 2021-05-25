package sg.edu.rp.c346.id19013886.demoriddleenhanced;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    // Event Handling Step 1
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        // Event Handling Step 2
        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");

        if (questionsSelected.contentEquals("Q1")) {
            tvAnswer.setText(questionsSelected + " answer is: Queue");
        } else {
            tvAnswer.setText(questionsSelected + " answer is: Gone");
        }

    }
}