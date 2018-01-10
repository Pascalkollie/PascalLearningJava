package com.company;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;

public class Main {

    private static final String FLOWERS_FEED = "http://services.hanselandpetal.com/feeds/flowers.xml";


     public static void main (String [] args){

         URL url = new URL(FLOWERS_FEED);
         InputStream stream = url.openStream();
         BufferedInputStream buf = new BufferedInputStream(stream);

         StringBuilder sb = new StringBuilder();

         while (true) {
             if (data == buf.read())
                 break;
         }  else {
             sb.append(Char)data);
         }

         System.out.println(sb);
     }

}