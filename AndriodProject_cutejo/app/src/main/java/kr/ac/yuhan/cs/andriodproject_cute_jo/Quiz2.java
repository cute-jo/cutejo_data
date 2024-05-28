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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Quiz2 extends AppCompatActivity {

    private TextView question;
    private Button answer1Button, answer2Button, answer3Button, answer4Button;
    private String[] questions;
    private String[] answers;
    private Random random;

    private int currentQuestionIndex = 0;
    private int correctAnswerIndex = 0;
    private int correctCount = 0; // 맞힌 문제 수
    private int currentQuizCount = 0; // 현재 진행 중인 퀴즈 횟수
    private static final int TOTAL_QUIZZES = 10; // 퀴즈 횟수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1);
// 돌아가기 버튼 클릭 시
        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        question = findViewById(R.id.question);
        answer1Button = findViewById(R.id.answer1);
        answer2Button = findViewById(R.id.answer2);
        answer3Button = findViewById(R.id.answer3);
        answer4Button = findViewById(R.id.answer4);

        random = new Random();
        questions = new String[]{"ア", "イ", "ウ", "エ", "オ",
                "カ", "キ", "ク", "ケ", "コ", "サ", "シ", "ス", "セ", "ソ",
                "タ", "チ", "ツ", "テ", "ト", "ナ", "ニ", "ヌ", "ネ", "ノ",
                "ハ", "ヒ", "フ", "ヘ", "ホ", "マ", "ミ", "ム", "メ", "モ",
                "ヤ", "ユ", "ヨ", "ラ", "リ", "ル", "レ", "ロ", "ワ", "ヲ", "ン"};

        answers = new String[]{"a", "i", "u", "e", "o",
                "ka", "ki", "ku", "ke", "ko", "sa", "shi", "su", "se", "so",
                "ta", "chi", "tsu", "te", "to", "na", "ni", "nu", "ne", "no",
                "ha", "hi", "fu", "he", "ho", "ma", "mi", "mu", "me", "mo",
                "ya", "yu", "yo", "ra", "ri", "ru", "re", "ro", "wa", "wo", "n"};
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
        currentQuizCount++;
        if (currentQuizCount > TOTAL_QUIZZES) {
            endQuiz();
            return;
        }

        currentQuestionIndex = random.nextInt(questions.length);
        question.setText(questions[currentQuestionIndex]);

        List<String> options = new ArrayList<>();
        options.add(answers[currentQuestionIndex]);
        while (options.size() < 4) {
            int wrongAnswerIndex = random.nextInt(answers.length);
            if (wrongAnswerIndex != currentQuestionIndex && !options.contains(answers[wrongAnswerIndex])) {
                options.add(answers[wrongAnswerIndex]);
            }
        }
        Collections.shuffle(options);

        answer1Button.setText(options.get(0));
        answer2Button.setText(options.get(1));
        answer3Button.setText(options.get(2));
        answer4Button.setText(options.get(3));

        correctAnswerIndex = options.indexOf(answers[currentQuestionIndex]);

        resetButtonColors();
    }

    private void resetButtonColors() {
        answer1Button.setBackgroundColor(Color.WHITE);
        answer2Button.setBackgroundColor(Color.WHITE);
        answer3Button.setBackgroundColor(Color.WHITE);
        answer4Button.setBackgroundColor(Color.WHITE);
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

        if (selectedAnswerIndex == correctAnswerIndex) {
            v.setBackgroundColor(Color.GREEN);
            correctCount++;
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        } else {
            v.setBackgroundColor(Color.RED);
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
            if (correctAnswerIndex == 0) answer1Button.setBackgroundColor(Color.GREEN);
            else if (correctAnswerIndex == 1) answer2Button.setBackgroundColor(Color.GREEN);
            else if (correctAnswerIndex == 2) answer3Button.setBackgroundColor(Color.GREEN);
            else if (correctAnswerIndex == 3) answer4Button.setBackgroundColor(Color.GREEN);
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                loadQuestion();
            }
        }, 1000);
    }

    private void endQuiz() {
        Toast.makeText(this, "Quiz Finished! You got " + correctCount + " out of " + TOTAL_QUIZZES + " correct.", Toast.LENGTH_LONG).show();
        disableButtons();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Quiz2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000); // 3초 후 메인 화면으로 이동
    }

    private void disableButtons() {
        answer1Button.setEnabled(false);
        answer2Button.setEnabled(false);
        answer3Button.setEnabled(false);
        answer4Button.setEnabled(false);
    }
}