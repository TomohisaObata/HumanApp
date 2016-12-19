package jp.techacademy.obata.tomohisa.javalog;

import android.util.Log;

/**
 * Created by tomohisa on 2016/12/11.
 */

class BigDog extends Dog {
    //クラス変数
    static String to_jp = "大型犬";

    //コンストラクタ
    public BigDog(String name, int age) {
        super(name,age);
    }

    //クラス関数
    public static void introduce(){
        Log.d("javatest", "これは大型犬クラスです。");
    }

}
