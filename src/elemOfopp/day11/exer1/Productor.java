package elemOfopp.day11.exer1;
/*
 * ������(Productor)����Ʒ������Ա(Clerk)��
 * ��������(Customer)�ӵ�Ա��ȡ�߲�Ʒ��
 * ��Աһ��ֻ�ܳ��й̶������Ĳ�Ʒ(����:20����
 * �����������ͼ��������Ĳ�Ʒ����Ա���������ͣһ�£�
 * ��������п�λ�Ų�Ʒ����֪ͨ�����߼����������������û�в�Ʒ�ˣ�
 * ��Ա����������ߵ�һ�£���������в�Ʒ����֪ͨ��������ȡ�߲�Ʒ��
������ܳ����������⣺
�����߱������߿�ʱ�������߻�©��һЩ����û��ȡ����
�����߱������߿�ʱ�������߻�ȡ��ͬ�����ݡ�

������ 
1���Ƿ��漰�����߳� �������ߺ�������
2���Ƕ��漰���������ݣ������̰߳�ȫ
3���������ݣ���Ʒ����
4���漰���߳�ͨ�ţ���������������
 */
public class Productor implements Runnable{
	Clerk clerk;
	
	public Productor(Clerk clerk) {
		super();
		this.clerk = clerk;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ����");
		while(true) {
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clerk.addProduct();
		}
	}
}
