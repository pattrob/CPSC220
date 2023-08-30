import java.util.ArrayList;

public class Lab10
{
    
    public static void main(String[] args)
    {
        //Create more than one person object
        Person Ella = new Person();
        Person Max = new Person("Max", 17, "August", SocialYear.FRESHMAN);//, new ArrayList<String>());
        
        //Set Ellas's name and use getName
        Ella.setName("Ella");
        String Ella_name = Ella.getName();
        System.out.println(Ella_name);
        
        //Initial getAge for Ella
        System.out.println(Ella.getAge());
        
        //Set Ellas's age and use getAge
        Ella.setAge(22);
        int Ella_age = Ella.getAge();
        System.out.println(Ella_age);
        
        //canVote for Ella
        boolean ellavoter = Ella.canVote();
        System.out.println(ellavoter);
        
        //canVote for Max
        boolean maxvoter = Max.canVote();
        System.out.println(maxvoter);
        
        //Set Ellas's birth month and use daysinbirthmonth
        Ella.setbirthMonth("Febuary");
        int elladibm = Ella.daysInBirthMonth();
        System.out.println(elladibm);
        
        //Use daysinbirthmonth for Max
        int maxdibm = Max.daysInBirthMonth();
        System.out.println(maxdibm);
        
        //PART 2
        
        //use getsocial year for Max
        System.out.println(Max.getSocialYear());
        
        //setsocial for Max - moving up a grade
        Max.setSocialYear(SocialYear.SOPHOMORE);
        
        //Add friends
        Max.addFriend("James");
        Max.addFriend("Jessica");
        Max.addFriend("Timmy");
        
        //hasfriend true
        boolean hasfriendtrue = Max.hasFriend("James");
        System.out.println(hasfriendtrue);
        
        //hasfriend false
        boolean hasfriendfalse = Max.hasFriend("Hunter");
        System.out.println(hasfriendfalse);
        
       
        
    }

    
}
