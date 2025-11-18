package lab;

import java.util.Scanner;

class Product{
    String productName;
    int quantity;

    Product(String productName, int quantity){
        this.productName= productName;
        this.quantity = quantity;
    }

    public String getProductName() {return productName; }
    public int getQuantity() {return quantity; }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    void addQuantity(int amount){ quantity+=amount;}
    void displayProduct(){
        System.out.printf("상품명:%s,재고: %d\n", getProductName(), getQuantity());
    }
}
public class InventoryManager {
    public static void main(String[] args) {
        Product[] product = new Product[50];
        int productCount=0;
        Scanner scanner = new Scanner(System.in);
        String state = " ";
        System.out.println("=== 메뉴 ===\na: 추가/입고\ns: 검색\nd: 전체보기\ne: 종료");
        while(!state.equals("e")&&!state.equals("E")){
            System.out.print("선택: ");
            state = scanner.nextLine();

            switch (state){
                case "a","A":
                    String str;
                    System.out.print("상품명과 입고 수량을 입력하시오: ");
                    str = scanner.nextLine();
                    String[] arr = str.split(" ");
                    boolean a = true;
                    Product product1 = new Product(arr[0], Integer.parseInt(arr[1]));

                    if(productCount==0) {
                            product[productCount] = product1;
                            productCount++;
                    }
                    else if(productCount==50){
                        System.out.println("재고 공간 부족");
                    }
                    else {
                        for (int i = 0; i < productCount; i++) {
                            if (product[i].getProductName().equals(product1.getProductName())) {
                                product[i].addQuantity(product1.getQuantity());
                                a = false;
                                break;
                            }
                        }
                        if(a)
                        {
                            product[productCount] = product1;
                            productCount++;
                        }

                    }
                        break;

                case "s","S":
                    String find;
                    Boolean check = true;
                    System.out.print("검색할 상품명을 입력하시오: ");
                    find = scanner.nextLine();

                    for(int i =0; i<productCount; i++){
                        if(product[i].getProductName().equals(find))
                        {
                            product[i].displayProduct();
                            check = false;
                            break;
                        }

                    }
                    if(check)
                        System.out.println("해당 상품 없음");
                    break;

                case "d","D":
                    for(int i = 0; i < productCount; i++)
                        product[i].displayProduct();
                    break;

                case "e","E":
                    System.out.println("프로그램을 종료합니다.");
                    break;

                default:
                    System.out.println("잘못된 메뉴");
                    break;
            }
        }

    }
}
