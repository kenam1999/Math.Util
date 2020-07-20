/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nam.util;

/**
 *
 * @author Namng
 */
//đây là class chứa các hàm toán học ta tự viêt, mục đích là công cụ dùng chung
//Cái ào xày chung cho mọi nơi thì dùng kĩ thuật static
public class MathUtil {

    //tính n!= 1 . 2 . 3. 4....n n! tăng rát nhanh vì n! sẽ tràng int rất nhanh, nên dùng long
    //tính tối đa đến 15!  
    public static long computeFactorial(int n) {
        
        //Nếu người dùng đưa cad chớn ta ném ra Exception
        if(n < 0 || n > 15)
            throw new IllegalArgumentException("Invalid argument. n must >= 0 & n <= 15");
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    

}
