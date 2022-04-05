public class Main {
    public static void main(String[] args) {
        Product sp1 = new Product(1, "com", 800);
        Product sp2 = new Product(2, "pho", 300);
        Product sp3 = new Product(3, "gao", 700);

        ProductManager productManager = new ProductManager();
        productManager.add(sp1);
        productManager.add(sp2);
        productManager.add(sp3);
        productManager.display();

        productManager.sx();

        productManager.display();



    }
}
