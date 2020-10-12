package com.example.todolist.modul.editTask;

import android.os.Bundle;
import android.view.View;

import com.example.todolist.base.BaseFragmentHolderActivity;


public class EditTaskActivity extends BaseFragmentHolderActivity {
    EditTaskFragment editTaskFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        Bundle bundle = getIntent().getExtras();
        editTaskFragment = new EditTaskFragment(bundle);
        setCurrentFragment(editTaskFragment, false);

    }

}
