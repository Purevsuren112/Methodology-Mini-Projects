
import java.util.Scanner;

public  class lostLogic{
       public static void systemMessage(){
        int lostKeyChain =1 ;
        do{ 
        try{
           
            
           // Promt for the user to pick what to do
           System.out.println("Is your smart keychain lost?\n"
                   + "Press 1 for Yes and 2 for No.");
           //User input.
           Scanner lostChoice = new Scanner(System.in);
           Integer userLostChoise = lostChoice.nextInt();
           // Promt to let user pick how they  want to find the keychain.
               if ( userLostChoise == 1){
               System.out.println("How would you like to find your keychain?\n"
                       +          "Press 1 to make a sound.\n"
                       +          "Press 2 to flash lights.\n"
                       +          "Press 3 to exit.");
               Scanner beepOrflash = new Scanner (System.in);
               Integer beepOrFlashChoice = beepOrflash.nextInt();
               switch(beepOrFlashChoice){
               case 1: 
                   beep();
                   break;                   
               case 2: 
                    flashFlash(); 
                    break;
               case 3: 
                   System.out.println("Returning to main menu.");
                   break;}}
           else if(userLostChoise == 2){
               lostKeyChain +=3;
               System.out.println("Returning to main menu.");
           }else{
               System.out.println("Please enter a valid input.");} //Incase the user presses a wrong int      
       
        //This will catch more general input errors.   
        }catch(Exception e){
             System.out.println("Please enter a valid input.\nTo play music press 1, to flash lights press 2, to exit press 3.");}     
        }while (lostKeyChain <3);
       
       
       }
       public static void beep(){
        try{
           Integer isLost = 1;
           do{
               System.out.println("Playing music.\nTo stop playing music press 1");// Place holder for playing music.
               Scanner beep = new Scanner(System.in);
               Integer beepEnd = beep.nextInt();
               if( beepEnd == 1){
                System.out.println("Stoped playing music.");
                isLost += 2;
               }else{
               System.out.println("Please enter a valid input");}// to catch bad int inputs.
           }while(isLost<2);
        }catch(Exception e){
            System.out.println("Please pick 1 to play music, 2 to flash lights or 3 to exit.");}//Execption handling.
       }
       public static void flashFlash(){
        try{
           Integer isLostFF = 1;
           do{
               System.out.println("Flashing lights.\nTo stop Flashing lights press 1"); //Place holder for flashing lights.
               Scanner flash = new Scanner(System.in);//User input.
               Integer flashEnd = flash.nextInt();
               if( flashEnd == 1){
                System.out.println("Stoped flashing lights.");
                isLostFF += 2;
               }else{
               System.out.println("Please enter a valid input");} // to catch bad int inputs.
           }while(isLostFF<2);
        }catch(Exception e){
            System.out.println("Please pick 1 to play music, 2 to flash lights or 3 to exit.");}//Exception handeling.
       } 
   }
    

