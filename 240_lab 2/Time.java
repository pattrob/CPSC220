public class Time {
    //instance variables
    private int hours;
    private int minutes;
    private int seconds;

    //default constructor
    public Time() {
        this.hours = 24;
        this.minutes = 00;
        this.seconds = 00;
    }

    //non default constructor
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    //increment method
    int mins = 0;
    int remaining_mins = 0;

    public void increment(int s) {
        mins = s / 60;
        remaining_mins = mins - 60;
        if (hours < 24) {
            int num = s;
            int counter = 0;
            while(num > 0){
                num --;
                if(num % 60 == 0){
                    counter +=1;
                }
            }
            minutes += counter;

            while(minutes > 0){
                minutes--;
                if(minutes % 60 == 0){
                    hours+=1;
                }
            }


        } else if (hours >= 24) {
            if (mins >= 60) {
                hours = 1;
                minutes = remaining_mins;
            }
        }
    }
    //method to convert military to regular time
    public String toStringStandard() {
        String ampm;
        String hr;
        if (hours > 12) {
            hr = "" + (hours - 12);
            ampm = "PM";
        } else if (hours == 12) {
            hr = "12";
            ampm = "PM";
        } else if (hours > 0) {
            hr = "" + hours;
            ampm = "AM";
        } else { // hour == 0
            hr = "12";
            ampm = "AM";
        }
        return hr + ":" + minutes + ":" + seconds + ":" + ampm;
    }


    //print method
    public void print(boolean military) {
        if (military == true) {
             System.out.println(hours + ":" + minutes + ":" + seconds);

        } else {
            System.out.println(toStringStandard());
        }

    }
}