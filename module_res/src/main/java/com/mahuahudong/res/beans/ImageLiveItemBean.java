package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class ImageLiveItemBean implements Serializable {
    /**
     * attachList : [{"attachType":"1","attachUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/642373786263490560.gif","pageUrl":""},{"attachType":"1","attachUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/642373788230619136.gif","pageUrl":""},{"attachType":"1","attachUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/642373791514759168.gif","pageUrl":""},{"attachType":"1","attachUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/642373788868153344.gif","pageUrl":""}]
     * content : 个事情发生后，朗朗在被采访时还说道再也不敢让老婆帮自己拿东西了，称前段时间受伤，而且平时老婆太过照顾自己了，以后会改掉这个问题。从这番回答中我们也可以看出朗朗的求生欲，朗朗是一名钢琴家，平时对手的保护要求是很严得，所以他也不会去拿重物干重活，怕伤手，而且他称他老婆平时照顾得他太好了，这一点看过节目的
     * contentId : 642374088911884288
     * issueTime : 2019-11-08 14:45:15
     * issueTimeStamp : 1573195515
     */

    private String content;
    private String contentId;
    private String issueTime;
    private String issueTimeStamp;
    private List<ImageLiveGridBean> attachList;
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(String issueTime) {
        this.issueTime = issueTime;
    }

    public String getIssueTimeStamp() {
        return issueTimeStamp;
    }

    public void setIssueTimeStamp(String issueTimeStamp) {
        this.issueTimeStamp = issueTimeStamp;
    }

    public List<ImageLiveGridBean> getAttachList() {
        return attachList;
    }

    public void setAttachList(List<ImageLiveGridBean> attachList) {
        this.attachList = attachList;
    }

    public static class AttachListBean implements Serializable {

    }





}
