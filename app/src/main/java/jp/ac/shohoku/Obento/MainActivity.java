package jp.ac.shohoku.Obento;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }

    int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        //ボタンを押したときにイベントを取得できるようにする

    }
}
