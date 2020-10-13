// I'm making a keychain that has GPS tracking, can notify you of the keychains location incase you lose it.
// The keychain will either light up, make a sound.
// The keychain will connect to the usersphone via internet or bluetooth. 
// The smart keychain will come with an app, that can track users and store some info. 
// The keychain will have  a smallspeaker and a small but powerful flashlight.
// The data used is dummy data and functions like play music and flash the flashlight are represented by a simple text output in the terminal at the moment.
import java.util.*;
public class KeyChains {

    public static void main(String[] args) {
        
        Integer mainMenu = 1;
        do{// The do while loop is here so that when the user presses a bad input the app doesnt close.
        try{
        //Promt in the main menu
        System.out.println("What would you like to do?\n Press 1 to go to location section, presss 2 to find lost keychain and press 3 to exit the app.");
        Scanner mainMenuOps = new Scanner(System.in);
        Integer mainMenuChoise = mainMenuOps.nextInt();// user input
        
        if(mainMenuChoise == 1){
            //I use an instance of the locationTracker class to get access to the locationLogic method.
            locationTracker a = new locationTracker();
            a.locationLogic();
        }else if( mainMenuChoise ==2 ){
            //I use and instance of the lostLogic class to get access to systemMessage method, which calls beep and flashflash.
            lostLogic b = new lostLogic();
            b.systemMessage();
        }else if ( mainMenuChoise == 3){
            System.out.println("Shuting down app.");
            mainMenu += 3;
        }else{
            System.out.println("Please enter a valid input.");} 
        //Catching bad inputs from user.
        }catch(Exception e){
        System.out.println("Please enter a valin input.\nPress 1 to go to location the location section, press 2 to find your lost keychain, or press 3 to exit. ");}
        }while(mainMenu <3);}

}//This is the closing bracket for the keychain class.