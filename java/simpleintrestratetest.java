public class simpleintrestratetest {
    public static void main(String[] args) {
        simpleintrest first=new simpleintrest();
        first.setvalues(1000,10,5);
        System.out.println(first.si());
    }
}
class simpleintrest{
    int principle,rate,time;
    void setvalues (int num1,int num2,int num3)
    {
        principle=num1;
        rate=num2;
        time=num3;
    }
    float si(){
        float result=(principle*rate*time)/100.0f;
        return result;
    }
}
