package kr.ac.yuhan.cs.andriodproject_cute_jo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class Quiz1Result extends AppCompatActivity {

    private TextView resultTextView;
    private Button mainMenuButton;
    private LinearLayout quizDetailsLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1_result);

        resultTextView = findViewById(R.id.result_text_view);
        mainMenuButton = findViewById(R.id.main_menu_button);
        quizDetailsLayout = findViewById(R.id.quiz_details_layout);

        // 퀴즈 결과 가져오기
        Intent intent = getIntent();
        int correctCount = intent.getIntExtra("correctCount", 0);
        int totalQuizzes = intent.getIntExtra("totalQuizzes", 10);
        List<String> quizQuestions = intent.getStringArrayListExtra("quizQuestions");
        List<String> userAnswers = intent.getStringArrayListExtra("userAnswers");

        // 결과 표시
        resultTextView.setText("You got " + correctCount + " out of " + totalQuizzes + " correct.");

        for (int i = 0; i < quizQuestions.size(); i++) {
            String question = quizQuestions.get(i);
            String userAnswer = userAnswers.get(i);

            TextView questionTextView = new TextView(this);
            questionTextView.setText((i + 1) + ". " + question);
            quizDetailsLayout.addView(questionTextView);

            TextView userAnswerTextView = new TextView(this);
            userAnswerTextView.setText("Your answer: " + userAnswer);
            quizDetailsLayout.addView(userAnswerTextView);
        }
        // 메인 메뉴로 돌아가기 버튼 클릭 시
        mainMenuButton.setOnClickListener(v -> {
            Intent mainMenuIntent = new Intent(Quiz1Result.this, MainActivity.class);
            startActivity(mainMenuIntent);
            finish();
        });
    }
}
