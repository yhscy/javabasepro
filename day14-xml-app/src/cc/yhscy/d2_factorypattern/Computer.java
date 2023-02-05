package cc.yhscy.d2_factorypattern;

import org.jcp.xml.dsig.internal.dom.DOMUtils;

import javax.print.DocFlavor;

/**
 * Created by yhsec on 2023/2/4 10:16
 */
public abstract class  Computer {
    private String name;
    private double price;

    public abstract void start();

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }



    }

