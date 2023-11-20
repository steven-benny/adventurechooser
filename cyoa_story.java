import java.util.Scanner;
import java.util.ArrayList;


class Main {
   public static void main(String[] args) { // make this method menu() not main. (I changed it to main because it
                                            // wouldn't run otherwise)


       ArrayList<String> items = new ArrayList<String>();
       items.add("beach");
       items.add("skate");
       items.add("pool");


       System.out.println("Welcome to your summer adventure!");


       Scanner value = new Scanner(System.in);
       System.out.println("time to make your first decision:");
       System.out.println("1. Start");
       System.out.println("2. Instructions");
       System.out.println("Type 'start' to start or 'instructions' for the instructions");
       String option = value.nextLine();


       if (option.equalsIgnoreCase("Instructions")) {
           System.out.println(
                   "In this choose your own adventure, you will be faced with many choices and your decisions will impact your fate. Are you ready to start?");


           Scanner value1 = new Scanner(System.in);
           System.out.println("time to make your first decision:");
           System.out.println("1. Start");
           System.out.println("2. Instructions");
           System.out.println("Type 'start' to start or 'instructions' for the   instructions");
           String option2 = value1.nextLine();


       }


       if (option.equalsIgnoreCase("Start")) {
           System.out.println();
           System.out.println("Here's your adventure:");
           System.out.println();
           System.out.println(
                   "You are a young boy who is eager and curious about the world.Your friend John had recently invited you to a pool party at his local community pool. Now, you have little experience swimming, but you still accepted the invite because you wnat to go to your friend's party. When you ask your parents if you could go, they initially say no, as they know that you are not experienced in swimming. But after begging and pleading, your parents agree to let you go to the pool party, as long as he stayed in the shallow end. you agree, and then he went off to the pool party. At the pool party you notice one thing, the shallow end was full of little kids, while the deep end was where your friends were going. Knowing full well he couldn’t swim, he felt embarrassed that your parents want you to stay in the shallow end, so you break your parents' rule and started swimming towards the deep end, thinking that it would be fine. your friends shout and encourage you to swim over to them, as your friends were all experienced swimmers and could hold their own on the deep end. You swim over to where your friends were, and suddenly realize you can barely swim, and you notice that you are sinking.");
           System.out.println();


           System.out.println("Do you A. call you friends");
           System.out.println("Do you B. struggle to the edge");


           Scanner scanner = new Scanner(System.in);
           String scan = scanner.next();


           if (scan.equalsIgnoreCase("A")) {
               System.out.println("Your friends help him up but they are now disdainful.");
               System.out.println("Do you A. Excuse yourself and go home");
               System.out.println("Do you B. Make up an excuse and try again");
               String scan1 = scanner.next();
               if (scan1.equalsIgnoreCase("A")) {
                   System.out.println(
                           "Your friends now think you can’t swim and have a bit of sympathy.  You go home sad.");
               } else if (scan1.equalsIgnoreCase("B")) {
                   System.out.println(
                           "Your friends stick closer to you this time but you still starts to sink. They then Friends help you up and suggest that they stop and watch a movie instead.  They show pity.  You are grateful and have a blast with your friends eating and watching the movie.  You go home happy.");
               }
           } else if (scan.equalsIgnoreCase("B")) {
               System.out.println(
                       " You try and doggy paddle to the surface. You get to the surface and get a breath but you start to sink again");
               System.out.println("Do you A. paddle towards exit");
               System.out.println("Do you B. call for friend's help");
               String scan2 = scanner.next();
               if (scan.equalsIgnoreCase("A")) {
                   System.out.println("Do you A. try to go in the pool again");
                   System.out.println("Do you B. Make an excuse and go home");


                   String scan3 = scanner.next();
                   if (scan3.equalsIgnoreCase("A")) {
                       System.out.println("Starts sinking again and just gets out of the swimming pool and goes home without a word.  Friends are confused and John feels really, really bad.");
                   } else if (scan3.equalsIgnoreCase("B")) {
                       System.out.println("Some friends are confused because they’re having a great time and some friends think that his excuse is genuine.  John goes home miserable and embarrassed.");
                   }
               }
               else if (scan2.equalsIgnoreCase("B")) {
                   System.out.println("Your friends help him up but they are now disdainful.");
               System.out.println("Do you A. Excuse yourself and go home");
               System.out.println("Do you B. Make up an excuse and try again");
               String scan1 = scanner.next();
               if (scan1.equalsIgnoreCase("A")) {
                   System.out.println(
                           "Your friends now think you can’t swim and have a bit of sympathy.  You go home sad.");
               } else if (scan1.equalsIgnoreCase("B")) {
                   System.out.println(
                           "Your friends stick closer to you this time but you still starts to sink. They then Friends help you up and suggest that they stop and watch a movie instead.  They show pity.  You are grateful and have a blast with your friends eating and watching the movie.  You go home happy.");
               }
               }
           } else if (scan.equalsIgnoreCase("Give up")) {
               System.out.println("You have given up. Your friends think ur a wuss.");
           }
           // start the game code
       }


   }
}
