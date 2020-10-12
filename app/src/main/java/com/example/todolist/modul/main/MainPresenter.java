package com.example.todolist.modul.main;

import android.os.Bundle;

public class MainPresenter implements MainContract.Presenter{
    private final MainContract.View view;
    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

/*    @Override
    public void initializeProfile(Bundle bundle){
        String email = bundle.getString("email");
        String password = bundle.getString("password");

        view.setProfile(email, password);
    }*/
    public void performEdit(){
        //proses login
        //if login success call redirect to profile
        view.redirectToEditDialog();
    }

}
