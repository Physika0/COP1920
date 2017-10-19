//********************************************************************************
// FIU PANTHERID: 5909334
// CLASS: COP 2210 – 2017
// ASSIGNMENT # 2
// DATE: 10/15/17
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************


package antfarmcaretaker;

import java.lang.Math;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author npabon11
 */
public class AntFarmCaretaker {

    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to the ant farm caretaker " 
                                                                  + "program!");
        
        String caretakerName = JOptionPane.showInputDialog("What is your "
                + "name?");
        
        String colonyName = JOptionPane.showInputDialog("What would you like "
                + "to name your colony?");
        
        String queenName = JOptionPane.showInputDialog("What would you like "
                + "to name your queen?");
        
        String startingSize = JOptionPane.showInputDialog("What's your starting"
                + " size?");        
        int startingSizeToInt = Integer.parseInt(startingSize);
        
        AntFarm antFarm = new AntFarm(queenName, colonyName, caretakerName, 
        startingSizeToInt);
        
        String daysFed = JOptionPane.showInputDialog("How many days would you "
                + "like to feed your ant farm?");
        int daysFedToInt = Integer.parseInt(daysFed);
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        
        int colonyExpanded = JOptionPane.showConfirmDialog(null, "Would you "
                + "like to add an additional module to expand your colony?", 
                "Expansion", dialogButton);
        if (colonyExpanded == JOptionPane.YES_OPTION){
            antFarm.expansion(true);
        }else{
            antFarm.expansion(false);
        }
        
        
        int breedQueen = JOptionPane.showConfirmDialog(null, "Would you like to"
                + " breed your queen?","Breeding", dialogButton);
        
        if(breedQueen == JOptionPane.YES_OPTION){
            String timesToBreed = JOptionPane.showInputDialog("How many times "
                    + "would you like to breed your queen?");
            int timesToBreedToInt = Integer.parseInt(timesToBreed);
            
            antFarm.feedAndBreed(daysFedToInt, timesToBreedToInt);
        }else{
            antFarm.feed(daysFedToInt);
        }       
        
        
        String queenAlive;
        String newQueenBorn;
        String didColonyExpand;
        
        if(antFarm.getQueenAlive() == true){
            queenAlive = "Yes";
        }else{
            queenAlive = "No";
        }
        
        if(antFarm.getNewQueen() == true){
            newQueenBorn = "Yes";
        }else{
            newQueenBorn = "No";
        }
        
        if(antFarm.getColonyExpanded() == true){
            didColonyExpand = "Yes";
        }else{
            didColonyExpand = "No";
        }
        
        String queenNameResult = "Queen Name: " + antFarm.getQueenName();
        String colonyNameResult = "Ant Colony Name: " + antFarm.getColonyName();
        String caretakerNameResult = "Caretaker Name: " + 
                antFarm.getCaretakerName();
        
        String startingSizeResult = "Starting Size: " + 
                Integer.toString(antFarm.getStartingSize());
        
        String daysFedResult = "Days Fed: " + 
                Integer.toString(antFarm.getDaysFed());
        
        String timesToBreedResult = "Requested times to breed: " + 
                Integer.toString(antFarm.getTimesToBreed());
        
        String timesBredResult = "Times successfully bred: " + 
                Integer.toString(antFarm.getTimesBred());
        
        String didColonyExpandResult = "Did the colony expand: " + 
                didColonyExpand;
        
        String queenAliveResult = "Original queen survived: " + queenAlive;
        String deathCountResult = "Number of ants dead: " + 
                Integer.toString(antFarm.getDeathCount());
        
        String newQueenBornResult = "New queen born: " + newQueenBorn;
        
        String newQueenNameResult = "New queen name: " + 
                antFarm.getNewQueenName();
        
        String finalSizeResults = "Final number of ants: " + 
                Integer.toString(antFarm.getFinalSize());
        
        String finalResults = queenNameResult 
                              + "\n" + colonyNameResult
                              + "\n" + caretakerNameResult 
                              + "\n" + startingSizeResult 
                              + "\n" + daysFedResult 
                              + "\n" + timesToBreedResult 
                              + "\n" + timesBredResult
                              + "\n" + didColonyExpandResult
                              + "\n" + queenAliveResult 
                              + "\n" + deathCountResult 
                              + "\n" + newQueenBornResult 
                              + "\n" + newQueenNameResult 
                              + "\n" + finalSizeResults;
        
        String finalResults2 = queenNameResult
                              + "\n" + colonyNameResult
                              + "\n" + caretakerNameResult
                              + "\n" + startingSizeResult
                              + "\n" + daysFedResult
                              + "\n" + timesToBreedResult
                              + "\n" + timesBredResult
                              + "\n" + didColonyExpandResult
                              + "\n" + queenAliveResult
                              + "\n" + deathCountResult
                              + "\n" + newQueenBornResult
                              + "\n" + finalSizeResults;
        
        if (antFarm.getNewQueen() == true){
            JOptionPane.showMessageDialog(null, finalResults);
            
        }else{
            JOptionPane.showMessageDialog(null, finalResults2);
        }
        
    }
    
}
