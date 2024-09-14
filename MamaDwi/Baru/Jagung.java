/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MamaDwi.Baru;

/**
 *
 * @author RAMAJA
 */
public class Jagung extends Monokotil {
    public Jagung(int a, String b){
        super(a,b);
        System.out.println("Tumbuhan Jagung");
        this.batangJagung();
        this.suteraJagung();
        super.daunPita();
        super.getbentukAkar();
        super.getjumlahBiji();
    }
    
    public void batangJagung(){
        System.out.println("Batang Jagung tidak Berkayu");
    }
    
    public void suteraJagung(){
        System.out.println("Jagung memiliki benang - benang halus");
    }
}
