//Author: Ishaan Virani
public class Main 
{
  public static void main(String[] args) 
  {
    Main app = new Main();
  }
  public Main()
  {
    RaceHorse horse1 = new RaceHorse("John Wayne", 3, 250000, 2, 4);
    System.out.println(horse1);
    System.out.println();
    //###John Wayne's horse lost two races.  Implement that code below
    horse1.lostRace();
    horse1.lostRace();

    System.out.println("after losing races");
     System.out.println(horse1);
    System.out.println();

    Horse horse2 = new RaceHorse("Jimmy Stewart", 4, 325000, 8, 6);
    System.out.println(horse2);
    System.out.println();
    //###Jimmy's horse won two races.  Implement that code below
    //###Note: horse2 is of type Horse, so you need to take some steps
    //### before you can invoke the wonRace method.
    ((RaceHorse) horse2).wonRace();
    ((RaceHorse) horse2).wonRace();


    System.out.println("after winning races");
    System.out.println(horse2);
  }
}