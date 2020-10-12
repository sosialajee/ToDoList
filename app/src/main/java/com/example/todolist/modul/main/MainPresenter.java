package com.example.todolist.modul.main;

import android.os.Bundle;

public class MainPresenter implements MainContract.Presenter{
    private final MainContract.View view;
    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    public void performEdit(){
        view.redirectToEditDialog();
    }

}
