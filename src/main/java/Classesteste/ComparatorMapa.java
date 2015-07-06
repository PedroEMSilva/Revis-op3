/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classesteste;

import java.util.Comparator;
import java.util.Map;

/**
 *
 * @author Cliente
 */
public class ComparatorMapa implements Comparator<String> {

    Map<String, Integer> base;
    public ComparatorMapa(Map<String, Integer> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals.    
    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}