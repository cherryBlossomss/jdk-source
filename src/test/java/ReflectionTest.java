package com.auch.test;


import java.lang.*;
import java.lang.Class;
import java.lang.ClassNotFoundException;
import java.lang.IllegalAccessException;
import java.lang.Object;
import java.lang.String;

/**
 * <p></p>
 *
 * @author luohuiqi
 * @date 2023/6/6 14:31
 */

public class ReflectionTest {

    public static void main(String[] args) throws java.lang.InstantiationException, IllegalAccessException, ClassNotFoundException {
        Class<?> userClass = Class.forName("com.auch.test.pojo.Human");
        Object o = userClass.newInstance();

//        System.out.println("实例化o:" + o);

//        Object o1 = userClass.newInstance();
//        System.out.println("实例化o:" + o1);


    }


}
