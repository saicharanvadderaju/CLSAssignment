package PojoDeserialize;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"contract_address",
"platform"
})
@Generated("jsonschema2pojo")
public class ContractAddress {

@JsonProperty("contract_address")
private String contractAddress;
@JsonProperty("platform")
private Platform platform;

@JsonProperty("contract_address")
public String getContractAddress() {
return contractAddress;
}

@JsonProperty("contract_address")
public void setContractAddress(String contractAddress) {
this.contractAddress = contractAddress;
}

@JsonProperty("platform")
public Platform getPlatform() {
return platform;
}

@JsonProperty("platform")
public void setPlatform(Platform platform) {
this.platform = platform;
}

}
