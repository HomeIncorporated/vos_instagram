/**
 * "First, solve the problem. Then, write the code. -John Johnson"
 * "Or use Vangav M"
 * www.vangav.com
 * */

/**
 * MIT License
 *
 * Copyright (c) 2016 Vangav
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 * */

/**
 * Community
 * Facebook Group: Vangav Open Source - Backend
 *   fb.com/groups/575834775932682/
 * Facebook Page: Vangav
 *   fb.com/vangav.f
 * 
 * Third party communities for Vangav Backend
 *   - play framework
 *   - cassandra
 *   - datastax
 *   
 * Tag your question online (e.g.: stack overflow, etc ...) with
 *   #vangav_backend
 *   to easier find questions/answers online
 * */

package com.vangav.vos_instagram.controllers.login_email;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vangav.backend.play_framework.param.ParamOptionality;
import com.vangav.backend.play_framework.param.ParamType;
import com.vangav.backend.play_framework.request.RequestJsonBodyPost;

/**
 * GENERATED using ControllersGeneratorMain.java
 */
/**
 * RequestLoginEmail represents the request's structure
 * */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestLoginEmail extends RequestJsonBodyPost {

  @Override
  @JsonIgnore
  protected String getName () throws Exception {

    return "LoginEmail";
  }

  @Override
  @JsonIgnore
  protected RequestLoginEmail getThis () throws Exception {

    return this;
  }

  @JsonIgnore
  public static final String kRequestTrackingIdName = "request_tracking_id";
  @JsonProperty
  public String request_tracking_id;

  @JsonIgnore
  public static final String kDeviceTokenName = "device_token";
  @JsonProperty
  public String device_token;

  @JsonIgnore
  public static final String kEmailName = "email";
  @JsonProperty
  public String email;

  @JsonIgnore
  public static final String kPasswordName = "password";
  @JsonProperty
  public String password;

  @Override
  @JsonIgnore
  public void validate () throws Exception {

    this.validate(
      kRequestTrackingIdName,
      this.request_tracking_id,
      ParamType.UUID,
      ParamOptionality.OPTIONAL);

    this.validate(
      kDeviceTokenName,
      this.device_token,
      ParamType.DEVICE_TOKEN,
      ParamOptionality.MANDATORY);

    this.validate(
      kEmailName,
      this.email,
      ParamType.EMAIL,
      ParamOptionality.MANDATORY);

    this.validate(
      kPasswordName,
      this.password,
      ParamType.PASSWORD,
      ParamOptionality.MANDATORY);

  }
}
