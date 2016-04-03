package twice_a_day.forge.ru.scrollviewtraining;

import android.annotation.TargetApi;
import android.app.FragmentTransaction;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ScrollViewListener {

    Button btn1,btn2,btn3;
    TextView tv;
    LinearLayout mainLay,raw;
    MyScroll scrollView;
    FragmentScroll fragmentScroll;
    android.support.v4.app.FragmentTransaction ft;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findAllViews();
        fragmentScroll = new FragmentScroll();

        ft=getSupportFragmentManager().beginTransaction();
        ft.add(R.id.mainLay, fragmentScroll);
        ft.commit();


        //scrollView= (MyScroll)(fragmentScroll.getView().findViewById(R.id.mainLay)).findViewById(R.id.scrollView);


    }

    @Override
    protected void onStart() {
        super.onStart();
        scrollView= fragmentScroll.myScroll;
        scrollView.setScrollViewListener(this);
    }

    private void findAllViews() {
        mainLay=(LinearLayout)findViewById(R.id.mainLay);

    }



    @Override
    public void onScrollChanged(MyScroll scrollV, int x, int y, int oldx, int oldy) {

        if (x == 0) {
            ft=getSupportFragmentManager().beginTransaction();
            ft.remove(fragmentScroll);
            ft.commit();

        }
    }


}
