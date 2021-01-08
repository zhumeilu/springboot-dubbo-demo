package com.lmhd.common.util;

import com.alibaba.fastjson.JSONObject;
import de.odysseus.staxon.json.JsonXMLConfig;
import de.odysseus.staxon.json.JsonXMLConfigBuilder;
import de.odysseus.staxon.json.JsonXMLInputFactory;
import de.odysseus.staxon.json.JsonXMLOutputFactory;
import de.odysseus.staxon.xml.util.PrettyXMLEventWriter;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @DESCRIPTION：
 * @author：DDCAO
 * @createDate：2019-02-28 18:11
 **/
public class XmlConvertUtil {

	public static String json2xml(String json) {
		StringReader input = new StringReader(json);
		StringWriter output = new StringWriter();
		JsonXMLConfig config = new JsonXMLConfigBuilder().multiplePI(false).repairingNamespaces(false).build();
		try {
			XMLEventReader reader = new JsonXMLInputFactory(config).createXMLEventReader(input);
			XMLEventWriter writer = XMLOutputFactory.newInstance().createXMLEventWriter(output);
			writer = new PrettyXMLEventWriter(writer);
			writer.add(reader);
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				output.close();
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return output.toString();
	}

	/**
	 * @Description: json string convert to xml string ewidepay ues only
	 * @author DDCAO
	 * @date 2017年7月19日 上午10:50:32
	 */
	public static String json2xmlPay(String json) {
		StringReader input = new StringReader(json);
		StringWriter output = new StringWriter();
		JsonXMLConfig config = new JsonXMLConfigBuilder().multiplePI(false).repairingNamespaces(false).build();
		try {
			XMLEventReader reader = new JsonXMLInputFactory(config).createXMLEventReader(input);
			XMLEventWriter writer = XMLOutputFactory.newInstance().createXMLEventWriter(output);
			writer = new PrettyXMLEventWriter(writer);
			writer.add(reader);
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				output.close();
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (output.toString().length() >= 38) {// remove <?xml version="1.0" encoding="UTF-8"?>
			return "<xml>" + output.toString().substring(39) + "</xml>";
		}
		return output.toString();
	}

	/**
	 * @Description: json string convert to xml string ewidepay ues only
	 * @author DDCAO
	 * @date 2017年7月19日 上午10:50:32
	 */
	public static String json2xmlPayExceptXmlTag(String json) {
		StringReader input = new StringReader(json);
		StringWriter output = new StringWriter();
		JsonXMLConfig config = new JsonXMLConfigBuilder().multiplePI(false).repairingNamespaces(false).build();
		try {
			XMLEventReader reader = new JsonXMLInputFactory(config).createXMLEventReader(input);
			XMLEventWriter writer = XMLOutputFactory.newInstance().createXMLEventWriter(output);
			writer = new PrettyXMLEventWriter(writer);
			writer.add(reader);
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				output.close();
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (output.toString().length() >= 38) {// remove <?xml version="1.0" encoding="UTF-8"?>
			return output.toString().substring(39);
		}
		return output.toString();
	}

	/**
	 * @Description: xml string convert to json string
	 * @author DDCAO
	 * @date 2017年7月19日 上午10:50:46
	 */
	public static String xml2json(String xml) {
		StringReader input = new StringReader(xml);
		StringWriter output = new StringWriter();
		JsonXMLConfig config = new JsonXMLConfigBuilder().autoArray(true).autoPrimitive(true).prettyPrint(true).build();
		try {
			XMLEventReader reader = XMLInputFactory.newInstance().createXMLEventReader(input);
			XMLEventWriter writer = new JsonXMLOutputFactory(config).createXMLEventWriter(output);
			writer.add(reader);
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				output.close();
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return output.toString();
	}

	/**
	 * @Description: 去掉转换xml之后的换行和空格
	 * @author DDCAO
	 * @date 2017年8月9日 下午4:05:44
	 */
	public static String json2xmlReplaceBlank(String json) {
		String str = json2xml(json);
		String dest = "";
		if (str != null) {
			Pattern p = Pattern.compile("\\s*|\t|\r|\n");
			Matcher m = p.matcher(str);
			dest = m.replaceAll("");
		}
		return dest;
	}
	/**
	 * @Description: xml string convert to json string
	 * @author DDCAO
	 * @date 2017年7月19日 上午10:50:46
	 */
	public static JSONObject xml2jsonObject(String xml) {
		String output = xml2json(xml);
		return JSONObject.parseObject(output.toString());
	}

}
