/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GoD
 */
public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) throws pException {
        if(side<=0){
            throw new pException("Side is incorrect");
        }
        this.side = side;
    }
}
