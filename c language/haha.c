#include <stdio.h>

int main() {
    int number[5];
    int count=0;
    
    printf("enter five element:-");
    for(int i=0;i<5;i++){
        scanf("%d",&number[i]);
        if (number[i]==1){
            count++;
        }
    }
    if (count==5){
        printf("the final sequence is:-");
        for (int i=0;i<5;i++){
            printf("1");
        }
        printf("1\n");
    }
    else{
        printf("the entered sequence is not all 1's");
    }
    return 0;
    
    
   
}