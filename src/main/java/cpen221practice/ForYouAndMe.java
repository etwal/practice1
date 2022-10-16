package cpen221practice;

public class ForYouAndMe {
    public String youandme(String name) {

        if(name == null){
            name = "you";
        }

        String oneFor = "One for " + name + ", one for me.";

        return oneFor;
    }
}
