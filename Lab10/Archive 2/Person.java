import java.util.ArrayList;

public class Person
{
    //Instance variables
    private String name;
    private int age;
    private String birthMonth;
    private SocialYear year;
    private ArrayList<String> friends = 
        new ArrayList<String>();
    
    
    //Default constructor
    public Person()
    {
        this.name = "";
        this.age = -1;
        this.birthMonth = "";
        this.year = year;
        //this.friends = friends;
    }

    //Non-defualt constructior
    public Person(String name, int age, String birthMonth, SocialYear year)//, ArrayList friends)
    {
        this.name = name;
        this.age = age;
        this.birthMonth = birthMonth;
        this.year = year;
        //this.friends = friends;
    }
    
    //Getname
    public String getName()
    {
        return this.name;
    }
    
    //Setname
    public void setName(String name)
    {
        this.name = name;
    }
    
    //Getage
    public int getAge()
    {
        return this.age;
    }
    
    //Setage
    public void setAge(int age)
    {
        this.age = age;
    }
    
    //Getbirthmonth
    public String getbirthMonth()
    {
        return this.birthMonth;
    }
    
    //Setbirthmonth
    public void setbirthMonth(String birthMonth)
    {
        this.birthMonth = birthMonth;
    }
    
    //canvote
    public boolean canVote()
    {
        if (this.age >= 18){
            return true;
        } else {
            return false;
        }
    }
    
    //Daysinbirthmonth
    public int daysInBirthMonth()
    {
        if (this.birthMonth.equals("January") || this.birthMonth.equals("March") || this.birthMonth.equals("May") || this.birthMonth.equals("July") || this.birthMonth.equals("August") || this.birthMonth.equals("October") || this.birthMonth.equals("December")){
            return 31;
        } 
        else if (this.birthMonth.equals("April") || this.birthMonth.equals("June") || this.birthMonth.equals("September") || this.birthMonth.equals("November")){
            return 30;
        }
        else{
            return 28;
        }
    }
    
    //getsocialyear
    public SocialYear getSocialYear()
    {
        return this.year;
    }
    
    //setsocialyear
    public void setSocialYear(SocialYear y)
    {
        this.year = y;
    }
    
    //getfriends
    public ArrayList<String> getFriends()
    {
        return this.friends;
    }
    
    //addfriend
    public void addFriend(String friend)
    {
        friends.add(friend);
    }
    
    //hasfriend
    public boolean hasFriend(String friend)
    {
        if(friends.contains(friend)){
            return true;
        } else {
            return false;
        }
    }
}
