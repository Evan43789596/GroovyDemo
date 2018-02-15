package com.eshare.example

/**
 * Created by liangyh on 2018/2/15.
 * Email:10856214@163.com
 */
class MethodDemo {

    /**
     *
     <pre>默认参数。 如果没有值传递给参数的方法，则使用缺省值。
     如果使用非默认和默认参数，则必须注意，默认参数应在参数列表的末尾定义。
     </pre>
     */
    static void main(String[] args){
        sum(1,2);
        sum(1);
    }

    static void sum(a,b=1){
        int c = a+b;
        println(c);
    }
}
