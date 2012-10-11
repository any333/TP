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
 Пример:
java HomeWork1 java.version java.vm.version java.vendor invalid java.vendor.url down
трябва до доведе до
http://java.sun.com/
Sun Microsystems Inc.
11.0-b15
1.6.0_10
*/

public class Version{  
	public static void main (String [] argv){
	int i;
	int count_down = 0;
	String s;
	for(i = 0; i <= argv.length-1; i++)
		if(argv[i].equals("down"))
			count_down = 1;
	if (count_down == 1){
		java.util.Arrays.sort(argv,java.util.Collections.reverseOrder());
	} else{
		java.util.Arrays.sort(argv);
	}
	for(i = 0; i <= argv.length-1; i++){
		s = System.getProperty(argv[i]);
		if(s != null)
			System.out.println(s); 
	}
	}
}
