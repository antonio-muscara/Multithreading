/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hihello;

/**
 *
 * @author alessio.vampo
 */
public class Say extends Thread{
    String ciao;
    public Say (String ciao) {
        this.ciao=ciao;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Ciao);
            try{
                Thread.sleep(1000);
            }catch(Exception E){
            
            }
        }
    }
}
