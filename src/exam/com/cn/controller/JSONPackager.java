package exam.com.cn.controller;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JSONPackager{
	/**
	 * 
	 * @param status 状态  true（成功）,false（失败） 
	 * @param data 返回值 json对象
	 * @param desc 描述信息
	 * @return  
	 */
	public static String jsonObjData(boolean status,JSONObject data,String desc ){
		JSONObject result = new JSONObject();
		result.put("status", status);
		result.put("data", data);		
		result.put("description", desc);		
		return result.toString();
	}		
	/**
	 * 
	 * @param status 状态  true（成功）,false（失败） 
	 * @param data 返回值 json数组
	 * @param desc 描述信息
	 * @return  
	 */
	public static String jsonArrData(boolean status,JSONArray data,String desc ){
		JSONObject result = new JSONObject();		
		result.put("status", status);
		result.put("data", data);
		result.put("description", desc);		
		return result.toString();
	}
}