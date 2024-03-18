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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * BankDetailsModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BankDetailsModel {
  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routingNumber";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public BankDetailsModel() {
  }

  public BankDetailsModel routingNumber(String routingNumber) {
    
    
    if (routingNumber != null && routingNumber.length() < 1) {
      throw new IllegalArgumentException("Invalid value for routingNumber. Length must be greater than or equal to 1.");
    }
    
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Bank Routing Number
   * @return routingNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "082900872", required = true, value = "Bank Routing Number")

  public String getRoutingNumber() {
    return routingNumber;
  }


  public void setRoutingNumber(String routingNumber) {
    
    
    if (routingNumber != null && routingNumber.length() < 1) {
      throw new IllegalArgumentException("Invalid value for routingNumber. Length must be greater than or equal to 1.");
    }
    this.routingNumber = routingNumber;
  }


  public BankDetailsModel accountNumber(String accountNumber) {
    
    
    if (accountNumber != null && accountNumber.length() < 3) {
      throw new IllegalArgumentException("Invalid value for accountNumber. Length must be greater than or equal to 3.");
    }
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Bank Account Number
   * @return accountNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1234567890", required = true, value = "Bank Account Number")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    
    
    if (accountNumber != null && accountNumber.length() < 3) {
      throw new IllegalArgumentException("Invalid value for accountNumber. Length must be greater than or equal to 3.");
    }
    this.accountNumber = accountNumber;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the BankDetailsModel instance itself
   */
  public BankDetailsModel putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankDetailsModel bankDetailsModel = (BankDetailsModel) o;
    return Objects.equals(this.routingNumber, bankDetailsModel.routingNumber) &&
        Objects.equals(this.accountNumber, bankDetailsModel.accountNumber)&&
        Objects.equals(this.additionalProperties, bankDetailsModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routingNumber, accountNumber, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankDetailsModel {\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("routingNumber");
    openapiFields.add("accountNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("routingNumber");
    openapiRequiredFields.add("accountNumber");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BankDetailsModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BankDetailsModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BankDetailsModel is not found in the empty JSON string", BankDetailsModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BankDetailsModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("routingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `routingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("routingNumber").toString()));
      }
      if (!jsonObj.get("accountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BankDetailsModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BankDetailsModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BankDetailsModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BankDetailsModel.class));

       return (TypeAdapter<T>) new TypeAdapter<BankDetailsModel>() {
           @Override
           public void write(JsonWriter out, BankDetailsModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public BankDetailsModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BankDetailsModel instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BankDetailsModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BankDetailsModel
  * @throws IOException if the JSON string is invalid with respect to BankDetailsModel
  */
  public static BankDetailsModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BankDetailsModel.class);
  }

 /**
  * Convert an instance of BankDetailsModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

