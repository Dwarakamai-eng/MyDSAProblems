
import java.util.*;

class Main {
    public static void main(String[] args) {
      
  
     
    String str="hello my name is DWARAKA";
    String l=str.replaceAll("\\s","").toLowerCase();
   
    char[] ch=l.toCharArray();
    int start=0;
    int end=ch.length-1;
   // System.out.println(start+""+end);

    while(start<end){
       
         while("aeiou".indexOf(ch[start])==-1){
            start++;
        }
        while("aeiou".indexOf(ch[end])==-1){
            end--;
        }
        
        if(start<end){
        swap(ch,start,end);
        start++;
        end--;
        }
        
    }
    

    
System.out.println(new String(ch));
   
    }
     static void swap(char[] ch,int start,int end){
        char temp=ch[start];
        ch[start]=ch[end];
        ch[end]=temp;
       
    }
}

 
