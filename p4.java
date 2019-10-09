import java.util.*;
import java.io.*;
/**
 * Write a description of class p4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p4
{
    public static void main(String[] args){
        try{
            Scanner s = new Scanner(new FileReader("c:\\Windows\\system.ini"));
            int i = 1;
            System.out.println("c:\\Windows\\system.ini 파일을 읽어 출력합니다.");
            while(s.hasNext()){
                System.out.print("  "+ i +":");
                System.out.println(s.nextLine());
                i++;
            }
        }catch(IOException e){
            System.out.println("error");
        }
    }
}
