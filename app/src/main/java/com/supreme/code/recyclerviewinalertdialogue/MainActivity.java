package com.supreme.code.recyclerviewinalertdialogue;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView recyclerview;
    private MyAdapter adapter;
    ArrayList<MyData> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<MyData>();
//        list.add(0,new MyData("a"));
//        list.add(1,new MyData("b"));
//        list.add(2,new MyData("c"));
//        list.add(3,new MyData("d"));
//        list.add(4,new MyData("e"));
//        list.add(5,new MyData("f"));

        for(int i=0;i<100;i++)
        {
            list.add(i,new MyData("data = "+i));
        }


        findViewById(R.id.clickHere).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickMe();
            }
        });

    }

    private void clickMe() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        // ...Irrelevant code for customizing the buttons and title
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.alert_label_editor, null);
        int w = dialogView.getWidth();
        dialogBuilder.setView(dialogView);


        recyclerview = dialogView.findViewById(R.id.recyclerview);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        adapter = new MyAdapter(list);
        recyclerview.setAdapter(adapter);

        Button editText = dialogView.findViewById(R.id.label_field);
        editText.setText("test label");
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "alert dialogue button clicked");
            }
        });

        AlertDialog alertDialog = dialogBuilder.create();
        alertDialog.show();
        alertDialog.getWindow().getAttributes().windowAnimations = R.style.DialogTheme;
        //alertDialog.getWindow().setLayout(dialogView.getLayoutParams().width,dialogView.getLayoutParams().width);

        //this is new test
        //this is second test
        //this is third

    }
}