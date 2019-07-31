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
public class Robot <T extends Head>/*Only classes what extends Head*/{
    private Body body;
    private T head;//FOR HEAD only Object's Class methods
    
    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }
    public <T1,T2 extends Head> T2 foo(T1 a,T2 b){ //return T2 value
        return b;
    }
    public void roo(Robot<?> ob){
        System.out.println("Return robot with some parameters");
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }
    
    
}
