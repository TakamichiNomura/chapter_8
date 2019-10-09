package p3;

import java.io.*;
import java.util.*;
/**
 * Write a description of class p3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class part1

{
    public static void main(String[] args){
        try{
            Scanner s = new Scanner(new FileReader("c:\\Windows\\system.ini"));
            while(s.hasNext()){
                String up = s.nextLine();
                System.out.println(up.toUpperCase());
            }
        }catch(IOException e){

        }
    }
}