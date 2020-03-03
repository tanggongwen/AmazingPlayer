package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class NewsCommontBean implements Serializable {

    /**
     * endRow : 0
     * firstPage : 1
     * hasNextPage : false
     * hasPreviousPage : false
     * isFirstPage : true
     * isLastPage : true
     * lastPage : 1
     * list : [{"crtDate":"2019-11-23 15:43:37","discussContent":"兔兔图兔兔","discussId":"647824585651261440","hasLike":"","issueTimeStamp":"1574523817","likeCount":1,"newsId":"638333782000275456","newsTitle":"","status":"","thumUrl":"","userInfo":{"petName":"我的","profilePhoto":"https://thirdqq.qlogo.cn/g?b=oidb&k=JiamozozYmQpicibbOcprOicMw&s=100&t=1572934991","userId":"644555998052356096"}}]
     * navigateFirstPage : 1
     * navigateLastPage : 1
     * navigatePages : 20
     * navigatepageNums : [1]s
     * nextPage : 0
     * pageNum : 1
     * pageSize : 1
     * pages : 1
     * prePage : 0
     * size : 1
     * startRow : 0
     * total : 1
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
    private List<UserCommontBean> list;
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

    public List<UserCommontBean> getList() {
        return list;
    }

    public void setList(List<UserCommontBean> list) {
        this.list = list;
    }

    public List<Integer> getNavigatepageNums() {
        return navigatepageNums;
    }

    public void setNavigatepageNums(List<Integer> navigatepageNums) {
        this.navigatepageNums = navigatepageNums;
    }

    public static class UserCommontBean {
        /**
         * crtDate : 2019-11-23 15:43:37
         * discussContent : 兔兔图兔兔
         * discussId : 647824585651261440
         * hasLike :
         * issueTimeStamp : 1574523817
         * likeCount : 1
         * newsId : 638333782000275456
         * newsTitle :
         * status :
         * thumUrl :
         * userInfo : {"petName":"我的","profilePhoto":"https://thirdqq.qlogo.cn/g?b=oidb&k=JiamozozYmQpicibbOcprOicMw&s=100&t=1572934991","userId":"644555998052356096"}
         */

        private String crtDate;
        private String discussContent;
        private String discussId;
        private String hasLike;
        private String issueTimeStamp;
        private String issueTime;
        private int likeCount;
        private String newsId;
        private String newsTitle;
        private String status;
        private String newsType;
        private String thumUrl;
        private UserInfoBean userInfo;

        public String getCrtDate() {
            return crtDate;
        }

        public void setCrtDate(String crtDate) {
            this.crtDate = crtDate;
        }

        public String getDiscussContent() {
            return discussContent;
        }

        public void setDiscussContent(String discussContent) {
            this.discussContent = discussContent;
        }

        public String getDiscussId() {
            return discussId;
        }

        public void setDiscussId(String discussId) {
            this.discussId = discussId;
        }

        public String getHasLike() {
            return hasLike;
        }

        public void setHasLike(String hasLike) {
            this.hasLike = hasLike;
        }

        public String getIssueTimeStamp() {
            return issueTimeStamp;
        }

        public void setIssueTimeStamp(String issueTimeStamp) {
            this.issueTimeStamp = issueTimeStamp;
        }

        public int getLikeCount() {
            return likeCount;
        }

        public void setLikeCount(int likeCount) {
            this.likeCount = likeCount;
        }

        public String getNewsId() {
            return newsId;
        }

        public void setNewsId(String newsId) {
            this.newsId = newsId;
        }

        public String getNewsTitle() {
            return newsTitle;
        }

        public void setNewsTitle(String newsTitle) {
            this.newsTitle = newsTitle;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getThumUrl() {
            return thumUrl;
        }

        public void setThumUrl(String thumUrl) {
            this.thumUrl = thumUrl;
        }

        public UserInfoBean getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoBean userInfo) {
            this.userInfo = userInfo;
        }

        public String getIssueTime() {
            return issueTime;
        }

        public void setIssueTime(String issueTime) {
            this.issueTime = issueTime;
        }

        public String getNewsType() {
            return newsType;
        }

        public void setNewsType(String newsType) {
            this.newsType = newsType;
        }

        public static class UserInfoBean {
            /**
             * petName : 我的
             * profilePhoto : https://thirdqq.qlogo.cn/g?b=oidb&k=JiamozozYmQpicibbOcprOicMw&s=100&t=1572934991
             * userId : 644555998052356096sdsdfidjedisjesics
             */

            private String petName;
            private String profilePhoto;
            private String userId;

            public String getPetName() {
                return petName;
            }

            public void setPetName(String petName) {
                this.petName = petName;
            }

            public String getProfilePhoto() {
                return profilePhoto;
            }

            public void setProfilePhoto(String profilePhoto) {
                this.profilePhoto = profilePhoto;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }
        }
    }
}
