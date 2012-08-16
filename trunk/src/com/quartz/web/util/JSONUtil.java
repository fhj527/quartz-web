/**
 * JWatch - Quartz Monitor: http://code.google.com/p/jwatch/
 * Copyright (C) 2011 Roy Russo and the original author or authors.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 */
package com.quartz.web.util;

import net.sf.ezmorph.MorpherRegistry;
import net.sf.ezmorph.object.DateMorpher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.JSONUtils;
import net.sf.json.xml.XMLSerializer;

import javax.servlet.http.HttpServletRequest;

import com.quartz.web.pojo.QrtzJobDetails;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author <a href="mailto:royrusso@gmail.com">Roy Russo</a>
 *         Date: Apr 8, 2011 4:28:10 PM
 */
public class JSONUtil {
    public static Map<String, String> convertRequestToMap(HttpServletRequest request) {
        Map returnMap = new HashMap();
        if (request.getParameterMap() != null) {
            for (Iterator it = request.getParameterMap().entrySet().iterator(); it.hasNext(); ) {
                Map.Entry entry = (Map.Entry) it.next();
                String k = (String) entry.getKey();
                String v = request.getParameter(k);
                returnMap.put(k, v);
            }
        }
        return returnMap;
    }

    public static JSONObject buildError(String message) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(GlobalConstants.JSON_SUCCESS_KEY, false);
        jsonObject.put(GlobalConstants.JSON_MESSAGE, message);
        return jsonObject;
    }
    public static JSONObject buildSuccess(String message) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(GlobalConstants.JSON_SUCCESS_KEY, true);
        jsonObject.put(GlobalConstants.JSON_MESSAGE, message);
        return jsonObject;
    }
    
    /**
     * 
     * @param objects
     * @return
     */
    public static JSONObject list2json(List objects){
    	Map map = new HashMap();
		Iterator it = objects.iterator(); 
        while(it.hasNext()){ 
        	Object object = (Object)it.next();
        	map.put("totalCount", objects.size());
        	map.put("results", object);
        }
		return JSONObject.fromObject(map);
    }
    
    public static Map<String, String> convertList2Map(List objects) {
        Map returnMap = new HashMap();
        objects.toArray();
        if (objects != null) {
            for (Iterator it = objects.iterator(); it.hasNext(); ) {
                Object object = (Object) it.next();
                returnMap =getFiledValues(object);
            }
        }
        return returnMap;
    }

    /**
     * ʹ�÷�������������ƻ�ȡ����ֵ 
     * @param fieldName
     * @param o
     * @return
     */
    private static Object getFieldValueByName(String fieldName, Object o) {  
        try {  
            String firstLetter = fieldName.substring(0, 1).toUpperCase();  
            String getter = "get" + firstLetter + fieldName.substring(1);  
            Method method = o.getClass().getMethod(getter, new Class[] {});  
            Object value = method.invoke(o, new Object[] {});  
            return value;  
        } catch (Exception e) {  
            System.out.println("���Բ�����");  
            return null;  
        }  
    }                                      

    /**
     * 2. ��ȡ�������ԣ�����һ���ַ�������   
     * @param o
     * @return
     */
    private static String[] getFiledName(Object o){
    	Field[] fields=o.getClass().getDeclaredFields();
       	String[] fieldNames=new String[fields.length];
    	for(int i=0;i<fields.length;i++){
    		fieldNames[i]=fields[i].getName();
    	}
    	return fieldNames;
    }  
 
    /**
     * 3. ͨ�������������裬���ɽ�һ������ת��Ϊһ������            
     * @param o
     * @return
     */
    public static Map getFiledValues(Object o){
    	String[] fieldNames=getFiledName(o);
    	Object[] value=new Object[fieldNames.length];
    	Map<Object, Object> map = new HashMap<Object, Object>();
    	for(int i=0;i<fieldNames.length;i++){
    		map.put(fieldNames[i], getFieldValueByName(fieldNames[i], o));
    	}
    	return map;
    }
  

	/**
	* ��json��ת����ʵ�����
	* @param jsonObjStr e.g. {'name':'get','dateAttr':'2009-11-12'}
	* @param clazz Person.class
	* @return
	*/
	public static Object getDtoFromJsonObjStr(String jsonObjStr, Class clazz) {
		return JSONObject.toBean(JSONObject.fromObject(jsonObjStr), clazz);
	}

	/**
	* ��json��ת����ʵ����󣬲���ʵ�弯�����Դ�������ʵ��Bean
	* @param jsonObjStr e.g. {'data':[{'name':'get'},{'name':'set'}]}
	* @param clazz e.g. MyBean.class
	* @param classMap e.g. classMap.put("data", Person.class)
	* @return Object
	*/
	public static Object getDtoFromJsonObjStr(String jsonObjStr, Class clazz, Map classMap) {
		return JSONObject.toBean(JSONObject.fromObject(jsonObjStr), clazz, classMap);
	}

	/**
	* ��һ��json���鴮ת������ͨ����
	* @param jsonArrStr  e.g. ['get',1,true,null]
	* @return Object[]
	*/
	public static Object[] getArrFromJsonArrStr(String jsonArrStr) {
		return JSONArray.fromObject(jsonArrStr).toArray();
	}

	/**
	* ��һ��json���鴮ת����ʵ������
	* @param jsonArrStr e.g. [{'name':'get'},{'name':'set'}]
	* @param clazz e.g. Person.class
	* @return Object[]
	*/
	public static Object[] getDtoArrFromJsonArrStr(String jsonArrStr, Class clazz) {
		JSONArray jsonArr = JSONArray.fromObject(jsonArrStr);
		Object[] objArr = new Object[jsonArr.size()];
		for (int i = 0; i < jsonArr.size(); i++) {
			objArr[i] = JSONObject.toBean(jsonArr.getJSONObject(i), clazz);
		}
		return objArr;
	}

	/**
	* ��һ��json���鴮ת����ʵ�����飬������Ԫ�ص����Ժ�������ʵ��Bean
	* @param jsonArrStr e.g. [{'data':[{'name':'get'}]},{'data':[{'name':'set'}]}]
	* @param clazz e.g. MyBean.class
	* @param classMap e.g. classMap.put("data", Person.class)
	* @return Object[]
	*/
	public static Object[] getDtoArrFromJsonArrStr(String jsonArrStr, Class clazz,
			Map classMap) {
		JSONArray array = JSONArray.fromObject(jsonArrStr);
		Object[] obj = new Object[array.size()];
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			obj[i] = JSONObject.toBean(jsonObject, clazz, classMap);
		}
		return obj;
	}

	/**
	* ��һ��json���鴮ת���ɴ����ͨ����Ԫ�صļ���
	* @param jsonArrStr  e.g. ['get',1,true,null]
	* @return List
	*/
	public static List getListFromJsonArrStr(String jsonArrStr) {
		JSONArray jsonArr = JSONArray.fromObject(jsonArrStr);
		List list = new ArrayList();
		for (int i = 0; i < jsonArr.size(); i++) {
			list.add(jsonArr.get(i));
		}
		return list;
	}

	/**
	* ��һ��json���鴮ת���ɼ��ϣ��Ҽ������ŵ�Ϊʵ��Bean
	* @param jsonArrStr e.g. [{'name':'get'},{'name':'set'}]
	* @param clazz
	* @return List
	*/
	public static List getListFromJsonArrStr(String jsonArrStr, Class clazz) {
		JSONArray jsonArr = JSONArray.fromObject(jsonArrStr);
		List list = new ArrayList();
		for (int i = 0; i < jsonArr.size(); i++) {
			list.add(JSONObject.toBean(jsonArr.getJSONObject(i), clazz));
		}
		return list;
	}

	/**
	* ��һ��json���鴮ת���ɼ��ϣ��Ҽ�����Ķ�������Ժ�������ʵ��Bean
	* @param jsonArrStr e.g. [{'data':[{'name':'get'}]},{'data':[{'name':'set'}]}]
	* @param clazz e.g. MyBean.class
	* @param classMap e.g. classMap.put("data", Person.class)
	* @return List
	*/
	public static List getListFromJsonArrStr(String jsonArrStr, Class clazz, Map classMap) {
		JSONArray jsonArr = JSONArray.fromObject(jsonArrStr);
		List list = new ArrayList();
		for (int i = 0; i < jsonArr.size(); i++) {
			list.add(JSONObject.toBean(jsonArr.getJSONObject(i), clazz, classMap));
		}
		return list;
	}

	/**
	* ��json����ת����map����
	* @param jsonObjStr e.g. {'name':'get','int':1,'double',1.1,'null':null}
	* @return Map
	*/
	public static Map getMapFromJsonObjStr(String jsonObjStr) {
		JSONObject jsonObject = JSONObject.fromObject(jsonObjStr);

		Map map = new HashMap();
		for (Iterator iter = jsonObject.keys(); iter.hasNext();) {
			String key = (String) iter.next();
			map.put(key, jsonObject.get(key));
		}
		return map;
	}

	/**
	* ��json����ת����map������map�������ŵ�Ϊ����ʵ��Bean
	* @param jsonObjStr e.g. {'data1':{'name':'get'},'data2':{'name':'set'}}
	* @param clazz e.g. Person.class
	* @return Map
	*/
	public static Map getMapFromJsonObjStr(String jsonObjStr, Class clazz) {
		JSONObject jsonObject = JSONObject.fromObject(jsonObjStr);

		Map map = new HashMap();
		for (Iterator iter = jsonObject.keys(); iter.hasNext();) {
			String key = (String) iter.next();
			map.put(key, JSONObject.toBean(jsonObject.getJSONObject(key), clazz));
		}
		return map;
	}

	/**
	 * ��json����ת����map������map�������ŵ�����ʵ��Bean����������ʵ��Bean
	 * @param jsonObjStr e.g. {'mybean':{'data':[{'name':'get'}]}}
	 * @param clazz e.g. MyBean.class
	 * @param classMap	e.g. classMap.put("data", Person.class)
	 * @return Map
	 */
	public static Map getMapFromJsonObjStr(String jsonObjStr, Class clazz, Map classMap) {
		JSONObject jsonObject = JSONObject.fromObject(jsonObjStr);

		Map map = new HashMap();
		for (Iterator iter = jsonObject.keys(); iter.hasNext();) {
			String key = (String) iter.next();
			map.put(key, JSONObject
					.toBean(jsonObject.getJSONObject(key), clazz, classMap));
		}
		return map;
	}

	/**
	 * ��ʵ��Bean��Map�������顢�б���ת����Json��
	 * @param obj 
	 * @return
	 * @throws Exception String
	 */
//	public static String getJsonStr(Object obj) {
//		String jsonStr = null;
//		//Json����    
//		JsonConfig jsonCfg = new JsonConfig();
//
//		//ע�����ڴ�����
//		jsonCfg.registerJsonValueProcessor(java.util.Date.class,
//				new JsonDateValueProcessor(Util.YYYY_MM_DD_HH_MM_ss));
//		if (obj == null) {
//			return "{}";
//		}
//
//		if (obj instanceof Collection || obj instanceof Object[]) {
//			jsonStr = JSONArray.fromObject(obj, jsonCfg).toString();
//		} else {
//			jsonStr = JSONObject.fromObject(obj, jsonCfg).toString();
//		}
//
//		return jsonStr;
//	}
//
//	/**
//	 * ��json�������顢����(collection map)��ʵ��Beanת����XML
//	 * XMLSerializer API��
//	 * http://json-lib.sourceforge.net/apidocs/net/sf/json/xml/XMLSerializer.html
//	 * ����ʵ����ο���
//	 * http://json-lib.sourceforge.net/xref-test/net/sf/json/xml/TestXMLSerializer_writes.html
//	 * http://json-lib.sourceforge.net/xref-test/net/sf/json/xml/TestXMLSerializer_writes.html
//	 * @param obj 
//	 * @return
//	 * @throws Exception String
//	 */
//	public static String getXMLFromObj(Object obj) {
//		XMLSerializer xmlSerial = new XMLSerializer();
//
//		//Json����    
//		JsonConfig jsonCfg = new JsonConfig();
//
//		//ע�����ڴ�����
//		jsonCfg.registerJsonValueProcessor(java.util.Date.class,
//				new JsonDateValueProcessor(Util.YYYY_MM_DD_HH_MM_ss));
//
//		if ((String.class.isInstance(obj) && String.valueOf(obj).startsWith("["))
//				|| obj.getClass().isArray() || Collection.class.isInstance(obj)) {
//			JSONArray jsonArr = JSONArray.fromObject(obj, jsonCfg);
//			return xmlSerial.write(jsonArr);
//		} else {
//			JSONObject jsonObj = JSONObject.fromObject(obj, jsonCfg);
//			return xmlSerial.write(jsonObj);
//		}
//	}

	/**
	 * ��XMLתjson��
	 * @param xml
	 * @return String
	 */
	public static String getJsonStrFromXML(String xml) {
		XMLSerializer xmlSerial = new XMLSerializer();
		return String.valueOf(xmlSerial.read(xml));
	}
	
}
