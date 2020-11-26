package com.example.todolist.modul.editTask;

import android.os.Bundle;

public class EditTaskPresenter implements EditTaskContract.Presenter{
    private final EditTaskContract.View view;
    public EditTaskPresenter(EditTaskContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void initializeTask(Bundle bundle){
        String task = bundle.getString("task");
//        int index = bundle.getString("index");

//        view.setIndex(index);
        view.setTask(task);
    }

}
