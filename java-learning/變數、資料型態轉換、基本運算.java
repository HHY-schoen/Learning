// ////變數
public class Basic{
    public static void main(String[] args){
        //整數(預設為int型態)
        int x;
        x=3;
        System.out.println(x);
        x=33;
        System.out.println(x);

        //長整數 : 在數字後方加上 L
        long y=6666666666666666L;
        System.out.println(y);

        //浮點數(預設為double型態)
        double m=9.6918516151;
        System.out.println(m);
        //單精度浮點數 : 在數字後方加上 F
        float n=9.6918516151F;
        System.out.println(n);

        //布林值
        boolean t=true;
        System.out.println(t);
        //字元，只能放一個字
        char h='嗨';
        System.out.println(h);
        //字串
        String s="hello world !";
        System.out.println(s);
    }
}


////資料型態轉換
public class Basic{
    public static void main(String[] args){
        //小範圍轉大範圍 : 自動轉換
        byte x=3;
        int y=x;
        System.out.println(y);
        long z=y;
        System.out.println(z);
        double d=z;
        System.out.println(d);

        //大範圍轉小範圍 : 需使用'強制轉換'
        int x=1024;
        byte y=(byte)x;
        System.out.println(y);  //數字失真，結果為0
        long z=102400;
        int m=(int)z;
        System.out.println(m);
        // float f=0.141592639;  //錯誤:試圖把double(程式預設)轉換成float
        float f=(float)0.141592639;  //數字失真
        System.out.println(f);

        //字串to數字
        String text="34";
        int x=Integer.parseInt(text);
        System.out.println(x);
        text="3.14666";
        double d=Double.parseDouble(text);
        System.out.println(d);
        
        //數字to字串
        int x=34;
        String s=String.valueOf(x);
        System.out.println(s);
        long y=999999;
        s=String.valueOf(y);
        System.out.println(s);
        s=String.valueOf(3.14159F);
        System.out.println(s);
    }
}


////基本運算
public class Basic{
    public static void main(String[] args){
        int x=5+(3/4);
        System.out.println(x);
        double y=5/2.0;
        System.out.println(y);
        boolean r=3>5;  //要注意變數型態
        System.out.println(r);
        r=3==3;  
        System.out.println(r);

        //單元運算
        int j=4;
        j++;  //等於 j+=1
        j--;
        System.out.println(j);
        boolean p=!true;
        System.out.println(p);

        //邏輯運算
        boolean x=true&&true;
        System.out.println(x);
        boolean y=true||false;
        System.out.println(y);
    }
}

