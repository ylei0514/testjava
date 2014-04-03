package com.testjava;

import java.math.BigDecimal;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.testjava.baseclass.FirstBase;
import com.testjava.myinterface.FirstInterface;

public class Test {
	
	public static enum Color{
		red,green,yellow,blue,black
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		testGson();
		
//		double result = 0;
//		CalculatorFactory cf = new CalculatorFactory(1);
//		cf.setValue(5, 6,4);
//		result = cf.getResult();
//		System.out.println("result=="+result);
		
//		int i = 0;
//		System.out.println("i=="+ ++i);
//		System.out.println("i1=="+i++);
//		System.out.println("i2=="+i++);
//		System.out.println("i3=="+i++);
		
//		BigDecimal bd = BigDecimal.TEN.divide(new BigDecimal(3), 4, RoundingMode.UP);
//		System.out.println(String.valueOf(bd.doubleValue()));
//		SecIn si = new SecIn();
//		FirstTest ft = new FirstTest();
//		ft.base_print("This is first test!");
//		ft.base_print1(si);
		
//		Test t = new Test();
//		t.test(ft,"this is my");
//		t.test_sec(ft, "this is my base");
		//测试排序-----------------------------------------------------
//		List<User> usrlist = new ArrayList<User>();
//		for(int i = 0;i < 10 ; i++){
//			User u = new User();
//			u.setName("abc");
//			u.setNo(i);
//			usrlist.add(u);
//		}
//		for(User u:usrlist){
//			System.out.print(u.getName()+"::"+u.getNo());
//		}
//		
//		Collections.sort(usrlist, new Comparator<User>(){
//
//			@Override
//			public int compare(User arg0, User arg1) {
//				//arg0-arg1为升序
//				//arg1-arg0为降序
//				return arg1.getNo() - arg0.getNo();
//			}
//			
//		});
//		for(User u:usrlist){
//			System.out.print(u.getName()+"::"+u.getNo());
//		}
		
		
		//--------------------------------------------------------------
		
		
		
//--------------------------------------------------------------------
//测试String的startsWith方法
//		String s = "woshishui:";
//		String x = "woshishui:nishini";
//		boolean temp = x.startsWith(s);
//		System.out.print("panduan==="+temp);
//------------------------------------------------------------------
		
//--------------------------------------------------------------------
//测试字符串截取对比
//		String[] mDiscountStrs = new String[]{"充值记录","会员升级","会员充值","我的预约","积分兑换","修改登录密码","修改结账密码","申领会员卡","添加认证信息"};
//		String[] mChoicStrs = new String[]{"|0|1|2|3|","|0|1|","|0|1|2|","|0|1|2","|0|1|2|","|0|1|2|3|","|0|1|2|","|0|1|2|","|0|1|2|"};
//		String str = "|1|";
//		for(int i = 0; i<mChoicStrs.length;i++){
//			if(mChoicStrs[i].contains(str)){
//				System.out.print(mDiscountStrs[i]);
//			}
//		}
//----------------------------------------------------------------
//		Color test = Color.blue;
//		switch(test){
//		case red:
//			System.out.print(Color.red);
//			break;
//		case green:
//			System.out.print(Color.green);
//			break;
//		case yellow:
//			System.out.print(Color.yellow);
//			break;
//		case blue:
//			System.out.print(Color.blue);
//			break;
//		}
		
//		Queue<String> qu = new ConcurrentLinkedQueue<String>();
//			qu.offer("你");
//			qu.offer("是");
//			qu.offer("谁");
//			qu.offer("的");
//			qu.offer("人");
//			System.out.print(qu.size());
//			System.out.print(qu.size());
//			System.out.print(qu.size());
//			System.out.print(qu.size());
//			int size = qu.size();
//			for(int i = 0;i<size;i++){
//				System.out.print(qu.poll());
//			}
		
		// TODO Auto-generated method stub
//		 double i=2, j=2.1, k=2.5, m=2.9510;
//	     System.out.println("舍掉小数取整:Math.floor(2)=" + (double)Math.floor(i));
//	     System.out.println("舍掉小数取整:Math.floor(2.1)=" + (double)Math.floor(j));
//	     System.out.println("舍掉小数取整:Math.floor(2.5)=" + (double)Math.floor(k));
//	     System.out.println("舍掉小数取整:Math.floor(2.9)=" + (double)Math.floor(m)); 
//	   Test test=new Test();
//	   System.out.println(test.getRoundD(new BigDecimal(0.7)));
//	   System.out.println(test.compareBigDecimal(new BigDecimal(0.1),new BigDecimal(0.100)));
	
		
//------------------------------------------------
		//测试DecimalFormat
//		DecimalFormat df = new DecimalFormat("0.000000");
//		double x = 0.126001;
//		String result = df.format(x);
//		System.out.println("result == "+result);
		
//		double x = 35;
//		String t1 = String.valueOf(x);
//		boolean hasDot = t1.contains(".");
//		if(!hasDot){
//			System.out.println("result == "+String.valueOf(x));
//			return;
//		}
//		String[] tl1 = t1.split("\\.");
//		String t2 = tl1[1];
//		int length = t2.length();
//		if(length < 3){
//			System.out.println("result == "+String.valueOf(x));
//			return;
//		}
//		int result1 = 0;
//		String t3 = t2.substring(0,2);
//		int ti = Integer.parseInt(t2.substring(2));
//		switch(length){
//		case 3:
//			if(ti >0 && ti <= 3){
//				result1 = 3000;
//			}else if(ti > 3 && ti <= 6){
//				result1 = 6000;
//			}else{
//			    result1 = 9000;
//			}
//			break;
//		case 4:
//			if(ti >0 && ti <= 30){
//				result1 = 3000;
//			}else if(ti > 30 && ti <= 60){
//				result1 = 6000;
//			}else{
//			    result1 = 9000;
//			}
//			break;
//		case 5:
//			if(ti >0 && ti <= 300){
//				result1 = 3000;
//			}else if(ti > 300 && ti <= 600){
//				result1 = 6000;
//			}else{
//			    result1 = 9000;
//			}
//			break;
//		case 6:
//			if(ti >0 && ti <= 3000){
//				result1 = 3000;
//			}else if(ti > 3000 && ti <= 6000){
//				result1 = 6000;
//			}else{
//			    result1 = 9000;
//			}
//			break;
//		}
//		String result = tl1[0]+"."+t3+String.valueOf(result1);
//		System.out.println("result == "+result);
//-------------------------------------------------
	}
	
	public int compareBigDecimal(BigDecimal one,BigDecimal two){
		//one > two == 1
		//one = two == 0
		//one < two == -1
		return one.compareTo(two);
	}
	
	public int getRound(double dSource){
	    double iRound;
	    //BigDecimal的构造函数参数类型是double
	    BigDecimal deSource = new BigDecimal(dSource);
	    //deSource.setScale(0,BigDecimal.ROUND_HALF_UP) 返回值类型 BigDecimal
	    //intValue() 方法将BigDecimal转化为int
	    iRound= deSource.setScale(0,BigDecimal.ROUND_UP).doubleValue();
	    int x = (int)iRound;
	    return x;
	}
	
	public double getRoundD(double dSource){
	    double iRound;
	    //BigDecimal的构造函数参数类型是double
	    BigDecimal deSource = new BigDecimal(dSource);
	    //deSource.setScale(0,BigDecimal.ROUND_HALF_UP) 返回值类型 BigDecimal
	    //intValue() 方法将BigDecimal转化为int
	    iRound= deSource.setScale(1,BigDecimal.ROUND_UP).doubleValue();
	    return iRound;
	}
	
	public BigDecimal getRoundD(BigDecimal bd){
		BigDecimal t = bd.divide(new BigDecimal(1), 2, BigDecimal.ROUND_DOWN);
		
//		BigDecimal t =  bd.setScale(2, BigDecimal.ROUND_DOWN);
//		BigDecimal p = t.setScale(1, BigDecimal.ROUND_UP);
//		BigDecimal d =  p.setScale(2, BigDecimal.ROUND_DOWN);
	    return t;
	}
	
	public void test(FirstInterface fif,String temp){
		fif.print(temp);
	}
	
	public void test_sec(FirstBase tb,String temp){
		tb.base_print(temp);
	}
	
	public static void testGson(){
		String str = "{\"p\":[{\"name\":\"zhang\",\"no\":\"23\"},{\"name\":\"xue\",\"no\":\"29\"},{\"name\":\"zeng\",\"no\":\"25\"},{\"name\":\"song\",\"no\":\"36\"}]}";
//		String str_single = "{\"name\":\"zhang\",\"no\":\"23\"}";
		Gson g = new Gson();
//		Father f = g.fromJson(str, Father.class);
//		if(f != null){
//			for(P u:f.getList()){
//				System.out.println("name="+u.getName()+"::"+"no="+u.getNo());
//			}
//		}else{
//			System.out.println("false");
//		}
		
		
		Father p = g.fromJson(str, new TypeToken<Father>() {}.getType());
		if(p != null){
			for(User u:p.getP()){
				System.out.println("name="+u.getName()+"::"+"no="+u.getNo());
			}
		}
//		System.out.println(p.getName()+"::"+p.getNo());
	}
}
