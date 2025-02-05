public class TemperatureConvertertest {
    public static void main(String[] args) {
        TemperatureConverter first=new TemperatureConverter();
        first.setTemp(50,'C');
        if (first.category=='C' || first.category=='c'){
            System.out.println("Temperture in fahrenheit is "+first.to_fahrenheit());
            first.freezing();
        }
        else{
            System.out.println("Temperture in celsius is"+first.to_celsius());
            first.freezing();
        }
    }
}
class TemperatureConverter{
    int temp;
    char category;
    public void setTemp(int temp,char category) {
        this.temp = temp;
        this.category=category;
    }
    int to_celsius(){
        int degree=(temp+32)*5/9;
        return degree;
    }
    int to_fahrenheit(){
        int degree=temp*(9/5)+32;
        return degree;
    }
    void freezing(){
        if(category=='C'|| category=='c'){
            if(temp<0){
                System.out.println("Temperature is below freezing point");
            }
        }
        else{
            if(temp<32){
                System.out.println("Temoerature is below freezing point");
            }
        }
    }
}