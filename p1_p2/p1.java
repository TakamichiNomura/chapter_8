package p1_p2;
import java.io.*;
import java.util.*;

/**
 * Write a description of class p1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p1
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("전화번호 입력 프로그램입니다.");
            while(true){
                FileWriter fw = new FileWriter("d:\\iphone.txt");
                System.out.print("이름 전화번호 >>");
                String name = s.next();
                if(name.equals("그만")){
                    System.out.println("d:\\iphone.txt에 저장하였습니다.");
                    break;
                }
                int phone_num = s.nextInt();
                fw.write(name);
                fw.write(phone_num);
            }
        }catch(IOException e){
            System.out.println("파일이 없습니다.");
        }
        s.close();
    }
}
