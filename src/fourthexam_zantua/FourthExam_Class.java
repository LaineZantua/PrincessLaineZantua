
package fourthexam_zantua;

import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.Map;

import java.util.*;

public class FourthExam_Class {
    private Map<String, Set<String>> friendsMap;
    
    public FourthExam_Class(){
        friendsMap = new HashMap<>();
    }
    
            public void adduser(String user){
                friendsMap.putIfAbsent(user, new HashSet<>());
            }
            
            public void addfriend(String user1, String user2){
                friendsMap.putIfAbsent(user1, new HashSet<>());
                friendsMap.get(user1).add(user2);
                friendsMap.get(user2).add(user1);
            }
            
            public void displayFriends(){
                for(var entry : friendsMap.entrySet()){
                    System.out.println(entry.getKey() + "'s friends: ");
                    
                    for(String friend : entry.getValue()) {
                        System.out.println(friend + " ");
                    }
                    
                    System.out.println();
                }
            }
            
            public  Set<String> getRecommendationFriends (String user) {
                Set<String> recommend = new HashSet<>();
                Set<String> userFriends = friendsMap.getOrDefault
        (user, new HashSet<>());
                
                for(String friend : userFriends) {
                    for(String friendsFriend : friendsMap.getOrDefault(friend,
                            new HashSet<>())){
                        if(!userFriends.contains(friendsFriend) && !friendsFriend.
                                equals(user)){
                            recommend.add(friendsFriend);
                        }
                    
                    }
                }
            
                        
            return recommend;
    
    }
}
