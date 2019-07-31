/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadLocalRandomAndTimeUnit;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author GoD
 */
public class ThreadLocalRandomAndTimeUnit {
    public static void main(String[]args) throws InterruptedException{
        System.out.println(ThreadLocalRandom.current().nextInt(10));   
        System.out.println((TimeUnit.DAYS.toSeconds(14)));
    }
}
