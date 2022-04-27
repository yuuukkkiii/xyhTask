package com.example.xyhtask.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewbinding.ViewBinding;

import com.example.xyhtask.BR;
import com.example.xyhtask.R;
import com.example.xyhtask.bean.Select;

import java.util.List;

/**
 * author : Zhai Hao
 * date : 2022/4/26 10:38
 * description :
 */
public class ListViewAdapter extends BaseAdapter {

    private List<Select> data;

    private Context context;

    private ViewDataBinding binding;;

    public ListViewAdapter(List<Select> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Log.i("===============","进入了");

        if(view==null){
            binding= DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.list_view,viewGroup,false);
            if(binding==null){
                Log.e("-------","空的binding");
            }
            view=binding.getRoot();
            view.setTag(binding);
        }else{
            binding=(ViewDataBinding)view.getTag();
        }
        binding.setVariable(BR.listData,data.get(i));
        return binding.getRoot();
    }

    public void popView(){
        data.remove((int)getItemId(getCount()));
    }

    public void pushView(Select select){
        data.add(select);
    }

    public List<Select> getData() {
        return data;
    }

    public void setData(List<Select> data) {
        this.data = data;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
