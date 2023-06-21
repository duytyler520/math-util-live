
package com.fu.mathutil;

//Ta viết class để cung cấp tiện ích cho nơi khác dùng
//Hàm static
public class MathUtil {
    
    //n! = 1.2.3.n!
    //0! = 1! = 1
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! lố kiểu long
    //ko có giai thừa âm -> exception
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument! (0 <= n <= 20)");        
        //hàm dừng liền ko cần return
        
        if (n == 0 || n == 1)
            return 1;
        
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
