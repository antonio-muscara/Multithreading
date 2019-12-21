/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provathread;

/**
 *
 * @author vampo.alessio
 */
public class ProvaThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hi saluto = new Hi();
        Hello saluto2 = new Hello();
        saluto2.start();
        saluto.start();
    }

}
