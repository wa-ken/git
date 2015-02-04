#include <stdio.h>
int main(void){
    // 入力
    int year = 2015;
    int month = 2;
    int day = 4;
    
    // バリデーション
    if(month < 0 || 12 < month){
        printf("月が不正な値だけど続行");
    }
    if(day < 0 || 31 < day){
        printf("日が不正な値だけど続行");
    }
    
    // ツェラーの公式
    if(month < 3){
        month = month + 12;
        year = year - 1;
    }
    int c = year / 100;
    int first = day;
    int second = (26 * (month + 1 )) / 10;
    int third = year % 100;
    int fourth = third / 4;
    int fifth = (5 * c) + c / 4;
    
    int h = ( first + second + third + fourth + fifth ) % 7;

    // 曜日変換    
    switch(h) {
        case 0:
            printf("土曜日");
            break;
        case 1:
            printf("日曜日");
            break;
        case 2:
            printf("月曜日");
            break;
        case 3:
            printf("火曜日");
            break;
        case 4:
            printf("水曜日");
            break;
        case 5:
            printf("木曜日");
            break;
        case 6:
            printf("金曜日");
            break;
    }
}
