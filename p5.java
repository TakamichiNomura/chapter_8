import java.util.*;
import java.io.*;
/**
 * Write a description of class p5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p5
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        String file_1 = s.nextLine();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        String file_2 = s.nextLine();
        System.out.println(file_1 +"와 "+ file_2 +"를 비교합니다.");
        try{
            FileInputStream fis = new FileInputStream(file_1);
            FileOutputStream fos = new FileOutputStream(file_2);
            while(fis.read() != -1){
                fis.read();
            }
            System.out.println(fis.read());
        }catch(IOException e){
            
        }
    }
}
