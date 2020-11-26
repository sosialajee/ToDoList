package com.example.todolist.modul.main;

import com.example.todolist.data.model.Task;

import java.util.ArrayList;

public class MainPresenter implements MainContract.Presenter{
    private final MainContract.View view;
    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void addTask(final String task){
        Task newTask = new Task("3", task);
        //save new task
    }

    @Override
    public ArrayList<Task> getDataSet() {
        //get Data from DB
        ArrayList<Task> data = new ArrayList<Task> ();
        data.add(new Task("1","Makan"));
        data.add(new Task("2", "Minum"));
        return data;
    }

/*    public void performEdit(){
        view.redirectToEditDialog();
    }*/

/*    @Override
    public void initializeTask(Bundle bundle){
        String status = bundle.getString("status");
        view.setStatus(status);
    }*/
}
