package com.littlehu.test01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
	public static void main(String[] args) {
		String line="This order was placed for QT3000! Ok?";
		String pattern="(\\d+)(.*)";
		String pattern1="0{2}";
		
		Pattern r=Pattern.compile(pattern1);
		Matcher m=r.matcher(line);
		if (m.find()) {
			System.out.println("the matcherNum is "+m.groupCount());
			
			System.out.println("Found value:"+m.group(0));
//			System.out.println("Found value:"+m.group(1));
//			System.out.println("Found value:"+m.group(2));
			
		}else {
			System.out.println("NO MATCH");
		}
	}

}
