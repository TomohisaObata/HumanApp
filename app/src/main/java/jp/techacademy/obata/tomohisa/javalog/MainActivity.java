package jp.techacademy.obata.tomohisa.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //5.5 条件分岐
        int num1 = 60;

        if(num1>=90){
            Log.d("javatest", "優");
        }else if(num1>=75){
            Log.d("javatest", "良");
        }else if(num1>=60){
            Log.d("javatest", "可");
        }else {
            Log.d("javatest", "不可");
        }

        int drink = 1;

        switch (drink){
            case 0:
                Log.d("javatest", "コーヒーを注文しました");
                break;
            case 1:
                Log.d("javatest", "紅茶を注文しました");
                break;
            case 2:
                Log.d("javatest", "ミルクを注文しました");
                break;
            default:
                Log.d("javatest", "オーダーミスです");
                break;
        }

        //5.6 繰り返し処理
        for (int i = 1; i < 6; i++){
            Log.d("javatest", "for文の" + String.valueOf(i) + "回目");
        }

        int num = 1;

        while (num < 6){
            Log.d("javatest", "while文の" + String.valueOf(num) + "回目");
            num++;
        }

        //5.7 配列
        int[] points = new int[5];
        points[0] = 10;
        points[1] = 6;
        points[2] = 15;
        points[3] = 23;
        points[4] = 17;

        for (int i = 0 ; i < points.length; i++){
            Log.d("javatest", String.valueOf(points[i]));
        }

        //6. 関数
        int t = total(100,1000);
        Log.d("javatest", String.valueOf(t));

        /*
           7. クラス
           8. 抽象クラス
         */
        Dog dog = new Dog("ポチ", 3);
        dog.say();
        Log.d("javatest", "犬の名前は、" + dog.name + "です。");
        Log.d("javatest", "犬の年齢は、" + dog.age + "歳です。");

        Dog dog2 = new Dog("ハチ", 10);
        dog2.say();
        Log.d("javatest", "犬の名前は、" + dog2.name + "です。");
        Log.d("javatest", "犬の年齢は、" + dog2.age + "歳です。");

        Dog.introduce();
        Log.d("javatest", Dog.to_jp + "のクラス変数です。");

        Dog bigdog = new Dog("ヨーゼフ", 15);
        bigdog.say();
        Log.d("javatest", "犬の名前は、" + bigdog.name + "です。");
        Log.d("javatest", "犬の年齢は、" + bigdog.age + "歳です。");

        //9.インターフェース
        dog.move();

        //Lesson3 課題
        Human human = new Human("小畑", 41, "androidアプリ");
        human.say();
        human.think();

        //10. Stringクラス
        String str1 = new String("Hello");
        String str2 = "World";
        String str3 = new String("Hello");
        int length = str3.length();
        Log.d("javatest",String.valueOf(length));
        if (str1.equals(str2)){
            Log.d("javatest", "str1とstr2は一緒です");
        } else {
            Log.d("javatest", "str1とstr2は異なります");
        }
        if (str1.equals(str3)){
            Log.d("javatest", "str1とstr3は一緒です");
        } else {
            Log.d("javatest", "str1とstr3は異なります");
        }

    }

    private int total(int first, int last){
        int sum = 0;
        for (int i = first; i < last; i++){
            sum = sum + i;
        }
        return sum;
    }
}
