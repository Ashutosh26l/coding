class  stringConcatinates {
    String concatinates(String s1,String s2)
    {
        return s1+s2;
    }
    boolean substring(String mainstring,String substring)
    {
        return mainstring.contains(substring);
    }
}
class stringConcatinatesTest
{
    public static void main(String[] args) {
        stringConcatinates sc=new stringConcatinates();
        String result=sc.concatinates("ashutosh", "kumar");
        System.out.println(result);
        System.out.println("contains'world':"+ contains);


    }
}