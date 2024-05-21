package kr.ac.yuhan.cs.andriodproject_cute_jo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 히라가나 버튼 클릭 시
        Button hiragana = (Button) findViewById(R.id.hiragana);
        hiragana.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), hiragana.class);
                startActivity(intent);
            }
        });


        // 가타카나 버튼 클릭 시
        Button gatakana = (Button) findViewById(R.id.gatakana);
        gatakana.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), gatakana.class);
                startActivity(intent);
            }
        });




    }
}