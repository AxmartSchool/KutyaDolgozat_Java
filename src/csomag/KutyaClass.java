/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csomag;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Axmart
 */
public class KutyaClass {
    
    private String fajta;
    private String nem;
    private int eletkor;
    private String Nev;

    public KutyaClass(String fajta, String nem, int eletkor, String Nev) {
        this.fajta = fajta;
        this.nem = nem;
        this.eletkor = eletkor;
        this.Nev = Nev;
    }

    public String getFajta() {
        return fajta;
    }

    public String getNem() {
        return nem;
    }

    public int getEletkor() {
        return eletkor;
    }

    public String getNev() {
        return Nev;
    }
    
    
    
    
      public static ArrayList<KutyaClass> Beolvasas() throws IOException{
        
        ArrayList<KutyaClass> outputList = new ArrayList<>();
        
         System.setProperty("file.encoding", "UTF-8");
        BufferedReader fileReader = new BufferedReader(new FileReader("kutyak.txt"));
        
        String sor;
        
        String[] tempTomb;
        
        while((sor =fileReader.readLine())!= null){
            
            tempTomb = sor.split(";");
            outputList.add(new KutyaClass(tempTomb[0], tempTomb[1],Integer.parseInt(tempTomb[2]), tempTomb[3]));
            
        }
        
        fileReader.close();
        
        return outputList;
        
        
        
    }
    
}
