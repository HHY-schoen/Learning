import java.util.Scanner;

////判斷式
public class Two{
    public static void main(String[] args){
        //標準輸入(從終端機輸入資料)
        Scanner s=new Scanner(System.in);
        System.out.println("請輸入一個整數 : ");
        int x=s.nextInt();   //取得使用者輸入的整數
        System.out.println(x*10);

        // if判斷式
        Scanner s=new Scanner(System.in);
        System.out.println("請問要領多少錢...?");
        int money=s.nextInt();
        if(money>100000){
            System.out.println("金額太高");
        }else if(money>=100){
            System.out.println("ok");
        }else{
            System.out.println("太少了");
        }
        
        // switch判斷式
        int n1=3;
        int n2=4;
        System.out.println("請輸入想要做的運算 (+, -, *, /)");
        Scanner s=new Scanner(System.in);
        String op=s.next();
        switch(op){
            case "+":
                System.out.println(n1+n2);
                break;
            case "-":
                System.out.println(n1-n2);
                break;
            case "*":
                System.out.println(n1*n2);
                break;
            case "/":
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("不支援此運算符");
                break;
        }
    }
}


////迴圈
public class Loop{
    public static void main(String[] args){
        // while迴圈
        while(true){
            System.out.println("無窮迴圈");
        }
        //計算1+2+3+4+5的總和
        int total=0;
        int x=1;
        while(x<=5){
            total+=x;
            x++;
        }
        System.out.println(total);
    
        // for迴圈
        //計算1+2+3+4+5的總和
        int total=0;
        for(int x=1; x<=5; x++){
            total+=x;
        }
        System.out.println(total);

        // continue: 強制返回迴圈開頭、進入下一圈
        for(int i=0;i<=6;i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }
        // break: 強制結束迴圈
        int p=0;
        while(p<=6){
            if(p==4){
                break;
            }
            System.out.println(p);
            p++;
        }

        //應用案例:連續輸入直到正確為止
        Scanner s=new Scanner(System.in);
        int number;
        while(true){
            System.out.println("請輸入一個正整數 : ");
            number=s.nextInt();
            if(number>0){
                break;
            }else{
                System.out.println("輸入錯誤，再來一次");
            }
        }
        System.out.println("輸入正確 : "+number);
    }
}


////陣列
public class Two{
    public static void main(String[] args){
        //陣列基本操作
        int[] grade=new int[]{90,80,0};
        System.out.println("陣列長度 : "+grade.length);
        // grade[0]=90;
        // grade[1]=80;
        for(int i=0;i<grade.length;i++){
            System.out.println(grade[i]);
        }

        //輸入學生數量、及成績，計算平均數
        System.out.println("請輸入學生數量 : ");
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int[] grade=new int[number];
        System.out.println("請逐一輸入學生成績 : ");
        for(int i=0;i<grade.length;i++){
            grade[i]=s.nextInt();
        }
        //計算平均數，先算總和
        int total=0;
        for(int i=0;i<grade.length;i++){
            total+=grade[i];
        }
        int avg=total/grade.length;
        System.out.println("平均成績是 : "+avg);
    }
}

