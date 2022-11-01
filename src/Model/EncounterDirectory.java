/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author aniruddha
 */
public class EncounterDirectory {
      private ArrayList<Encounter> encounterRegister;
    public EncounterDirectory() {
    this.encounterRegister = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterRegister() {
        return encounterRegister;
    }

    public void setEncounterRegister(ArrayList<Encounter> encounterRegister) {
        this.encounterRegister = encounterRegister;
    }
    public Encounter addNewEncounter() {
    Encounter encounter = new Encounter();
    encounterRegister.add(encounter);
    return encounter;
   
    }
}
