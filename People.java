/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.hw4;
import java.util.Comparator;
/**
 *
 * @author Home
 */
public class People implements Comparable<People>{

    public People(int number,String FIO, String post, boolean pass) {
        this.number=number;
        this.FIO=FIO;
        this.post=post;
        this.pass=pass;
    }
    private int number;
    private String FIO;
    private String post;
    private boolean pass;

    public String getFIO() {
        return FIO;
    }

    public String getPost() {
        return post;
    }

    public boolean isPass() {
        return pass;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public int compareTo(People k){
        return FIO.compareTo(k.getFIO());
    }
}


