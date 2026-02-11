package Customersystem;

import java.util.Scanner;

public class SellingSystem {

 static Scanner sc = new Scanner(System.in);
    //Products Atributes

   static int id;
    static String description;
    static double price;
    static int quantity;
    static boolean state;

    //Customers Atributes

    static int idCustomer;
    static String customerName;
    static String customerPhone;
    static String customerEmail;


    public static void main(String[] args) {

   createProducts();

   getProducts();
     System.out.println("Ingrese el id del producto a actualizar: ");
   int id = sc.nextInt();
   sc.nextLine();
   updateProducts(id);
     System.out.println("Ingrese el id del producto a eliminar: ");
      id = sc.nextInt();

  deleteProduct(id);

  createCustomer();

  getCustomers();
        System.out.println("Ingrese el Id del cliente a actualizar.");
        int findUpdateId = sc.nextInt();
        sc.nextLine();

        updateCustomers(findUpdateId);
        System.out.println("Ingrese el Id del cliente a eliminar.");
        int findDeleteId = sc.nextInt();

        deleteCustomer(findDeleteId);

    }

    //Class Methods

    public static void createProducts() {

     System.out.println("Ingrese el ID del producto");
     id=sc.nextInt();
     sc.nextLine();
     System.out.println("Ingrese el nombre del producto");
     description = sc.nextLine();
     System.out.println("Ingrese el precio del producto");
     price = sc.nextDouble();
     sc.nextLine();
     System.out.println("Ingrese la cantidad");
     quantity = sc.nextInt();
     sc.nextLine();
     System.out.println("Ingrese el estado del producto");
     state = sc.nextBoolean();

    }

    public static void getProducts(){
     System.out.println("Id: " + id  + "\n" +
             "Description: " + description + "\n" +
             "Price: " + price + "\n" +
             "Quantity: " + quantity + "\n" +
             "State: " + state + "\n");
    }

 public static void updateProducts(int findId) {

     if (findId == id) {
      System.out.println("Ingrese el ID del producto");
      id=sc.nextInt();
      sc.nextLine();
      System.out.println("Ingrese el nombre del producto");
      description = sc.nextLine();
      System.out.println("Ingrese el precio del producto");
      price = sc.nextDouble();
      sc.nextLine();
      System.out.println("Ingrese la cantidad");
      quantity = sc.nextInt();
      sc.nextLine();
      System.out.println("Ingrese el estado del producto");
      state = sc.nextBoolean();
     } else {
      System.out.println("Producto no encontrado.");
     }

 }

 public static void deleteProduct( int deleteId){
     if (deleteId == id){
        id = 0;
        description = " ";
        price = 0.0;
        quantity = 0;
        state = false;
     }else {
      System.out.println("Id " + deleteId + " no encontrado.");
     }
 }

 //Métodos clientes

 public static void createCustomer(){

     System.out.println("Ingrese el ID del cliente: ");
     idCustomer = sc.nextInt();
     sc.nextLine();
     System.out.println("Ingrese el nombre del cliente: ");
     customerName = sc.nextLine();
     System.out.println("Ingrese el teléfono del cliente");
     customerPhone = sc.nextLine();
     System.out.println("Ingrese el correo del cliente: ");
     customerEmail = sc.nextLine();
     System.out.println("Estado del cliente (true = activo, false = inactivo)");
     state = sc.nextBoolean();

 }

public static void getCustomers(){
    System.out.println("Id: " + idCustomer + "\n" +
            "Nombre del cliente: " + customerName + "\n" +
            "Teléfono: " + customerPhone + "\n" +
            "Correo: " + customerEmail + "\n" +
            "Estado: " + state + "\n");
}

    public static void updateCustomers(int findId) {
        if (findId == idCustomer) {
            System.out.println("Ingrese el ID del cliente: ");
            idCustomer = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre del cliente: ");
            customerName = sc.nextLine();
            System.out.println("Ingrese el teléfono del cliente");
            customerPhone = sc.nextLine();
            System.out.println("Ingrese el correo del cliente: ");
            customerEmail = sc.nextLine();
            System.out.println("Estado del cliente (true = activo, false = inactivo)");
            state = sc.nextBoolean();
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    public static void deleteCustomer( int deleteId) {
        if (deleteId == idCustomer){
            idCustomer = 0;
            customerName = null;
            customerPhone =null;
            customerEmail = null;
            state = false;
        }else {
            System.out.println("Id " + deleteId + " No encontrado.");
        }
    }

}
