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
    String hash;
    public Block(String index,String timestamp,String data,String previousHash){
        this.index = index;
        this.timestamp = timestamp;
        this.data = data;
        this.previousHash = previousHash;
        this.hash = hash();
    }
    
    public String calculateHash(){
        return (this.index +"\t"+ this.previousHash +"\t"+
                this.timestamp +"\t"+ this.previousHash).toString();
    }
    
    public String hash(){
        return (this.index + this.previousHash +
                this.timestamp + this.data);
    }
}
