package com.fund.service;

import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Service;

import com.fund.criteria.Criteria;
import com.google.gson.Gson;

@Service
public class FundService {
	
	public Object searchFundsell(Criteria criteria) {
		Object result = null;
		HttpClient httpclient = HttpClients.createDefault();

		try {
			URIBuilder builder = new URIBuilder("https://api.sec.or.th/FundFactsheet/fund/{proj_id}/IPO");

			URI uri = builder.build();
			HttpGet request = new HttpGet(uri);
			request.setHeader("Ocp-Apim-Subscription-Key", "{subscription key}");

			Gson gson = new Gson();
			String body = gson.toJson(criteria);
			System.out.println(body);
			
			// Request body
			StringEntity reqEntity = new StringEntity(body);
			((HttpResponse) request).setEntity(reqEntity);

			HttpResponse response = httpclient.execute(request);
			result = response.getEntity();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return result;
	}

}
