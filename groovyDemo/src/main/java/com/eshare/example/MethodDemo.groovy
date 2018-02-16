package com.eshare.example

/**
 * 方法示例
 * Created by liangyh on 2018/2/15.
 * Email:10856214@163.com
 */
class MethodDemo {

    int age=1 ;

    String name ="abc" ;

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }

    /**
     *
     <pre>默认参数。 如果没有值传递给参数的方法，则使用缺省值。
     如果使用非默认和默认参数，则必须注意，默认参数应在参数列表的末尾定义。
     </pre>
     */
    static void main(String[] args){
        sum(1,2);
        sum(1);

        MethodDemo demo = new MethodDemo();
        println(demo.getAge());
        println(demo.getName());
    }

    static void sum(a,b=1){
        int c = a+b;
        println(c);
    }
}
