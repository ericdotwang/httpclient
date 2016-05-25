package com.zf.httpclient.body;

import com.zf.httpclient.ContentType;

import org.json.JSONObject;

public class JsonBody extends TextBody {

	public JsonBody(String json) {
		super(json);
	}
	
	public JsonBody(JSONObject json) {
		super(json.toString());
	}
	
	@Override
	public String getContentType() {
		return ContentType.APPLICATION_JSON;
	}

	@Override
	public String getContent() {
		return text;
	}

	@Override
	public long getContentLength() {
		return text.getBytes().length;
	}

}