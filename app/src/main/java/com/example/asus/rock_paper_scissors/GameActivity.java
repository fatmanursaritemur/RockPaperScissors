package com.example.asus.rock_paper_scissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
   ImageButton b_rock, b_paper, b_scissors;
    private int kullanıcı1 = 0;
    private int kullanıcı2 = 0;
   TextView t_kullanıcı1, t_kullanıcı2,kazanan;
   TextView tv1,tv2;
   String s1,s2;
    String kullanıcı1secim;
    String kullanıcı2secim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Intent i = getIntent();
        s1 = i.getStringExtra("mesaj1");
        tv1 = (TextView) findViewById(R.id.kullanıcı1_sonuc);
        tv1.setText(s1);
        s2 = i.getStringExtra("mesaj2");
        tv2 = (TextView) findViewById(R.id.kullanıcı2_sonuc);
        tv2.setText(s2);

        b_rock = (ImageButton) findViewById(R.id.rockbutton);
        b_paper = (ImageButton) findViewById(R.id.paperbutton);
        b_scissors = (ImageButton) findViewById(R.id.scissorsbutton);
        t_kullanıcı1 = (TextView) findViewById(R.id.kullanıcı1_sayac);
        t_kullanıcı2 = (TextView) findViewById(R.id.kullanıcı2_sayac);
        kazanan = (TextView) findViewById(R.id.sonkazanan);
        birincisecim();
    }
        void birincisecim()
        {
            b_rock.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kullanıcı1secim = "rock";
                    ikincisecim();
                }
            });
            b_paper.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kullanıcı1secim = "paper";
                    ikincisecim();
                }
            });

            b_scissors.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kullanıcı1secim = "scissors";
                    ikincisecim();
                }
            });
        }


   void ikincisecim()
    {
        b_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kullanıcı2secim="rock";
                hesap();
            }
        });
        b_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kullanıcı2secim="paper";
                hesap();
            }
        });

        b_scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kullanıcı2secim="scissors";
                hesap();
            }
        });
    }
    void hesap() {
        if (kullanıcı1secim == "rock" && kullanıcı2secim == "rock") {
            kazanan.setText("kazanan yok");
            t_kullanıcı1.setText(Integer.toString(kullanıcı1));
            t_kullanıcı2.setText(Integer.toString(kullanıcı2));
            birincisecim();
        }
        if (kullanıcı1secim == "rock" && kullanıcı2secim == "paper") {
            ++kullanıcı2;
            kazanan.setText(s2);
            t_kullanıcı1.setText(Integer.toString(kullanıcı1));
            t_kullanıcı2.setText(Integer.toString(kullanıcı2));
            birincisecim();
        }

        if (kullanıcı1secim == "rock" && kullanıcı2secim == "scissors") {
            ++kullanıcı1;
            kazanan.setText(s1);
            t_kullanıcı1.setText(Integer.toString(kullanıcı1));
            t_kullanıcı2.setText(Integer.toString(kullanıcı2));
            birincisecim();
        }
        if (kullanıcı1secim == "paper" && kullanıcı2secim == "rock") {
            ++kullanıcı1;
            kazanan.setText(s1);
            t_kullanıcı1.setText(Integer.toString(kullanıcı1));
            t_kullanıcı2.setText(Integer.toString(kullanıcı2));
            birincisecim();
        }
        if (kullanıcı1secim == "paper" && kullanıcı2secim == "paper") {
            kazanan.setText("kazanan yok");
            t_kullanıcı1.setText(Integer.toString(kullanıcı1));
            t_kullanıcı2.setText(Integer.toString(kullanıcı2));
            birincisecim();
        }

        if (kullanıcı1secim == "paper" && kullanıcı2secim == "scissors") {
            ++kullanıcı2;
            kazanan.setText(s2);
            t_kullanıcı1.setText(Integer.toString(kullanıcı1));
            t_kullanıcı2.setText(Integer.toString(kullanıcı2));
            birincisecim();
        }
        if (kullanıcı1secim == "scissors" && kullanıcı2secim == "rock") {
            ++kullanıcı2;
            kazanan.setText(s2);
            t_kullanıcı1.setText(Integer.toString(kullanıcı1));
            t_kullanıcı2.setText(Integer.toString(kullanıcı2));
            birincisecim();
        }
        if (kullanıcı1secim == "scissors" && kullanıcı2secim == "paper") {
            ++kullanıcı1;
            kazanan.setText(s1);
            t_kullanıcı1.setText(Integer.toString(kullanıcı1));
            t_kullanıcı2.setText(Integer.toString(kullanıcı2));
            birincisecim();

            if (kullanıcı1secim == "scissors" && kullanıcı2secim == "scissors") {
                kazanan.setText("kazanan yok");
                t_kullanıcı1.setText(Integer.toString(kullanıcı1));
                t_kullanıcı2.setText(Integer.toString(kullanıcı2));
             birincisecim();
            }


        }
    }
}
