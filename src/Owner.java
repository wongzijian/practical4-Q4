/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Owner {
    private String name;
    private String ic;

    public Owner(String name, String ic) {
        this.name = name;
        this.ic = ic;
    }
    
    @Override
    public String toString(){
      return String.format("%-15s %-15s", name, ic);
    }
}


