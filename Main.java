import java.util.concurrent.TimeUnit;
class Main {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("How much do you weigh on the moon lmao");
    liftOff(3);
  }
  public static liftOff(int countdown) throws InterruptedException {
    if(countdown == 0){
      System.out.print("\nLift Off!\n\n");
    }
    else{
      System.out.println(countdown);
      TimeUnit.SECONDS.sleep(1);
      countdown --;
      liftOff(countdown);
      return idk;
    }
  }
}