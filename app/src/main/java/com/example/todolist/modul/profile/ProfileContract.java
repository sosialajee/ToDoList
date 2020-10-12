package com.example.todolist.modul.profile;

import android.os.Bundle;

import com.example.todolist.base.BasePresenter;
import com.example.todolist.base.BaseView;

public interface ProfileContract {
    interface View extends BaseView<Presenter> {
        void setProfile(String email, String password);
    }

    interface Presenter extends BasePresenter {
        void initializeProfile(Bundle bundle);
    }
}
