package PojoDeserialize;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"name",
"symbol",
"category",
"description",
"slug",
"logo",
"subreddit",
"notice",
"tags",
"tag-names",
"tag-groups",
"urls",
"platform",
"date_added",
"twitter_username",
"is_hidden",
"date_launched",
"contract_address",
"self_reported_circulating_supply",
"self_reported_tags",
"self_reported_market_cap"
})
@Generated("jsonschema2pojo")
public class _1027 {

@JsonProperty("id")
private Integer id;
@JsonProperty("name")
private String name;
@JsonProperty("symbol")
private String symbol;
@JsonProperty("category")
private String category;
@JsonProperty("description")
private String description;
@JsonProperty("slug")
private String slug;
@JsonProperty("logo")
private String logo;
@JsonProperty("subreddit")
private String subreddit;
@JsonProperty("notice")
private String notice;
@JsonProperty("tags")
private List<String> tags = null;
@JsonProperty("tag-names")
private List<String> tagNames = null;
@JsonProperty("tag-groups")
private List<String> tagGroups = null;
@JsonProperty("urls")
private Urls urls;
@JsonProperty("platform")
private Object platform;
@JsonProperty("date_added")
private String dateAdded;
@JsonProperty("twitter_username")
private String twitterUsername;
@JsonProperty("is_hidden")
private Integer isHidden;
@JsonProperty("date_launched")
private Object dateLaunched;
@JsonProperty("contract_address")
private List<ContractAddress> contractAddress = null;
@JsonProperty("self_reported_circulating_supply")
private Object selfReportedCirculatingSupply;
@JsonProperty("self_reported_tags")
private Object selfReportedTags;
@JsonProperty("self_reported_market_cap")
private Object selfReportedMarketCap;

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

@JsonProperty("category")
public String getCategory() {
return category;
}

@JsonProperty("category")
public void setCategory(String category) {
this.category = category;
}

@JsonProperty("description")
public String getDescription() {
return description;
}

@JsonProperty("description")
public void setDescription(String description) {
this.description = description;
}

@JsonProperty("slug")
public String getSlug() {
return slug;
}

@JsonProperty("slug")
public void setSlug(String slug) {
this.slug = slug;
}

@JsonProperty("logo")
public String getLogo() {
return logo;
}

@JsonProperty("logo")
public void setLogo(String logo) {
this.logo = logo;
}

@JsonProperty("subreddit")
public String getSubreddit() {
return subreddit;
}

@JsonProperty("subreddit")
public void setSubreddit(String subreddit) {
this.subreddit = subreddit;
}

@JsonProperty("notice")
public String getNotice() {
return notice;
}

@JsonProperty("notice")
public void setNotice(String notice) {
this.notice = notice;
}

@JsonProperty("tags")
public List<String> getTags() {
return tags;
}

@JsonProperty("tags")
public void setTags(List<String> tags) {
this.tags = tags;
}

@JsonProperty("tag-names")
public List<String> getTagNames() {
return tagNames;
}

@JsonProperty("tag-names")
public void setTagNames(List<String> tagNames) {
this.tagNames = tagNames;
}

@JsonProperty("tag-groups")
public List<String> getTagGroups() {
return tagGroups;
}

@JsonProperty("tag-groups")
public void setTagGroups(List<String> tagGroups) {
this.tagGroups = tagGroups;
}

@JsonProperty("urls")
public Urls getUrls() {
return urls;
}

@JsonProperty("urls")
public void setUrls(Urls urls) {
this.urls = urls;
}

@JsonProperty("platform")
public Object getPlatform() {
return platform;
}

@JsonProperty("platform")
public void setPlatform(Object platform) {
this.platform = platform;
}

@JsonProperty("date_added")
public String getDateAdded() {
return dateAdded;
}

@JsonProperty("date_added")
public void setDateAdded(String dateAdded) {
this.dateAdded = dateAdded;
}

@JsonProperty("twitter_username")
public String getTwitterUsername() {
return twitterUsername;
}

@JsonProperty("twitter_username")
public void setTwitterUsername(String twitterUsername) {
this.twitterUsername = twitterUsername;
}

@JsonProperty("is_hidden")
public Integer getIsHidden() {
return isHidden;
}

@JsonProperty("is_hidden")
public void setIsHidden(Integer isHidden) {
this.isHidden = isHidden;
}

@JsonProperty("date_launched")
public Object getDateLaunched() {
return dateLaunched;
}

@JsonProperty("date_launched")
public void setDateLaunched(Object dateLaunched) {
this.dateLaunched = dateLaunched;
}

@JsonProperty("contract_address")
public List<ContractAddress> getContractAddress() {
return contractAddress;
}

@JsonProperty("contract_address")
public void setContractAddress(List<ContractAddress> contractAddress) {
this.contractAddress = contractAddress;
}

@JsonProperty("self_reported_circulating_supply")
public Object getSelfReportedCirculatingSupply() {
return selfReportedCirculatingSupply;
}

@JsonProperty("self_reported_circulating_supply")
public void setSelfReportedCirculatingSupply(Object selfReportedCirculatingSupply) {
this.selfReportedCirculatingSupply = selfReportedCirculatingSupply;
}

@JsonProperty("self_reported_tags")
public Object getSelfReportedTags() {
return selfReportedTags;
}

@JsonProperty("self_reported_tags")
public void setSelfReportedTags(Object selfReportedTags) {
this.selfReportedTags = selfReportedTags;
}

@JsonProperty("self_reported_market_cap")
public Object getSelfReportedMarketCap() {
return selfReportedMarketCap;
}

@JsonProperty("self_reported_market_cap")
public void setSelfReportedMarketCap(Object selfReportedMarketCap) {
this.selfReportedMarketCap = selfReportedMarketCap;
}

}
