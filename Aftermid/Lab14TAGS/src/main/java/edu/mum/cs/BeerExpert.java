package edu.mum.cs;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List getBrands(String color){
        List brands = new ArrayList();
        if(color.equals("borgio")){
            brands.add("APU");
            brands.add("Gem");
        }else{
            brands.add("MCS-Tiger");
            brands.add("Other");
        }
        return brands;
    }
}
