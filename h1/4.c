/*	
Училище - Технологично училище "Електронни системи" към ТУ-София 
Клас - 11Б клас
Номер - 3
Име - Анна-Мария Верева Матейна
Задача - Да се разработи програма, която изисква от потребителя да въведе две целочислени числа, x и y, където x < y. Да се намерят и изведат всички числа на Фибоначи в интервала [x, y] 
*/

#include<stdio.h>

void main(){
	int x,y,counter,fx,fy,fsum,test;
	do{
		printf("Enter x & y (x<y)\n");
		scanf("%d %d",&x,&y);
	} 
	while ((x==y) || (x>y));
	for(counter=x;counter<=y;counter++){
	fx=0;
	fy=1;
	
		do{
			fsum=fx+fy;
			if ((fsum==counter) || (counter==0)){
				
				printf("Number: %d\n", counter);
			}
			fx=fy;
			fy=fsum;
		}
		while ((fsum<y) && (test==0));
		
	}
	
}
