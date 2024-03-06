## java-learning
- javac <file_name> : 編譯 java 程式
 > 每一次檔案有修改，都要重新存檔、編譯程式，更新 class 檔案


### 變數型態
- 整數 byte、short、**int**、long
- 浮點數 float、**double**
- 布林值 boolean
- 字元 char、字串 **S**tring

```
變數如何使用 ?
宣告變數、指定資料、使用變數
```

### 資料基本轉換規
**double > float > long > int > short > byte**
- 小範圍轉大範圍 : 自動轉換
- 大範圍轉小範圍 : 產生錯誤
 > 可使用 _強制轉換_ (轉換後可能會造成數字失真)

### 判斷式
- if ... else if ... else
- switch

#### 標準輸入
讓使用者從終端機輸入資料。
`import java.util.Scanner;   //載入內建的 java.util.Scanner 類別`
`Scanner s=new Scanner(System.in);   //建立 Scanner 物件`

#### 初始化陣列
`int[] y=new int[]{2,8,5}    //初始化並同時指定長度和值 [2,8,5]`

## 類別
Java 程式的核心概念，一定要定義類別！
- **組織程式的基礎單位 ( 檔案名稱須和類別名稱一致 ! )**
  > 可執行的類別 : 類別定義中包含 `main 方法`，才可以成功被執行
  ```java
  class Test1{
    public static void main(String[] args){    
        //程式進入點
        static int a=10;   //定義類別屬性: static 資料型態 屬性名稱=初始資料
        static String s="hello";
        Test1.a++;   //操作類別的屬性: 類別名稱.屬性名稱
    }
  }
  class Test2{   //此方法沒加上main，無法執行

  }
 
- 類別方法、類別呼叫、類別參數
```java
clsss 類別名稱{
  //類別的miain方法 : 程式的進入點
  public static void main(String[] args){
    //呼叫add方法後的回傳值
    int result=類別名稱.add(3, 4);
    System.out.println(result);
    //呼叫hello方法，沒有回傳值
    類別名稱.hello("Hello","Bob");
  }
  //自訂義的類別方法
  static void hello(String name, String msg){   //void:代表此方法沒有回傳值
    System.out.println(name+":"+msg);
    return;  //return:中斷執行(可寫可不寫)
  }
  static int add(int n1, int n2){
    return n1+n2
  }
}
```

## 封包 Package : 用來分群程式檔案 / 類別
- 封包 <--> 對應專案中的資料夾
- 需在程式最前面，使用 `package` 宣告所屬封包
```java
package math.geometry
public class Rectangle{
  public static double GOLDEN_RATIO=1.168;
}
```

##### 基礎權限控制
類別、屬性和方法的調用限制。
- 預設權限 : 只有同個封包中的其他類別可以調用 
- 公開權限 : 使用 `public` 宣告，可被封包外以外的類別使用


- **物件實體的藍圖**


-----------------------------------
refer
- [JDK download](https://www.oracle.com/tw/java/technologies/downloads/)
- 環境變數設定 : https://www.kjnotes.com/devtools/35#google_vignette