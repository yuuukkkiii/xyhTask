package com.example.xyhtask.handlers;

import android.content.Context;
import android.util.Log;
import android.view.View;

import com.example.xyhtask.bean.Select;

import java.util.List;

/**
 * author : Zhai Hao
 * date : 2022/4/26 18:24
 * description :
 */
public class PublicHandler {
    Context context;
    public void onAddClick(View view, List<Select> data){
        data.add(new Select());
    }
    public void onSubClick(View view, List<Select> data){
        data.remove(data.remove(data.size()-1));
    }
}
