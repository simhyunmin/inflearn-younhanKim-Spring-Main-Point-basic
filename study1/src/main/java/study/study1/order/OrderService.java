package study.study1.order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
