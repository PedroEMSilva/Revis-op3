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
public class ComparaString  implements Comparator<String>{
    public int compare(String str1, String str2) {  
        return -str2.compareTo(str1);  
    }  
}
