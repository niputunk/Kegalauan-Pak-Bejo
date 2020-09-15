/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keramikpakbejo;

/**
 *
 * @author niputunk
 */
public class Keramik01 {
/* atribut */
/* satuan dalam cm */

int luasTanah;
int luasKeramik; 
int box;
int harga;

/* methods */
void jumlahKeramik(){
    keramik = this.luasTanah / this.luasKeramik;
    System.out.println("Jumlah keramik: "+keramik+ "pcs");
}
void jumlahBox(){
    jbox = (this.luasTanah / this.luasKeramik) / this.box;
    System.out.println("Jumlah box: "+jbox+ "box");                
}
void bayar(){
    bayar = ((this.luasTanah / this.luasKeramik) / this.box ) * this.harga;
    System.out.println("yang harus dibayarkan: Rp "+bayar);
    }
}