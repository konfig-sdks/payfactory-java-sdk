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
import com.konfigthis.client.model.AddressModel;
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
 * OwnerModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OwnerModel {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private OffsetDateTime dob;

  public static final String SERIALIZED_NAME_SSN = "ssn";
  @SerializedName(SERIALIZED_NAME_SSN)
  private String ssn;

  public static final String SERIALIZED_NAME_HOME_ADDRESS = "homeAddress";
  @SerializedName(SERIALIZED_NAME_HOME_ADDRESS)
  private AddressModel homeAddress;

  public static final String SERIALIZED_NAME_OWNERSHIP_PERCENTAGE = "ownershipPercentage";
  @SerializedName(SERIALIZED_NAME_OWNERSHIP_PERCENTAGE)
  private Integer ownershipPercentage;

  public OwnerModel() {
  }

  public OwnerModel title(String title) {
    
    
    if (title != null && title.length() < 1) {
      throw new IllegalArgumentException("Invalid value for title. Length must be greater than or equal to 1.");
    }
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CEO", required = true, value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    if (title != null && title.length() < 1) {
      throw new IllegalArgumentException("Invalid value for title. Length must be greater than or equal to 1.");
    }
    this.title = title;
  }


  public OwnerModel firstName(String firstName) {
    
    
    if (firstName != null && firstName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for firstName. Length must be greater than or equal to 1.");
    }
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "John", required = true, value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    if (firstName != null && firstName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for firstName. Length must be greater than or equal to 1.");
    }
    this.firstName = firstName;
  }


  public OwnerModel lastName(String lastName) {
    
    
    if (lastName != null && lastName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for lastName. Length must be greater than or equal to 1.");
    }
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Doe", required = true, value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    if (lastName != null && lastName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for lastName. Length must be greater than or equal to 1.");
    }
    this.lastName = lastName;
  }


  public OwnerModel email(String email) {
    
    
    if (email != null && email.length() < 1) {
      throw new IllegalArgumentException("Invalid value for email. Length must be greater than or equal to 1.");
    }
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "test@test.com", required = true, value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    if (email != null && email.length() < 1) {
      throw new IllegalArgumentException("Invalid value for email. Length must be greater than or equal to 1.");
    }
    this.email = email;
  }


  public OwnerModel phone(String phone) {
    
    
    if (phone != null && phone.length() < 1) {
      throw new IllegalArgumentException("Invalid value for phone. Length must be greater than or equal to 1.");
    }
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5551234567", required = true, value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    
    
    if (phone != null && phone.length() < 1) {
      throw new IllegalArgumentException("Invalid value for phone. Length must be greater than or equal to 1.");
    }
    this.phone = phone;
  }


  public OwnerModel dob(OffsetDateTime dob) {
    
    
    
    
    this.dob = dob;
    return this;
  }

   /**
   * Date of birth
   * @return dob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of birth")

  public OffsetDateTime getDob() {
    return dob;
  }


  public void setDob(OffsetDateTime dob) {
    
    
    
    this.dob = dob;
  }


  public OwnerModel ssn(String ssn) {
    
    
    
    
    this.ssn = ssn;
    return this;
  }

   /**
   * Social Security Number
   * @return ssn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5554449999", value = "Social Security Number")

  public String getSsn() {
    return ssn;
  }


  public void setSsn(String ssn) {
    
    
    
    this.ssn = ssn;
  }


  public OwnerModel homeAddress(AddressModel homeAddress) {
    
    
    
    
    this.homeAddress = homeAddress;
    return this;
  }

   /**
   * Get homeAddress
   * @return homeAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddressModel getHomeAddress() {
    return homeAddress;
  }


  public void setHomeAddress(AddressModel homeAddress) {
    
    
    
    this.homeAddress = homeAddress;
  }


  public OwnerModel ownershipPercentage(Integer ownershipPercentage) {
    if (ownershipPercentage != null && ownershipPercentage < 1) {
      throw new IllegalArgumentException("Invalid value for ownershipPercentage. Must be greater than or equal to 1.");
    }
    if (ownershipPercentage != null && ownershipPercentage > 100) {
      throw new IllegalArgumentException("Invalid value for ownershipPercentage. Must be less than or equal to 100.");
    }
    
    
    this.ownershipPercentage = ownershipPercentage;
    return this;
  }

   /**
   * Get ownershipPercentage
   * minimum: 1
   * maximum: 100
   * @return ownershipPercentage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "100", required = true, value = "")

  public Integer getOwnershipPercentage() {
    return ownershipPercentage;
  }


  public void setOwnershipPercentage(Integer ownershipPercentage) {
    if (ownershipPercentage != null && ownershipPercentage < 1) {
      throw new IllegalArgumentException("Invalid value for ownershipPercentage. Must be greater than or equal to 1.");
    }
    if (ownershipPercentage != null && ownershipPercentage > 100) {
      throw new IllegalArgumentException("Invalid value for ownershipPercentage. Must be less than or equal to 100.");
    }
    
    this.ownershipPercentage = ownershipPercentage;
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
   * @return the OwnerModel instance itself
   */
  public OwnerModel putAdditionalProperty(String key, Object value) {
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
    OwnerModel ownerModel = (OwnerModel) o;
    return Objects.equals(this.title, ownerModel.title) &&
        Objects.equals(this.firstName, ownerModel.firstName) &&
        Objects.equals(this.lastName, ownerModel.lastName) &&
        Objects.equals(this.email, ownerModel.email) &&
        Objects.equals(this.phone, ownerModel.phone) &&
        Objects.equals(this.dob, ownerModel.dob) &&
        Objects.equals(this.ssn, ownerModel.ssn) &&
        Objects.equals(this.homeAddress, ownerModel.homeAddress) &&
        Objects.equals(this.ownershipPercentage, ownerModel.ownershipPercentage)&&
        Objects.equals(this.additionalProperties, ownerModel.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, firstName, lastName, email, phone, dob, ssn, homeAddress, ownershipPercentage, additionalProperties);
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
    sb.append("class OwnerModel {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    homeAddress: ").append(toIndentedString(homeAddress)).append("\n");
    sb.append("    ownershipPercentage: ").append(toIndentedString(ownershipPercentage)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("email");
    openapiFields.add("phone");
    openapiFields.add("dob");
    openapiFields.add("ssn");
    openapiFields.add("homeAddress");
    openapiFields.add("ownershipPercentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("lastName");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("phone");
    openapiRequiredFields.add("ownershipPercentage");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OwnerModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OwnerModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OwnerModel is not found in the empty JSON string", OwnerModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OwnerModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (!jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if (!jsonObj.get("ssn").isJsonNull() && (jsonObj.get("ssn") != null && !jsonObj.get("ssn").isJsonNull()) && !jsonObj.get("ssn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssn").toString()));
      }
      // validate the optional field `homeAddress`
      if (jsonObj.get("homeAddress") != null && !jsonObj.get("homeAddress").isJsonNull()) {
        AddressModel.validateJsonObject(jsonObj.getAsJsonObject("homeAddress"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OwnerModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OwnerModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OwnerModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OwnerModel.class));

       return (TypeAdapter<T>) new TypeAdapter<OwnerModel>() {
           @Override
           public void write(JsonWriter out, OwnerModel value) throws IOException {
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
           public OwnerModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OwnerModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OwnerModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OwnerModel
  * @throws IOException if the JSON string is invalid with respect to OwnerModel
  */
  public static OwnerModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OwnerModel.class);
  }

 /**
  * Convert an instance of OwnerModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

