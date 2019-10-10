package BC;


/**
 * Write a description of class Block here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Block
{
    String index;
    String timestamp;
    String data;
    String previousHash;
    public Block(String index,String timestamp,String data){
        this.index = index;
        this.timestamp = timestamp;
        this.data = data;
        this.previousHash = previousHash;
    }
    public String hash(){
        return this.index + this.timestamp + this.data + this.previousHash;
    }
}
