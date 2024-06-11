package lab7.prob3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Marketing> marketingArrayList = new ArrayList<>();
        Marketing m1 = new Marketing("Nan Shawng","Rice Cooker",1500);
        Marketing m2 = new Marketing("Hpauyu","Washing Machine", 1500);
        Marketing m3 = new Marketing("John", "TV",3000);
        Marketing m4 = new Marketing("Hpauyu","Washing Machine", 100);
        Marketing m5 = new Marketing("John", "TV",500);
        marketingArrayList.add(m1);
        marketingArrayList.add(m2);
        marketingArrayList.add(m3);
        marketingArrayList.remove(m1);
        System.out.println(marketingArrayList.size());
        System.out.println(marketingArrayList.get(1));
        System.out.println(marketingArrayList.set(1, m1));
        marketingArrayList.add(m3);
        marketingArrayList.add(m4);
        marketingArrayList.add(m5);
        System.out.println(STR."Original \{marketingArrayList}");
        Collections.sort(marketingArrayList, new Comparator<Marketing>() {
            @Override
            //natural order for the field sales amount using comparator interface
            public int compare(Marketing o1, Marketing o2) {
                if (Double.valueOf(o1.getSalesamount()).compareTo(Double.valueOf(o2.getSalesamount())) != 0)
                    return Double.valueOf(o1.getSalesamount()).compareTo(Double.valueOf(o2.getSalesamount()));
                if (o1.getProductname().compareTo(o2.getProductname()) != 0)
                    return o1.getProductname().compareTo(o2.getProductname());
                else
                    return o1.getEmployeename().compareTo(o2.getEmployeename());
            }
        });
        System.out.println(STR."Sorted by sale amount natural order \{marketingArrayList}");
        System.out.println(STR."Sorted by name with sale amout 1000 \{listMoreThan1000(marketingArrayList)}");
    }
    public static List<Marketing> listMoreThan1000(List<Marketing> list){
        // Implement a body}
        List<Marketing> result = new ArrayList<>();
        for (Marketing marketing : list){
            if (marketing != null && marketing.getSalesamount() >1000)
                result.add(marketing);
        }
        Collections.sort(result, new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                if (o1.getEmployeename().compareTo(o2.getEmployeename()) != 0)
                    return o1.getEmployeename().compareTo(o2.getEmployeename());
                if (o1.getProductname().compareTo(o2.getProductname()) != 0)
                    return o1.getProductname().compareTo(o2.getProductname());
                else
                    return Double.valueOf(o1.getSalesamount()).compareTo(Double.valueOf(o2.getSalesamount()));
            }
        });
        return result;
    }
}
