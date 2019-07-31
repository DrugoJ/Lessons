
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.*;

public class Serializator {

    public boolean Serialization(Cat cat) {
        boolean flag = false;
        File file = new File("C:/s/cat.data");
        ObjectOutputStream oos = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            if (fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(cat);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    public Cat deserialization() throws InvalidObjectException {
        File file = new File("C:/s/cat.data");
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            if (fis != null) {
                ois = new ObjectInputStream(fis);
                Cat cat = (Cat) ois.readObject();
                return cat;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        throw new InvalidObjectException("InvalidObjectException");
    }
}
