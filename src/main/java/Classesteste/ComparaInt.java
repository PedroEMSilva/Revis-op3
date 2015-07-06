/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classesteste;

import java.util.Comparator;

/**
 *
 * @author Cliente
 */
public class ComparaInt implements Comparator<Integer> {
    public int compare(Integer str1, Integer str2) {  
        return -str2.compareTo(str1);  
    }  
}
