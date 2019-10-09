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
        StringBuffer sb = new StringBuffer();
        StringBuffer sb_hash = new StringBuffer();
        Scanner s = new Scanner(System.in);
        StringTokenizer st;
        Vector<Integer> v_index = new Vector<Integer>();
        Vector<Integer> v_hash = new Vector<Integer>();
        ArrayList<String> al_timestamp = new ArrayList<String>();
        ArrayList<String> al_data = new ArrayList<String>();
        ArrayList<String> al_previousHash = new ArrayList<String>();

        Block b = new Block("0", "01/01/2017", "Genesis block","0");
        sb.append(b.calculateHash());
        st = new StringTokenizer(new String(sb)," ");
        v_index.add(Integer.parseInt(st.nextToken()));
        al_timestamp.add(st.nextToken());
        al_data.add(st.nextToken());
        al_previousHash.add(st.nextToken());
        int count = 0;
        while(true){
            System.out.print("입력하시겠습니까?(y/n)");
            String ansar = s.next();
            if(ansar.equals("y") || ansar.equals("Y")){
                System.out.print("index(inttype):");
                String index = s.next();
                System.out.print("timestamp(Stringtype):");
                String timestamp = s.next();
                System.out.print("data(Stringtype):");
                String data = s.next();
                System.out.print("previousHash(Stringtype):");
                String previousHash = s.next();
                b = new Block(index,timestamp,data,previousHash);

                sb.append(b.calculateHash());
                st = new StringTokenizer(new String(sb)," ");
                v_index.add(Integer.parseInt(st.nextToken()));
                al_timestamp.add(st.nextToken());
                al_data.add(st.nextToken());
                al_previousHash.add(st.nextToken());

                sb_hash.append(b.hash());
                v_hash.add(Integer.parseInt(new String(sb_hash)));
                count ++;
            }else if(ansar.equals("n") || ansar.equals("N")){
                break;
            }
        }
        System.out.print("전체를 보시겠습니까?(y/n)");
        String ansar = s.next();
        if(ansar.equals("y") || ansar.equals("Y")){
            while(count < 0){
                System.out.print("index:");
                System.out.println(v_index.get(count));
                System.out.print("timestamp:");
                System.out.println(al_timestamp.get(count));
                System.out.print("data:");
                System.out.println(al_data.get(count));
                System.out.print("previousHash:");
                System.out.println(al_previousHash.get(count));
                System.out.print("hash:");
                System.out.println(v_hash.get(count));
                count --;
            }
        }else if(ansar.equals("n") || ansar.equals("N")){
            System.exit(0);
        }
    }

}
