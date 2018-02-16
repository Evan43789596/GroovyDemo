package com.eshare.example

/**
 * 闭包示例
 * Created by liangyh on 2018/2/16.
 * Email:10856214@163.com
 */
class ClosureDemo {



    static void main(String[] args){
        def clos = {param -> "这是测试${param}"}
        println(clos.call("闭包"));
        def list = [1,32,55,56,12];
        list.each {println it};
        def map = ["name":"xiaogou","age":12,"edu":"本科"];
        map.each {println "${it.key}->${it.value}"}
    }
}
