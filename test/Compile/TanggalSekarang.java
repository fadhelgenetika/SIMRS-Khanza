/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compile;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author user
 */
public class TanggalSekarang {
    
    private static DateTimeFormatter tgl,jam;
    private static LocalDateTime now;
    
    public static void main(String args[]){
        tgl = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        jam = DateTimeFormatter.ofPattern("HH:mm:ss");  
        now = LocalDateTime.now();
        System.out.println(tgl.format(now)); 
        System.err.println(jam.format(now)); 
    }
}
