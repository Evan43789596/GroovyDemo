package com.eshare.example

/**
 * 特性示例
 * Created by liangyh on 2018/2/16.
 * Email:10856214@163.com
 */
class TraitDemo {

     trait Animals {

         void eat(){
             println("吃东西");
         }
     }

    interface Cats extends Animals{

        void run();
    }


    static class Tiger implements Cats,Animals{

        @Override
        void run() {
            println("快速奔跑");
        }
    }

    static void main(String[] args){
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
    }

}
