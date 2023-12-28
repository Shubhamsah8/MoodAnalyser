package org.example;
import java.util.regex.*;

public class MoodAnalyser {

    private String message;
    public MoodAnalyser(){
        //Default Constructor
    }

    public MoodAnalyser(String message){
        this.message = message;
    }

    public class MoodAnalysisException extends Exception{
        public MoodAnalysisException(String message){
            super(message);
        }
    }

    public String analyseMood() throws MoodAnalysisException{
        try{
            if(message.contains("Sad")){
                return "SAD";
            }
            else if(message.contains("Happy")){
                return "HAPPY";
            }
            else if(message.isEmpty()){
                return "EMPTY";
            }
            else{
                return "NEUTRAL";
            }
        }
        catch (NullPointerException e){
            throw new MoodAnalysisException("NULL");
        }
    }
}

