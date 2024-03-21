package com.benson.wsdemo.endpoint;

import com.jaxb.people.GetPersonRequest;
import com.jaxb.people.GetPersonResponse;
import com.jaxb.people.Person;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PeopleEndpoint {

  @PayloadRoot(namespace = "http://benson-yeh.com/ws-demo/people", localPart = "getPersonRequest")
  @ResponsePayload
  public GetPersonResponse getPerson(@RequestPayload GetPersonRequest request) {
    var resp = new GetPersonResponse();
    var peoplelist = resp.getPeople();
    var person = new Person();
    person.setName("Benson");
    peoplelist.add(person);

    return resp;
  }
}
