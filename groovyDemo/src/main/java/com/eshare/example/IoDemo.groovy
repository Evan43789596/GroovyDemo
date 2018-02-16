package com.eshare.example

/**
 *  IO示例
 * Created by liangyh on 2018/2/15.
 * Email:10856214@163.com
 */
class IoDemo {

    static void main(String[] args) {
        IoDemo demo = new IoDemo();
        //写文件
        demo.write();
        //读文件
        demo.read();
        //复制文件
        demo.copy();
        //删除文件
        demo.delete();
    }

    void delete() {
        ClassLoader classLoader = getClass().getClassLoader();
        URL url = classLoader.getResource("test.txt");
        new File(url.getFile()).delete();
    }

    public void write() {
        ClassLoader classLoader = getClass().getClassLoader();
        URL url = classLoader.getResource("test.txt");
        new File(url.getFile()).withWriter("UTF-8") {
            writer -> writer.writeLine 'Hello World'
        }

    }

    public void read(){
        ClassLoader classLoader = getClass().getClassLoader();
        URL url = classLoader.getResource("test.txt");
        new File(url.getFile()).eachLine{
            line -> println("line : $line");
        }
    }

    public void copy(){
        ClassLoader classLoader = getClass().getClassLoader();
        URL url = classLoader.getResource("test.txt");
        def dist = new File("test1.txt");
        dist << new File(url.getFile()).text;

    }

}
