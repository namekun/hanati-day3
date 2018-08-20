package day3_180820;

/**
 * �ϻ��Ȱ�� ��ü�� �߻�ȭ �ϱ� ���� �𵨸� Ŭ���� ���� ������� ��ü
 */

class Account {
	// �ν��Ͻ� ���� ����
	String accountNum; // string�� class�̸� �Դϴ�.
	String accountOwner; // ���� string�� �ʱ�ȭ �������� ������ null������ ������ �˴ϴ�.
	int passwd; // int�� �ʱ�ȭ ��Ű�� ������ 0���� �ʱ�ȭ�ȴ�.
	long restMoney;

	// ������
	public Account(String accountNum, String accountOwner, int passwd, long restMoney) {
		this.accountNum = accountNum;
		this.accountOwner = accountOwner;
		this.passwd = passwd;
		this.restMoney = restMoney;

	}

	// ������ �����ε�
	public Account(String accountNum, String accountOwner, int passwd) {
		//this.accountNum = accountNum;
		//this.accountOwner = accountOwner;
		//this.passwd = passwd;
		this(accountNum, accountOwner, 0, 0);
		// �ڽ��� Ŭ���� �ȿ��� �Ǵٸ� �����ڸ� ȣ���� �� ��ģ���� �θ��ϴ�.
	}

	public Account(String accountNum, String accountOwner) {
		this.accountNum = accountNum;
		this.accountOwner = accountOwner;
	}

	// ������ �����ε� (default constructor)
	public Account() {
		this(null, null);
	}

	// setter, getter �޼ҵ�
	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public int getPasswd() {
		return passwd;
	}

	public void setPasswd(int passwd) {
		this.passwd = passwd;
	}

	public long getRestMoney() {
		return restMoney;
	}
	
	public void setRestMoney(long restMoney) {
		this.restMoney = restMoney;
	}


	// �ν��Ͻ� �޼ҵ�
	long deposit(long money) {
		restMoney += money;
		return restMoney;
	}

	long withdraw(long money) {
		restMoney -= money;
		System.out.printf("%d�� ����߽��ϴ�.\n", money);
		return restMoney;
	}

	boolean checkPasswd(int pw) {
		return passwd == pw;
	}

}
