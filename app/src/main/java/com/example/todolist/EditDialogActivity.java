package com.example.todolist;

//import android.support.v7;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EditDialogActivity extends AppCompatActivity {
  //  AlertDialog.Builder builder = new AlertDialog.Builder();

    //LayoutInflater inflater = getLayoutInflater();
    //View view = inflater.inflate(R.layout.layout_dialog, null);
    Button updateBTN, deleteBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dialog);

        Intent intent = getIntent();
        updateBTN = findViewById(R.id.update);
        deleteBTN = findViewById(R.id.delete);

    }
}
