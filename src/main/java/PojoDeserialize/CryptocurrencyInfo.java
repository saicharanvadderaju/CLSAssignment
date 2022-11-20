package PojoDeserialize;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"status",
"data"
})
@Generated("jsonschema2pojo")
public class CryptocurrencyInfo {

@JsonProperty("status")
private Status status;
@JsonProperty("data")
private Data data;

@JsonProperty("status")
public Status getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(Status status) {
this.status = status;
}

@JsonProperty("data")
public Data getData() {
return data;
}

@JsonProperty("data")
public void setData(Data data) {
this.data = data;
}

}

