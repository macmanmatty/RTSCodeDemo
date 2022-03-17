import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utilities {

    public  Map aboveBelow( List<Integer> numbers, int compareValue){
        int numberOfIntegersAboveCompareValue=0;
        int numberOfIntegersBelowCompareValue=0;
        int numberOfNullValues=0;
        Map values= new HashMap<String, Integer>();
        for( Integer integer : numbers){
            if(integer==null){
                numberOfNullValues++;
            }
           else if(integer>compareValue){
                numberOfIntegersAboveCompareValue++;
            }
            else{
                numberOfIntegersBelowCompareValue++;
            }
        }

        values.put("Number Of Null Values", numberOfNullValues);
        values.put("Number of Integers Above Compare Value", numberOfIntegersAboveCompareValue);
        values.put("Number of Integers Below Compare Value", numberOfIntegersBelowCompareValue);
        return  values;

    }

    public  String shiftString(String string , int amount){
        int length=string.length();
        char [] chars=string.toCharArray();
        char[] newChars= new char [length];
        int shift=amount%length;
        // if shift is negative we want to shift left instead of right so re calculate shift position
        if(shift<0){
            shift=length+shift;
        }
        int counter=0;
        int letterCounter=shift;
        // make new string
        while(counter<length){
            if(letterCounter>=length){
                letterCounter=0;
            }
            newChars[letterCounter]=chars[counter];
            counter++;
            letterCounter++;
        }

        return new String(newChars);
    }
}
