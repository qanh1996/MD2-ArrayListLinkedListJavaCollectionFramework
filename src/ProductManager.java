import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager extends Product {
    private ArrayList<Product> arrayList = new ArrayList<>();

    public ProductManager(ArrayList<Product> arrayList) {
        this.arrayList = arrayList;
    }

    public void add(Product product) {
        this.arrayList.add(product);
    }

    public void display() {
        System.out.println(this.arrayList);
    }

    public void changeID(int id, int price, String name) {
        for (Product arrayslist : arrayList) {
            if (arrayslist.getId() == id) {
                arrayslist.setName(name);
                arrayslist.setPrice(price);
            }
        }
    }

    public void deleteSP(int id) {
        for (Product arrayslist : arrayList) {
            if (arrayslist.getId() == id) {
                arrayList.remove(arrayslist);
            }
        }
    }

    public Product seachName(String name) {
        for (Product arrayslist : arrayList) {
            if (arrayslist.getName() == name) {
                return arrayslist;
            }
        }
        return null;
    }

    public void sx(){
        Collections.sort(arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice()-o2.getPrice());
            }
        });
    }

    public ProductManager() {
    }

}
