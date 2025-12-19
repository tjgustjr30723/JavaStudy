package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public ShoppingCart(){

    }
    public void addItem(Item item){
        if (itemCount < 10) {
            this.items[itemCount] = item;
            itemCount++;
        }
        else {
            System.out.println("장바구니가 꽉찼습니다.");
        }
    }
    public void displayItems(){
        int sum = 0;
        System.out.println("작바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명:"+items[i].getName()+", 합계:"+items[i].getTotal());
            sum += items[i].getTotal();
        }
        System.out.println("전체 가격 합:"+ sum);
    }

}
