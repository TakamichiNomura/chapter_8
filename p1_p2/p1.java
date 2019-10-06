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
        PhoneList pl;
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("전화번호 입력 프로그램입니다.");
            while(true){
                FileWriter fw = new FileWriter("d:\\phone.txt");
                System.out.print("이름 전화번호 >>");
                String name = s.next();
                if(name.equals("그만")){
                    System.out.println("c:\\temp\\phone.txt에 저장하였습니다.");
                    break;
                }
                int phone_num = s.nextInt();
                pl = new PhoneList(name,phone_num);
                fw.write(pl.toString());
            }
        }catch(IOException e){
            System.out.println("파일이 없습니다.");
        }
        s.close();
    }
}
