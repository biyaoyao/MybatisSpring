package byy.com.util;
 
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 容器类转化为json字符串
 * 
 * @since 2015/08/25
 * @author 2i
 *
 */
public class CollectionToJson {

	/**
	 * 容器类转换称json string
	 * 
	 * @since 2015/08/25
	 * @revise 09/01 YangKang param is map not collection
	 * @author 2i
	 * @param map
	 * @return
	 */
	public static String byObject(Map<?, ?> map) { 
		JSONObject jsonObj = null; 
		try {
			if(map == null) {
				jsonObj = new JSONObject(); 
				jsonObj.put("code", 301); 
				jsonObj.put("err_msg", "map is empty");
			}else if(map.containsKey("code")){ //包含错误信息
				jsonObj = new JSONObject(map);
			}else{  //正确返回信息 code 为200
				jsonObj = new JSONObject(map);
				jsonObj.put("code", 200);
			} 
		} catch (JSONException e) {
			return "{\"code\": 302,\"err_msg\": \"generate to json error\"}"; 
		} 
		return jsonObj.toString();
	} 
	
	
	/**
	 * 容器类转换称json string
	 * 
	 * @since 2015/08/25
	 * @author 2i
	 * @param collection
	 * @return
	 */ 
	public static String byList(List<?> list, String keyName) { 
		JSONObject jsonObj = null; 
		try {
			if(list == null) {
				jsonObj = new JSONObject(); 
				jsonObj.put("code", 303); 
				jsonObj.put("err_msg", "list is null");
			}else {  
				jsonObj = new JSONObject();
				jsonObj.put(keyName, list); 
				jsonObj.put(keyName + "_size", list.size()); 
				jsonObj.put("code", 200);
			} 
		} catch (JSONException e) {
			return "{\"code\": 302,\"err_msg\": \"generate to json error\"}"; 
		} 
		return jsonObj.toString();
	}
	 
	/**
	 * 错误信息
	 * 
	 * @author 2i
	 * @since 2015/08/27
	 * @param errorCode
	 * @param errMsg
	 * @return
	 */
	public static String byErrInfo(int errorCode,String errMsg){
		JSONObject jsonObj = null; 
		try {
			jsonObj = new JSONObject(); 
			jsonObj.put("code", errorCode); 
			jsonObj.put("err_msg", errMsg);
		} catch (JSONException e) {
			return "{\"code\": 302,\"err_msg\": \"generate to json error\"}"; 
		} 
		return jsonObj.toString();
	}
	
	/**
	 * 正确信息
	 * 
	 * @author 2i
	 * @since 2015/08/27
	 * @param msg
	 * @return
	 */
	public static String byMsgInfo(String msg){
		JSONObject jsonObj = null; 
		try {
			jsonObj = new JSONObject(); 
			jsonObj.put("code", 200); 
			jsonObj.put("msg", msg);
		} catch (JSONException e) {
			return "{\"code\": 302,\"err_msg\": \"generate to json error\"}"; 
		} 
		return jsonObj.toString();
	}
}
