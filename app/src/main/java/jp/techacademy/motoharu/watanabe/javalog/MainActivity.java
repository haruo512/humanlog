package jp.techacademy.motoharu.watanabe.javalog;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("渡邊", 17, "Android");      //名前を渡邊、年齢17歳で、Humanのインスタンスを作る
        human.say();
        human.think();
    }
}
