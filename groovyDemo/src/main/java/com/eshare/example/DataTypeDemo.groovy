package com.eshare.example

import com.sun.javaws.Main

/**
 * Created by liangyh on 2018/2/15.
 * Email:10856214@163.com
 */
class DataTypeDemo {

    /**byte -这是用来表示字节值。例如2。

    short -这是用来表示一个短整型。例如10。

    int -这是用来表示整数。例如1234。

    long -这是用来表示一个长整型。例如10000090。

    float -这是用来表示32位浮点数。例如12.34。

    double -这是用来表示64位浮点数，这些数字是有时可能需要的更长的十进制数表示。例如12.3456565。

    char -这定义了单个字符文字。例如“A”。

    Boolean -这表示一个布尔值，可以是true或false。

    String -这些是以字符串的形式表示的文本。例如，“Hello World”的
    java.lang.Byte
    java.lang.Short
    java.lang.Integer
    java.lang.Long
    java.lang.Float
    java.lang.Double
    java.math.BigInteger
    java.math.BigDecimal*/
    static void main(String[] args){
        int x = 1;
        long y = 1024L;
        float z = 1.0f;
        char c = 'A';
        boolean flag = true;
        BigInteger bi = 30;
        BigDecimal bd = 30.24354;
        def range = 1..10;

        println(x);
        println(y);
        println(z);
        println(z);
        println(c);
        println(flag);
        println(bi)
        println(bd);
        println(range);
    }
}
