package com.example.todolist.modul.editTask;

import android.os.Bundle;

import com.example.todolist.base.BasePresenter;
import com.example.todolist.base.BaseView;

public interface EditTaskContract {
    interface View extends BaseView<Presenter> {
        void setTask(String task);
        void setIndex(int index);
    }

    interface Presenter extends BasePresenter {
        void initializeTask(Bundle bundle);
    }
}
