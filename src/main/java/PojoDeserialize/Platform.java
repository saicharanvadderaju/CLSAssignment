package PojoDeserialize;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"name",
"coin"
})
@Generated("jsonschema2pojo")
public class Platform {

@JsonProperty("name")
private String name;
@JsonProperty("coin")
private Coin coin;

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("coin")
public Coin getCoin() {
return coin;
}

@JsonProperty("coin")
public void setCoin(Coin coin) {
this.coin = coin;
}

}
