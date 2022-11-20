package PojoDeserialize;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"website",
"twitter",
"message_board",
"chat",
"facebook",
"explorer",
"reddit",
"technical_doc",
"source_code",
"announcement"
})
@Generated("jsonschema2pojo")
public class Urls {

@JsonProperty("website")
private List<String> website = null;
@JsonProperty("twitter")
private List<String> twitter = null;
@JsonProperty("message_board")
private List<String> messageBoard = null;
@JsonProperty("chat")
private List<String> chat = null;
@JsonProperty("facebook")
private List<Object> facebook = null;
@JsonProperty("explorer")
private List<String> explorer = null;
@JsonProperty("reddit")
private List<String> reddit = null;
@JsonProperty("technical_doc")
private List<String> technicalDoc = null;
@JsonProperty("source_code")
private List<String> sourceCode = null;
@JsonProperty("announcement")
private List<String> announcement = null;

@JsonProperty("website")
public List<String> getWebsite() {
return website;
}

@JsonProperty("website")
public void setWebsite(List<String> website) {
this.website = website;
}

@JsonProperty("twitter")
public List<String> getTwitter() {
return twitter;
}

@JsonProperty("twitter")
public void setTwitter(List<String> twitter) {
this.twitter = twitter;
}

@JsonProperty("message_board")
public List<String> getMessageBoard() {
return messageBoard;
}

@JsonProperty("message_board")
public void setMessageBoard(List<String> messageBoard) {
this.messageBoard = messageBoard;
}

@JsonProperty("chat")
public List<String> getChat() {
return chat;
}

@JsonProperty("chat")
public void setChat(List<String> chat) {
this.chat = chat;
}

@JsonProperty("facebook")
public List<Object> getFacebook() {
return facebook;
}

@JsonProperty("facebook")
public void setFacebook(List<Object> facebook) {
this.facebook = facebook;
}

@JsonProperty("explorer")
public List<String> getExplorer() {
return explorer;
}

@JsonProperty("explorer")
public void setExplorer(List<String> explorer) {
this.explorer = explorer;
}

@JsonProperty("reddit")
public List<String> getReddit() {
return reddit;
}

@JsonProperty("reddit")
public void setReddit(List<String> reddit) {
this.reddit = reddit;
}

@JsonProperty("technical_doc")
public List<String> getTechnicalDoc() {
return technicalDoc;
}

@JsonProperty("technical_doc")
public void setTechnicalDoc(List<String> technicalDoc) {
this.technicalDoc = technicalDoc;
}

@JsonProperty("source_code")
public List<String> getSourceCode() {
return sourceCode;
}

@JsonProperty("source_code")
public void setSourceCode(List<String> sourceCode) {
this.sourceCode = sourceCode;
}

@JsonProperty("announcement")
public List<String> getAnnouncement() {
return announcement;
}

@JsonProperty("announcement")
public void setAnnouncement(List<String> announcement) {
this.announcement = announcement;
}

}
