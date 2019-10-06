package p1_p2;
import java.util.*;
import java.io.*;

/**
 * Write a description of class p2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p2
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("c:\\temp\\iphone.txt를 출력합니다.");
        try{
            FileReader fr = new FileReader("d:\\iphone.txt");
            int c;
            while((c = fr.read()) != -1){
                System.out.print((char)c);
            }
        }catch(IOException e){
            System.out.println("파일이 없습니다.");
        }
    }
}
