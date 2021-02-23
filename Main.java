import java.util.Scanner;
//Scanner ^
import java.util.concurrent.TimeUnit;
//Time addition. Makes everything smooth and more ralistic. ^
class Main {
  public static void main(String[] args) throws InterruptedException {
    System.out.print("How many miles do you want to be from the moon?\n\n");
    Scanner sc = new Scanner(System.in);
    int startDistance = sc.nextInt();
    //Requirements in order for function to work as intended 
    if(startDistance > 500 && startDistance % 500 == 0) {
      System.out.println("\nWe are at a approxmate distance of " + startDistance + " miles towards the moon. Operation Landship activated - over \n");
      //Method call
      land(startDistance);
    }
    else
    {
      System.out.println("\nOperation Landship Deactivated. Altitude requirements not sufficient (Make it by every 500!! Also no negatives please)");
    }
  }
  public static int land(int altDrop) throws InterruptedException {
    //Once altitude is 0, you land. Base case. 
    if(altDrop == 0){
      System.out.println("\nWe have approached the surface of the moon!");
      return altDrop;
    }
    //recursve part. Counts down by 500 miles (in altitude) till your altitude is 0 from the moon. 
    else{
      System.out.println(altDrop);
      TimeUnit.SECONDS.sleep(1);
      altDrop -= 500;
      return land(altDrop);
    }
  }
}
//hiMin