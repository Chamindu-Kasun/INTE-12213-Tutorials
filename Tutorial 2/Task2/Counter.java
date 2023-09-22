public class Counter{
    private int count;
    
    public Counter(int value){
      count = value;
    }
    
    public int getValue(){
      return count;
    }
    
    public void increment(){
      count++;
    }
}
