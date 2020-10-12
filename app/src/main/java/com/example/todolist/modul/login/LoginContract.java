package com.example.todolist.modul.login;

import com.example.todolist.base.BasePresenter;
import com.example.todolist.base.BaseView;

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void redirectToMain();
    }

    interface Presenter extends BasePresenter {
        void performLogin(String email, String password);
    }
}
