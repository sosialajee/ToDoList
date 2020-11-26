package com.example.todolist.modul.main;

import android.os.Bundle;

import com.example.todolist.base.BasePresenter;
import com.example.todolist.base.BaseView;
import com.example.todolist.data.model.Task;

import java.util.ArrayList;

public interface MainContract {
    interface View extends BaseView<Presenter> {
        //void gotoNewTask();
/*        void redirectToEditDialog();
        void setStatus(String status);*/
    }

    interface Presenter extends BasePresenter {
//        void performEdit();
        ArrayList<Task> getDataSet();
        void addTask(String task);
    }
}
