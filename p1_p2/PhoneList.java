package p1_p2;


/**
 * Write a description of class PhoneList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhoneList
{
    String name;
    int phone_num;
    public PhoneList(String a,int b){
        this.name = a;
        this.phone_num = b;
    }
    public String toString(){
        return this.name +" "+ this.phone_num;
    }
}
