package com.example.todolist.modul.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.example.todolist.R;
import com.example.todolist.base.BaseFragment;
import com.example.todolist.modul.editTask.EditTaskActivity;

import java.util.ArrayList;

public class MainFragment extends BaseFragment<MainActivity, MainContract.Presenter> implements MainContract.View {
    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView listView;
    private Button button, update, delete;
    Context mBase;

    public MainFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_main, container, false);
        mPresenter = new MainPresenter(this);
        mPresenter.start();

        listView = fragmentView.findViewById(R.id.listView);
        button = fragmentView.findViewById(R.id.addTaskBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem(view);
            }
        });

        items = new ArrayList<>();
        itemsAdapter = new ArrayAdapter<>(activity, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Context context = getApplicationContext();
                //Toast.makeText(context, "Item Removed", Toast.LENGTH_SHORT).show();
                //items.remove(i);
                //itemsAdapter.notifyDataSetChanged();
                setUpListViewListener();
                return true;
            }
        });


        setTitle("List Activity");

        return fragmentView;
    }


    public void setUpListViewListener() {
        mPresenter.performEdit();
    }

    @Override
    public void redirectToEditDialog() {
        Intent intent = new Intent(activity, EditTaskActivity.class);
        startActivity(intent);
        activity.finish();
    }

    private void addItem(View view) {
        EditText input = fragmentView.findViewById(R.id.addTaskTF);
        String itemText = input.getText().toString();

        if(!(itemText.equals(""))) {
            itemsAdapter.add(itemText);
            input.setText("");
        }
        else {
            //Toast.makeText(getApplicationContext(), "Please enter text", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        mPresenter = presenter;
    }


}