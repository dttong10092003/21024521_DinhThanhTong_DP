package dp_adapter;

import org.json.XML;

import org.json.JSONObject;

public class XmlToJsonAdapter implements DataConverter {
	@Override
	public String convert(String xmlData) {
		JSONObject jsonObject = XML.toJSONObject(xmlData);
		return jsonObject.toString(4); // Format đẹp hơn
	}
}
