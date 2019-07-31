/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AboutPC;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author GoD
 */
public class Model4 {
    public String information(){
        RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
        String s  = "---------------------";
        Map<String, String> systemProperties = runtimeBean.getSystemProperties();
        Set<String> keys = systemProperties.keySet();
        for (String key : keys) {
            if(key.contains("sun.boot.class.path")){}
            else if(key.contains("java.library.path")){}
            else{
            String value = systemProperties.get(key);
            s += "\n"+ key+" - "+ value;
            }
        }
        return s;
        
    }
}
