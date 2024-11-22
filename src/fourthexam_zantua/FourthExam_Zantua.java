
package fourthexam_zantua;

import java.util.Scanner;
import java.util.Set;


public class FourthExam_Zantua {

    
    public static void main(String[] args) {
        
        FourthExam_Class exam  = new FourthExam_Class();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Friendster");
        System.out.println("Option 1 - Add Someone");
        System.out.println("Option 2 - Add as Friend");
        System.out.println("Option 3 - Display Friends");
        System.out.println("Option 4 - Recommend Friends");
        System.out.println("Option 5 - Log out");
        
        while(true) {
            System.out.println("\nOption: ");
            int choice = scan.nextInt();
            scan.nextLine();
            
            
            switch(choice){
                case 1: 
                    System.out.println("Enter the name of the user to add: ");
                    String user = scan.nextLine();
                    exam.adduser(user);
                    System.out.println("User " + user + " added.");
                    break;
                    
                case 2:
                    System.out.println("Enter the name of the first user: ");
                    String user1 = scan.nextLine();
                    System.out.println("Enter the name of the second user: ");
                    String user2 = scan.nextLine();
                    exam.addfriend(user1, user2);
                    System.out.println("Friendship added between " + user1 
                    + " and " + user2 + "." );
                    break;
                    
                case 3:
                    System.out.println("Diplaying all the users and their "
                            + "friends: ");
                    exam.displayFriends();
                    break;
                    
                case 4:
                    System.out.println("Enter the name of the users to get "
                            + "recommmendations for: ");
                    String targetUser = scan.nextLine();
                    Set<String> recommendedFriends = exam.getRecommendationFriends
                        (targetUser);
                    if(recommendedFriends.isEmpty()){
                        System.out.println("No recommended friends for " + 
                                targetUser + ".");
                    }else{
                        System.out.println("Recommended friends for " +
                                targetUser + ": " + recommendedFriends);
                    }
                    break;
                    
                case 5: 
                    System.out.println("Logging out.");
                    scan.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

