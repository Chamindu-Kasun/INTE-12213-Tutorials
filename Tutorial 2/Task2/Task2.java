public class Task2 {
  public static void main(String[] args){
    Counter counter1 = new Counter(5);
    System.out.println(counter1.getValue());
    counter1.increment();
    System.out.println(counter1.getValue());
  }
}
