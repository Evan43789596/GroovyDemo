package com.eshare.example

import groovy.text.SimpleTemplateEngine
import groovy.text.StreamingTemplateEngine
import groovy.text.Template
import groovy.text.XmlTemplateEngine

/**
 * 模板示例
 * Created by liangyh on 2018/2/16.
 * Email:10856214@163.com
 */
class TempateDemo {

    static void main(String[] args){

        TempateDemo demo = new TempateDemo();
      //测试简单模板
        demo.testSimpleTemplate();
        //测试流式模板
        demo.testStreamTemplate();
        //测试xml模板
        demo.testXmlTemplate();
    }


    void testSimpleTemplate(){
        ClassLoader classLoader = getClass().getClassLoader();
        URL url = classLoader.getResource("simpleTemplate.template");
        def simpleTemplate = new File(url.getFile());
        def binding = ["content":"simple template demo"];
        def simpleEngine = new SimpleTemplateEngine();
        def response = simpleEngine.createTemplate(simpleTemplate).make(binding);
        println response;
    }


    void testStreamTemplate(){
        ClassLoader classLoader = getClass().getClassLoader();
        URL url = classLoader.getResource("StreamTemplate.template");
        def template = new File(url.getFile());
        def binding = ["className":"Test","field1":"name","field2":"age"];
        def engine = new StreamingTemplateEngine();
        def response =  engine.createTemplate(template).make(binding);
        println response;
    }

    void testXmlTemplate(){
        ClassLoader classLoader = getClass().getClassLoader();
        URL url = classLoader.getResource("xmlTemplate.template");
        def template = new File(url.getFile());
        def binding = ["StudentName":"Test","id":"1","subject":"数学"];
        def engine = new XmlTemplateEngine();
        def response = engine.createTemplate(template).make(binding);
        println response;
    }
}
