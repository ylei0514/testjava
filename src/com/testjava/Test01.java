package com.testjava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		
//		SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long temp = 1339125862296l;
		Date d = new Date(temp);
		Date now = new Date();;
		
		SimpleDateFormat f = new SimpleDateFormat("MM��dd�� HH:mm");
		String s = f.format(d);
		System.out.println(s);
		long between = (d.getTime() - now.getTime())/1000;
		
		long day1=between/(24*3600);//24Сʱ��3600��/Сʱ
		long hour1= between%(24*3600)/3600;
		
		long minute1=((between%(24*3600))%3600)/60;
		long second1= ((between%(24*3600))%3600)%60;//between/60;
		
		System.out.println(""+day1+"��"+hour1+"Сʱ"+minute1+"��"+second1+"��");
		
		
	}
}
