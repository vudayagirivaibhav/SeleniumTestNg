package testing.webservice;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestTest {

	
		@Test
		public void engineersTest() throws ClientProtocolException, IOException {
			Map<String,String> countryCapital = new HashMap<String,String>();
			HttpClient client = new DefaultHttpClient();

			HttpGet get = new HttpGet("https://bayamprestapp.herokuapp.com//bayamp/engineers");
			//get.addHeader("content-type","application/xml");

			HttpResponse reponseMessage = client.execute(get);
			StatusLine line = reponseMessage.getStatusLine();
			int code = line.getStatusCode();
			AssertJUnit.assertEquals(code, 200);
			HttpEntity body = reponseMessage.getEntity();

			String expectedContent ="[{\"id\":\"NkzLzR-ke\",\"name\":\"Mahesh\"},{\"id\":\"NkXLwZGyl\",\"name\":\"vinay\"},{\"id\":\"N1gfnpt8l\",\"name\":\"harish\"},{\"id\":\"VyovGSPje\"}]";
			String content = EntityUtils.toString(body);
			//System.out.println(content);
			AssertJUnit.assertEquals(content,expectedContent);

			//client.ex
		}
		
		@Test
		public void engineersTest1() throws ClientProtocolException, IOException {
			Map<String,String> countryCapital = new HashMap<String,String>();
			String url ="https://bayamprestapp.herokuapp.com//bayamp/create";
			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);
			post.addHeader("content-type","application/json");
         
			List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
			urlParameters.add(new BasicNameValuePair("name", "vaibhav"));
			post.setEntity(new UrlEncodedFormEntity(urlParameters));
		  	HttpResponse reponseMessage = client.execute(post);
			StatusLine line = reponseMessage.getStatusLine();
			int code = line.getStatusCode();
			Assert.assertEquals(code, 200);
			HttpEntity body = reponseMessage.getEntity();
		
			String content = EntityUtils.toString(body);
			//System.out.println(content);
		

			//client.ex
		}
		
		

	}


