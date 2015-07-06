package com.mediatek.mtk70951.slidetest;

import java.util.Locale;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v13.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements View.OnClickListener{

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v13.app.FragmentStatePagerAdapter}.
     */
    //SectionsPagerAdapter mSectionsPagerAdapter;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;


    /**
     * The {@link ViewPager} that will host the section contents.
     */
    //ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        //mSectionsPagerAdapter = new SectionsPagerAdapter(getFragmentManager());

        // Set up the ViewPager with the sections adapter.
        //mViewPager = (ViewPager) findViewById(R.id.pager);
        //mViewPager.setAdapter(mSectionsPagerAdapter);
        initView();

    }

    private void initView() {
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                startActivity(new Intent(MainActivity.this, SlidingMenuActivity_1.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(MainActivity.this, SlidingMenuActivity_2.class));
                break;
            case R.id.btn3:
                startActivity(new Intent(MainActivity.this, SlidingMenuActivity_3.class));
                break;
            case R.id.btn4:
                startActivity(new Intent(MainActivity.this, SlidingMenuActivity_4.class));
                break;
            case R.id.btn5:
                startActivity(new Intent(MainActivity.this, SlidingMenuActivity_5.class));
                break;
            case R.id.btn6:
                startActivity(new Intent(MainActivity.this, SlidingMenuActivity_6.class));
                break;
            case R.id.btn7:
                startActivity(new Intent(MainActivity.this, SlidingMenuActivity_7.class));
                break;

            default:
                break;
        }
    }
}
