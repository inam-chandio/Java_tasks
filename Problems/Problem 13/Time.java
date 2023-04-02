import java.util.Scanner;

	public class Time {
    Scanner sc = new Scanner(System.in);
    public void Mintues() {
            Scanner input = new Scanner(System.in);
        System.out.print("Enter  seconds: ");
        int  seconds = input.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;

        if (seconds <10 && minutes<10 && hours<10)
            {
                System.out.println ("0" + hours + " : " + "0" + minutes + " : " + "0"+seconds);
            }
            else if (minutes == 0 && hours<10 &&  seconds<10)
            {
                System.out.println ("0" + hours + " : " + "00" + " : " + seconds);

            }
            else if (hours == 0 && minutes<10 && seconds<10)
            {
                System.out.println ("00" +" : " + "0" + minutes + " : " + "0" +seconds);

            }

        else {
            System.out.println( hours+" : "+   minutes+" : "+ seconds);
        }
        }
        public static void main (String []args){


            Time t = new Time();
            t.Mintues();

        }}