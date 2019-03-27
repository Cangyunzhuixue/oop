package elemOfopp.day9;
/*
 * public ���εĳ�Ա�������κη�Χ��ֱ�ӷ��ʣ�ֻ��һ������ɵķ��ʿ��Ƶȼ���
 * ��Ҫע��ģ���ν��ֱ�ӷ�������Ҫ�ȴ�������һ����Ӧ��Ķ���Ȼ��ſ���ʹ�á�������.
 * ��Ա���ķ�ʽ���������Ի�����䷽�������ǳ�����Ϣ��װ�����ص���Ҫһ�㲻�ᳫ�ѳ�Ա����Ϊpublic�ģ�
 * �����췽������Ҫ���ֱ�ӵ��õ���ͨ�������ʺ�����Ϊpublic.
 *protected ���εĳ�Ա���������������С�ͬһ���м������У����������ڲ���ͬһ��������ֱ�ӷ��ʣ�
 *��������λ�ڲ�ͬ���еķ������б�ֱ�ӷ��ʣ�������Ҫ�ر�������
 *��λ�ڲ�ͬ���������б���������Ķ������ֱ�ӷ����丸���protected��Ա��
 *����������Ķ��󷴶����ܷ�������������������protected��Ա\
 *ȱʡ :�������η��ĳ�Աֻ�������������л����ֱ�ӷ��ʣ��ڲ�ͬ���м�ʹ�ǲ�ͬ��������Ҳ����ֱ�ӷ��ʡ�
 *private��Աֻ�����������б�ֱ�ӷ��ʣ���4�ַ��ʵȼ���ߵ�һ����
 */

public class Person implements Comparable{
	private Integer age;
	protected String name;
	int id=1001;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {// Ĭ�϶���ģ�һ����ʾ���幹��������ʾ�Ĺ����������ṩ������������
		age = 18;
	}

	public Person(int age,String name) {
		this.age = age;
		this.name=name;

	}


	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Person) {
			Person person=(Person)o;
			/*return this.name.compareTo(person.name);*/
			/*return this.age.compareTo(person.age);*///�Ӹ����ţ��Ӵ�С
			int i=this.age.compareTo(person.age);
			if (i==0) {
				return this.name.compareTo(person.name);
			}else {
				return i;
			}
		}
		return 0;
	}

}
