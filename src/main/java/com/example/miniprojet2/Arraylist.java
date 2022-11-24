package com.example.miniprojet2;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    private ArrayList<String>ListMot;
    public Arraylist(){
        this.ListMot=new ArrayList<>();
    }

    public ArrayList<String> getListMot(){
        return this.ListMot;
    }
    public void addList(String x){
        ListMot.add(x);
    }

}