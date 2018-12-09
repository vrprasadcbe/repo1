package com.prasad.rest;
import java.util.UUID;
import java.security.SecureRandom;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prasad.package1;
import com.prasad.package2;
import com.prasad.package3;
import com.prasad.package4;

import org.springframework.http.MediaType;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.XML;

@RestController
public class Controller {
  @RequestMapping(value="/healthcheck",produces={MediaType.TEXT_PLAIN_VALUE})
  	public String  healthCheck() throws JSONException {
  		return "ok";
  	}
}
