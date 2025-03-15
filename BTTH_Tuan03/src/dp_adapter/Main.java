package dp_adapter;

public class Main {
	public static void main(String[] args) {
        // XML đầu vào
        String xmlData = "<user><name>Nguyễn Văn A</name><age>30</age></user>";
        System.out.println(" XML gốc:\n" + xmlData);

        // Chuyển XML → JSON
        DataConverter xmlToJson = new XmlToJsonAdapter();
        String jsonData = xmlToJson.convert(xmlData);
        System.out.println("\n Chuyển XML → JSON:\n" + jsonData);

        // Chuyển JSON → XML
        DataConverter jsonToXml = new JsonToXmlAdapter();
        String xmlConvertedBack = jsonToXml.convert(jsonData);
        System.out.println("\n Chuyển JSON → XML:\n" + xmlConvertedBack);
    }
}
