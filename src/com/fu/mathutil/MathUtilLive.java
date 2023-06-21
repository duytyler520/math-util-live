
package com.fu.mathutil;

public class MathUtilLive {

    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("expected: 5! = 120; actual: " + result);
        //kĩ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về của hàm là gì
        
        //MathUtil.getFactorial(-5);
        
        System.out.println("expected: 6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("expected: 0! = 720; actual: " + MathUtil.getFactorial(0));
    }
    
}
