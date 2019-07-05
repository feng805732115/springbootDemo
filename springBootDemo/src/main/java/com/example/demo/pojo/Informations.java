package com.example.demo.pojo;


import java.util.Date;

public class Informations {

  private Integer infoId;
  private String title;
  private String content;
  private Integer replyCount;
  private Integer viewCount;
  private Date reportTime;
  private Date lastPostTime;


  public Integer getInfoId() {
    return infoId;
  }

  public void setInfoId(Integer infoId) {
    this.infoId = infoId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Integer getReplyCount() {
    return replyCount;
  }

  public void setReplyCount(Integer replyCount) {
    this.replyCount = replyCount;
  }

  public Integer getViewCount() {
    return viewCount;
  }

  public void setViewCount(Integer viewCount) {
    this.viewCount = viewCount;
  }

  public Date getReportTime() {
    return reportTime;
  }

  public void setReportTime(Date reportTime) {
    this.reportTime = reportTime;
  }

  public Date getLastPostTime() {
    return lastPostTime;
  }

  public void setLastPostTime(Date lastPostTime) {
    this.lastPostTime = lastPostTime;
  }
}
