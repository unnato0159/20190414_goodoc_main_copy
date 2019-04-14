package com.tje.a20190414_goodoc_main_copy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText search;
    Button searchBtn;
    TextView welcomeMsgTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = findViewById(R.id.search);
        searchBtn = findViewById(R.id.searchBtn);
        welcomeMsgTxt =findViewById(R.id.welcomeMsgTxt);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String searchData = search.getText().toString();
                String searchData1 = String.format("[%s]을 검색합니다.",searchData);

                //Toast.makeText(MainActivity.this, searchData, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, searchData1, Toast.LENGTH_SHORT).show();
            }
        });

        String loginUserId = getIntent().getStringExtra("사용자아이디");
        Log.d("로그인사용자",loginUserId);

        String welcomeMessage = String.format("%s님 환영합니다.!",loginUserId);
        welcomeMsgTxt.setText(welcomeMessage);
    }
}
