
package randomarray;

import java.util.Random;
public class RandomArray {

    
    public static void main(String[] args) {
        Random rand = new Random();
        int freq[]= new int [7];
        int element;
        
        for(element=1;element<=100;element++){
            ++freq[1+rand.nextInt(6)];
        }
        System.out.println("Index\tFrequency");
        
        for(int index=1;index<freq.length;index++){
            System.out.println(index+"\t"+freq[index]);
        }
    }
    
}
