package kr.ac.yuhan.cs.andriodproject_cute_jo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Quiz1 extends AppCompatActivity {

    private TextView questionTextView;
    private Button answer1Button, answer2Button, answer3Button, answer4Button;

    private String[] questions = {
            "Question 1?",
            "Question 2?",
            "Question 3?",
            "Question 4?",
            "Question 5?",
            "Question 6?",
            "Question 7?",
            "Question 8?",
            "Question 9?",
            "Question 10?"
    };

    private String[][] answers = {
            {"Answer 1", "Answer 2", "Answer 3", "Answer 4"},
            {"Answer 1", "Answer 2", "Answer 3", "Answer 4"},
            {"Answer 1", "Answer 2", "Answer 3", "Answer 4"},
            {"Answer 1", "Answer 2", "Answer 3", "Answer 4"},
            {"Answer 1", "Answer 2", "Answer 3", "Answer 4"},
            {"Answer 1", "Answer 2", "Answer 3", "Answer 4"},
            {"Answer 1", "Answer 2", "Answer 3", "Answer 4"},
            {"Answer 1", "Answer 2", "Answer 3", "Answer 4"},
            {"Answer 1", "Answer 2", "Answer 3", "Answer 4"},
            {"Answer 1", "Answer 2", "Answer 3", "Answer 4"}
    };

    // 모든 정답을 1번(첫 번째 선택지)으로 설정
    private int[] correctAnswers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    private int currentQuestionIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1);

        questionTextView = findViewById(R.id.question);
        answer1Button = findViewById(R.id.answer1);
        answer2Button = findViewById(R.id.answer2);
        answer3Button = findViewById(R.id.answer3);
        answer4Button = findViewById(R.id.answer4);

        loadQuestion();

        View.OnClickListener answerButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(v);
            }
        };

        answer1Button.setOnClickListener(answerButtonClickListener);
        answer2Button.setOnClickListener(answerButtonClickListener);
        answer3Button.setOnClickListener(answerButtonClickListener);
        answer4Button.setOnClickListener(answerButtonClickListener);
    }

    private void loadQuestion() {
        questionTextView.setText(questions[currentQuestionIndex]);
        answer1Button.setText(answers[currentQuestionIndex][0]);
        answer2Button.setText(answers[currentQuestionIndex][1]);
        answer3Button.setText(answers[currentQuestionIndex][2]);
        answer4Button.setText(answers[currentQuestionIndex][3]);

        resetButtonColors();
    }

    private void resetButtonColors() {
        answer1Button.setBackgroundColor(Color.parseColor("#00ffffff"));
        answer2Button.setBackgroundColor(Color.parseColor("#00ffffff"));
        answer3Button.setBackgroundColor(Color.parseColor("#00ffffff"));
        answer4Button.setBackgroundColor(Color.parseColor("#00ffffff"));
    }

    private void checkAnswer(View v) {
        int selectedAnswerIndex = -1;
        if (v.getId() == R.id.answer1) {
            selectedAnswerIndex = 0;
        } else if (v.getId() == R.id.answer2) {
            selectedAnswerIndex = 1;
        } else if (v.getId() == R.id.answer3) {
            selectedAnswerIndex = 2;
        } else if (v.getId() == R.id.answer4) {
            selectedAnswerIndex = 3;
        }

        if (selectedAnswerIndex == correctAnswers[currentQuestionIndex]) {
            v.setBackgroundColor(Color.GREEN);
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        } else {
            v.setBackgroundColor(Color.RED);
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
            // Highlight the correct answer
            answer1Button.setBackgroundColor(Color.GREEN);
        }

        currentQuestionIndex++;
        if (currentQuestionIndex < questions.length) {
            // Delay before loading the next question
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    loadQuestion();
                }
            }, 1000);  // 1 second delay
        } else {
            Toast.makeText(this, "Quiz Finished!", Toast.LENGTH_LONG).show();
            disableButtons();
        }
    }

    private void disableButtons() {
        answer1Button.setEnabled(false);
        answer2Button.setEnabled(false);
        answer3Button.setEnabled(false);
        answer4Button.setEnabled(false);
    }
}