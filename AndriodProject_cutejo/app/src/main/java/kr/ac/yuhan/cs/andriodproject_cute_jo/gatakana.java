package kr.ac.yuhan.cs.andriodproject_cute_jo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class gatakana extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gatakana);

        // 퀴즈 버튼 클릭시
        Button quiz2 = (Button) findViewById(R.id.quiz2);
        quiz2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Quiz2.class);
                startActivity(intent);
            }
        });

        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        Button katakana_a = findViewById(R.id.katakana_a);
        Button katakana_i = findViewById(R.id.katakana_i);
        Button katakana_u = findViewById(R.id.katakana_u);
        Button katakana_e = findViewById(R.id.katakana_e);
        Button katakana_o = findViewById(R.id.katakana_o);
        Button katakana_ka = findViewById(R.id.katakana_ka);
        Button katakana_ki = findViewById(R.id.katakana_ki);
        Button katakana_ku = findViewById(R.id.katakana_ku);
        Button katakana_ke = findViewById(R.id.katakana_ke);
        Button katakana_ko = findViewById(R.id.katakana_ko);
        Button katakana_sa = findViewById(R.id.katakana_sa);
        Button katakana_shi = findViewById(R.id.katakana_shi);
        Button katakana_su = findViewById(R.id.katakana_su);
        Button katakana_se = findViewById(R.id.katakana_se);
        Button katakana_so = findViewById(R.id.katakana_so);
        Button katakana_ta = findViewById(R.id.katakana_ta);
        Button katakana_chi = findViewById(R.id.katakana_chi);
        Button katakana_tsu = findViewById(R.id.katakana_tsu);
        Button katakana_te = findViewById(R.id.katakana_te);
        Button katakana_to = findViewById(R.id.katakana_to);
        Button katakana_na = findViewById(R.id.katakana_na);
        Button katakana_ni = findViewById(R.id.katakana_ni);
        Button katakana_nu = findViewById(R.id.katakana_nu);
        Button katakana_ne = findViewById(R.id.katakana_ne);
        Button katakana_no = findViewById(R.id.katakana_no);
        Button katakana_ha = findViewById(R.id.katakana_ha);
        Button katakana_hi = findViewById(R.id.katakana_hi);
        Button katakana_fu = findViewById(R.id.katakana_fu);
        Button katakana_he = findViewById(R.id.katakana_he);
        Button katakana_ho = findViewById(R.id.katakana_ho);
        Button katakana_ma = findViewById(R.id.katakana_ma);
        Button katakana_mi = findViewById(R.id.katakana_mi);
        Button katakana_mu = findViewById(R.id.katakana_mu);
        Button katakana_me = findViewById(R.id.katakana_me);
        Button katakana_mo = findViewById(R.id.katakana_mo);
        Button katakana_ya = findViewById(R.id.katakana_ya);
        Button katakana_yu = findViewById(R.id.katakana_yu);
        Button katakana_yo = findViewById(R.id.katakana_yo);
        Button katakana_ra = findViewById(R.id.katakana_ra);
        Button katakana_ri = findViewById(R.id.katakana_ri);
        Button katakana_ru = findViewById(R.id.katakana_ru);
        Button katakana_re = findViewById(R.id.katakana_re);
        Button katakana_ro = findViewById(R.id.katakana_ro);
        Button katakana_wa = findViewById(R.id.katakana_wa);
        Button katakana_wo = findViewById(R.id.katakana_wo);
        Button katakana_n = findViewById(R.id.katakana_n);

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        katakana_a.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("アメ [ame] 비");
                textView2.setText("アセ [ase] 땀");
            }
        });
        katakana_i.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("イイ [ii] 좋은");
                textView2.setText("アイ [ai] 사랑");
            }
        });
        katakana_u.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ウマ [uma] 말");
                textView2.setText("ウチ [uchi] 집");
            }
        });
        katakana_e.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ナマエ [namae] 이름");
                textView2.setText("コエ [koe] 목소리");
            }
        });
        katakana_o.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("シオ [shio] 소금");
                textView2.setText("カオ [kao] 얼굴");
            }
        });
        katakana_ka.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("カク [kaku] 쓰다");
                textView2.setText("アカ [aka] 빨간");
            }
        });
        katakana_ki.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("セキ [seki] 자리");
                textView2.setText("ユキ [yuki] 눈");
            }
        });
        katakana_ku.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("クチ [kuchi] 입");
                textView2.setText("クロ [kuro] 검은색");
            }
        });
        katakana_ke.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("サケ [sake] 주류");
                textView2.setText("イケ [ike] 연못");
            }
        });
        katakana_ko.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ネコ [neko] 고양이");
                textView2.setText("タコ [tako] 문어");
            }
        });
        katakana_sa.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("アサ [asa] 아침");
                textView2.setText("サカナ [sakana] 물고기");
            }
        });
        katakana_shi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ホシ [hoshi] 별");
                textView2.setText("スシ [sushi] 스시");
            }
        });
        katakana_su.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("スシ [sushi] 스시");
                textView2.setText("ヤスミ [yasumi] 휴일");
            }
        });
        katakana_se.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("セキ [seki] 자리");
                textView2.setText("アセ [ase] 땀");
            }
        });
        katakana_so.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ミソ [miso] 미소");
                textView2.setText("ソラ [sora] 하늘");
            }
        });
        katakana_ta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("アナタ [anata] 당신");
                textView2.setText("シタ [shita] 밑");
            }
        });
        katakana_chi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("イチ [ichi] 일");
                textView2.setText("ウチ [uchi] 집");
            }
        });
        katakana_tsu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("イツ [natsu] 언제");
                textView2.setText("クツ[kutsu] 신발");
            }
        });
        katakana_te.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("チカテツ [chikatetsu] 지하철");
                textView2.setText("");
            }
        });
        katakana_to.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ヒト [hito] 사람들");
                textView2.setText("トケイ [tokei] 시계");
            }
        });
        katakana_na.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ナナ [nana] 칠");
                textView2.setText("ハナ [hana] 꽃");
            }
        });
        katakana_ni.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ニク [niku] 고기");
                textView2.setText("ナニ [nani] 무엇");
            }
        });
        katakana_nu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("イヌ [inu] 개");
                textView2.setText("");
            }
        });
        katakana_ne.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("フネ [fune] 선박");
                textView2.setText("オカネ [okane] 돈");
            }
        });
        katakana_no.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("キノウ [kinou] 어제");
                textView2.setText("ココノツ [kokonotsu] 아홉");
            }
        });
        katakana_ha.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ハコ [hako] 상자");
                textView2.setText("ハル [haru] 봄");
            }
        });
        katakana_hi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ヒト [hito] 사람들");
                textView2.setText("ヒトツ [hitotsu] 하나");
            }
        });
        katakana_fu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("フク [fuku] 옷");
                textView2.setText("フユ [fuyu] 겨울");
            }
        });
        katakana_he.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ヘタ [heta] 잘 못하는");
                textView2.setText("");
            }
        });
        katakana_ho.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ホシ [hoshi] 별");
                textView2.setText("");
            }
        });
        katakana_ma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("クマ [kuma] 곰");
                textView2.setText("ウマ [uma] 말");
            }
        });
        katakana_mi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ミミ [mimi] 귀");
                textView2.setText("ミソ [miso] 미소");
            }
        });
        katakana_mu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ムシ [mushi] 곤충");
                textView2.setText("");
            }
        });
        katakana_me.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ユメ [yume] 꿈");
                textView2.setText("アメ [ame] 비");
            }
        });
        katakana_mo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("モモ [momo] 허벅지");
                textView2.setText("");
            }
        });
        katakana_ya.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ヤスミ [yasumi] 휴일");
                textView2.setText("");
            }
        });
        katakana_yu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ユメ [yume] 꿈");
                textView2.setText("ユキ [yuki] 눈");
            }
        });
        katakana_yo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("オハヨウ [ohayou] 좋은아침");
                textView2.setText("");
            }
        });
        katakana_ra.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("アラウ [arau] 씻다");
                textView2.setText("ソラ [sora] 하늘");
            }
        });
        katakana_ri.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ヤキトリ [yakitori] 야키토리");
                textView2.setText("");
            }
        });
        katakana_ru.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ワルイ [warui] 나쁜");
                textView2.setText("サル [saru] 원숭이");
            }
        });
        katakana_re.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("コレ [kore] 이");
                textView2.setText("ソレ [sore] 저");
            }
        });
        katakana_ro.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ロク [roku] 육");
                textView2.setText("キイロ [kiiro] 노란색");
            }
        });
        katakana_wa.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ワタシ [watashi] 나");
                textView2.setText("");
            }
        });
        katakana_wo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ヲタク [otaku] 서브 컬처 마니아");
                textView2.setText("");
            }
        });
        katakana_n.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ソウジキ [soujiki] 청소기");
                textView2.setText("");
            }
        });
    }
}