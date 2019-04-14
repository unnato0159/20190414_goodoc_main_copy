package com.tje.a20190414_goodoc_main_copy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText search;
    Button searchBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = findViewById(R.id.search);
        searchBtn = findViewById(R.id.searchBtn);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String searchData = search.getText().toString();
                String searchData1 = String.format("[%s]을 검색합니다.",searchData);

                Toast.makeText(MainActivity.this, searchData, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, searchData1, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
