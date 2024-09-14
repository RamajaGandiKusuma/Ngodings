/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MamaDwi.Baru;

/**
 *
 * @author RAMAJA
 */
public class Mangga extends Dikotil{
    
    public Mangga(int a, String b) {
        super(a, b);
        System.out.println("Tumbuhan Mangga");
        this.lapisaMangga();
        super.getbentukAkar();
        super.getjumlahBiji();
        super.daunMenyirip();
    }
    
    public void lapisaMangga(){
        System.out.println("Mangga memiliki tiga lapisan yaitu lapisan Eksokarp, Mesokarp dan Endokarp");
    }
}
