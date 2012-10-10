/*
Училище - Технологично училище "Електронни системи" към ТУ-София
Клас - 11Б клас
Номер - 3
Име - Анна-Мария Верева Матейна
Задача - Да се създаде програма, която да изкарва на екрана стойността на системните свойства по
зададени от командния ред имена на свойствата. Програмата трябва да приема и
невалидни имена. Ако последния подаден аргумент от командния ред е up то стойностите
показани в изхода трябва да са сортиран във възходящ ред. Ако последната стойност е
down изходът трябва да е сортиран в низходящ ред. Стойността по подразбиране, ако не е
посочено up или down, е up.
*/

public class Version{  
	public static void main(String [] argv){
	int t;
	int b=0;
	String m;
	for(t=0;t<=argv.length-1;t++)
		if(argv[t].equals("down"))
			b=1;
	if (b==1){
		java.util.Arrays.sort(argv,java.util.Collections.reverseOrder());
	} else{
		java.util.Arrays.sort(argv);
	}
	for(t=0;t<=argv.length-1;t++){
		m=System.getProperty(argv[t]);
		if(m!=null)
			System.out.println(m); 
	}
	}
}
