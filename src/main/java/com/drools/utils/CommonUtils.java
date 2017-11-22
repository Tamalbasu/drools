package com.drools.utils;


public class CommonUtils {
	
/*	private static final Logger LOGGER = LoggerFactory
			.getLogger(CommonUtils.class);
	
	public static final String INTEGERVALUE = "^?[0-9]+?$";

	public static boolean isEmpty(String pString) {
        boolean isEmpty = false;

        if (pString == null || pString.trim().length() < 1) {
            isEmpty = true;
        }
        return isEmpty;
    }
	
	public static boolean isNullOrEmpty(Collection c) {
		boolean result = true;
		if (c != null && c.size() > 0) {
			result = false;
		}
		return result;
	}
	
	public static String getTimeStamp(){
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		return sdf.format(timestamp);
	}
	
	public static boolean isInteger(String str) {
		int temp = 0;
		if (str != null && str.matches(INTEGERVALUE)) {
			try {
				// str is within the integer range
				temp = Integer.parseInt(str);
			} catch (NumberFormatException e) {
				LOGGER.error("Exception in converting string to integer");
				return false;
			}
			return true;
		}
		return false;
	}
	
	public static String formatMessage(String message,String pattern) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(message.trim());
		if (m.find ())
	      {
	         String temp=message.substring(0,m.start());
	         return temp;
	      }
		return message;
	}

	public static String getJSONrequestFromObject(Object object) {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		String requestJson = null;
		try {
			requestJson = mapper.writerWithDefaultPrettyPrinter()
					.writeValueAsString(object);
		} catch (Exception e) {
			LOGGER.error("Error in getting the JSON request from the object",e);
		}
		return requestJson;
	}
	
	private static String parseJson(String response,String parsePath) {
		if(response == null){
			return null;
		}
		if(parsePath!=null){
			JsonNode jsonNode = null;
			try {
				JsonNode rootNode = new ObjectMapper().readTree(new StringReader(response));
				jsonNode = rootNode.get(parsePath);
			} catch (IOException e) {
				LOGGER.error("Error in parsing the node of the JSON response",e);
			}
			return jsonNode.toString();
		}else {
			return response;
		}
	}
	
	public static JSONObject getJsonObjectFromString(String response)  {
		JSONParser j = new JSONParser();
		JSONObject jsonObject = null;
		try {
			jsonObject =  (JSONObject)j.parse(response);
		} catch (ParseException e) {
			
		}
		return  jsonObject;
	}*/

}
