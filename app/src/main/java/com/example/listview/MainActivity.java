package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
/*
* 是应用的主要活动（Activity），其中的 onCreate 方法用于初始化整个应用。它创建了一个 FruitAdapter 并将其设置给 ListView 用于显示水果列表。另外，实现了 onItemClick 方法，使得在点击列表项时能弹出对应水果的名称。
* */
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<fruit> fruitList = new ArrayList<>();//声明水果列表清单
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();// 初始化水果数据

        FruitAdapter arrayAdapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);

    }
//水果添加图片以及文字设置
    private void initFruits(){

         fruit apple = new fruit("苹果",R.drawable.apple);
         fruitList.add(apple);
         fruit heimei = new fruit("我是黑莓",R.drawable.heimei);
         fruitList.add(heimei);
         fruit hmg= new fruit("哈密瓜",R.drawable.hmg);
         fruitList.add(hmg);
         fruit htg = new fruit("海棠果",R.drawable.htg);
         fruitList.add(htg);
         fruit mht= new fruit("猕猴桃",R.drawable.mht);
         fruitList.add(mht);
         fruit orange= new fruit("橙子",R.drawable.orange);
         fruitList.add(orange);
         fruit smt = new fruit("水蜜桃",R.drawable.smt);
         fruitList.add(smt);
         fruit whg= new fruit("无花果",R.drawable.whg);
         fruitList.add(whg);
         fruit xylz = new fruit("西洋李子",R.drawable.xylz);
         fruitList.add(xylz);
    }
    //实现点击水果清单中任何一项水果出现响应的弹出框功能
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        fruit fruit = fruitList.get(position);
        Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
    }

}