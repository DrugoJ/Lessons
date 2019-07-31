/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrics;

import models.Ipad2;
import models.IphoneXS;
import models.SamsungA5;
import models.SamsungNote;
import phones.Apple;
import phones.Samsung;

/**
 *
 * @author user
 */
public class RussiaFactory implements MobileFactory{

    @Override
    public Samsung[] createSamsung() {
        Samsung[] samsung = {new SamsungNote(),new SamsungA5()};
        return samsung;
    }

    @Override
    public Apple[] createApple() {
        Apple[] apple = {new Ipad2(),new IphoneXS()};
        return apple;
        
    }
    
}
