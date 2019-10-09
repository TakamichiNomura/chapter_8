package p3;
import java.io.*;
import java.util.*;
/**
 * Write a description of class part2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class part2
{
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("c:\\Windows\\system.ini");
            int c;
            while((c = fr.read()) != -1){
                System.out.print(Character.toUpperCase((char)c));
                //Wrapper클래스의 Character클래스
            }
        }catch(IOException e){
            
        }
    }
}
