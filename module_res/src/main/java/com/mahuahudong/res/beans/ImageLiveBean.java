package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class ImageLiveBean implements Serializable {


    /**
     * endRow : 3
     * firstPage : 1
     * hasNextPage : false
     * hasPreviousPage : false
     * isFirstPage : true
     * isLastPage : true
     * lastPage : 1
     * list : [{"attachList":[{"attachType":"1","attachUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/642373786263490560.gif","pageUrl":""},{"attachType":"1","attachUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/642373788230619136.gif","pageUrl":""},{"attachType":"1","attachUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/642373791514759168.gif","pageUrl":""},{"attachType":"1","attachUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/642373788868153344.gif","pageUrl":""}],"content":"个事情发生后，朗朗在被采访时还说道再也不敢让老婆帮自己拿东西了，称前段时间受伤，而且平时老婆太过照顾自己了，以后会改掉这个问题。从这番回答中我们也可以看出朗朗的求生欲，朗朗是一名钢琴家，平时对手的保护要求是很严得，所以他也不会去拿重物干重活，怕伤手，而且他称他老婆平时照顾得他太好了，这一点看过节目的","contentId":"642374088911884288","issueTime":"2019-11-08 14:45:15","issueTimeStamp":"1573195515"},{"attachList":[{"attachType":"2","attachUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/642373159626084352.mp4","pageUrl":""}],"content":"因为在朗朗和吉娜婚后一起去机场时，朗朗因为没有拿行李而被网友吐槽不体贴，从媒体放出的图中可以看到吉娜背着包包拿着行李箱，而朗朗则是特别轻松的样子，图片被爆出来后，朗朗就被网友吐槽不体贴老婆了。很多网友都吐槽朗朗什么都不拿，只让老婆大包小包的拿着，不知道帮忙分担。","contentId":"642373271941156864","issueTime":"2019-11-08 14:41:25","issueTimeStamp":"1573195285"},{"attachList":[{"attachType":"1","attachUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/642372813369511936.jpg","pageUrl":""},{"attachType":"1","attachUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/642372919032418304.jpg","pageUrl":""},{"attachType":"1","attachUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/642372920441704448.jpg","pageUrl":""},{"attachType":"1","attachUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/642372920479453184.jpg","pageUrl":""}],"content":"原因就是在节目中朗朗和吉娜抢着干活的样子太点太明显也太刻意了，甚至有时候他为了抢着干活还会很认真地把吉娜挤到一边去。然而朗朗的这个样子我们这些局外人看着也是感觉又好气，又好笑。","contentId":"642373068928454656","issueTime":"2019-11-08 14:39:46","issueTimeStamp":"1573195186"},{"attachList":[{"attachType":"2","attachUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/642372376788602880.mp4","pageUrl":""}],"content":"第一期节目播出后，很多观众都感叹朗朗妻子的颜值和身材太好了，随意的牛仔裤和体桖也能穿的很美，吉娜是德韩混血，和朗朗一样她也是一名钢琴演奏家，可以看出气质非常好。整期节目看下来，朗朗都表现出了一副\u201c一朝被蛇咬，十年怕井绳\u201d的样子。\n\n朗朗上综艺抢活干的样子太逗了，是有多怕再次被骂","contentId":"642372638337011712","issueTime":"2019-11-08 14:38:09","issueTimeStamp":"1573195089"}]
     * navigateFirstPage : 1
     * navigateLastPage : 1
     * navigatePages : 20
     * navigatepageNums : [1]
     * nextPage : 0
     * pageNum : 1
     * pageSize : 4
     * pages : 1
     * prePage : 0
     * size : 4
     * startRow : 0
     * total : 4
     */

    private int endRow;
    private int firstPage;
    private boolean hasNextPage;
    private boolean hasPreviousPage;
    private boolean isFirstPage;
    private boolean isLastPage;
    private int lastPage;
    private int navigateFirstPage;
    private int navigateLastPage;
    private int navigatePages;
    private int nextPage;
    private int pageNum;
    private int pageSize;
    private int pages;
    private int prePage;
    private int size;
    private int startRow;
    private int total;
    private List<ImageLiveItemBean> list;
    private List<Integer> navigatepageNums;

    public int getEndRow() {
        return endRow;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    public int getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(int firstPage) {
        this.firstPage = firstPage;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public boolean isHasPreviousPage() {
        return hasPreviousPage;
    }

    public void setHasPreviousPage(boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    public boolean isIsFirstPage() {
        return isFirstPage;
    }

    public void setIsFirstPage(boolean isFirstPage) {
        this.isFirstPage = isFirstPage;
    }

    public boolean isIsLastPage() {
        return isLastPage;
    }

    public void setIsLastPage(boolean isLastPage) {
        this.isLastPage = isLastPage;
    }

    public int getLastPage() {
        return lastPage;
    }

    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }

    public int getNavigateFirstPage() {
        return navigateFirstPage;
    }

    public void setNavigateFirstPage(int navigateFirstPage) {
        this.navigateFirstPage = navigateFirstPage;
    }

    public int getNavigateLastPage() {
        return navigateLastPage;
    }

    public void setNavigateLastPage(int navigateLastPage) {
        this.navigateLastPage = navigateLastPage;
    }

    public int getNavigatePages() {
        return navigatePages;
    }

    public void setNavigatePages(int navigatePages) {
        this.navigatePages = navigatePages;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrePage() {
        return prePage;
    }

    public void setPrePage(int prePage) {
        this.prePage = prePage;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<ImageLiveItemBean> getList() {
        return list;
    }

    public void setList(List<ImageLiveItemBean> list) {
        this.list = list;
    }

    public List<Integer> getNavigatepageNums() {
        return navigatepageNums;
    }

    public void setNavigatepageNums(List<Integer> navigatepageNums) {
        this.navigatepageNums = navigatepageNums;
    }


}
