package com.example.demo.pojo;


import java.util.Date;

public class Repiles {

  private Integer rid;
  private String content;
  private Date replyTime;
  private Integer infoId;


  public Integer getRid() {
    return rid;
  }

  public void setRid(Integer rid) {
    this.rid = rid;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getReplyTime() {
    return replyTime;
  }

  public void setReplyTime(Date replyTime) {
    this.replyTime = replyTime;
  }

  public Integer getInfoId() {
    return infoId;
  }

  public void setInfoId(Integer infoId) {
    this.infoId = infoId;
  }
}
