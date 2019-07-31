/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcommandline;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author GoD
 */
public class JCommandLine {
//http://allmbs.ru/cmd-01.html
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        KeyLogger keylog = new KeyLogger();
        Commands com = new Commands();
        Scanner sc = new Scanner(System.in);
        System.out.println("Добро пожаловать, сейчас вы находитесь в Java Command Line");
        System.out.println("Для ознакомления с командами напишите /help");
        for(;;){
        String name = sc.nextLine();
        switch(name){
            case "/help":
                System.out.println("list (View directories and files)");
                System.out.println("open (Open Files)");
                System.out.println("ip (View your ip-address)");
                System.out.println("mac (View your mac-address)");
                System.out.println("shutdown (Shutdown your PC)");
                System.out.println("restart (Restart your pc)");
                System.out.println("cancel (Cancel Restart or Shutdown)");
                System.out.println("clean (Lower the programm's script)");
                System.out.println("arp (Show you all ip Address in our local Network)");
                System.out.println("port (Show your open ports)");
                System.out.println("date (Show now date)"); 
                System.out.println("keylog (For example open browser and write there something and after that open JCmd again)");
                System.out.println("exit (Close the programm)");
                break;
            case "open":
                com.open();
                break;
            case "list":
                System.out.println("Write the directory");
                System.out.println("Example - C:\\Program Files (x86)\\Internet Explorer");
                String dir = sc.nextLine();
                File currentDir = new File(dir);
                com.viewDirCont(currentDir);
                break;
            case "exit":
                System.exit(0);
                break;
            case "ip":
                com.ipconfig();
                break;
            case "mac":
                com.macconfig();
                break;
            case "shutdown":
                com.shutdown();
                break;
            case "restart":
                com.restart();
                break;
            case "cancel":
                com.cancel();
                break;
            case "clean":
                com.clean();
                break;
            case "arp":
                com.arp();
                break;
            case "port":
                com.port();
                break;
            case "date":
                com.date();
                break;
            case "keylog":
                keylog.main();
                break;
            default:
                System.out.println("Bad command");
                break;
            }
        }
    }
}
