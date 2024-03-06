//類別基本概念、屬性
class Test1{
    //類別的屬性 Class Attribute/ Static Attribute
    static int a=10;
    static String s="hello";
}
class Test2{
    static double a=3.14;
    public static void main(String[] args){
        System.out.println(Test1.a);
        System.out.println(Test2.a);
        System.out.println(Test1.s);
        Test1.a++;
        System.out.println(Test1.a);
    }
}

//回傳值
class Test{
    public static void main(String[] args){
        //程式進入點
        Test.talk("Hello");   
        Test.talk("你好");
        int ans=Math.add(3, 4);   //類別名稱.對應方法(特定參數)
        System.out.println(ans);
        ans=Math.multiply(4, 2);
        System.out.println(ans);
    }
    //定義更多自己的類別方法
    static void talk(String content){  //void:無回傳值
        System.out.println(content);
    }
}
class Math{
    static int add(int n1, int n2){   //回傳值資料型態為int
        int result=n1+n2;
        return result;
    }
    static void multiply(int n1, int n2){
        return n1*n2;
    }
}


