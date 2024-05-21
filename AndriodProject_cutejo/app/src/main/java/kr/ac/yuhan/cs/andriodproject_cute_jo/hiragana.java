package kr.ac.yuhan.cs.andriodproject_cute_jo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class hiragana extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana);
        // 퀴즈 버튼 클릭시
        Button quiz1 = (Button) findViewById(R.id.quiz1);
        quiz1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Quiz1.class);
                startActivity(intent);
            }
        });

        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        Button hiragana_a = findViewById(R.id.hiragana_a);
        Button hiragana_i = findViewById(R.id.hiragana_i);
        Button hiragana_u = findViewById(R.id.hiragana_u);
        Button hiragana_e = findViewById(R.id.hiragana_e);
        Button hiragana_o = findViewById(R.id.hiragana_o);
        Button hiragana_ka = findViewById(R.id.hiragana_ka);
        Button hiragana_ki = findViewById(R.id.hiragana_ki);
        Button hiragana_ku = findViewById(R.id.hiragana_ku);
        Button hiragana_ke = findViewById(R.id.hiragana_ke);
        Button hiragana_ko = findViewById(R.id.hiragana_ko);
        Button hiragana_sa = findViewById(R.id.hiragana_sa);
        Button hiragana_shi = findViewById(R.id.hiragana_shi);
        Button hiragana_su = findViewById(R.id.hiragana_su);
        Button hiragana_se = findViewById(R.id.hiragana_se);
        Button hiragana_so = findViewById(R.id.hiragana_so);
        Button hiragana_ta = findViewById(R.id.hiragana_ta);
        Button hiragana_chi = findViewById(R.id.hiragana_chi);
        Button hiragana_tsu = findViewById(R.id.hiragana_tsu);
        Button hiragana_te = findViewById(R.id.hiragana_te);
        Button hiragana_to = findViewById(R.id.hiragana_to);
        Button hiragana_na = findViewById(R.id.hiragana_na);
        Button hiragana_ni = findViewById(R.id.hiragana_ni);
        Button hiragana_nu = findViewById(R.id.hiragana_nu);
        Button hiragana_ne = findViewById(R.id.hiragana_ne);
        Button hiragana_no = findViewById(R.id.hiragana_no);
        Button hiragana_ha = findViewById(R.id.hiragana_ha);
        Button hiragana_hi = findViewById(R.id.hiragana_hi);
        Button hiragana_fu = findViewById(R.id.hiragana_fu);
        Button hiragana_he = findViewById(R.id.hiragana_he);
        Button hiragana_ho = findViewById(R.id.hiragana_ho);
        Button hiragana_ma = findViewById(R.id.hiragana_ma);
        Button hiragana_mi = findViewById(R.id.hiragana_mi);
        Button hiragana_mu = findViewById(R.id.hiragana_mu);
        Button hiragana_me = findViewById(R.id.hiragana_me);
        Button hiragana_mo = findViewById(R.id.hiragana_mo);
        Button hiragana_ya = findViewById(R.id.hiragana_ya);
        Button hiragana_yu = findViewById(R.id.hiragana_yu);
        Button hiragana_yo = findViewById(R.id.hiragana_yo);
        Button hiragana_ra = findViewById(R.id.hiragana_ra);
        Button hiragana_ri = findViewById(R.id.hiragana_ri);
        Button hiragana_ru = findViewById(R.id.hiragana_ru);
        Button hiragana_re = findViewById(R.id.hiragana_re);
        Button hiragana_ro = findViewById(R.id.hiragana_ro);
        Button hiragana_wa = findViewById(R.id.hiragana_wa);
        Button hiragana_wo = findViewById(R.id.hiragana_wo);
        Button hiragana_n = findViewById(R.id.hiragana_n);

        // 돌아가기 버튼 클릭 시
        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        hiragana_a.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("あき [aki] 가을");
                textView2.setText("あせ [ase] 땀");
            }
        });
        hiragana_i.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("いい [ii] 좋은");
                textView2.setText("いつ [itsu] 언제");
            }
        });
        hiragana_u.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("うま [uma] 말");
                textView2.setText("うち [uchi] 집");
            }
        });
        hiragana_e.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("なまえ [namae] 이름");
                textView2.setText("えき [eki] 역");
            }
        });
        hiragana_o.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("しお [shio] 소금");
                textView2.setText("かお [kao] 얼굴");
            }
        });
        hiragana_ka.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("かく [kaku] 쓰다");
                textView2.setText("あか [aka] 빨간");
            }
        });
        hiragana_ki.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("せき [seki] 자리");
                textView2.setText("ゆき [yuki] 눈");
            }
        });
        hiragana_ku.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("くち [kuchi] 입");
                textView2.setText("くろ [kuro] 검은색");
            }
        });
        hiragana_ke.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("とけい [tokei] 시계");
                textView2.setText("いけ [ike] 연못");
            }
        });
        hiragana_ko.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ねこ [neko] 고양이");
                textView2.setText("たこ [tako] 문어");
            }
        });
        hiragana_sa.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("あさ [asa] 아침");
                textView2.setText("さる [saru] 원숭이");
            }
        });
        hiragana_shi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ほし [hoshi] 별");
                textView2.setText("あし [ashi] 발");
            }
        });
        hiragana_su.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("すし [sushi] 스시");
                textView2.setText("やすみ [yasumi] 휴일");
            }
        });
        hiragana_se.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("せん [sen] 천");
                textView2.setText("あせ [ase] 땀");
            }
        });
        hiragana_so.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("みそ [miso] 미소");
                textView2.setText("そら [sora] 하늘");
            }
        });
        hiragana_ta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("あした [ashita] 내일");
                textView2.setText("した [shita] 밑");
            }
        });
        hiragana_chi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("いち [ichi] 일");
                textView2.setText("はち [hachi] 팔");
            }
        });
        hiragana_tsu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("なつ [natsu] 여름");
                textView2.setText("くつ [kutsu] 신발");
            }
        });
        hiragana_te.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("きって [kitte] 우표");
                textView2.setText("ちかてつ [chikatetsu] 지하철");
            }
        });
        hiragana_to.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ひと [hito] 사람들");
                textView2.setText("もっと [motto] 더");
            }
        });
        hiragana_na.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("なな [nana] 칠");
                textView2.setText("はな [hana] 꽃");
            }
        });
        hiragana_ni.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("にく [niku] 고기");
                textView2.setText("なに [nani] 무엇");
            }
        });
        hiragana_nu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("いぬ [inu] 개");
                textView2.setText("");
            }
        });
        hiragana_ne.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ふね [fune] 선박");
                textView2.setText("おかね [okane] 돈");
            }
        });
        hiragana_no.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("きのう [kinou] 어제");
                textView2.setText("ここのつ [kokonotsu] 아홉");
            }
        });
        hiragana_ha.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("はこ [hako] 상자");
                textView2.setText("はる [haru] 봄");
            }
        });
        hiragana_hi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ひる [hiru] 정오");
                textView2.setText("ひとつ [hitotsu] 하나");
            }
        });
        hiragana_fu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ふく [fuku] 옷");
                textView2.setText("ふゆ [fuyu] 겨울");
            }
        });
        hiragana_he.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("へた [heta] 잘 못하는");
                textView2.setText("");
            }
        });
        hiragana_ho.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ほし [hoshi] 별");
                textView2.setText("ほしい [hoshii] 원하다");
            }
        });
        hiragana_ma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("くま [kuma] 곰");
                textView2.setText("まん [man] 만");
            }
        });
        hiragana_mi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("みみ [mimi] 귀");
                textView2.setText("みそ [miso] 미소");
            }
        });
        hiragana_mu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("むし [mushi] 곤충");
                textView2.setText("");
            }
        });
        hiragana_me.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ゆめ [yume] 꿈");
                textView2.setText("あめ [ame] 비");
            }
        });
        hiragana_mo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("もも [momo] 허벅지");
                textView2.setText("もっと [motto] 더");
            }
        });
        hiragana_ya.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("やすみ [yasumi] 휴일");
                textView2.setText("");
            }
        });
        hiragana_yu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ゆめ [yume] 꿈");
                textView2.setText("ゆき [yuki] 눈");
            }
        });
        hiragana_yo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("よる [yoru] 밤");
                textView2.setText("よん [yon] 사");
            }
        });
        hiragana_ra.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("あらう [arau] 씻다");
                textView2.setText("そら [sora] 하늘");
            }
        });
        hiragana_ri.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("やきとり [yakitori] 야키토리");
                textView2.setText("");
            }
        });
        hiragana_ru.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("わるい [warui] 나쁜");
                textView2.setText("よる [yoru] 밤");
            }
        });
        hiragana_re.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("これ [kore] 이");
                textView2.setText("それ [sore] 저");
            }
        });
        hiragana_ro.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("ろく [roku] 육");
                textView2.setText("しろ [shiro] 하얀색");
            }
        });
        hiragana_wa.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("わたし [watashi] 나");
                textView2.setText("");
            }
        });
        hiragana_wo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("");
                textView2.setText("");
            }
        });
        hiragana_n.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView1.setText("きっさてん [kissaten] 커피숍");
                textView2.setText("");
            }
        });
    }
}
