/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrics;

import phones.Apple;
import phones.Samsung;

/**
 *
 * @author user
 */
public interface MobileFactory {
    public Samsung[] createSamsung();
    public Apple [] createApple();
}
