package com.example.todolist.modul.editTask;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.todolist.R;
import com.example.todolist.base.BaseFragment;

public class EditTaskFragment extends BaseFragment<EditTaskActivity, EditTaskContract.Presenter> implements EditTaskContract.View {
    EditText editText;
    Bundle bundle;

    public EditTaskFragment(Bundle bundle) {
        this.bundle = bundle;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.layout_dialog, container, false);
        mPresenter = new EditTaskPresenter(this);
        mPresenter.start();

        editText = fragmentView.findViewById(R.id.etEditTask);
        mPresenter.initializeTask(bundle);


        setTitle("Edit Task");

        return fragmentView;
    }

    @Override
    public void setPresenter(EditTaskContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void setTask(String task) {
        editText.setText(task);
    }

}