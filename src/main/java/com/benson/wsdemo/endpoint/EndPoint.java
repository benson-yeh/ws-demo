package com.benson.wsdemo.endpoint;

import java.util.List;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.benson_yeh.ws_demo.*;

@Endpoint
public class EndPoint {
  @PayloadRoot(namespace = "http://benson-yeh.com/ws-demo", localPart = "getCountryRequest")
  @ResponsePayload
  public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
    GetCountryResponse response = new GetCountryResponse();

    var country = new Country();
    country.setName("TW");
    country.setCapital("TPE");
    country.setCurrency(Currency.EUR);

    var country2 = new Country();
    country2.setName("TW");
    country2.setCapital("TPE");
    country2.setCurrency(Currency.EUR);

    response.getCountry().addAll(List.of(country, country2));

    return response;
  }
}
