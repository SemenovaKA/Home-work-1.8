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
class SortByNumber implements Comparator<People>{
    @Override
    public int compare(People o1, People o2) {
       return Double.compare(o1.getNumber(), o2.getNumber());
    }
}
