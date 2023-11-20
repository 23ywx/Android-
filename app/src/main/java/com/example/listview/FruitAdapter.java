package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listview.R;
import com.example.listview.fruit;

import java.util.List;
/*
继承自 ArrayAdapter，用于将水果对象列表连接到 ListView 上。通过重写 getView 方法，它将每个水果对象的图像和名称放置到列表项的布局中，以供显示。
**/
public class FruitAdapter extends ArrayAdapter<fruit> {

    private int resourceId;

    public FruitAdapter(Context context, int textViewResourceId, List<fruit> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        fruit fruit = getItem(position); //获取当前项的Fruit实例
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
        TextView fruitName =(TextView) view.findViewById(R.id.fruitname);
        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getName());
        return view;
    }
}