package jp.techacademy.obata.tomohisa.javalog;

import android.util.Log;

/**
 * Created by tomohisa on 2016/12/11.
 */

class Dog extends Animal implements Movale{
    //クラス変数
    static String to_jp = "犬";

    //メンバ変数
    String name;
    int age;

    //コンストラクタ
    public Dog(String name,int age) {
        this.name = name;
        this.age = age;
    }

    //クラス関数
    public static void introduce(){
        Log.d("javatest", "これは犬クラスです。");
    }

    //メソッド
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    @Override
    public void move() {
        Log.d("javatest",this.name + "(" + String.valueOf(this.age) + "歳)" + "は全力で走った。");
    }
}
