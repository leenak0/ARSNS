package com.leenak0.arsns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class Map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        BottomSheetBehavior.from(sheet).apply {
            peekHeight=200
                    this.state=BottomSheetBehavior.STATE_COLLAPSED
        }

    }
}