package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinası");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitInStock(3);
		product1.setImageUrl("delonghiKahveMakinası.jpg");

		Product product2 = new Product();
		product2.setName("Delonghi Kahve Makinası");
		product2.setUnitPrice(7500);
		product2.setDiscount(7);
		product2.setUnitInStock(3);
		product2.setImageUrl("delonghiKahveMakinası.jpg");

		Product product3 = new Product();
		product3.setName("Delonghi Kahve Makinası");
		product3.setUnitPrice(7500);
		product3.setDiscount(7);
		product3.setUnitInStock(3);
		product3.setImageUrl("delonghiKahveMakinası.jpg");

		Product[] products = { product1, product2, product3 };
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0656436326");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");

		CorparateCustomer corparateCustomer = new CorparateCustomer();
		corparateCustomer.setId(2);
		corparateCustomer.setCompanyName("Kodlama.id");
		corparateCustomer.setPhone("5525552");
		corparateCustomer.setTaxtNumber("111111");
		corparateCustomer.setCustomerNumber("5142");

		Customer[] customers = { individualCustomer, corparateCustomer };

	}

}
