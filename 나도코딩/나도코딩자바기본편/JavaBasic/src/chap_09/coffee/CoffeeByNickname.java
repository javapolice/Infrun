package chap_09.coffee;

public class CoffeeByNickname {
    public String nickName;

    public CoffeeByNickname(String nickName) {
        this.nickName = nickName;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " + nickName);
    }

}
