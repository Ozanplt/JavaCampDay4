import abstracts.BaseGameCalculator;
import abstracts.KidCalculator;
import abstracts.ManCalculator;
import abstracts.WomanCalculator;
import interfaces.CustomerManager;
import interfaces.MySqlCustomerDal;
import interfaces.OracleCustomerDal;
import staticDemo.Product;
import staticDemo.ProductManager;
import staticDemo.ProductValidator;

public class Main {

	public static void main(String[] args) {
        System.out.println("abstracts---------");
        BaseGameCalculator gameCalculator = new KidCalculator();
        gameCalculator.hesapla();
        gameCalculator.gameOver();
        
        
        
        System.out.println("static--------");
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        ProductValidator.isValid(product);
        productManager.add(product);
        
        
        
        System.out.println("interfaces----------");
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
        CustomerManager customerManager2 = new CustomerManager(new OracleCustomerDal());
        customerManager2.add();


	}

}
