package com.cllstudy.androidclassutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cllstudy.androidclassutils.view.CharAvatarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CharAvatarView cav = (CharAvatarView) findViewById(R.id.cav);
        cav.setText("周杰伦");
    }
}
