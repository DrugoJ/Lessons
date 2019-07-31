/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcommandline;
import java.util.Scanner;
import java.net.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author GoD
 */
public class Commands  {
    //
    Scanner sc = new Scanner (System.in);
    Runtime rt = Runtime.getRuntime();
    Process proc;
    public void open()throws Exception{
        System.out.println("Write the file's directory");
        System.out.println("Example - C:\\Program Files (x86)\\Internet Explorer\\iexplore");
        try{
            String way = sc.nextLine();
            proc = rt.exec(way);
        }
        catch(IOException e){
                System.out.println(e);
        }
    }
  
    //
    
    public void viewDirCont(File dir) {
    String[] children = dir.list();    
    if (children == null) {
        System.out.println("does not exist or is not a directory");} 
    else {
        for (int i = 0; i < children.length; i++) {
            String filename = children[i];
            if(filename.contains(".")){
                System.out.println(filename+" - file");
            }
            else{
                System.out.println(filename+" - folder");
            }
        }
    }
}
    
    //
    
    public void ipconfig() throws UnknownHostException, IOException {
        InetAddress IP = InetAddress.getLocalHost();
        System.out.println("Private Ip Address - "+IP.toString());
        //////////////////////////////
        URL whatismyip = new URL("http://checkip.amazonaws.com");
        BufferedReader in = new BufferedReader(new InputStreamReader(
        whatismyip.openStream()));
        String ip = in.readLine(); //you get the IP as a String
        System.out.println("Public IP Address - "+ip);
    }
    
    //
    
    public void macconfig ()throws SocketException, UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        NetworkInterface network = NetworkInterface.getByInetAddress(ip);
        byte[] mac = network.getHardwareAddress();
        System.out.print("Current MAC address : ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));        
        }
        System.out.println(sb.toString());  
    }
    
    //
    
    public void shutdown() throws IOException{
        String [] commands = {"shutdown","-s"};
        proc = rt.exec(commands);
        }
    
    //
    
    public void restart () throws IOException{
        String [] commands = {"shutdown","-r"};
        proc = rt.exec(commands);
    }
    
    //
    
    public void cancel () throws IOException{
        String [] commands = {"shutdown","-a"};
        proc = rt.exec(commands);
    }
    
    //
    
    public void clean (){
       for(int i = 0;i<100;i++){
           System.out.println();
       }
    }
    
    //
    
    public void arp ()throws IOException{
        //https://www.quora.com/How-do-I-get-IP-Address-of-all-computers-in-a-network-using-java
    ProcessBuilder pb = new ProcessBuilder("arpe.bat");  
    pb.redirectErrorStream();                          
    Process p = pb.start();				
    BufferedReader br = new BufferedReader (new InputStreamReader(p.getInputStream()));
    String out="";                                              		    	     
    while(true)
    {
        String l=null;
        try {
                l = br.readLine();
        } 
        catch (IOException ex) {}
        if(l==null)
                break;
        out+="\n"+l;
    }
    Pattern pattern = 
    Pattern.compile(".*\\b\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\b"); 
    Matcher match = pattern.matcher(out);			
    out="";
    String prev="",pLoc;
    if(!(match.find()))        // In case no IP address Found in out
            out="No IP found!";
    else
    {
        //pLoc = match.group();  
        out=/*pLoc+*/"\nOther Hosts'(In Same Network) IP addresses without our:\n";
        while(match.find()){
                pLoc = match.group();
                out+=pLoc+"\n";
        }
        try {
                br.close();
        } 
        catch (IOException ex) {}
        }
    System.out.print(out);
    }
    
    //
    
    public void port (){
        //https://www.javacodex.com/Networking/Port-Scanner
        System.out.println("Write the first point");
        int first = sc.nextInt();
        System.out.println("Write the second point");
        int second = sc.nextInt();
    for (int port = first; port <= second; port++) {
         try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("localhost", port), 1);
            socket.close();
            System.out.println("Port " + port + " is open");
        } catch (Exception ex) {
            System.out.println("Port " + port + " is not open");
        }
      }
    }
    
    //
    
    public void date(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
    
    //
    
    /* public void openTime(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

    }*/
    
    //
    
    
}
