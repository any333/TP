/*	
Училище - Технологично училище "Електронни системи" към ТУ-София 
Клас - 11Б клас
Номер - 3
Име - Анна-Мария Верева Матейна
Задача - Да се разработи програма, която изисква от потребителя да въведе две целочислени числа, x и y, където x < y. Да се намери сумата на всички нечетни числа в интервала [x,y].
*/

#include<stdio.h>

void main(){
	int x,y,counter,sum;
	sum=0;
	do{
		printf("Enter x & y (x<y)\n");
		scanf("%d %d",&x,&y);
	} 
	while ((x==y) || (x>y));
	for(counter=x;counter<=y;counter++){
		if (counter%2==1) {
			sum=sum+counter;
		}
	}
	printf("Sum: %d\n",sum);
}
