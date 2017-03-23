/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;


public class IteratorExample {

   
    public static void main(String[] args) {
    
        List<String> myList = new ArrayList<>();
        
        myList.add("sandeep");
        myList.add("how");
        myList.add("are");
        myList.add("you ");
        myList.add(" from ");
        myList.add("you");
        
        Iterator it = myList.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
            
        }
    }
    
}
