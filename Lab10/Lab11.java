
/**
 * This class tests the modified Person class.
 * 
 * @author Dr. Zeitz
 * @version CPSC 220
 */
public class Lab11
{
    public static void main(String[] args)
    {
        UpdatedPerson rebecca = new UpdatedPerson("Rebecca", 23, SocialYear.SENIOR);
        UpdatedPerson henry = new UpdatedPerson("Henry", 16, SocialYear.FRESHMAN);
    
        String n = rebecca.getName();
        System.out.println("One person is " + n + ".");
        
        System.out.println("This person is " + rebecca.getAge() + " years old.");
        
        System.out.print(henry.getName() + " used to be " + henry.getAge() + " years old.");
        henry.birthday();
        System.out.println(" He just had a birthday and is now " + henry.getAge() + " years old.");
        
        System.out.println(rebecca.getName() + " is a " + rebecca.getSocialYear() + ".");
        
        if (rebecca.canVote()) {
            System.out.println(rebecca.getName() + " can vote.");
        } else {
            System.out.println(rebecca.getName() + " is not old enough to vote.");
        }

        if (henry.canVote()) {
            System.out.println(henry.getName() + " can vote.");
        } else {
            System.out.println(henry.getName() + " is not old enough to vote.");
        }

        // HELP! Create more instances of the UpdatedPerson class for testing.
        UpdatedPerson jackson = new UpdatedPerson("Jackson", 21, SocialYear.JUNIOR);
        UpdatedPerson davis = new UpdatedPerson("Davis", 20, SocialYear.JUNIOR);
        
        // HELP! Modify me to use the UpdatedPerson class.
        //       Add friends to the ArrayLists of the instances.
        //       What type input parameter should be passed into the method?
        UpdatedPerson sarah = new UpdatedPerson("Sarah", 19, SocialYear.SOPHOMORE);
        UpdatedPerson erin = new UpdatedPerson("Erin", 22, SocialYear.SENIOR);
        UpdatedPerson bert = new UpdatedPerson("Bert", 17, SocialYear.FRESHMAN);
        rebecca.addFriend(sarah);
        rebecca.addFriend(erin);
        rebecca.addFriend(bert);
        
        UpdatedPerson isaac = new UpdatedPerson("Isaac", 21, SocialYear.SENIOR);
        UpdatedPerson kaley = new UpdatedPerson("Kaley", 20, SocialYear.JUNIOR);
        henry.addFriend(isaac);
        henry.addFriend(kaley);

        // HELP! Modify me to use the UpdatedPerson class.
        //       What type of objects does the ArrayList of friends have?
        
        if (rebecca.hasFriend(bert)) {
            System.out.println(rebecca.getName() + " is friends with " + bert.getName() + ".");
        } else {
            System.out.println(rebecca.getName() + " does not know " + bert.getName() + ".");
        }

        UpdatedPerson sam = new UpdatedPerson ("Sam", 21, SocialYear.JUNIOR);
        if (henry.hasFriend(sam)) {
            System.out.println(henry.getName() + " is friends with " + sam.getName() + ".");
        } else {
            System.out.println(henry.getName() + " does not know " + sam.getName() + ".");
        }
        
        
        // HELP! Print out the favorite friend of one of the students.
        System.out.println(rebecca.getFavFriendName());
        
        // HELP! Change the favorite friend of one of the people.
        //       The new favorite should already be a friend of the person.
        //       Print out this new favorite friend.
        henry.myNewFavFriend(kaley);
        System.out.println(henry.getFavFriendName());
        
        // HELP! Print out all the friends of one of the people.
        rebecca.printFriendNames();
        
        // HELP! Check to see if a person is friends with another person.
        //       This test should be true (the person should have the friend).
        rebecca.hasFriend(sarah);
        
        // HELP! Check to see if a person is friends with another person.
        //       This test should be false (the person should NOT have the friend).
        rebecca.hasFriend(davis);
        
        // HELP! A friend transfers and a person loses track.
        //       The student should unfriend the friend.
        //       Print out the updated list of friends.
        rebecca.unFriend(bert);
        rebecca.printFriendNames();
        
    }
}
