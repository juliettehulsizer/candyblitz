import java.util.Scanner;
//make intro and study
public class candyblitz{
    //making neighborhood probabilities universal
    static int answer;
    static int candy;
    public static void main(String args[]) {
        System.out.println("Welcome to candyblitz! This is a choose your own adventure game! The goal is to get as much candy as possible before time runs out. Let's begin!");
        //Add instructions to game or any intro you want
        Costume costume = new Costume();
        Scanner sc = new Scanner(System.in);
        String input = sterile(sc.nextLine());
        if(costume.choosecostume(input) == false){
            main(new String[]{});
        }else{
            chooseNeighborhood(sc);
            gameLoop();
        }
    }

    public static void chooseNeighborhood(Scanner sc){
        System.out.println("Which neighborhood would you like to Trick or Treat in? East or West? You get more candy in East and You get more answers in West.");
        String input = sterile(sc.nextLine());
        if(input.equals("east")){
            answer = 60;
            candy = 40;
        }else if(input.equals("west")){
            answer = 40;
            candy = 60;
        }else{
            System.out.println("You are stupid. Pick a valid direction!");
            chooseNeighborhood(sc);
        }
    }

    public static String sterile(String input){
        return input.toLowerCase().replaceAll(" ","");
    }

    public static void gameLoop(){
        int time = 0;
        while(time < 60){
            House chosenHome = new House();
            time += newHouse(chosenHome);
        }
    }


    public static int newHouse(House chosenHome){
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to go up to the house and ring the doorbell?");
        String input = sterile(sc.nextLine());
        if(input.equals("yes")){
            System.out.println("*ding dong*");
            double answerDoor = Math.random() * 100.0 + 1;
            if(answerDoor > answer){
                System.out.println("Happy Halloween!");
                System.out.println("Do you want to be friendly, neutral or beg for candy?");
                input = sterile(sc.nextLine());
                switch(input){
                    case "friendly":

                        break;
                    case "neutral":

                        break;
                    case "beg":

                        break;
                    default:

                        break;
                }

            }else{
                return chosenHome.time/2;
            }

        }else if(input.equals("no")){
            return 0;
        }else{
            System.out.println("You are stupid. Choose!");
            return newHouse(chosenHome);
        }

    }
}
//A large, white, ranch style house. The porch is lit by candles but there are no lights on in the house.
//
//A small, cozy wood house. Soft jazz music comes streaming out the open windows. The smell of fresh baked apple pie seems to be inviting you in, and asking you to stay a while.
//
//a brown, poorly lit house sits on the corner. shingles are missing in places and the windows are cracked. it seems like no one has lived there in years.
//
//a tall town house sits on the corner. all the lights are on. the house is a bright blue, and some of the windows are open.
//
//a glooming, stone, fortress house. it seems to be covered in dark shadows. a tall grey gate sits in front, threatening all who dare to venture in.
//
//this house has gone all out. gingerbread decorated the entire exterior, and candy dots put the finishing touches. it’s like something out of a fairytale, but not the best one.
//
//and suddenly... it’s your house! do you wanna go in? will they give you candy or tell you to keep going? what’s your choice?
//
//a hut made of grass and dirt comes up. earthy and odd, it’s quite the unusual house.

