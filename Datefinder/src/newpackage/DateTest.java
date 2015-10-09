package newpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class DateTest {

public static void calendprinter (int month, int year,int days,int dat)
{
Calendar thefirst = new GregorianCalendar(year,(month-1),1);
Calendar theday = new GregorianCalendar(year,(month-1),dat);
int nod, linechanger=1;
nod = days;
int day = thefirst.get(Calendar.DAY_OF_WEEK);
int dow = theday.get(Calendar.DAY_OF_WEEK);
System.out.println(dow);
switch(dow)
{
case 1 : 
	System.out.println("Sunday Sunny Sleepy");
	break;
case 2:
	System.out.println("Monday DEAD");
	break;
case 3:
	System.out.println("Tuesday is ok");
	break;
case 4 :
	System.out.println("Wednesday - hump day!");
	break;
case 5 : 
	System.out.println("Thursday - Almost there");
	break;
case 6 :
	System.out.println("TGIF");
	break;
case 7 : 
	System.out.println("Saturday Sports ");
	break;
	
}

GregorianCalendar now = new GregorianCalendar();

Date time1=theday.getTime();
Date time2=now.getTime();
long t1=time1.getTime();
long t2=time2.getTime();
long eldays = (t2-t1)/(1000*60*60*24);
System.out.println("The number of days elapsed is "+ eldays);





System.out.println("S\tM\tT\tW\tTh\tF\tSa"); 

for(int j = 1 ; j <day; j++)
{
System.out.print("\t");
linechanger++;
}
for(int i = 1; i <= (nod + day); i++)
{ 
if(linechanger%7==0 && i<=nod)
{
System.out.print(i+"\t\n");
linechanger++;
}
else if (i <= nod)
{
System.out.print(i+"\t");
linechanger++;
}
}

}





public static void main(String[] args) {
Date now = new Date();
int mont, year, leap, days,dat;
//System.out.println("toString(): " + now); // dow mon dd hh:mm:ss zzz yyyy
Scanner keyboard = new Scanner(System.in);
String entry;

System.out.println("date in the following format mm/dd/yyyy ");
entry=keyboard.nextLine();
//System.out.println("Enter the Year)");
Scanner parser = new Scanner(entry).useDelimiter("/");
mont = parser.nextInt();
dat = parser.nextInt();
year = parser.nextInt();
//year=keyboard.nextInt();

if((year%4==0&&year%100!=0)||year%400==0)
leap=1;
else
leap=0;

switch (mont)
{
case 1:
days=31;
calendprinter(mont,year,days,dat);
break ;

case 2:
if (leap ==1)
days =29;
else 
days =28;
calendprinter(mont,year,days,dat);
break ;

case 3:
days=31;
calendprinter(mont,year,days,dat);
break ;

case 4:
days=30;
calendprinter(mont,year,days,dat);
break ;

case 5:
days=31;
calendprinter(mont,year,days,dat);
break ;

case 6:
days=30;
calendprinter(mont,year,days,dat);
break ;

case 7:
days=31;
calendprinter(mont,year,days,dat);
break ;

case 8:
days=31;
calendprinter(mont,year,days,dat);
break ;

case 9:
days=30;
calendprinter(mont,year,days,dat);
break ;

case 10:
days=31;
calendprinter(mont,year,days,dat);
break ;

case 11:
days=30;
calendprinter(mont,year,days,dat);
break ;

case 12:
days=31;
calendprinter(mont,year,days,dat);
break ;

}




/*SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
System.out.println("Format 1: " + dateFormatter.format(now));

dateFormatter = new SimpleDateFormat("E");
String j = dateFormatter.format(now);
System.out.println("Format 2: " + j);

/* dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
System.out.println("Format 3: " + dateFormatter.format(now));*/
}
}
