package jp.techacademy.motoharu.watanabe.javalog;

import android.util.Log;

/**
 * Created by motoharuwatanabe on 16/08/22.
 */
public class Human extends Animal{

    //メンバ変数
    String hobby="Java";

    //コンストラクタ
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    //メンバ関数
    public void say(){
        Log.d("javatest", "『私の名前は" + this.name + "です。年は" +this.age+"歳です。』");
    }

    public void think() {
        Log.d("javatest", "私は"+ hobby + "について考える");
    }
}