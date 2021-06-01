package oop.example;

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String userInput;

        System.out.print("Is the car silent when you turn the key? ");
        userInput = input.nextLine();

        if(userInput.equalsIgnoreCase("y"))   {
            System.out.print("Are the battery terminals corroded? ");
            userInput = input.nextLine();
            if(userInput.equalsIgnoreCase("y"))   {
                System.out.println("Clean terminals and try again.");
            }
            else   {
                System.out.println("Replace cables and start again.");
            }


        }
        else   {
            System.out.print("Does the car make a slicking noise? ");
            userInput = input.nextLine();
            if(userInput.equalsIgnoreCase("y"))   {
                System.out.println("Replace the battery");
            }
            else   {
                System.out.print("Does the car crank up but fail to start? ");
                userInput = input.nextLine();
                if(userInput.equalsIgnoreCase("y")) {
                    System.out.println("Check spark plug connections.");
                }
                else   {
                    System.out.print("Does the engine start and then die? ");
                    userInput = input.nextLine();
                    if(userInput.equalsIgnoreCase("y"))   {
                        System.out.print("Does your car have fuel injection? ");
                        userInput = input.nextLine();
                        if(userInput.equalsIgnoreCase("y"))   {
                            System.out.println("Get it in for service.");
                        }
                        else   {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }

                    }
                    else   {
                        //not possibly i guess...
                    }
                }

            }
        }


    }


}
