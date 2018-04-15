package com.szhtwl.util;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Wizzer.cn
 * @time   2012-9-13 上午10:54:04
 *
 */
public class StringUtil {
//	public static void main(String args[]){
//	 
//		CommonUtils.println("");
//		
//	}
	public static final String allcode[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	/**
	 * 返回文件大小，单位MB
	 * @param filesize
	 * @param scale
	 * @return
	 */
    public static double getFileSize(long filesize,int scale){
    	BigDecimal bd1 = new BigDecimal(Long.toString(filesize)); 
        BigDecimal bd2 = new BigDecimal(Long.toString(1024)); 
        return bd1.divide 
        (bd2,scale,BigDecimal.ROUND_HALF_UP).divide(bd2,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
	/**
	 * 返回文件大小，单位MB
	 * @param filesize
	 * @param scale
	 * @return
	 */
    public static double getFileSizeKB(long filesize,int scale){
    	BigDecimal bd1 = new BigDecimal(Long.toString(filesize)); 
        BigDecimal bd2 = new BigDecimal(Long.toString(1024)); 
        return bd1.divide 
        (bd2,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    
    /**
     * 将字符串类型转换为整数类型
     *
     * @param str
     */
    public static int doubleStringToInt(String str) {
    	if (str == null || str.trim().equals("")){
    		return 0;
    	}
    	int n=str.indexOf(".");
    	if(n>0){
    		str=str.substring(0, n);
    	}else{
    		return StringToInt(str, 0);
    	}
        return StringToInt(str, 0);
    }

    
    /**
     * 将字符串类型转换为整数类型
     *
     * @param str
     */
    public static int StringToInt(String str) {
        return StringToInt(str, 0);
    }

    /**
     * 将字符串类型转换为整数类型，出错时有def值返回
     *
     * @param str
     * @param def
     */
    public static int StringToInt(String str, int def) {
        int intRet = def;
        try {
            if (str == null || str.trim().equals(""))
                str = def + "";
            intRet = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return intRet;
    }

    /**
     * 将字符串类型转换为浮点类型
     *
     * @param str
     */
    public static float StringToFloat(String str) {
        return StringToFloat(str, 0);
    }

    /**
     * 将字符串类型转换为浮点类型，出错时有def值返回
     *
     * @param str
     * @param def
     */
    public static float StringToFloat(String str, float def) {
        float fRet = def;
        try {
            if (str == null || str.trim().equals(""))
                str = "0";
            fRet = Float.parseFloat(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return fRet;
    }


    /**
     * 将字符串类型转换为双精度类型
     *
     * @param str
     */
    public static double StringToDouble(String str) {
        return StringToDouble(str, 0);
    }

    
    /**
     * 将字符串类型转换为双精度类型，出错时有def值返回
     *
     * @param str
     * @param def
     */
    public static double StringToDouble(String str, double def) {
        double dRet = def;
        try {
            if (str == null || str.trim().equals(""))
                str = "0";
            dRet = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return dRet;
    }

    /**
     * double类型金额格式化
     * @param def
     * @return
     * @author wanfly_win7
     */
    /**
     * double类型金额格式化
     * @param def
     * @param towy 是否装换为万元
     * @return
     * @author wanfly_win7
     */
    public static String getDoubletoString(double def,boolean towy){
    	if(towy && def>=11000){//大于一万
    		double ts=def/10000;
    		if(ts % 1.0 == 0){//如果没有小数值
    			return String.format("%.0f", ts)+"万";
    		}
    		return String.format("%.6f", ts)+"万";
		}else{
			if(def % 1.0 == 0){//如果有没有小数值
				return String.format("%.0f", def);
			}
	        return String.format("%.2f", def);
		}
    }
    
    /**
     * 将字符串类型转换为双精度类型
     *
     * @param str
     */
    public static long StringToLong(String str) {
        return StringToLong(str, 0);
    }

    /**
     * 将字符串类型转换为双精度类型，出错时有def值返回
     *
     * @param str
     * @param def
     */
    public static long StringToLong(String str, long def) {
        long dRet = def;
        try {
            if (str == null || str.trim().equals(""))
                str = "0";
            dRet = Long.parseLong(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return dRet;
    }

    public static String getUtf8FromGBK(String s){
    	String str="";
    	try {
    		if(s!=null)
    			str=new String(s.getBytes("GBK"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return "";
		}
    	return str;
    	
    }
    public static String getGBKFromUtf8(String s){
    	String str="";
    	try {
    		if(s!=null)
    			str=new String(s.getBytes("UTF-8"),"GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return "";
		}
    	return str;
    	
    }
    /**
     * 将对象转换为字符型
     *
     * @param s
     */
    public static String null2String(Object s) {
        return s == null || s.equals("undefined") ||s.equals("null") || s.equals("NULL") ? "" : s.toString();
    }

    /**
     * 将字符串数组转换为（'a','b'）的格式后返回，来方便数据库的操作
     *
     * @param names
     * @return String
     */
    public static String getStrsplit(String[] names) {
        if (names == null || names.length == 0)
            return "()";
        String result = "(";
        for (int i = 0; i < names.length; i++) {
            if (i == names.length - 1)
                result = result + "'" + names[i] + "'";
            else
                result = result + "'" + names[i] + "',";
        }
        result = result + ")";
        return result;
    }

    /**
     * 将字符串数组转换为（'a','b'）的格式后返回，来方便数据库的操作
     *
     * @param names
     * @return String
     */
    public static String getStrsplit(List<String> names) {
        if (names == null || names.size() == 0)
            return "('')";
        String result = "(";
        for (int i = 0; i < names.size(); i++) {
            if (i == names.size() - 1)
                result = result + "'" + names.get(i) + "'";
            else
                result = result + "'" + names.get(i) + "',";
        }
        result = result + ")";
        return result;
    }
    /**
     * 将整型数组转换为（1，2）的格式后返回，来方便数据库的操作
     *
     * @param ids
     * @return String
     */
    public static String getIdsplit(Integer[] ids) {
        if (ids == null || ids.length == 0)
            return "()";
        String result = "(";
        for (int i = 0; i < ids.length; i++) {
            if (i == ids.length - 1)
                result = result + ids[i];
            else
                result = result + ids[i] + ",";
        }
        result = result + ")";
        return result;
    }
    /**
     * 将整型数组转换为（1，2）的格式后返回，来方便数据库的操作
     *
     * @param ids
     * @return String
     */
    public static String getIdsplit(String[] ids) {
        if (ids == null || ids.length == 0)
            return "('')";
        String result = "(";
        for (int i = 0; i < ids.length; i++) {
            if (i == ids.length - 1)
                result = result + ids[i];
            else
                result = result + ids[i] + ",";
        }
        result = result + ")";
        return result;
    }

    /**
     * 将向量转换为（1，2）的格式后返回，来方便数据库的操作
     *
     * @param ids
     * @return String
     */
    public static String getIdsplit(ArrayList<String> ids) {
        if (ids == null || ids.size() == 0)
            return "()";
        String result = "(";
        for (int i = 0; i < ids.size(); i++) {
            if (i == ids.size() - 1)
                result = result + ids.get(i);
            else
                result = result + ids.get(i) + ",";
        }
        result = result + ")";
        return result;
    }
    /**
     * 将向量转换为（1，2）的格式后返回，来方便数据库的操作
     *
     * @param ids
     * @return String
     */
    public static String getIdsplit(List<String> ids) {
        if (ids == null || ids.size() == 0)
            return "()";
        String result = "(";
        for (int i = 0; i < ids.size(); i++) {
            if (i == ids.size() - 1)
                result = result + ids.get(i);
            else
                result = result + ids.get(i) + ",";
        }
        result = result + ")";
        return result;
    }
    
    /**
     * 把一个含有“,”分隔符的字符串解析为List<String>
     * @param vlas
     * @return
     */
    public static List<String> getStringSplit(String vlas){
    	List<String> s=new ArrayList<String>();
    	if(vlas!=null && !vlas.equals("") && vlas.indexOf(",")>0){
    		String[] vas=vlas.split(",");
    		for(String v:vas){
    			s.add(v);
    		}
    	}else{
    		s.add(vlas);
    	}
    	return s;
    }
    
    /**
     * 把一个含有“,”分隔符的字符串解析为数组，
     * 并将数组内指定的index位置的是数据合计到sum，并返回合计结果
     * @param vlas
     * @param sum
     * @param index
     * @return
     */
    public static String getAddUpNum(String vlas,String sum,String index){
    	int ind=StringUtil.StringToInt(index);
    	String[] vas=vlas.split(",");
    	return addUpStr(sum,vas[ind]);
    }
    
    public static String addUpStr(String c,String vlas){
    	if(c!=null && vlas!=null){
    		return ""+(StringUtil.StringToInt(c)+StringUtil.StringToInt(vlas));
    	}
    	return "0";
    }
    /**
	 * 把格式为:文件名1%文件路径1;文件名2%文件路径2...
	 * 的字符串解析为List<List<String>>
	 * @param filePathes
	 * @return
	 */
	public static List<List<String>> analyzeFiles(String filePathes){
		if(filePathes!=null  && !filePathes.equals("")){
			List<List<String>> global_filesList=new ArrayList<List<String>>();
			String files=filePathes;
			if(files.indexOf(";")>0){
				String[] fftemp=files.split(";");
				for(String temp :fftemp){
					List<String> tlist=new ArrayList<String>();
					if(temp.indexOf("%")>0){
						String[] ftemp=temp.split("%");
						tlist.add(ftemp[0]);
						tlist.add(ftemp[1]);
					}else{
						tlist.add(temp);
					}
					global_filesList.add(tlist);
				}
				
			}else{
				List<String> tlist=new ArrayList<String>();
				if(files.indexOf("%")>0){
					String[] ftemp=files.split("%");
					tlist.add(ftemp[0]);
					tlist.add(ftemp[1]);
				}else{
					tlist.add(files);
				}
				global_filesList.add(tlist);
			}
			return global_filesList;
		}
		return null;
	}
	/**
	 * 将字符串在指定的长度内显示，超出后以..代替
	 *
	 * @param str  in string
	 * @param iLen specify length out string
	 */
	public static String substr(String str, int iLen) {
	    if (str == null)
	        return "";
	    if (iLen > 2) {
	        if (str.length() > iLen - 2) {
	            str = str.substring(0, iLen - 2) + "..";
	        }
	
	    }
	    return str;
	}
	
	/**
	 * 获取指定长度的字符串前段
	 * @param str
	 * @param lengt
	 * @return
	 * @author wanfly_win7
	 */
	public static String getStringLength(String str,int lengt){
		if (str == null)
	        return "";
	    if (lengt > 1) {
	        if (str.length() > lengt - 1) {
	            str = str.substring(0, lengt - 1);
	        }
	    }
	    return str;
	}
	
	static public String getMysqlSaveString(String strField, String def)
	{
		if (strField == null)
			return (def == null) ? "\'\'" : def;
		if (strField.indexOf('\'') != -1)
			return "'" + replaceCharacterWithString('\'', "\'\'", strField) + "'";
		return strField;
	}
	static public String replaceCharacterWithString(char character, String replacement, String source)
	{
		StringBuffer myStringBuffer = new StringBuffer(source);
		int length = myStringBuffer.length();
		int replacementLen = replacement.length();
	
		for (int indexOf = 0; indexOf < length; indexOf++)
		{
			if (myStringBuffer.charAt(indexOf) == character)
			{
				myStringBuffer.replace(indexOf, indexOf + 1, replacement);
				length = myStringBuffer.length();
				indexOf += replacementLen - 1;
			}
		}
		return myStringBuffer.toString();
	}
	/**  
     * 生成32位编码  
     * @return string  
     */    
    public synchronized static String getUUID(){    
    	String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");    
        return uuid;    
    }    
    
    /**
     * 获取length位数字和字母随机码，如果length<4则默认生成6位
     * @param length
     * @return
     * @author 王鑫
     */
    public static String getVecString(int length){
    	String uuid= getUUID();
    	if(length>=4){
    		return uuid.substring(0, length);
    	}else{
    		return uuid.substring(0, 6);
    	}
    }
    /**
     * 获取length位数字随机码，如果length<4则默认生成4位
     * @param length
     * @return
     * @author 王鑫
     */
    public static String getNumVecString(int length){
    	Random random = new Random();
    	String sRand = "";
    	int leng=4;
    	if(length>4){
    		leng=length;
    	}
        for (int i = 0; i < leng; i++) {
            String rand = allcode[random.nextInt(10)];
            sRand += rand;
        }
        return sRand;
    }
    
    /**  
     * 自定义规则生成32位编码  
     * @return string  
     */    
    public static String getUUIDByRules(String rules)    
    {    
      int rpoint = 0;    
        StringBuffer generateRandStr = new StringBuffer();    
        Random rand = new Random();    
        int length = 32;    
        for(int i=0;i<length;i++)    
        {    
            if(rules!=null){    
                rpoint = rules.length();    
                int randNum = rand.nextInt(rpoint);    
                String radStr=getUUID();
                generateRandStr.append(radStr.substring(randNum,randNum+1));    
            }    
        }    
        return generateRandStr+"";    
    }

    /**
     * 返回一个不为空的字符串，当为空时返回def
     *
     * @param str
     * @param def
     */
    public static String isNull(String str, String def)
    {
        if (str == null)
            return def;
        else if (str.length() == 0)
            return def;
        else
            return str;
    }
    
    /**
     * 将List<List<String>>装换成Map<String,List<Integer>>，
     * 只适用于子list为{String,Int}结构的数据
     * @param placeuinglist
     * @return
     * @author 王鑫
     */
    public static Map<String,List<Integer>> listChangeToMap(List<List<String>> placeuinglist){
    	Map<String,List<Integer>> placeusingMap=null;
		if(placeuinglist!=null && placeuinglist.size()>0){
			placeusingMap=new HashMap<String, List<Integer>>();
			Set<String> key=new HashSet<String>();
			for(List<String> temp :placeuinglist){
				String key1=temp.get(0);
				String value1=temp.get(1);
				if(key.contains(key1)){
					placeusingMap.get(key1).add(StringUtil.StringToInt(value1));
				}else{
					key.add(key1);
					List<Integer> valulist=new ArrayList<Integer>();
					valulist.add(StringUtil.StringToInt(value1));
					placeusingMap.put(key1, valulist);
				}
			}
		}
		return placeusingMap;
    }
    
    /**
     * 将List<List<String>>装换成Map<String,List<String>>，
     * 只适用于子list为{String,String}结构的数据,
     * 最后会插入一个key为="hits_key_list"的list记录里本身从List<List<String>>
     * 中遍历出的key的原顺序list
     * @param placeuinglist
     * @return
     * @author wanfly_win7
     */
    public static Map<String,List<String>> listChangeToMapStr(List<List<String>> placeuinglist){
    	Map<String,List<String>> placeusingMap=null;
    	List<String> keylist=new ArrayList<String>();
		if(placeuinglist!=null && placeuinglist.size()>0){
			placeusingMap=new HashMap<String, List<String>>();
			for(List<String> temp :placeuinglist){
				String key1=temp.get(0);
				String value1=temp.get(1);
				if(keylist.contains(key1)){
					placeusingMap.get(key1).add(value1);
				}else{
					keylist.add(key1);
					List<String> valulist=new ArrayList<String>();
					valulist.add(value1);
					placeusingMap.put(key1, valulist);
				}
			}
			placeusingMap.put("hits_key_list", keylist);
		}
		return placeusingMap;
    }
    
    /**
     * 将List<List<String>>装换成Map<String,List<String>>，
     * 中遍历出的key的原顺序list
     * @param placeuinglist
     * @return
     * @author wanfly_win7
     */
    public static Map<String,List<String>> listChange2MapStr(List<List<String>> placeuinglist){
    	Map<String,List<String>> placeusingMap=null;
    	List<String> keylist=new ArrayList<String>();
		if(placeuinglist!=null && placeuinglist.size()>0){
			placeusingMap=new HashMap<String, List<String>>();
			for(List<String> temp :placeuinglist){
				String key1=temp.get(0);
				if(keylist.contains(key1)){
				}else{
					keylist.add(key1);
					placeusingMap.put(key1, temp);
				}
			}
			placeusingMap.put("hits_key_list", keylist);
		}
		return placeusingMap;
    }
    
    /**
	 * 分段换行
	 * 
	 * @param note
	 * @param longs
	 * @author 王鑫
	 * @return
	 */
	public static String sectionNewlines(String note, int longs) {
		String res = "";
		if (note != null && note.length() > longs) {
			int d = note.length() / longs + 1;
			String[] ts = new String[d];
			for (int i = 1; i <= d; i++) {
				if (i != d)
					ts[i - 1] = note.substring((i - 1) * longs, i * longs) + "\n";
				else
					ts[i - 1] = note.substring((i - 1) * longs);
			}
			for (String t : ts) {
				res += t;
			}
		}
		else {
			res = note;
		}
		return res;
	}
	
	public static  boolean ischinese(String note){
		String regEx = "[\\u4e00-\\u9fa5]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(note);
		int count=0;
		while (m.find()) {
			for (int i = 0; i <= m.groupCount(); i++) {
				count = count + 1;
				}
		}
		if(count>0){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 用默认的分隔符“:”拼接两个字符串
	 * @param astr
	 * @param bstr
	 * @return
	 * @author wanfly_win7
	 */
	public static String constr(String astr,String bstr){
		return constr(astr, bstr, null);
	}
	
	/**
	 * 将两个字符串用指定的分隔符进行拼接
	 * @param astr
	 * @param bstr
	 * @param bow
	 * @return
	 * @author wanfly_win7
	 */
	public static String constr(String astr,String bstr,String bow){
		if(bow!=null && !bow.equals("")){
			return null2String(astr)+bow+null2String(bstr);
		}
		return null2String(astr)+":"+null2String(bstr);
	}
	
	/**
	 * 判断数组中是否有重复值
	 * @param v
	 * @return
	 */
	public static boolean ishaveCfz(String[] v){
		if(v!=null && v.length>0){
			Map<String,Integer> m=new HashMap<String, Integer>();
			try{
				int i=0;
				for(String v1:v){
					m.put(v1, i);
					i++;
				}
				if(m.size()==v.length){
					m=null;
					return true;
				}else{
					m=null;
					return false;
				}
			}catch (Exception e) {
				e.printStackTrace();
				m=null;
				return false;
			}
		}
		return false;
	}
	
	/**
	 * 科学计数法的正则表达式
	 * @param input
	 * @return
	 */
	public static boolean getScientific(String input){
    	String regx="^((-?\\d+.?\\d*)[Ee]{1}(-?\\d+))$";//科学计数法正则表达式 
    	Pattern pattern=Pattern.compile(regx);
    	return pattern.matcher(input).matches();
    }
	
	/**
	 * 校验输入的字符串是否是数值
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("-?[0-9]+.?[0-9]+");
		Pattern pattern2 = Pattern.compile("^-?\\d+$"); //所有整数
		Matcher isNum = pattern.matcher(str);
		Matcher isNum2 = pattern2.matcher(str);
		if(isNum.matches() || isNum2.matches()){
			return true; 
		}
		return false; 
	}
	
	/**
	 * 判断字符串是否不为空
	 * @param obj
	 * @return
	 */
	public static boolean notEmpty(String obj){
		if(obj!=null && !obj.equals("")){
			return true;
		}
		return false;
	}
	
	/**
	 * 获取当前允许系统的文件目录结构分割符号，windows下是\，linux下是/
	 * @return
	 */
	public static String getSystemFile(){
		return System.getProperty("file.separator");
	}
}