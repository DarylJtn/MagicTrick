/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magictrick;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
/**
 *
 * @author Daryl
 */
public class MagicTrick {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here 
  FileInputStream fstream = new FileInputStream("C:/Users/Daryl/Desktop/A-small-attempt2.in");
DataInputStream in = new DataInputStream(fstream);
        BufferedReader br =  new BufferedReader(new InputStreamReader(in));
       PrintStream out = new PrintStream(new FileOutputStream("C:/Users/Daryl/Desktop/A-small-attempt2.out"));
System.setOut(out); 

     String line = br.readLine();
     int numCases = Integer.parseInt(line);
     
     String magicCard = null;
     String rowOne;
     String rowTwo;
     String rowThree;
     String rowFour;
     String[] row = new String[4];
     int rowLoc;
     int cardsFound;
     
     for(int c=0;c<numCases;c++){
         magicCard = null;
      cardsFound = 0;
         line = br.readLine();
   rowLoc = Integer.parseInt(line);
         
    for(int i=0;i<4;i++){
    row[i] = br.readLine();
    }
    
    
    
     String[] oCard = row[rowLoc -1].split("\\s+");     
    line = br.readLine();
   rowLoc = Integer.parseInt(line); 
    
   
   for(int i=0;i<4;i++){
    row[i] = br.readLine();
    }
        String[] nCard = row[rowLoc -1].split("\\s+");     
        
  
       
    for(int o=0;o<4;o++){
        
     for(int n=0;n<4;n++){   
       if(oCard[o] == null ? nCard[n] == null : oCard[o].equals(nCard[n])){
       magicCard = oCard[o];
        cardsFound++;
       }   
    }
    }
    
    
  if(cardsFound==1){
       System.out.println("Case #"+(c+1)+": "+ magicCard);
      }
  else if(cardsFound>1){
             System.out.println("Case #"+(c+1)+": Bad magician!");

  }else if (cardsFound==0){
  System.out.println("Case #"+(c+1)+": Volunteer cheated!");
  }
  else{
  
  System.out.println("ERROR");
  }
  
 
  
   /*
    *if row[rowLoc -1] contains oCard[0 1 2 3] 
    * 
    * 
    */
         
    }
       out.close();

     
    }
}
