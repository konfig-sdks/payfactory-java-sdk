/*
 * Payfactory Api
 * Payfactory specializes in embedded payment facilitation (payfac) services for ISVs and SaaS companies. Our gateway-friendly platform integrates with software systems to provide seamless payment facilitation with little to no development required, allowing our partners to minimize integration costs and quickly gain a new revenue stream. Founded by payment industry veterans, we believe that integrated processing should be simple, frictionless and fast – while also maintaining the highest level of security, customer service and human support.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ApplicationStatus
 */
@JsonAdapter(ApplicationStatus.Adapter.class)public enum ApplicationStatus {
  
  UNKNOWN("Unknown"),
  
  SUBMITTED("Submitted"),
  
  PENDING("Pending"),
  
  UNDERWRITING("Underwriting"),
  
  APPROVED("Approved"),
  
  DECLINDED("Declinded"),
  
  ONBOARDED("Onboarded");

  private String value;

  ApplicationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ApplicationStatus fromValue(String value) {
    for (ApplicationStatus b : ApplicationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ApplicationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ApplicationStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ApplicationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ApplicationStatus.fromValue(value);
    }
  }
}

