package com.example.asus.rock_paper_scissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText kullanıcı1_name = (EditText) findViewById(R.id.kullanıcı1_name);
        final EditText kullanıcı2_name = (EditText) findViewById(R.id.kullanıcı2_name);
        ((Button) findViewById(R.id.basla)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MainActivity.this,GameActivity.class);
                i.putExtra("mesaj1",kullanıcı1_name.getText().toString());
                i.putExtra("mesaj2",kullanıcı2_name.getText().toString());
                startActivity(i);
            }
        });


    }

}
