import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ��� ������:");
		String a1 = scanner.nextLine();
		switch(a1) {
		case "int":
			System.out.println("������� �����: ");
			int a2 = scanner.nextInt();
			a2 = a2%2;
			System.out.println("������� �� ������� �� 2 = " + a2);
			break;
		case "double":
			System.out.println("������� �����: ");
			double a3 = scanner.nextDouble();
			a3 = a3 * 0.7;
			System.out.println("70%" + a3);
			break;
		case "float":
			System.out.println("������� �����: ");
			float a4 = scanner.nextFloat();
			a4 = (float) Math.pow(a4, 2);
			System.out.println("����� � ��������: " + a4);
			break;
		case "char":
			System.out.println("������� ������: ");
			char a5 = scanner.next().charAt(0);
			int x = (int) a5;
			System.out.println("��� �������: ");
			break;
		case "String","string":
			System.out.println("������� ���� ���:");
			String a6 = scanner.nextLine();
			System.out.println("Hello" + a6);
			break;
		default:
			System.out.println("Unsupported type");
		}
	}
}