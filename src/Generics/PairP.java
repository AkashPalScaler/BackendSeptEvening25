package Generics;

public class PairP <V>{
    V var1;
    PairP() {
    }
    PairP(V var1){
        this.var1 = var1;
    }
    public void getVar1(){
        System.out.println(this.var1);
    }
    public void setVar1(V var1){
        this.var1 = var1;
    }
}
