package com.example.todolist.modul.main;

import android.os.Bundle;

import com.example.todolist.base.BasePresenter;
import com.example.todolist.base.BaseView;

public interface MainContract {
    interface View extends BaseView<Presenter> {
        void redirectToEditDialog();
    }

    interface Presenter extends BasePresenter {
        void performEdit();
    }
}
