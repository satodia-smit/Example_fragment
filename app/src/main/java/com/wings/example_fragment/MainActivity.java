package com.wings.example_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private FragmentManager fm;
    private Button btn_android;
    private Button btn_apple;
    private Button btn_get_current_fragment;
    private String TAG_apple = "APPLE";
    private String TAG_android = "ANDROID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
        btn_android = (Button) findViewById(R.id.btn_android);
        btn_apple = (Button) findViewById(R.id.btn_apple);
        btn_get_current_fragment = (Button)findViewById(R.id.btn_show_android_hide_apple);


        btn_android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment_android fragment_android = new Fragment_android();
                Bundle args = new Bundle();
                args.putString("Key", "I am android");
                fragment_android.setArguments(args);
                getSupportFragmentManager().beginTransaction().
                        replace(R.id.container, fragment_android,TAG_android)
                        .addToBackStack(null)
                        .commit();
            }
        });

        btn_apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment_apple fragment_apple = new Fragment_apple();
                Bundle args = new Bundle();
                args.putString("Key", "I am apple");
                fragment_apple.setArguments(args);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, fragment_apple, TAG_apple)
                        .addToBackStack(null)
                        .commit();
            }
        });

        btn_get_current_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Fragment currentFragment = getSupportFragmentManager().findFragmentById(R.id.container);
                if(currentFragment instanceof Fragment_apple){
                    Log.e("CURRENT FRAGMENT","Fragment_apple");
                }else if(currentFragment instanceof Fragment_android){
                    Log.e("CURRENT FRAGMENT","Fragment_android");
                }

            }
        });


    }

}
