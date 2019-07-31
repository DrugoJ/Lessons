/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrics;

import models.Iphone6S;
import models.IphoneX;
import models.SamsungS6;
import models.SamsungS7;
import phones.Apple;
import phones.Samsung;

/**
 *
 * @author user
 */
public class UsaFactory implements MobileFactory{

    @Override
    public Samsung[] createSamsung() {
        Samsung[] samsung = {new SamsungS7(),new SamsungS6()};
        return samsung;
    }

    @Override
    public Apple[] createApple() {
        Apple[] apple = {new IphoneX(),new Iphone6S()};
        return apple;
    }
    
}
