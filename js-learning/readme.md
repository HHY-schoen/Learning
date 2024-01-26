## JaveScript
### 變數與運算子
// : 單行註解

/*

多行註解

*/
- var <var_name> : 宣告變數
- 單元運算 : x ++ 相當於 x = x + 1
- 讓使用者輸入 : prompt ( 提示語, 預設值 )   ( ex. prompt("請輸入數字", 1) ; )

### 判斷式
- if ... else if ... else ...
- 把資料轉換成數字 : number ( )
### 迴圈
- while ( <條件> ) { } ; ( 無窮迴圈 )
- for ( <初始值> ; <條件> ; <迴圈> ) { }
- break : 強制跳出迴圈
- continue : 強制進行下一次的迴圈

### 函式
- function <函式名稱> ( ) {
-   alert ( ) ;    //函式的本體
- }
函式回傳值預設為 undefined，要自己 return 回傳值，才可以在函式外部繼續操作

外部的程式碼 ( 全域變數 )，不能使用區域內部 ( 函式內 ) 的變數。

### 物件
- 建立空白物件 : new <Object_name> ( )   ( ex. var point= new Object ( ) )
- 建立物件的成員 : ex. point.x=3



------------------------
refer : https://www.youtube.com/watch?v=iZ3LfVujGCM&list=PL-g0fdC5RMbpqZ0bmvJTgVTS4tS3txRVp&index=18
