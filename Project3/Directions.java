//Imports for reading a file
import java.util.Scanner;
import java.io.FileInputStream;

//Imports for writing to a file
import java.io.PrintWriter;
import java.io.FileOutputStream;

//Imports for exceptions
import java.io.IOException;

public class Directions
{
    public static void main(String[] args) throws IOException
    {
        //Scanner for user input
        Scanner input = new Scanner(System.in);

        //Take input from usern for the file
        System.out.println("Please enter the name of the text file: ");
        String file_name = input.nextLine();

        //Read the file into the program
        FileInputStream file_input = new FileInputStream(file_name);

        //Scanner for file input 
        Scanner scan = new Scanner(file_input);
        String line_1 = scan.nextLine();

        //Split and parse the first line
        String[] line1 = line_1.split(" ");
        int iterations = Integer.parseInt(line1[0]);

        //Take user input for gas price
        System.out.println("What is the price per gallon of gas?");
        double gas_price = input.nextDouble();

        //Take user input for MPG
        System.out.println("What is your vehicle's fuel efficiency in miles per gallon?");
        double mpg = input.nextDouble();

        //Put the file into an array
        int num = 0;
        String[] lines = new String[iterations];

        //Loop through the file and add each line to the array one at a time
        while(num < iterations){
            String line = scan.nextLine();
            lines[num] = line;
            num += 1;
        }

        //Get mileage
        double mileage = 0;
        int stop = iterations - 2;
        for(int i = 0; i  < stop; i ++){
            String[] split_line = lines[i+1].split("\\ |\\(");
            String mile_element = split_line[split_line.length - 2];
            double parsed_line = Double.parseDouble(mile_element);
            mileage += parsed_line;

        }

        //Calculate gas cost and create outputs
        double mileage_by_mpg = (mileage*2)/mpg;
        double cost = mileage_by_mpg * gas_price;
        double rounded_cost = Math.round(cost * 100)/100.0;
        double round_trip = mileage * 2;
        double rounded_trip = Math.round(round_trip * 100)/100.0;
        String mileage_output = ("Your ") + rounded_trip + ("-mile round trip will cost about $") + rounded_cost + (".");

        //Get the reverse starting direction before the lines are flipped
        String location = lines[iterations-1];
        int cutoff = location.indexOf(" is");
        String new_starting_point = "Start at " + location.substring(0 ,cutoff);

        //Find arrival direction and create outputs
        String[] arrival = lines[2].split(" ");
        String direction = arrival[0];

        if(direction.equals("Left")){
            direction = "Left";
        }
        else if(direction.equals("Right")){
            direction = "Right";
        }

        //Reverse the lines
        int beginning = 0;
        int end = iterations;
        String blank;

        while(beginning < end){
            blank = lines[beginning];
            lines[beginning] = lines[end-1];
            lines[end-1] = blank;
            beginning+=1;
            end -=1;
        }

        //Switch right and left
        for(int i = 1; i < iterations; i++){
            lines[i] = lines[i].replace("Left", "L");
            lines[i] = lines[i].replace("Right", "R");

        }
        
        //Shift all directions downwards
        int numb = 1;
        int fall = iterations -2;
        
        while(numb < iterations){
            String d1 = lines[fall].substring(0,1);
            String d1R = lines[1].substring(0,1);
            lines[numb] = lines[numb].replace(d1R, d1);
            numb +=1;
            fall -=1;
            String first = lines[1].substring(0,1);

        }
        
        //Switch the first line which was skipped over in the previous loop
        lines[1] = lines[1].replace("L", "lholder");
        lines[1] = lines[1].replace("R", "rholder");
        lines[1] = lines[1].replace("lholder", "R");
        lines[1] = lines[1].replace("rholder", "L");
        
        //Write the output to a new file
        FileOutputStream output = new FileOutputStream("reverse_directions.txt");
        PrintWriter pw_output = new PrintWriter(output);

        String new_ending_point = "UMW is on the " + direction;
        pw_output.println(new_starting_point);

        for(int i = 1; i <= iterations -2; i++){
            pw_output.println(lines[i]);
        }

        pw_output.println(new_ending_point);

        pw_output.println(mileage_output);

        pw_output.flush();

        output.close();

    }
}