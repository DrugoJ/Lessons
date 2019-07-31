/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

/**
 *
 * @author GoD
 */
public class Generic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Body body = new Body();
        Leg leg = new Leg();
        SmallHead smHead = new SmallHead();
        MediumHead mdHead = new MediumHead();
        BigHead bgHead = new BigHead();
        Robot <SmallHead> robot = new Robot<>(body,smHead);
        Robot <MediumHead> robot2 = new Robot <>(body,mdHead);
        Robot <BigHead> robot3 = new Robot <>(body,bgHead);
        robot.getHead().burn();
        robot2.getHead().eat();
        robot3.getHead().drink();
        robot.<SmallHead,MediumHead>foo(smHead, mdHead);
        Robot <MediumHead> robot5 = new Robot<>(body,mdHead); 
        Robot <SmallHead> robot6 = new Robot(body,smHead);
        robot5.roo(robot6);
        
    }
}
