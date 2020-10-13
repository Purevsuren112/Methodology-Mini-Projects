
import java.util.ArrayList;
import java.util.Scanner;

public  class locationTracker{
        public Double Longitute;
        public Double Latitute;
        //This arraylist will store the home location of users.
        public static ArrayList<Double>homeCoordinates = new ArrayList<Double>();
        //This arraylist will store the current location of the user.
        //Usecases like when the user goes on a hike and wants to store the location of the endpoint.
        public static ArrayList<Double>currentCoordinates = new ArrayList<Double>();
        //This array will store the users current location and it will update in real time. 
        //This feature is mainly for parents tracking  their kids, to make sure they dont get lost or to see where they are going.
        public static ArrayList<Double>childCoordinates = new ArrayList<Double>();
        
        // This section will handle adding new locations to the keychain app.
         public static void  locationLogic(){
            //Get user input        
            int doWhileControl = 1;          
            do{
                try{
                //Promt for user interaction   
                Scanner userOptions = new Scanner(System.in);
                System.out.println("To save your Home locations press 0.\n"
                        +          "To save your Current location press 1.\n"
                        +          "To check the location of the keychain press 2.\n"
                        +          "To see saved data press 3.\n"
                        +          "To exit press 4");

                // This represents the user input. 0-Set home location, 1- save current location, 3- Show current location live on the keychain app, 4 to got back to main menu         
                Integer userInput = userOptions.nextInt();
                
                double homeLongitute = 15.1536;//This is dummy data
                double homeLatitute = 45.687;//This is dummy data, the keychains will take the GPS coordinates from the phones location tracker or the built in one.
                double currentLongitute = 545.787;//dummy data.
                double currentLatitute = 878.4564;//dummy data.
                double childLongitute = 145.787;//This is dummy data.
                double childLatitute = 178.45; // This is dummy data.
                
                //Options to save coordinates
                if (userInput == 0){
                    homeCoordinates.add(homeLongitute);
                    homeCoordinates.add(homeLatitute);
                    System.out.println("Your home location has been set at:" + homeCoordinates);
                }else if( userInput == 1){
                    currentCoordinates.add(currentLongitute);
                    currentCoordinates.add(currentLatitute);
                    System.out.println("Your current location has been set at:"+ currentCoordinates);
                }else if( userInput == 2){
                    childCoordinates.add(childLongitute);
                    childCoordinates.add(childLatitute);
                    System.out.println("This is your real time location: "+ childCoordinates);
                //Promt to view saved coordinates
                }else if( userInput == 3){
                    System.out.println("To see saved home locations press 0.\n"
                            +          "To see saved locations press 1.\n"
                            +          "To see current location press 2.\n");

                    Scanner seeData = new Scanner(System.in);
                    int seeDataOpt = seeData.nextInt();
                    //Options to view saved coordinates
                    if( seeDataOpt == 0){
                        System.out.println("This is the saved home location: "+homeCoordinates);
                    }else if ( seeDataOpt == 1){
                        System.out.println("These are the saved location: "+ currentCoordinates);
                    }else if ( seeDataOpt == 2){
                        System.out.println("This is the live coordinate feed: "+childCoordinates);  
                    }else{
                        System.out.println("Please give a valid input");}
                }
                if( userInput == 4){
                    
                    doWhileControl += 5;
                }

             }catch(Exception e){
                System.out.println("Please follow these rules : 0 to get Home.\n"
                        + "1 to get Saved location\n"
                        + "2 to get Current location\n"
                        + "3 to display saved data");}   
            }
            while(doWhileControl <4);
         }
   }