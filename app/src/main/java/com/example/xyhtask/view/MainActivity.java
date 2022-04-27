package com.example.xyhtask.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.xyhtask.R;
import com.example.xyhtask.adapter.ListViewAdapter;
import com.example.xyhtask.bean.Select;
import com.example.xyhtask.databinding.ActivityMainBinding;
import com.example.xyhtask.handlers.PublicHandler;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        List<Select> data=new ArrayList<>();

        data.add(new Select("this is init","AND","CLASS"));
        data.add(new Select("this is init","AND","CLASS"));
        data.add(new Select("this is init","AND","CLASS"));
        data.add(new Select("this is init","AND","CLASS"));
        data.add(new Select("this is init","AND","CLASS"));
        binding.setAdapter(new ListViewAdapter(data,this));
        data.remove(4);
        binding.add.setOnClickListener((v)->{
            data.add(new Select());
        });
        binding.sub.setOnClickListener((v)->{
            data.remove(data.size()-1);
        });
        binding.setHandler(new PublicHandler());
        binding.setList(data);
    }


}