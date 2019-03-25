package elemOfopp.day5;

public class Order {
private int orderId;
private String orderName;
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public String getOrderName() {
	return orderName;
}
public void setOrderName(String orderName) {
	this.orderName = orderName;
}
public Order(int orderId, String orderName) {
	this.orderId = orderId;
	this.orderName = orderName;
}
/*
 *1、 先判断被对比的对象是否为空，因为当前对象不可能为空，否则不可能调用equals（）；
 *2、再直接判断引用的地址是否一样，一样的话必然相等
 *3、对对象内部数据进行比较
 * 
 */
/*@Override
public boolean equals(Object obj){
	if (obj==null) {
		return false;
	}else if(this==obj) {
		return true;
	}else if (obj instanceof Order) {
		Order order=(Order)obj;
		if(order.orderId==this.orderId&&order.orderName.equals(this.orderName)) {
			return true;
		}else {
			return false;
		}
	}
	return false;
}*/
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + orderId;
	result = prime * result + ((orderName == null) ? 0 : orderName.hashCode());
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
	Order other = (Order) obj;
	if (orderId != other.orderId)
		return false;
	if (orderName == null) {
		if (other.orderName != null)
			return false;
	} else if (!orderName.equals(other.orderName))
		return false;
	return true;
}
@Override
public String toString() {
	return "Order [orderId=" + orderId + ", orderName=" + orderName + "]";
}

}
