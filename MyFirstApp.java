import java.util.Scanner;

public class MyFirstApp {
  public static void main(String[] args) {
    System.out.println("Hello");

    myMethod();
    mySecondMethod();

    System.out.println();

    myCombinedMethod();

    System.out.println("----------------------");
    System.out.println();
    //-------------------------main1

    String declareLine = "Declared line";
    System.out.println(declareLine);
    scope();
    System.out.println(declareLine);

    System.out.println("----------------------");
    System.out.println();
    //-------------------------main2

    Scanner input = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = input.next();
    // input.close();
    System.out.println("My name is " + name);
    greet();
    System.out.println(name);
    
    System.out.println("----------------------");
    System.out.println();
    //-------------------------main3

    grid();
    
    System.out.println();
    System.out.println("----------------------");
    System.out.println();
    //-------------------------main4
    
    met4(10);
    
    System.out.println();
    System.out.println("----------------------");
    System.out.println();
    //-------------------------main5

    Scanner inGd = new Scanner(System.in);
    System.out.println("How many grids?");
    int gr = inGd.nextInt();
    // inGd.close();

    byGrid(gr);

    System.out.println();
    System.out.println("----------------------");
    System.out.println();
    //-------------------------main6

    Scanner inGrd = new Scanner(System.in);
    System.out.println("How many grids?");
    System.out.print("Input X length = ");
    int x = inGrd.nextInt();
    System.out.print("Input Y length = ");
    int y = inGrd.nextInt();
    // inGd.close();

    byCoor(x, y);

    System.out.println();
    System.out.println("----------------------");
    System.out.println();
    //-------------------------main7
  }
    //-------------------------met7

  public static void byCoor(int x, int y){
    for (int row=1; row<=y; row++){
      for (int col=1; col<=x; col++){
        if (row == col){
          System.out.print("1");
        } else {
          System.out.print("0");
        }
        if (col == x){
          System.out.print("\n");
        }
      }
    }
  }
    //-------------------------met6

  public static void byGrid(int gd){
    for (int row=1; row<=gd; row++){
      for (int col=1; col<=gd; col++){
        if (row == col){
          System.out.print("1");
        } else {
          System.out.print("0");
        }
        if (col == gd){
          System.out.print("\n");
        }
      }
    }
  }
  
    //-------------------------met5

  public static void met4(int grid){
    for (int row=1; row<=grid; row++){
      for (int col=1; col<=grid; col++){
        if (row == col){
          System.out.print("1");
        } else {
          System.out.print("0");
        }
        if (col == grid){
          System.out.print("\n");
        }
      }
    }
  }
  
    //-------------------------met4
  public static void grid(){
    for (int row=1; row<=5; row++){
      for (int col=1; col<=5; col++){
        if (row == col){
          System.out.print("1");
        } else {
          System.out.print("0");
        }
        if (col == 5){
          System.out.print("\n");
        }
      }
    }
  }
    //-------------------------met3
  public static void greet(){
    System.out.print("Hi, ");
  }
  
    //-------------------------met2
  public static void scope(){
    String declareLine = "Declare lagi";
    System.out.println(declareLine);
  }

    //-------------------------met1
  public static void myMethod(){
    System.out.println("bener");
  }
  public static void mySecondMethod(){
    System.out.println("betul");
  }
  public static void myCombinedMethod(){
    myMethod();
    mySecondMethod();
    System.out.println("bener dicombine");
  }
}