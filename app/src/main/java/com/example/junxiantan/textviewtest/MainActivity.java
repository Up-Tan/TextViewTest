package com.example.junxiantan.textviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.text.Html;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView html=(TextView)findViewById(R.id.html);
        html.setText(Html.fromHtml("欢迎参加<font color=red>手机设计大赛</font>"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.activity_main,menu);
        return true;
    }
}
