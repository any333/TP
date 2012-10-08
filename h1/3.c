/*	
Училище - Технологично училище "Електронни системи" към ТУ-София 
Клас - 11Б клас
Номер - 3
Име - Анна-Мария Верева Матейна
Задача - Да се разработи програма, която изисква от потребителя да въведе две целочислени числа, x и y, където x < y. Да се намерят и изведат всички прости числа завършващи на 3 в интервал [x,y].
*/

#include<stdio.h>

void main(){
	int x,y,counter,c,test;
	do{
		printf("Enter x & y (x<y)\n");
		scanf("%d %d",&x,&y);
	} 
	while ((x==y) || (x>y));
	for(counter=x;counter<=y;counter++){
		if ((counter%10)==3){
			c=2;
			test=0;
			do{
				if ((counter%c)==0){
					test++;
				} 
				c++;
			} 
			while ((test==0) && (c<counter));
			if (test==0){
				printf("Number: %d\n", counter);
			}
		}
	}	
}
