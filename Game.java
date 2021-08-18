

// package com.devmountain.game;
import java.util.Scanner;
// import java.util.*;
// import java.util.Random;

public class Game {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String first_name;
        System.out.print("Hello! What is your first name?");
        first_name = userInput.next();
        System.out.println("Hello " + first_name+ "! I am thinking of a number between 1 and 50. Can you guess it?");
        

        Scanner userGuess = new Scanner( System.in );
        do{
          int a = userGuess.nextInt();
          if(a < 35) {
              System.out.print("Try guessing a little higher");
              continue;
          } else if (a > 35) {
              System.out.print("Try guessing a little lower");
              continue;
          } else if (a == 35)
              System.out.print("Congratulations! You guessed the number!");
          break;
      } while(true);
      userInput.close();
      userGuess.close();
  }
}













// /*


// A number-guessing game.

// */
// import java.util.Scanner;

// // https://www.homeandlearn.co.uk/java/user_input.html


// // public class Game {
// //   public static void main(String[] args){
// //     // Put your code here
// //   }

// // }
// // public class Game {
// //   public static void main(String[] args){
// //     System.out.println("Coke is better than Pepsi");
// //   }
// // }

// //Step 2 Results
// // moleon@MacBook-Pro guessing-game-java % javac Game.java
// // moleon@MacBook-Pro guessing-game-java % java Game
// // Coke is better than Pepsi


// //Step 3 build out guessing game
// //pseudo code
// // greet player
// // get player name
// // choose random number between 1 and 100
// // repeat forever:
// //     get guess
// //     if guess is incorrect:
// //         give hint
// //         increase number of guesses
// //     else:
// //         congratulate player
 
// //Greet Player

// // public class Game {
// //   public static void main(String[] args){
// //     System.out.println("Helloooo there! What is your name?");
// //   }
// // }

// //Get Players name

// public class Game {
//   public static void main(String[] args){
    
//     Scanner firstName = new Scanner( System.in );

    
    
//     System.out.print("Helloooo! What is your name?");
//     Scanner user_input;
//     String firstName = user_input.next( );
//     System.out.println("Hello " + firstName);

//     Scanner userGuess = new Scanner( System.in );
//     do{
//       int a = userGuess.nextInt();
//       if(a < 35) {
//           System.out.print("Try guessing a little higher");
//           continue;
//       } else if (a > 35) {
//           System.out.print("Try guessing a little lower");
//           continue;
//       } else if (a == 35)
//           System.out.print("Congratulations! You guessed the number!");
//       break;
//   } while(true);

//   }
// }

//        while (a != 35) {
//            if (a < 35) {
//                System.out.print("Try guessing a little higher");
//                break;
//            } else if (a > 35) {
//                System.out.print("Try guessing a little lower");
//                break;
//            } else if (a == 35)
//                System.out.print("Congratulations! You guessed the number!");
//            break;
//
//        }