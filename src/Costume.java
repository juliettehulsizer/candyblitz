public class Costume {
    int strength;
    int speed;
    int experience;
    int comfort;
    int style;
    int luck;
    int[] comfortstats = {1,3,2};
    int[] stylestats = {3,2,1};
    int[] luckstats = {2,1,3};
    // first column kim kardashian, second column cow, third column leprechaun
    public Costume(){
        System.out.println("Choose your costume!");
        for(int i = 0; i < 3; i++){
            if(i == 0){
                System.out.println("Kim Kardashian");
            }else if(i == 1){
                System.out.println("Cow");
            }else{
                System.out.println("Leprechaun");
            }
            System.out.println("Comfort: " + comfortstats[i]);
            System.out.println("Style: " + stylestats[i]);
            System.out.println("Luck: " + luckstats[i]);
            System.out.println(" ");
        }
    }
    public boolean choosecostume(String chosen){
        switch(chosen) {
            case "leprechaun":
                comfort = comfortstats[2];
                style = stylestats[2];
                luck = luckstats[2];
                break;

            case "cow":
                comfort = comfortstats[1];
                style = stylestats[1];
                luck = luckstats[1];
                break;

            case "kimkardashian":
                comfort = comfortstats[0];
                style = stylestats[0];
                luck = luckstats[0];
                break;

            default:
                System.out.println("Costume not found.");
                return false;
        }
        return true;
    }
}
