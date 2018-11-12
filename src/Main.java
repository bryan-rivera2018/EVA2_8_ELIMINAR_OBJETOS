/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test test = new Test();
        Test copia = test;
        test.x = 100;
        System.out.println(test.x);
        System.out.println(test);
        System.out.println(copia);
        test = new Test();
        System.out.println("Señor slim, usted tiene : " + test.x);
        System.out.println(test);
        System.out.println(copia);
        test = null;
        System.out.println(test);
        System.out.println(copia);
        System.out.println("Pereme Sr. slim, tiene: " + copia.x);
    }
    
}
class Test{
    int x;
}
