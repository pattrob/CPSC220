import java.util.ArrayList;
/**
 * This class defines UpdatedPerson objects.
 * 
 * @author Dr. Zeitz 
 * @version CPSC 220
 */
public class UpdatedPerson
{
    private String name;
    private int age;
    private SocialYear year;
    private ArrayList<UpdatedPerson> friends;
    protected int gradYear;

    /**
     * Constructor for objects of class Student
     */
    public UpdatedPerson(String n, int a, SocialYear sy)
    {
        this.name = n;
        this.age = a;
        this.year = sy;
        this.friends = new ArrayList<UpdatedPerson>();
    }
    
    public String getName()
    {
        return this.name;
    }

    public void setName(String n)
    {
        this.name = n;
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    public void setAge(int a)
    {
        this.age = a;
    }
    
    public SocialYear getSocialYear()
    {
        return this.year;
    }

    public void setSocialYear(SocialYear y)
    {
        this.year = y;
    }

    public void birthday()
    {
        this.age++;
    }
    
    public boolean canVote()
    {
        return this.age >= 18;
    }

    public ArrayList<UpdatedPerson> getFriends()
    {
        return this.friends;
    }
    
    public void addFriend(UpdatedPerson friend)
    {
        friends.add(friend);
    }
    
    public boolean hasFriend(UpdatedPerson friend)
    {
        return friends.contains(friend);
    }
    
    public boolean equals(UpdatedPerson s)
    {
        if(s.equals(s)){
            return true;
        } else {
            return false;
        }
    }
    
    public void unFriend(UpdatedPerson friend)
    {
        if(friends.contains(friend)){
            friends.remove(friend);
        }
    }
    
    public String printFriendNames()
    {
        for(int i = 0; i < friends.size(); i++){
            String name = friends.get(i).getName();
            
        }
        return name;
    }
    
    public String getFavFriendName()
    {
        if(friends.contains(0)){
            return (friends.get(0).getName());
        } else {
           return (this.name + " does not know anyone yet");
        }
    }
    
    public void myNewFavFriend(UpdatedPerson friend)
    {
        int num = 0;
        friends.add(0,friend);
        while(num < friends.size()){
            friends.add(num + 1, friends.get(num));
        }
      
    }
    
    
    public String cheer(){
        return "I am impartial";
    }
    
    
}

