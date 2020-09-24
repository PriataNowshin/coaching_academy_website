/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

/**
 *
 * @author PRIATA
 */
public class website {
    
    public int total_mark(int mid_mark,int final_mark){
        return mid_mark + final_mark;
    }
    
    public String nameCheck(String name){
        String[] arr = name.split(" ");
        String firstName = "";
        String lastName = ""; 
        
        for(int i=0;i<arr.length;i++){
            firstName = arr[0];
            lastName = arr[1];
        }
        return firstName;
    }
    
    public int totalStudents(int puran, int  notun){
        return puran+notun;
    }
    
    public boolean idCheck(String id){
        if (id.startsWith("Batch")){
            return true;
        }
        return false;
    }
    
    
}
