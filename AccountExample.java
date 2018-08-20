package day3_180820;

/**
 * ���α׷� ������ ���� ���ø����̼� Ŭ���� ����
 */
import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		System.out.println("���� ���� ���ø����̼� ���۵�....");

		// Ŭ�����κ��� ��ü(�ν��Ͻ�) ����
		// Account account = new Account(); // reference Ÿ�� �����ϰ�, new ��ɾ ���ؼ� �޸� �Ҵ�.

		// �ν��Ͻ��� �Ӽ��� ��� ���
		//account.accountNum = "1111-2222-3333";
		//account.accountOwner = "Mr.Kim";
		//account.restMoney = 100000;
		//account.passwd = 1234;
		//System.out.println(account.accountNum);

		// �����ڸ� �̿��� ��ü ����
		Account account = new Account("1111-2222-3333", "Mr.kim", 1234, 100000);

		int passwd;
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		passwd = sc.nextInt();

		boolean result = account.checkPasswd(passwd);
		if (result) {
			long money = account.deposit(100000);
			System.out.println("�Ա� �� �ܾ� : " + money);
			money = account.withdraw(10000);
			System.out.println("��� �� �ܾ� : " + money);
		} else {
			System.out.println("��й�ȣ�� Ȯ���ϼ���");
		}

		//Account account2 = new Account();
		//�ν��Ͻ� ������ ��� JVM�� ���� �ʱ�ȭ�ȴ�.
		//System.out.println(account2.accountNum);
		//System.out.println(account2.restMoney);
		//account2.accountNum = "2222-3333-4444";
		//account2.accountOwner = "Mr.song";
		//account2.restMoney = 500000;
		//account2.passwd = 1111;

		Account account2 = new Account("2222-3333-4444", "Mr.song");
		
		account2.setPasswd(12345);
		account2.setRestMoney(700000);
		
		System.out.println(account2.getAccountNum());
		System.out.println(account2.getAccountOwner());
		System.out.println(account2.getPasswd());
		System.out.println(account2.restMoney);

		Account account3 = new Account();

		System.out.println("���� ���� ���ø����̼� �����....");
	}
}
