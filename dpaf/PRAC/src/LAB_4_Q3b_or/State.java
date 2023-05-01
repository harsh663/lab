/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_4_Q3b_or;
import java.util.*;
/**
 *
 * @author user1
 */
public class State {
    private String stateName;
    Map<String, District> districts = new HashMap<>();

    public State(String stateName) {
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Map<String, District> getDistricts() {
        return districts;
    }
    
    public void addDistricts(){
        switch(this.getStateName()){
            case "Gujarat":
                //this.districts.put(stateName, new District("Ahmedabad East"));
                //this.districts.put(stateName, new District("Ahmedabad West"));
            default:
                break;
                
        }
    }
}
