import java.util.*;
import java.lang.*;

public class Arraytestdemo {

    public static void main(String[] args) {


        Bikes s1=new Bikes("ktm",45000,5,"red","sport");
        Bikes s2=new Bikes("pulsar",44000,4,"black","sport");
        Bikes s3=new Bikes("bmw",50000,4,"blue","lite");
        Bikes s4=new Bikes("bullet",77000,4,"grey","heavy");
        Bikes s5=new Bikes("r15",55000,5,"blue","lite");


        ArrayList<Bikes> al=new ArrayList<Bikes>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);

        Collections.sort(al);

        Iterator itr=al.iterator();

        while(itr.hasNext())
        {
            Bikes b=(Bikes)itr.next();
            System.out.println("bikename="+b.name+" price= "+b.price+" fuelcap="+b.fuelCap+" color= "+b.color+" biketype="+b.type);
        }
    }
}

class Bikes implements Comparable<Bikes>
{
    String name;
    int price;
    String color;
    String type;
    int fuelCap;

        Bikes(String name,int price,int fuelCap,String color,String type)
   {
        this.name=name;
        this.price=price;
        this.fuelCap=fuelCap;
        this.color=color;
        this.type=type;
    }

     public int compareTo(Bikes o)
    {
        if (price == o.price)
            return 0;
        else if (price > o.price)
            return 1;
        else
            return -1;
    }
}











