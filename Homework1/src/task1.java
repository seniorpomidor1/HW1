import java.util.Scanner;
public class task1 {
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double discount;
    System.out.print("���� ����: ");
    double price = in.nextDouble();
    System.out.print("��� �������: ");
    int age = in.nextInt();
	if (price <= 400) {
		discount = 20;
} else if (price>=300 && price<400) { 
	discount = 15; 
}  else if (price < 300 & price >= 200) {
	discount = 12;
	if (age >= 18) {
		discount = discount + 4;
	} else {
		discount = discount - 3;
	}
} else if (price>=100 && price<200) {
	discount = 7;
} else if (price > 100) { 
	discount = 5; 
	System.out.println("������: " + discount + "%");
	discount = price * (discount / 100);
	price = price - discount;
	System.out.println("� ������ - " + price);
	in.close();
}
	}
}