package BigDecimal;

import java.math.BigDecimal;

//两种构造
//BigDecimal(double val) 参数为double
// BigDecimal(String val) 参数为String
//5钟方法
//         / public BigDecimal add(另一个BigDecimal对象)                  | 加法 |
//        | public BigDecimal subtract (另一个BigDecimal对象)            | 减法 |
//        | public BigDecimal multiply (另一个BigDecimal对象)            | 乘法 |
//        | public BigDecimal divide (另一个BigDecimal对象)              | 除法 |
//        | public BigDecimal divide (另一个BigDecimal对象，精确几位，舍入模式) | 除法 |

public class BigDecimalMethod {
    public static void main(String[] args) {
        BigDecimal bd0=new BigDecimal(44);
        System.out.println(bd0);
        BigDecimal bd1=new BigDecimal("25");
        BigDecimal bd2=new BigDecimal("74");
        System.out.println(bd1);
        System.out.println(bd2);
        BigDecimal add = bd1.add(bd2);
        System.out.println("add="+add);
        BigDecimal subtract = bd1.subtract(bd2);
        System.out.println("substract="+subtract);
        BigDecimal multiply = bd1.multiply(bd2);
        System.out.println("multiply="+multiply);
        BigDecimal divide = bd1.divide(bd2,5,BigDecimal.ROUND_HALF_UP);
        System.out.println("divide="+divide);
    }
}
