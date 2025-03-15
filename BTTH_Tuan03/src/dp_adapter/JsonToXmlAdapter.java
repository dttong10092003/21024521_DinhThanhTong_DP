package dp_adapter;

import org.json.JSONObject;
import org.json.XML;

public class JsonToXmlAdapter implements DataConverter {
	@Override
	public String convert(String jsonData) {
		JSONObject jsonObject = new JSONObject(jsonData);
		return XML.toString(jsonObject);
	}
}
