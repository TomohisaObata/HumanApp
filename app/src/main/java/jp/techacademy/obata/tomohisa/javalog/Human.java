package jp.techacademy.obata.tomohisa.javalog;

import android.util.Log;
/**
 * Created by tomohisa on 2016/12/11.
 */

class Human extends Animal implements Thinkavle {

    //メンバ変数
    String name;
    int age;
    String hobby;

    //コンストラクタ
    public Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    @Override
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。" + "年は" + this.age + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }
}
