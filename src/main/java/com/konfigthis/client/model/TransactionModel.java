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
import com.konfigthis.client.model.CardTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * TransactionModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TransactionModel {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private Double fee;

  public static final String SERIALIZED_NAME_MASKED_PAN = "maskedPan";
  @SerializedName(SERIALIZED_NAME_MASKED_PAN)
  private String maskedPan;

  public static final String SERIALIZED_NAME_CARD_TYPE = "cardType";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private CardTypeEnum cardType;

  public static final String SERIALIZED_NAME_CARDHOLDER_NAME = "cardholderName";
  @SerializedName(SERIALIZED_NAME_CARDHOLDER_NAME)
  private String cardholderName;

  public static final String SERIALIZED_NAME_EXP_DATE = "expDate";
  @SerializedName(SERIALIZED_NAME_EXP_DATE)
  private String expDate;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_REF_NUMBER = "refNumber";
  @SerializedName(SERIALIZED_NAME_REF_NUMBER)
  private String refNumber;

  public static final String SERIALIZED_NAME_BATCH_ID = "batchId";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private String batchId;

  public static final String SERIALIZED_NAME_AUTH_CODE = "authCode";
  @SerializedName(SERIALIZED_NAME_AUTH_CODE)
  private String authCode;

  public static final String SERIALIZED_NAME_USER_DATA = "userData";
  @SerializedName(SERIALIZED_NAME_USER_DATA)
  private String userData;

  public TransactionModel() {
  }

  public TransactionModel date(OffsetDateTime date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    
    
    
    this.date = date;
  }


  public TransactionModel amount(Double amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    
    
    
    this.amount = amount;
  }


  public TransactionModel fee(Double fee) {
    
    
    
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getFee() {
    return fee;
  }


  public void setFee(Double fee) {
    
    
    
    this.fee = fee;
  }


  public TransactionModel maskedPan(String maskedPan) {
    
    
    
    
    this.maskedPan = maskedPan;
    return this;
  }

   /**
   * Get maskedPan
   * @return maskedPan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMaskedPan() {
    return maskedPan;
  }


  public void setMaskedPan(String maskedPan) {
    
    
    
    this.maskedPan = maskedPan;
  }


  public TransactionModel cardType(CardTypeEnum cardType) {
    
    
    
    
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CardTypeEnum getCardType() {
    return cardType;
  }


  public void setCardType(CardTypeEnum cardType) {
    
    
    
    this.cardType = cardType;
  }


  public TransactionModel cardholderName(String cardholderName) {
    
    
    
    
    this.cardholderName = cardholderName;
    return this;
  }

   /**
   * Get cardholderName
   * @return cardholderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCardholderName() {
    return cardholderName;
  }


  public void setCardholderName(String cardholderName) {
    
    
    
    this.cardholderName = cardholderName;
  }


  public TransactionModel expDate(String expDate) {
    
    
    
    
    this.expDate = expDate;
    return this;
  }

   /**
   * Get expDate
   * @return expDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpDate() {
    return expDate;
  }


  public void setExpDate(String expDate) {
    
    
    
    this.expDate = expDate;
  }


  public TransactionModel type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public TransactionModel refNumber(String refNumber) {
    
    
    
    
    this.refNumber = refNumber;
    return this;
  }

   /**
   * Get refNumber
   * @return refNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRefNumber() {
    return refNumber;
  }


  public void setRefNumber(String refNumber) {
    
    
    
    this.refNumber = refNumber;
  }


  public TransactionModel batchId(String batchId) {
    
    
    
    
    this.batchId = batchId;
    return this;
  }

   /**
   * Get batchId
   * @return batchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBatchId() {
    return batchId;
  }


  public void setBatchId(String batchId) {
    
    
    
    this.batchId = batchId;
  }


  public TransactionModel authCode(String authCode) {
    
    
    
    
    this.authCode = authCode;
    return this;
  }

   /**
   * Get authCode
   * @return authCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthCode() {
    return authCode;
  }


  public void setAuthCode(String authCode) {
    
    
    
    this.authCode = authCode;
  }


  public TransactionModel userData(String userData) {
    
    
    
    
    this.userData = userData;
    return this;
  }

   /**
   * Get userData
   * @return userData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserData() {
    return userData;
  }


  public void setUserData(String userData) {
    
    
    
    this.userData = userData;
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
   * @return the TransactionModel instance itself
   */
  public TransactionModel putAdditionalProperty(String key, Object value) {
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
    TransactionModel transactionModel = (TransactionModel) o;
    return Objects.equals(this.date, transactionModel.date) &&
        Objects.equals(this.amount, transactionModel.amount) &&
        Objects.equals(this.fee, transactionModel.fee) &&
        Objects.equals(this.maskedPan, transactionModel.maskedPan) &&
        Objects.equals(this.cardType, transactionModel.cardType) &&
        Objects.equals(this.cardholderName, transactionModel.cardholderName) &&
        Objects.equals(this.expDate, transactionModel.expDate) &&
        Objects.equals(this.type, transactionModel.type) &&
        Objects.equals(this.refNumber, transactionModel.refNumber) &&
        Objects.equals(this.batchId, transactionModel.batchId) &&
        Objects.equals(this.authCode, transactionModel.authCode) &&
        Objects.equals(this.userData, transactionModel.userData)&&
        Objects.equals(this.additionalProperties, transactionModel.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, amount, fee, maskedPan, cardType, cardholderName, expDate, type, refNumber, batchId, authCode, userData, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionModel {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    maskedPan: ").append(toIndentedString(maskedPan)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
    sb.append("    expDate: ").append(toIndentedString(expDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    refNumber: ").append(toIndentedString(refNumber)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("amount");
    openapiFields.add("fee");
    openapiFields.add("maskedPan");
    openapiFields.add("cardType");
    openapiFields.add("cardholderName");
    openapiFields.add("expDate");
    openapiFields.add("type");
    openapiFields.add("refNumber");
    openapiFields.add("batchId");
    openapiFields.add("authCode");
    openapiFields.add("userData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TransactionModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionModel is not found in the empty JSON string", TransactionModel.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("maskedPan").isJsonNull() && (jsonObj.get("maskedPan") != null && !jsonObj.get("maskedPan").isJsonNull()) && !jsonObj.get("maskedPan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maskedPan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maskedPan").toString()));
      }
      if (!jsonObj.get("cardholderName").isJsonNull() && (jsonObj.get("cardholderName") != null && !jsonObj.get("cardholderName").isJsonNull()) && !jsonObj.get("cardholderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardholderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardholderName").toString()));
      }
      if (!jsonObj.get("expDate").isJsonNull() && (jsonObj.get("expDate") != null && !jsonObj.get("expDate").isJsonNull()) && !jsonObj.get("expDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expDate").toString()));
      }
      if (!jsonObj.get("type").isJsonNull() && (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("refNumber").isJsonNull() && (jsonObj.get("refNumber") != null && !jsonObj.get("refNumber").isJsonNull()) && !jsonObj.get("refNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refNumber").toString()));
      }
      if (!jsonObj.get("batchId").isJsonNull() && (jsonObj.get("batchId") != null && !jsonObj.get("batchId").isJsonNull()) && !jsonObj.get("batchId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batchId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batchId").toString()));
      }
      if (!jsonObj.get("authCode").isJsonNull() && (jsonObj.get("authCode") != null && !jsonObj.get("authCode").isJsonNull()) && !jsonObj.get("authCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authCode").toString()));
      }
      if (!jsonObj.get("userData").isJsonNull() && (jsonObj.get("userData") != null && !jsonObj.get("userData").isJsonNull()) && !jsonObj.get("userData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userData").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionModel>() {
           @Override
           public void write(JsonWriter out, TransactionModel value) throws IOException {
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
           public TransactionModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TransactionModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionModel
  * @throws IOException if the JSON string is invalid with respect to TransactionModel
  */
  public static TransactionModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionModel.class);
  }

 /**
  * Convert an instance of TransactionModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

