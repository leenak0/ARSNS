package com.leenak0.arsns;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MyPage extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private View drawerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_page);


        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        drawerView = (View)findViewById(R.id.drawer2);

        //drawerLayout.setDrawerListener(listener);
        drawerLayout.addDrawerListener(listener);
        drawerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });


    }

    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
            //슬라이드 했을때
        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {
            //Drawer가 오픈된 상황일때 호출
        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {
            // 닫힌 상황일 때 호출
        }

        @Override
        public void onDrawerStateChanged(int newState) {
            // 특정상태가 변결될 때 호출
        }
    };

    public void btnOnclick(View view) {
        switch (view.getId()){
            case R.id.btn_open:
                drawerLayout.openDrawer(drawerView);
        }
    }
}