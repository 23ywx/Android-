package com.example.listview;
/*
* 表示一个水果对象，具有两个属性：名称和对应的图像 ID。它包含了水果对象的基本属性和方法。
* */
public class fruit {
    private String name;
    private int imageId;
    public fruit (String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }
    public String getName() {
        return name;
    }
    public int getImageId() {
        return imageId;
    }
}