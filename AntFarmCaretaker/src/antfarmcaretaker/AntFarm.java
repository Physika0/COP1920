/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antfarmcaretaker;

import java.lang.Math;
import java.util.Random;

/**
 *
 * @author npabon11
 */
public class AntFarm {
    Random r = new Random();
    
    private String queenName;
    private String colonyName;
    private String caretakerName;
    private int startingSize;
    
    private int finalSize = 0;
    private int deathCount = 0;
    private int daysFed = 0;
    private int timesToBreed = 0;
    private int timesBred = 0;
    private boolean queenAlive = true;
    private boolean newQueen = false;
    private boolean colonyExpanded = false;
    private String newQueenName = "queen2.0";
    private int newQueenProbability = r.nextInt(1);
    
    public AntFarm(String setQueenName, String setColonyName,
                   String setCaretakerName, int setStartingSize){
        
        queenName = setQueenName;
        colonyName = setColonyName;
        caretakerName = setCaretakerName;
        startingSize = setStartingSize;
    }
    
    public String getQueenName(){
        return queenName;
    }
    
    public String getColonyName(){
        return colonyName;
    }
    
    public String getCaretakerName(){
        return caretakerName;
    }
    
    public int getStartingSize(){
        return startingSize;
    }
    
    public int getDaysFed(){
        return daysFed;
    }
    
    public int getTimesToBreed(){
        return timesToBreed;
    }
    
    public int getTimesBred(){
        return timesBred;
    }
    
    public boolean getQueenAlive(){
        return queenAlive;
    }
    
    public int getDeathCount(){
        return deathCount;
    }
    
    public boolean getNewQueen(){
        return newQueen;
    }
    
    public String getNewQueenName(){
        return newQueenName;
    }
    
    public boolean getColonyExpanded(){
        return colonyExpanded;
    }
    
    public int getFinalSize(){
        return finalSize;
    }
    
    public void feedAndBreed(int daysToFeed, int setTimesToBreed){
        daysFed = daysToFeed;
        timesToBreed = setTimesToBreed;
        if (daysFed > 10){
            queenAlive = false;
            breed(timesToBreed);
            deathCount = finalSize / 2;
            finalSize = finalSize / 2;            
            newQueenName = queenName + "2.0";
        }else{
            breed(timesToBreed);
        }
    }
    
    public void feed(int daysToFeed){
        daysFed = daysToFeed;
        if (daysFed > 10){
            queenAlive = false;
            deathCount = finalSize / 2;
            finalSize = finalSize / 2;
            newQueenName = queenName + "2.0";
        }else{
            finalSize = startingSize;
        }
    }
    
    public void breed(int setTimesToBreed){
        timesToBreed = setTimesToBreed;
        if (timesToBreed <= daysFed && queenAlive == true){
            finalSize = startingSize * (int) Math.pow(3, timesToBreed);
            timesBred = timesToBreed;
            System.out.println("first");
            System.out.println(queenAlive);
//        }else{            
//            timesBred = daysFed;
//            finalSize = startingSize * (int) Math.pow(3, daysFed);
//        }        
        }else if (timesToBreed <= daysFed && newQueen == true && daysFed > 10){
            finalSize = startingSize * (int) Math.pow(3, timesToBreed);
            timesBred = timesToBreed;
            System.out.println("second");
        }else if (timesToBreed <= daysFed && newQueen == false && daysFed > 10){
            timesBred = 10;
            finalSize = startingSize * (int) Math.pow(3, timesBred);
            System.out.println("third");    
        }
    }
    
    public void expansion(boolean expandColony){
        if (expandColony == true){
            colonyExpanded = true;
            newQueenProbability = r.nextInt(2);
                if (newQueenProbability == 0){
                    newQueen = true;
                    newQueenName = queenName + "2.0";
                }
        }else{
            newQueenProbability = r.nextInt(10);
                if (newQueenProbability == 0){
                    newQueen = true;
                    newQueenName = queenName + "2.0";
                }
            colonyExpanded = false;
        }   
    }
}

    
