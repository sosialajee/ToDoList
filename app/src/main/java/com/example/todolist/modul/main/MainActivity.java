package com.example.todolist.modul.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.todolist.base.BaseFragmentHolderActivity;


public class MainActivity extends BaseFragmentHolderActivity {
    MainFragment mainFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

//        Intent intent = getIntent();
        mainFragment = new MainFragment();
        setCurrentFragment(mainFragment, false);

    }

}
