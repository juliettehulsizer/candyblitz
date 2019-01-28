public class House {
    String[] descriptions = {"A red brick, classic, suburban house. Warmly lit windows and a small TV on in the living room.", "A large, glass, modern house. Cold and dark, its uninviting.","A large, white, ranch style house. The porch is lit by candles but there are no lights on in the house.","A small, cozy wood house. Soft jazz music comes streaming out the open windows. The smell of fresh baked apple pie seems to be inviting you in, and asking you to stay a while.","a brown, poorly lit house sits on the corner. shingles are missing in places and the windows are cracked. it seems like no one has lived there in years","a tall town house sits on the corner. all the lights are on. the house is a bright blue, and some of the windows are open.","this house has gone all out. gingerbread decorated the entire exterior, and candy dots put the finishing touches. it’s like something out of a fairytale, but not the best one.","and suddenly... it’s your house! do you wanna go in? will they give you candy or tell you to keep going? what’s your choice?","a hut made of grass and dirt comes up. earthy and odd, it’s quite the unusual house." };
    int[] answeringArray = {4, -3, -1, 5, -4, 4, -2, 3, 0, 2};
    int[] friendlyArray = {0, -2, 0, 2, -2, 2, -2, 2, 0, 2};
    int[] neutralArray = {2, 0, 2, 0, 0, 0, 2, -2, 0, -2};
    int[] begArray = {-2, 2, -2, -2, 2, -2, 0, 0, 0, 0};
    int[] timeArray = {5, 8, 5, 18, 7, 5, 5, 5, 8};
    String description;
    int answer;
    int friendly;
    int beg;
    int neutral;
    int time;

    public House(){
        int houseChooser = (int) (Math.random() * 8.0);
        description = descriptions[houseChooser];
        friendly = friendlyArray[houseChooser];
        answer = answeringArray[houseChooser];
        neutral = neutralArray[houseChooser];
        beg = begArray[houseChooser];
        time = timeArray[houseChooser];
        System.out.println(description);
    }
}