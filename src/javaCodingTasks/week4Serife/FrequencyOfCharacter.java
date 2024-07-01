package javaCodingTasks.week4Serife;

import jdk.jfr.Frequency;

import javax.xml.stream.events.Characters;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter {
    //String -- Frequency of Characters
    //Write a return method that can find the frequency of characters
    //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    public static void main(String[] args) {
        String str ="AAABBCDD";
        str = str.toUpperCase();
        Map<Character, Integer> map = new HashMap<Character,Integer>();

       for (char ch : str.toCharArray()){
           if(map.get(ch) == null){
               map.put(ch, 1);
           }else{
               map.put(ch,map.get(ch)+ 1);
           }
       }
       map.forEach((key,value) ->{
           System.out.print( key  +""+value);
       });
    }

}
