package BC;
import java.util.*;
/**
 * Write a description of class Blockchain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Blockchain
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<String> al_hash = new ArrayList<String>();
        ArrayList<String> al_index = new ArrayList<String>();
        ArrayList<String> al_timestamp = new ArrayList<String>();
        ArrayList<String> al_data = new ArrayList<String>();
        ArrayList<String> al_previousHash = new ArrayList<String>();
        int count = 0,i = 0;

        // ↓ Genesis block초기화
        Block b = new Block("0","01/01/2017","Genesis block");
        al_index.add("0");
        al_timestamp.add("01/01/2017");
        al_data.add("Genesis block");
        al_hash.add(b.hash() + "0");
        al_previousHash.add("0");

        // ↓ 2번째 이후의 정보를 삽입하기.
        while(true){
            System.out.print("입력하시겠습니까?(y/n)");
            String ansar = s.next();
            if(ansar.equals("y") || ansar.equals("Y")){
                System.out.print("index(Stringtype):");
                String index = s.next();
                System.out.print("timestamp(Stringtype):");
                String timestamp = s.next();
                System.out.print("data(Stringtype):");
                String data = s.next();
                b = new Block(index,timestamp,data);
                al_index.add(index);
                al_timestamp.add(timestamp);
                al_data.add(data);
                al_hash.add(b.hash() + al_previousHash.get(count));
                al_previousHash.add(al_hash.get(count));
                count++;
            }else if(ansar.equals("n") || ansar.equals("N")){
                break;
            }
        }

        // ↓ 입력된 정보를 보기.
        while(true){
            System.out.print("전체를 보시겠습니까?(y/n)");
            String ansar = s.next();
            if(ansar.equals("y") || ansar.equals("Y")){
                for(;i <= count;i++){
                    System.out.println("________________________________");
                    System.out.print("index:");
                    System.out.println(al_index.get(i));
                    System.out.print("timestamp:");
                    System.out.println(al_timestamp.get(i));
                    System.out.print("data:");
                    System.out.println(al_data.get(i));
                    System.out.print("previousHash:");
                    System.out.println(al_previousHash.get(i));
                    System.out.print("hash:");
                    System.out.println(al_hash.get(i));
                }
                System.exit(0);
            }else if(ansar.equals("n") || ansar.equals("N")){
                System.exit(0);
            }
        }
    }
}
