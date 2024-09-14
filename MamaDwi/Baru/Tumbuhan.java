/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MamaDwi.Baru;

/**
 *
 * @author RAMAJA
 */
public class Tumbuhan {
    private int jumlahBiji;
    private String bentukAkar;
    
    public Tumbuhan(int a, String b){
        this.setBiji(a);
        this.setbentukAkar(b);
    }
    
    public void setBiji(int biji){
        this.jumlahBiji=biji;
    }
    
    public int getjumlahBiji(){
        System.out.println("Jumlah Biji : "+jumlahBiji);
        return jumlahBiji;
    }
    
    public void setbentukAkar(String Akar){
        this.bentukAkar=Akar;
    }
    
    public String getbentukAkar(){
        System.out.println("Bentuk Akar : "+bentukAkar);
        return bentukAkar;
    }
}
