package PojoDeserialize;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"name",
"symbol",
"slug",
"rank",
"displayTV",
"is_active",
"first_historical_data",
"last_historical_data",
"platform"
})
@Generated("jsonschema2pojo")
public class Datum {

@JsonProperty("id")
private Integer id;
@JsonProperty("name")
private String name;
@JsonProperty("symbol")
private String symbol;
@JsonProperty("slug")
private String slug;
@JsonProperty("rank")
private Integer rank;
@JsonProperty("displayTV")
private Integer displayTV;
@JsonProperty("is_active")
private Integer isActive;
@JsonProperty("first_historical_data")
private String firstHistoricalData;
@JsonProperty("last_historical_data")
private String lastHistoricalData;
@JsonProperty("platform")
private Object platform;

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("symbol")
public String getSymbol() {
return symbol;
}

@JsonProperty("symbol")
public void setSymbol(String symbol) {
this.symbol = symbol;
}

@JsonProperty("slug")
public String getSlug() {
return slug;
}

@JsonProperty("slug")
public void setSlug(String slug) {
this.slug = slug;
}

@JsonProperty("rank")
public Integer getRank() {
return rank;
}

@JsonProperty("rank")
public void setRank(Integer rank) {
this.rank = rank;
}

@JsonProperty("displayTV")
public Integer getDisplayTV() {
return displayTV;
}

@JsonProperty("displayTV")
public void setDisplayTV(Integer displayTV) {
this.displayTV = displayTV;
}

@JsonProperty("is_active")
public Integer getIsActive() {
return isActive;
}

@JsonProperty("is_active")
public void setIsActive(Integer isActive) {
this.isActive = isActive;
}

@JsonProperty("first_historical_data")
public String getFirstHistoricalData() {
return firstHistoricalData;
}

@JsonProperty("first_historical_data")
public void setFirstHistoricalData(String firstHistoricalData) {
this.firstHistoricalData = firstHistoricalData;
}

@JsonProperty("last_historical_data")
public String getLastHistoricalData() {
return lastHistoricalData;
}

@JsonProperty("last_historical_data")
public void setLastHistoricalData(String lastHistoricalData) {
this.lastHistoricalData = lastHistoricalData;
}

@JsonProperty("platform")
public Object getPlatform() {
return platform;
}

@JsonProperty("platform")
public void setPlatform(Object platform) {
this.platform = platform;
}

}
