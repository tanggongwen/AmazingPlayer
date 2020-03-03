package com.mahuahudong.res.beans;

import com.mahuahudong.res.beans.NewsMapBean.NewsLsBean.ClassicNewsBean;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//新闻集合类
public class NewsMapBean implements Serializable {

    /**
     * focusLs : [{"columnId":"000000000000000002","crtDate":"2019-10-25 00:00:00","crtOrgCode":"","crtUserCode":"admin","externalUrl":"","focusPictId":"637329379751497728","id":"637329379751497728","issueTimeStamp":"","newsId":"","newsSrc":"","newsTitle":"测试关联","relaColumnId":"634122975527964672","relaType":"2","seq":0,"status":"1","tag":"","thumFile":"images/637329371744571392.png","thumUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/637329371744571392.png?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148792763&Signature=sxhnq0e%2FpF4BFC5EJ7jhfUMlLGQ%3D","updDate":"2019-10-25 00:00:00","updOrgCode":"","updUserCode":"admin","viewCount":0},{"columnId":"000000000000000002","crtDate":"2019-10-25 00:00:00","crtOrgCode":"","crtUserCode":"admin","externalUrl":"https://www.baidu.com","focusPictId":"637360547737767936","id":"637360547737767936","issueTimeStamp":"","newsId":"","newsSrc":"","newsTitle":"测试外联","relaColumnId":"","relaType":"3","seq":0,"status":"1","tag":"","thumFile":"images/637360544478793728.png","thumUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/637360544478793728.png?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148800195&Signature=MsW1Q9orqKfcRIQDsVjAFFhEcKM%3D","updDate":"2019-10-25 00:00:00","updOrgCode":"","updUserCode":"admin","viewCount":0}]
     * topNewsLs : [{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"1","isSVideo":"","issueTimeStamp":"1573442292","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/643409067653599232.png?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3150242275&Signature=or5d1WaLpPYmEPoER4lg2woqoqc%3D"],"newsBrief":"长沙县果园镇党委书记覃芳：田汉故里 大美果园，约你来相会","newsId":"643409148003880960","newsSrc":"智慧长沙","newsTitle":"长沙县果园镇党委书记覃芳：田汉故里 大美果园，约你来相会","newsType":"1","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"4","tag":"1","timeDif":"270867","videoTime":"","videoUrl":"","viewCount":6575,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"","isExternal":"","isSVideo":"","issueTimeStamp":"1573436850","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/643386384148729856.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3150236867&Signature=PCpxXWVgaDW9Alb5sk3qKbhfygI%3D"],"newsBrief":"湖南省十大特色文旅小镇正式发布，新浪湖南推出\u201c小镇大业看湖南\u2014\u2014湖南十大特色文旅小镇巡礼\u201d专题，带领广大网友探一探小镇风采，品读小镇故事。","newsId":"643386398711353344","newsSrc":"","newsTitle":"小镇大业看湖南：湖南十大特色文旅小镇巡礼","newsType":"6","pageUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/643386394475106304.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3150236870&Signature=cL4an9w0XgrsgaVbRM4T1m3IVNc%3D","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"4","tag":"1","timeDif":"276309","videoTime":"","videoUrl":"","viewCount":6965,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"","issueTimeStamp":"1573195615","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/642374330403131392.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149995575&Signature=UZZIamN8%2BvyWaIPJW1nlwdqNRdQ%3D"],"newsBrief":"朗朗上综艺抢活干的样子太逗了，是有多怕再次被骂","newsId":"638333782000275456","newsSrc":"智慧长沙","newsTitle":"朗朗上综艺抢活干的样子太逗了，是有多怕再次被骂","newsType":"5","pageUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/642374385071689728.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149995588&Signature=ctwFoxw%2B4agerAHXMWGIu3t%2FfLo%3D","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"1","tag":"1","timeDif":"517544","videoTime":"","videoUrl":"","viewCount":7011,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"","isExternal":"","isSVideo":"","issueTimeStamp":"1573110623","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/642018521999609856.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149910743&Signature=8WPlTc1d4L0AvAflVbOMGuTGjiI%3D","http://dev-rgw.zhcs.csbtv.com/zhcs/images/642018536813891584.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149910747&Signature=okMxgMFdDLi0PS3pTCSzppCxxy4%3D","http://dev-rgw.zhcs.csbtv.com/zhcs/images/642018547484200960.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149910749&Signature=9cwjTmicvv236xw%2BM5Q3cEx1Kjo%3D"],"newsBrief":"车长5米7座布局，试驾后列几条\u201c鄙视\u201d汉兰达的理由","newsId":"638334337808470016","newsSrc":"智慧长沙","newsTitle":"车长5米7座布局，试驾后列几条\u201c鄙视\u201d汉兰达的理由","newsType":"7","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"3","tag":"1","timeDif":"602536","videoTime":"","videoUrl":"","viewCount":7097,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"","issueTimeStamp":"1571905069","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/636966279839879168.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706195&Signature=NInQqIyevG5RanVLJP7f1WgrvxQ%3D"],"newsBrief":"现有证据并不证明火星上存在生命","newsId":"636961728776769536","newsSrc":"智慧长沙","newsTitle":"美国宇航局:\u201c现有证据并不证明火星上存在生命\u201d","newsType":"5","pageUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636966261250723840.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706190&Signature=CA4Z9qNqTyzonncagVTNiBUfGPg%3D","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"4","tag":"1","timeDif":"1808090","videoTime":"","videoUrl":"","viewCount":7399,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"1","isSVideo":"","issueTimeStamp":"1571904669","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/636959939272773632.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148704683&Signature=bhGTRzSJBalVIbdv0EyUROL%2FhSs%3D"],"newsBrief":"10月20日至22日，第六届世界互联网大会在浙江乌镇如约举行。马云忙着演讲，张朝阳忙着直播，丁磊忙着组饭局。","newsId":"636959947829153792","newsSrc":"智慧长沙","newsTitle":"乌镇再无\u201c大佬饭局\u201d","newsType":"1","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"1","tag":"1","timeDif":"1808490","videoTime":"","videoUrl":"","viewCount":7447,"whetherLike":""}]
     * newsLs : {"endRow":19,"firstPage":1,"hasNextPage":false,"hasPreviousPage":false,"isFirstPage":true,"isLastPage":true,"lastPage":1,"list":[{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"1","isSVideo":"","issueTimeStamp":"1573115672","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/642039424489754624.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149915727&Signature=JX020qTx4pq77Nm65v1gaJYcRCc%3D"],"newsBrief":"女孩与从小长大的邻居哥哥结婚，网友称她是回娘家最方便的新娘","newsId":"642039433301987328","newsSrc":"智慧长沙","newsTitle":"女孩与从小长大的邻居哥哥结婚，网友称她是回娘家最方便的新娘","newsType":"1","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"1","tag":"0","timeDif":"597487","videoTime":"","videoUrl":"","viewCount":7036,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"","isExternal":"","isSVideo":"","issueTimeStamp":"1573110999","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/642017598694887424.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149910523&Signature=whhAMd0R3hCrF%2BSvjms9Y4PqJk8%3D","http://dev-rgw.zhcs.csbtv.com/zhcs/images/642017614071205888.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149910527&Signature=qxSgRrF5OiSwICqC4S4u8NKoZAM%3D","http://dev-rgw.zhcs.csbtv.com/zhcs/images/642017648342863872.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149910535&Signature=Dw4tO4aXvX9dAZcalNPTxl4iNrE%3D","http://dev-rgw.zhcs.csbtv.com/zhcs/images/642017627245514752.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149910530&Signature=%2FvB6ILqnMYEMV1oQiq3Xu8zyTdM%3D"],"newsBrief":"健身的时候，何不用美美的衣服来营造良好的心情","newsId":"638691426951106560","newsSrc":"智慧长沙","newsTitle":"健身的时候，何不用美美的衣服来营造良好的心情","newsType":"7","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"1","tag":"0","timeDif":"602160","videoTime":"","videoUrl":"","viewCount":7064,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573109753","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/642014419223711744.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149909765&Signature=eWLcxvkAGiFB7%2BerEHCVF%2B1Jfho%3D"],"newsBrief":"巩俐夫妇受邀出席总统宴会 素颜出镜与老公甜蜜对视","newsId":"642014424080715776","newsSrc":"智慧长沙","newsTitle":"巩俐夫妇受邀出席总统宴会 素颜出镜与老公甜蜜对视","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"603406","videoTime":"53000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/642014476954112000.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149909779&Signature=DdxGfRK1V%2B3p8UQQ%2BI2KwDuIve0%3D","viewCount":7126,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573109202","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/642012112050327552.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149909215&Signature=Sspsvlh%2FTTRPELHawapLhSbeNsc%3D"],"newsBrief":"双喜临门! 吴亦凡生日之际全新原创单曲《贰叁》上线","newsId":"642012118073348096","newsSrc":"智慧长沙","newsTitle":"双喜临门! 吴亦凡生日之际全新原创单曲《贰叁》上线","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"603957","videoTime":"48000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/642012179150802944.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149909231&Signature=t6QogB3%2F8bVk91c%2Bo7kKnShO3uQ%3D","viewCount":7150,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573094156","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641949008591458304.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149894170&Signature=I1Tuae2PlQm5r4ENgyABLgs6S%2FM%3D"],"newsBrief":"辣眼睛！《爸爸4》田亮扭动唱歌穿秋裤","newsId":"641949013985333248","newsSrc":"智慧长沙","newsTitle":"辣眼睛！《爸爸4》田亮扭动唱歌穿秋裤","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"619003","videoTime":"179000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641949086416769024.flv?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149894189&Signature=NmeQO%2BMGKhhZ5mnK0wB4fGmaQ9c%3D","viewCount":7187,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573027640","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641670005703970816.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149827651&Signature=ms%2FWY74TCjSt%2BnOxQ%2F26iLQYYYE%3D"],"newsBrief":"郎朗错位图像穿条裙子 网友调侃：身材比吉娜还好","newsId":"641670010183487488","newsSrc":"智慧长沙","newsTitle":"郎朗错位图像穿条裙子 网友调侃：身材比吉娜还好","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"685519","videoTime":"67000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641670082476511232.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149827669&Signature=WOfH1CUqAhkcxKhsuO30DjC21Do%3D","viewCount":7215,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573024950","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641658718878044160.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149824960&Signature=546UH7G99Qp9YHxOtj6jQGU0uns%3D"],"newsBrief":"在国外演奏《黄河》 我哭了出来","newsId":"641658731465150464","newsSrc":"智慧长沙","newsTitle":"在国外演奏《黄河》 我哭了出来","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"688209","videoTime":"323000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641664179727634432.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149826262&Signature=O1FXxPd784c0N8w2mF4TyQlf1Ms%3D","viewCount":6914,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"0","issueTimeStamp":"1573024647","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641657447324454912.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149824657&Signature=CO5vXQ1tVY2M4RdFNMMYmHLBAV8%3D"],"newsBrief":"郎朗妻子吉娜素颜照曝光 卸浓妆很清纯似邻家女孩","newsId":"641657453523636224","newsSrc":"智慧长沙","newsTitle":"郎朗妻子吉娜素颜照曝光 卸浓妆很清纯似邻家女孩","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"688512","videoTime":"63000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641657522276667392.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149824674&Signature=uyxzGQLLAEIKJVty9W71rk35lJI%3D","viewCount":6953,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"1","issueTimeStamp":"1573008802","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641591217838231552.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149808866&Signature=1J8b7be727M1p2LcZVPxli6jHYI%3D"],"newsBrief":"新浪娱乐讯  近日，郎朗的一张错位图引网友爆笑，照片中郎朗被大提琴挡住，乍一看以为朗朗穿了一件蓝色抹胸长裙。网友留言调侃：\u201c这蓝色长裙还可以，是不是偷穿老婆吉娜的衣服了~\u201d\u201c这张错位图的身材比吉娜的还好！","newsId":"641591223290826752","newsSrc":"智慧长沙","newsTitle":"郎朗错位图引网友爆笑 被大提琴挡住似穿抹胸长裙","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"5","timeDif":"704357","videoTime":"25000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641591252864864256.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149808874&Signature=Ni65ym7ME7hBeo91TfFLiECXBYM%3D","viewCount":6546,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"1","issueTimeStamp":"1573008061","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641587878517936128.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149808070&Signature=TBQahd7dukX1fP4lzVkxjgxcrJw%3D"],"newsBrief":"新浪娱乐讯    马蓉在上月晒为女儿庆生视频时，在评论区回怼提到女儿缺乏父爱的网友，嘲讽王宝强是废物应该被断舍离。前些天马蓉辱骂前夫是废物后现身机场，她一身大牌看起来贵气满满，可见离婚后依旧是过着富贵生活。可能是因为王宝强离婚后火速有了新恋情，让马蓉骂王宝强是废物后，仍然觉得内心很不平衡，近日，马蓉在某短视频平台分享了一段自己拍摄的视频，马蓉被眼尖的网友指出还戴着王宝强送她的项链...","newsId":"641587886029934592","newsSrc":"智慧长沙","newsTitle":"被指还戴着王宝强送的项链 马蓉回呛：该拿的全被拿走了","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"5","timeDif":"705098","videoTime":"50000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641587931454246912.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149808083&Signature=lYfDCKzS2dt8NSjypAcFeaKDKgw%3D","viewCount":6602,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"0","issueTimeStamp":"1573007544","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641585707420356608.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149807552&Signature=21wOCm1RYxnF%2FvoXhJ3GGXFlFa8%3D"],"newsBrief":"新浪娱乐讯  11月3日晚，在某节目中，费玉清回应透露了自己唱歌的习惯，解释总是仰头唱歌的原因。他说\u201c以前我们那个年代，一根铁杆上上面一个麦克风，然后音乐下来开始演唱\u201d，让他自然而然地养成了\u201c抬头演唱\u201d的习惯，而在更久之前唱歌时，则是\u201c两边电线拉下来，中间挂着麦克风\u201d，有时候甚至需要踮脚尖，表示是为了\u201c适应设备\u201d才形成的动作。 　　11月6、7日唱完台北小巨蛋最后2场之后，费玉清就要正式从歌坛引...","newsId":"641585710322814976","newsSrc":"智慧长沙","newsTitle":"为何总头仰45度演唱？费玉清解释原因辟谣为飙高音","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"705615","videoTime":"57000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641585758469230592.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149807565&Signature=dkmvBfc3cnI1O6eeNX7NWjHApRk%3D","viewCount":6654,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573007351","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641584911383400448.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149807362&Signature=HpAcnGsMwF8AjrZ8pi%2Fy8MJvDj0%3D"],"newsBrief":"新浪娱乐讯  11月4日晚，包贝尔在微博上晒出一组照片，并送上新鲜鸡汤：\u201c喧闹之后归于平静，世间所有的故事，就像四时总会交替，日夜总会轮转\u2026\u2026 \u201d照片里，包贝尔画着小丑妆，龇牙灿笑却显得有一丝心酸和伤感。不过不少网友都评价称仿佛看到了饺子，父女长得很是相似！ 　　包贝尔在2013年的时候向女友包文婧求婚成功，2015年包文婧生下女儿包可艾，小名饺子。饺子因活泼可爱，表情丰富，给观众留下深刻的印象。","newsId":"641584914520739840","newsSrc":"智慧长沙","newsTitle":"包贝尔小丑妆笑容背后显心酸 深夜发文感慨送心灵鸡汤","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"705808","videoTime":"55000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641584945374040064.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149807371&Signature=9KT5GKklYVp79XTGC2KfNsUHXos%3D","viewCount":6698,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573007090","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641583813054566400.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149807101&Signature=94p8MGalKi4ZXxB%2FgVjPzHklI3Q%3D"],"newsBrief":"新浪娱乐讯  11月5日，有媒体曝料，近日，娄艺潇乘飞机抵达上海，当天，戴着帽子口罩遮面的娄艺潇显得十分低调，在机场拍摄一番便迅速上车离开。然而她直接来到了小区后门，身边还有一位同样拖着行李箱的男子。次日清晨，内地演员陈若轩突然出现在小区外，而他所穿的破洞牛仔裤，与昨日和娄艺潇一同返家的那位男子正是同一条，疑似两人恋情曝光。9月初，娄艺潇曾被曝与一白衣男子的疑似恋情，二人牵手一起回到家中，就此求证娄艺潇方，对方并未作出回应","newsId":"641583874706640896","newsSrc":"智慧长沙","newsTitle":"娄艺潇再曝新恋情？疑似深夜带陈若轩返家过夜","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"706069","videoTime":"42000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641583919703134208.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149807126&Signature=TFqhHU6kiCcHihtl4Mq4Z3rG8cA%3D","viewCount":6729,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"1","issueTimeStamp":"1573006866","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641582867696193536.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806875&Signature=Vhy0VuuqlNuhFRIEFe3%2FETl3kYY%3D"],"newsBrief":"新浪娱乐讯  最近，网上曝出王嘉尔接受采访的一个小场景，采访中，记者问王嘉尔：为什么会经常被拍到逛超市？王嘉尔回应道：\u201c拍到我逛超市很正常，做菜，肯定要材料，材料的话，我不可能去打猎，那肯定去超市买。\u201d让人笑喷。网友也纷纷表示：\u201c第一次听见有人去买菜的原因是因为不能打猎哈哈哈\u201d、\u201c不然你们给个反驳的理由，王嘉尔真的是一本正经的可爱嗷\u201d、\u201c可也解释的太清楚了吧，怎么这么可爱呢\u201d。 　","newsId":"641582873400446976","newsSrc":"智慧长沙","newsTitle":"王嘉尔耿直回应超市被拍 \u201c因为又不可能去打猎\u201d","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"5","timeDif":"706293","videoTime":"48000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641582913523159040.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806886&Signature=xA1BBehAqlNZn%2FKzaGixh2fHPWU%3D","viewCount":6764,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"1","issueTimeStamp":"1573006740","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641582344016367616.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806750&Signature=0MrqvvooipLsEbVHvfD7KPm%2F2OA%3D"],"newsBrief":"新浪娱乐讯  11月5日凌晨，黄子韬发文称：\u201c这么多年了，这首长达五分多钟的最好的我们不打动除了粉丝以外的人的话，我真的失去私心好好当个戏子去吧\u2026\u2026\u201d 随后黄子韬在评论区感慨自己做音乐这么久、付出那么多，却没有一首出圈的歌，\u201c我对不起我自己，玩儿出感情了真的\u201d。目前该微博已删除。 　　归国这几年，从实际情况来看，黄子韬的音乐确实没有太过突出的地方，在电影电视方面，他拍了一部网剧《大话西游》，","newsId":"641582350370738176","newsSrc":"智慧长沙","newsTitle":"黄子韬深夜感慨音乐不出圈 称失去私心好好当戏子","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"5","timeDif":"706419","videoTime":"59000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641582413201412096.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806767&Signature=nSgcuMK0w%2BCd4sK8QQ5%2BtoIuu6M%3D","viewCount":6802,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"1","issueTimeStamp":"1573006615","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641581817882873856.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806625&Signature=vjxpBriqEROC5llPYfDVbMhOFH4%3D"],"newsBrief":"范冰冰海清祝绪丹同框看秀 范爷\u201c保镖开路\u201d造型一言难尽","newsId":"641581823276748800","newsSrc":"智慧长沙","newsTitle":"范冰冰海清祝绪丹同框看秀 范爷\u201c保镖开路\u201d造型一言难尽","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"5","timeDif":"706544","videoTime":"53000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641581851126927360.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806633&Signature=HwIUqb0zJOh8l%2BSRU0xaC684eZ8%3D","viewCount":6848,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"1","issueTimeStamp":"1573006507","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641581366252802048.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806517&Signature=orOknx%2B4bWl9ZE62HUDfkV9ffwI%3D"],"newsBrief":"早晨美貌时刻分享! 李栋旭戴手表动作秒杀网友","newsId":"641581370560352256","newsSrc":"智慧长沙","newsTitle":"早晨美貌时刻分享! 李栋旭戴手表动作秒杀网友","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"5","timeDif":"706652","videoTime":"43000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641581401216520192.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806526&Signature=8Ilb6O%2BFO8ZeAfy6pxg%2FA8wsaYU%3D","viewCount":6881,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"0","issueTimeStamp":"1573006402","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641580922185060352.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806411&Signature=TcApJ5mFaCe9rSHNjDupiOAXqW4%3D"],"newsBrief":"奚梦瑶产后火速营业 诞下赌王长孙不忘工作","newsId":"641580926505193472","newsSrc":"智慧长沙","newsTitle":"奚梦瑶产后火速营业 诞下赌王长孙不忘工作","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"706757","videoTime":"59000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641580956733542400.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806420&Signature=y8ML%2F5vGNOOQHd0qNSXimpq6e2o%3D","viewCount":7202,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573005593","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641577834158100480.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149805675&Signature=wmv1Lm2oJWgmyryPMh3gIkGJtmI%3D"],"newsBrief":"黄子韬深夜发文感慨音乐不出圈","newsId":"641577839413563392","newsSrc":"智慧长沙","newsTitle":"黄子韬深夜发文感慨音乐不出圈","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"707566","videoTime":"59000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641577915682787328.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149805695&Signature=%2BdY1byQM8TPouU%2BwPhSuvIElKlY%3D","viewCount":7253,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573004243","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641571856549285888.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149804250&Signature=w5xiyzHFDvpDfuT42hAM9q2EpiM%3D"],"newsBrief":"日前，杭州湖滨银泰的一台能夹大闸蟹的娃娃机，不花钱凭兑换值就能免费抓大闸蟹。平时超爱夹娃娃的小金姑娘一口气连抓10对蟹，她说比一般的娃娃好抓多了，\u201c没想到，今年的第一顿蟹居然是这么来的！\u201d都市快报","newsId":"641572027874021376","newsSrc":"智慧长沙","newsTitle":"还有这种操作？女子从娃娃机里一次性抓走十对螃蟹","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"708916","videoTime":"198000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641572085902217216.flv?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149804305&Signature=6B4kmhCW2Sgn9Aajp08jA4FSOXw%3D","viewCount":7319,"whetherLike":""}],"navigateFirstPage":1,"navigateLastPage":1,"navigatePages":20,"navigatepageNums":[1],"nextPage":0,"pageNum":1,"pageSize":20,"pages":1,"prePage":0,"size":20,"startRow":0,"total":20}
     * myServices :
     */

    private List<ServiceBean> myServices;
    private List<FocusLsBean> focusLs;
    private List<ClassicNewsBean> topNewsLs;
    private List<ClassicNewsBean> newsLs;
    private List<BookMarkBean> bookMark;
    private CopyOnWriteArrayList<ClassicNewsBean> twentyFourHours;

    public List<ClassicNewsBean> getNewsLs() {
        return newsLs;
    }

    public void setNewsLs(List<ClassicNewsBean> newsLs) {
        this.newsLs = newsLs;
    }

    public List<ServiceBean> getMyServices() {
        return myServices;
    }

    public void setMyServices(List<ServiceBean> myServices) {
        this.myServices = myServices;
    }

    public List<FocusLsBean> getFocusLs() {
        return focusLs;
    }

    public void setFocusLs(List<FocusLsBean> focusLs) {
        this.focusLs = focusLs;
    }

    public List<ClassicNewsBean> getTopNewsLs() {
        return topNewsLs;
    }

    public void setTopNewsLs(List<ClassicNewsBean> topNewsLs) {
        this.topNewsLs = topNewsLs;
    }

    public List<BookMarkBean> getBookMark() {
        return bookMark;
    }

    public void setBookMark(List<BookMarkBean> bookMark) {
        this.bookMark = bookMark;
    }

    public CopyOnWriteArrayList<ClassicNewsBean> getTwentyFourHours() {
        return twentyFourHours;
    }

    public void setTwentyFourHours(CopyOnWriteArrayList<ClassicNewsBean> twentyFourHours) {
        this.twentyFourHours = twentyFourHours;
    }

    public static class NewsLsBean {
        /**
         * endRow : 19
         * firstPage : 1
         * hasNextPage : false
         * hasPreviousPage : false
         * isFirstPage : true
         * isLastPage : true
         * lastPage : 1
         * list : [{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"1","isSVideo":"","issueTimeStamp":"1573115672","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/642039424489754624.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149915727&Signature=JX020qTx4pq77Nm65v1gaJYcRCc%3D"],"newsBrief":"女孩与从小长大的邻居哥哥结婚，网友称她是回娘家最方便的新娘","newsId":"642039433301987328","newsSrc":"智慧长沙","newsTitle":"女孩与从小长大的邻居哥哥结婚，网友称她是回娘家最方便的新娘","newsType":"1","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"1","tag":"0","timeDif":"597487","videoTime":"","videoUrl":"","viewCount":7036,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"","isExternal":"","isSVideo":"","issueTimeStamp":"1573110999","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/642017598694887424.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149910523&Signature=whhAMd0R3hCrF%2BSvjms9Y4PqJk8%3D","http://dev-rgw.zhcs.csbtv.com/zhcs/images/642017614071205888.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149910527&Signature=qxSgRrF5OiSwICqC4S4u8NKoZAM%3D","http://dev-rgw.zhcs.csbtv.com/zhcs/images/642017648342863872.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149910535&Signature=Dw4tO4aXvX9dAZcalNPTxl4iNrE%3D","http://dev-rgw.zhcs.csbtv.com/zhcs/images/642017627245514752.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149910530&Signature=%2FvB6ILqnMYEMV1oQiq3Xu8zyTdM%3D"],"newsBrief":"健身的时候，何不用美美的衣服来营造良好的心情","newsId":"638691426951106560","newsSrc":"智慧长沙","newsTitle":"健身的时候，何不用美美的衣服来营造良好的心情","newsType":"7","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"1","tag":"0","timeDif":"602160","videoTime":"","videoUrl":"","viewCount":7064,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573109753","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/642014419223711744.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149909765&Signature=eWLcxvkAGiFB7%2BerEHCVF%2B1Jfho%3D"],"newsBrief":"巩俐夫妇受邀出席总统宴会 素颜出镜与老公甜蜜对视","newsId":"642014424080715776","newsSrc":"智慧长沙","newsTitle":"巩俐夫妇受邀出席总统宴会 素颜出镜与老公甜蜜对视","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"603406","videoTime":"53000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/642014476954112000.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149909779&Signature=DdxGfRK1V%2B3p8UQQ%2BI2KwDuIve0%3D","viewCount":7126,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573109202","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/642012112050327552.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149909215&Signature=Sspsvlh%2FTTRPELHawapLhSbeNsc%3D"],"newsBrief":"双喜临门! 吴亦凡生日之际全新原创单曲《贰叁》上线","newsId":"642012118073348096","newsSrc":"智慧长沙","newsTitle":"双喜临门! 吴亦凡生日之际全新原创单曲《贰叁》上线","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"603957","videoTime":"48000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/642012179150802944.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149909231&Signature=t6QogB3%2F8bVk91c%2Bo7kKnShO3uQ%3D","viewCount":7150,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573094156","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641949008591458304.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149894170&Signature=I1Tuae2PlQm5r4ENgyABLgs6S%2FM%3D"],"newsBrief":"辣眼睛！《爸爸4》田亮扭动唱歌穿秋裤","newsId":"641949013985333248","newsSrc":"智慧长沙","newsTitle":"辣眼睛！《爸爸4》田亮扭动唱歌穿秋裤","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"619003","videoTime":"179000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641949086416769024.flv?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149894189&Signature=NmeQO%2BMGKhhZ5mnK0wB4fGmaQ9c%3D","viewCount":7187,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573027640","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641670005703970816.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149827651&Signature=ms%2FWY74TCjSt%2BnOxQ%2F26iLQYYYE%3D"],"newsBrief":"郎朗错位图像穿条裙子 网友调侃：身材比吉娜还好","newsId":"641670010183487488","newsSrc":"智慧长沙","newsTitle":"郎朗错位图像穿条裙子 网友调侃：身材比吉娜还好","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"685519","videoTime":"67000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641670082476511232.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149827669&Signature=WOfH1CUqAhkcxKhsuO30DjC21Do%3D","viewCount":7215,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573024950","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641658718878044160.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149824960&Signature=546UH7G99Qp9YHxOtj6jQGU0uns%3D"],"newsBrief":"在国外演奏《黄河》 我哭了出来","newsId":"641658731465150464","newsSrc":"智慧长沙","newsTitle":"在国外演奏《黄河》 我哭了出来","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"688209","videoTime":"323000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641664179727634432.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149826262&Signature=O1FXxPd784c0N8w2mF4TyQlf1Ms%3D","viewCount":6914,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"0","issueTimeStamp":"1573024647","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641657447324454912.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149824657&Signature=CO5vXQ1tVY2M4RdFNMMYmHLBAV8%3D"],"newsBrief":"郎朗妻子吉娜素颜照曝光 卸浓妆很清纯似邻家女孩","newsId":"641657453523636224","newsSrc":"智慧长沙","newsTitle":"郎朗妻子吉娜素颜照曝光 卸浓妆很清纯似邻家女孩","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"688512","videoTime":"63000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641657522276667392.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149824674&Signature=uyxzGQLLAEIKJVty9W71rk35lJI%3D","viewCount":6953,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"1","issueTimeStamp":"1573008802","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641591217838231552.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149808866&Signature=1J8b7be727M1p2LcZVPxli6jHYI%3D"],"newsBrief":"新浪娱乐讯  近日，郎朗的一张错位图引网友爆笑，照片中郎朗被大提琴挡住，乍一看以为朗朗穿了一件蓝色抹胸长裙。网友留言调侃：\u201c这蓝色长裙还可以，是不是偷穿老婆吉娜的衣服了~\u201d\u201c这张错位图的身材比吉娜的还好！","newsId":"641591223290826752","newsSrc":"智慧长沙","newsTitle":"郎朗错位图引网友爆笑 被大提琴挡住似穿抹胸长裙","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"5","timeDif":"704357","videoTime":"25000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641591252864864256.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149808874&Signature=Ni65ym7ME7hBeo91TfFLiECXBYM%3D","viewCount":6546,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"1","issueTimeStamp":"1573008061","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641587878517936128.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149808070&Signature=TBQahd7dukX1fP4lzVkxjgxcrJw%3D"],"newsBrief":"新浪娱乐讯    马蓉在上月晒为女儿庆生视频时，在评论区回怼提到女儿缺乏父爱的网友，嘲讽王宝强是废物应该被断舍离。前些天马蓉辱骂前夫是废物后现身机场，她一身大牌看起来贵气满满，可见离婚后依旧是过着富贵生活。可能是因为王宝强离婚后火速有了新恋情，让马蓉骂王宝强是废物后，仍然觉得内心很不平衡，近日，马蓉在某短视频平台分享了一段自己拍摄的视频，马蓉被眼尖的网友指出还戴着王宝强送她的项链...","newsId":"641587886029934592","newsSrc":"智慧长沙","newsTitle":"被指还戴着王宝强送的项链 马蓉回呛：该拿的全被拿走了","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"5","timeDif":"705098","videoTime":"50000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641587931454246912.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149808083&Signature=lYfDCKzS2dt8NSjypAcFeaKDKgw%3D","viewCount":6602,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"0","issueTimeStamp":"1573007544","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641585707420356608.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149807552&Signature=21wOCm1RYxnF%2FvoXhJ3GGXFlFa8%3D"],"newsBrief":"新浪娱乐讯  11月3日晚，在某节目中，费玉清回应透露了自己唱歌的习惯，解释总是仰头唱歌的原因。他说\u201c以前我们那个年代，一根铁杆上上面一个麦克风，然后音乐下来开始演唱\u201d，让他自然而然地养成了\u201c抬头演唱\u201d的习惯，而在更久之前唱歌时，则是\u201c两边电线拉下来，中间挂着麦克风\u201d，有时候甚至需要踮脚尖，表示是为了\u201c适应设备\u201d才形成的动作。 　　11月6、7日唱完台北小巨蛋最后2场之后，费玉清就要正式从歌坛引...","newsId":"641585710322814976","newsSrc":"智慧长沙","newsTitle":"为何总头仰45度演唱？费玉清解释原因辟谣为飙高音","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"705615","videoTime":"57000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641585758469230592.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149807565&Signature=dkmvBfc3cnI1O6eeNX7NWjHApRk%3D","viewCount":6654,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573007351","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641584911383400448.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149807362&Signature=HpAcnGsMwF8AjrZ8pi%2Fy8MJvDj0%3D"],"newsBrief":"新浪娱乐讯  11月4日晚，包贝尔在微博上晒出一组照片，并送上新鲜鸡汤：\u201c喧闹之后归于平静，世间所有的故事，就像四时总会交替，日夜总会轮转\u2026\u2026 \u201d照片里，包贝尔画着小丑妆，龇牙灿笑却显得有一丝心酸和伤感。不过不少网友都评价称仿佛看到了饺子，父女长得很是相似！ 　　包贝尔在2013年的时候向女友包文婧求婚成功，2015年包文婧生下女儿包可艾，小名饺子。饺子因活泼可爱，表情丰富，给观众留下深刻的印象。","newsId":"641584914520739840","newsSrc":"智慧长沙","newsTitle":"包贝尔小丑妆笑容背后显心酸 深夜发文感慨送心灵鸡汤","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"705808","videoTime":"55000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641584945374040064.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149807371&Signature=9KT5GKklYVp79XTGC2KfNsUHXos%3D","viewCount":6698,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573007090","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641583813054566400.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149807101&Signature=94p8MGalKi4ZXxB%2FgVjPzHklI3Q%3D"],"newsBrief":"新浪娱乐讯  11月5日，有媒体曝料，近日，娄艺潇乘飞机抵达上海，当天，戴着帽子口罩遮面的娄艺潇显得十分低调，在机场拍摄一番便迅速上车离开。然而她直接来到了小区后门，身边还有一位同样拖着行李箱的男子。次日清晨，内地演员陈若轩突然出现在小区外，而他所穿的破洞牛仔裤，与昨日和娄艺潇一同返家的那位男子正是同一条，疑似两人恋情曝光。9月初，娄艺潇曾被曝与一白衣男子的疑似恋情，二人牵手一起回到家中，就此求证娄艺潇方，对方并未作出回应","newsId":"641583874706640896","newsSrc":"智慧长沙","newsTitle":"娄艺潇再曝新恋情？疑似深夜带陈若轩返家过夜","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"706069","videoTime":"42000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641583919703134208.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149807126&Signature=TFqhHU6kiCcHihtl4Mq4Z3rG8cA%3D","viewCount":6729,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"1","issueTimeStamp":"1573006866","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641582867696193536.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806875&Signature=Vhy0VuuqlNuhFRIEFe3%2FETl3kYY%3D"],"newsBrief":"新浪娱乐讯  最近，网上曝出王嘉尔接受采访的一个小场景，采访中，记者问王嘉尔：为什么会经常被拍到逛超市？王嘉尔回应道：\u201c拍到我逛超市很正常，做菜，肯定要材料，材料的话，我不可能去打猎，那肯定去超市买。\u201d让人笑喷。网友也纷纷表示：\u201c第一次听见有人去买菜的原因是因为不能打猎哈哈哈\u201d、\u201c不然你们给个反驳的理由，王嘉尔真的是一本正经的可爱嗷\u201d、\u201c可也解释的太清楚了吧，怎么这么可爱呢\u201d。 　","newsId":"641582873400446976","newsSrc":"智慧长沙","newsTitle":"王嘉尔耿直回应超市被拍 \u201c因为又不可能去打猎\u201d","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"5","timeDif":"706293","videoTime":"48000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641582913523159040.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806886&Signature=xA1BBehAqlNZn%2FKzaGixh2fHPWU%3D","viewCount":6764,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"1","issueTimeStamp":"1573006740","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641582344016367616.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806750&Signature=0MrqvvooipLsEbVHvfD7KPm%2F2OA%3D"],"newsBrief":"新浪娱乐讯  11月5日凌晨，黄子韬发文称：\u201c这么多年了，这首长达五分多钟的最好的我们不打动除了粉丝以外的人的话，我真的失去私心好好当个戏子去吧\u2026\u2026\u201d 随后黄子韬在评论区感慨自己做音乐这么久、付出那么多，却没有一首出圈的歌，\u201c我对不起我自己，玩儿出感情了真的\u201d。目前该微博已删除。 　　归国这几年，从实际情况来看，黄子韬的音乐确实没有太过突出的地方，在电影电视方面，他拍了一部网剧《大话西游》，","newsId":"641582350370738176","newsSrc":"智慧长沙","newsTitle":"黄子韬深夜感慨音乐不出圈 称失去私心好好当戏子","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"5","timeDif":"706419","videoTime":"59000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641582413201412096.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806767&Signature=nSgcuMK0w%2BCd4sK8QQ5%2BtoIuu6M%3D","viewCount":6802,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"1","issueTimeStamp":"1573006615","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641581817882873856.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806625&Signature=vjxpBriqEROC5llPYfDVbMhOFH4%3D"],"newsBrief":"范冰冰海清祝绪丹同框看秀 范爷\u201c保镖开路\u201d造型一言难尽","newsId":"641581823276748800","newsSrc":"智慧长沙","newsTitle":"范冰冰海清祝绪丹同框看秀 范爷\u201c保镖开路\u201d造型一言难尽","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"5","timeDif":"706544","videoTime":"53000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641581851126927360.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806633&Signature=HwIUqb0zJOh8l%2BSRU0xaC684eZ8%3D","viewCount":6848,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"1","issueTimeStamp":"1573006507","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641581366252802048.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806517&Signature=orOknx%2B4bWl9ZE62HUDfkV9ffwI%3D"],"newsBrief":"早晨美貌时刻分享! 李栋旭戴手表动作秒杀网友","newsId":"641581370560352256","newsSrc":"智慧长沙","newsTitle":"早晨美貌时刻分享! 李栋旭戴手表动作秒杀网友","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"5","timeDif":"706652","videoTime":"43000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641581401216520192.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806526&Signature=8Ilb6O%2BFO8ZeAfy6pxg%2FA8wsaYU%3D","viewCount":6881,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"0","issueTimeStamp":"1573006402","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641580922185060352.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806411&Signature=TcApJ5mFaCe9rSHNjDupiOAXqW4%3D"],"newsBrief":"奚梦瑶产后火速营业 诞下赌王长孙不忘工作","newsId":"641580926505193472","newsSrc":"智慧长沙","newsTitle":"奚梦瑶产后火速营业 诞下赌王长孙不忘工作","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"706757","videoTime":"59000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641580956733542400.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149806420&Signature=y8ML%2F5vGNOOQHd0qNSXimpq6e2o%3D","viewCount":7202,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573005593","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641577834158100480.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149805675&Signature=wmv1Lm2oJWgmyryPMh3gIkGJtmI%3D"],"newsBrief":"黄子韬深夜发文感慨音乐不出圈","newsId":"641577839413563392","newsSrc":"智慧长沙","newsTitle":"黄子韬深夜发文感慨音乐不出圈","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"707566","videoTime":"59000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641577915682787328.mp4?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149805695&Signature=%2BdY1byQM8TPouU%2BwPhSuvIElKlY%3D","viewCount":7253,"whetherLike":""},{"commentCount":"","detailsUrl":"","isCollect":"","isComment":"0","isExternal":"","isSVideo":"2","issueTimeStamp":"1573004243","likeCount":"","mPictures":["http://dev-rgw.zhcs.csbtv.com/zhcs/images/641571856549285888.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149804250&Signature=w5xiyzHFDvpDfuT42hAM9q2EpiM%3D"],"newsBrief":"日前，杭州湖滨银泰的一台能夹大闸蟹的娃娃机，不花钱凭兑换值就能免费抓大闸蟹。平时超爱夹娃娃的小金姑娘一口气连抓10对蟹，她说比一般的娃娃好抓多了，\u201c没想到，今年的第一顿蟹居然是这么来的！\u201d都市快报","newsId":"641572027874021376","newsSrc":"智慧长沙","newsTitle":"还有这种操作？女子从娃娃机里一次性抓走十对螃蟹","newsType":"2","pageUrl":"","shareH5":"https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin","shareImg":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D","shareText":"智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。","showForm":"5","tag":"0","timeDif":"708916","videoTime":"198000","videoUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/video/641572085902217216.flv?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149804305&Signature=6B4kmhCW2Sgn9Aajp08jA4FSOXw%3D","viewCount":7319,"whetherLike":""}]
         * navigateFirstPage : 1
         * navigateLastPage : 1
         * navigatePages : 20
         * navigatepageNums : [1]
         * nextPage : 0
         * pageNum : 1
         * pageSize : 20
         * pages : 1
         * prePage : 0
         * size : 20
         * startRow : 0
         * total : 20
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
        private List<ClassicNewsBean> list;
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

        public List<ClassicNewsBean> getList() {
            return list;
        }

        public void setList(List<ClassicNewsBean> list) {
            this.list = list;
        }

        public List<Integer> getNavigatepageNums() {
            return navigatepageNums;
        }

        public void setNavigatepageNums(List<Integer> navigatepageNums) {
            this.navigatepageNums = navigatepageNums;
        }

        public static class ClassicNewsBean implements Serializable{
            /**
             * commentCount :
             * detailsUrl :
             * isCollect :
             * isComment : 0
             * isExternal : 1
             * isSVideo :
             * issueTimeStamp : 1573115672
             * likeCount :
             * mPictures : ["http://dev-rgw.zhcs.csbtv.com/zhcs/images/642039424489754624.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149915727&Signature=JX020qTx4pq77Nm65v1gaJYcRCc%3D"]
             * newsBrief : 女孩与从小长大的邻居哥哥结婚，网友称她是回娘家最方便的新娘
             * newsId : 642039433301987328
             * newsSrc : 智慧长沙
             * newsTitle : 女孩与从小长大的邻居哥哥结婚，网友称她是回娘家最方便的新娘
             * newsType : 1
             * pageUrl :
             * shareH5 : https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin
             * shareImg : http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D
             * shareText : 智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。
             * showForm : 1
             * tag : 0
             * timeDif : 597487
             * videoTime :
             * videoUrl :
             * viewCount : 7036
             * whetherLike :
             */

            private String commentCount;
            private String detailsUrl;
            private String isCollect;
            private String isComment;
            private String isExternal;
            private String isSVideo;
            private String issueTimeStamp;
            private String likeCount;
            private String newsBrief;
            private String newsId;
            private String newsSrc;
            private String newsTitle;
            private String newsType;
            private String pageUrl;
            private String shareH5;
            private String shareImg;
            private String shareText;
            private String showForm;
            private String tag;
            private String timeDif;
            private String videoTime;
            private String videoUrl;
            private String viewCount;
            private String whetherLike;
            private List<String> mPictures;

            public String getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(String commentCount) {
                this.commentCount = commentCount;
            }

            public String getDetailsUrl() {
                return detailsUrl;
            }

            public void setDetailsUrl(String detailsUrl) {
                this.detailsUrl = detailsUrl;
            }

            public String getIsCollect() {
                return isCollect;
            }

            public void setIsCollect(String isCollect) {
                this.isCollect = isCollect;
            }

            public String getIsComment() {
                return isComment;
            }

            public void setIsComment(String isComment) {
                this.isComment = isComment;
            }

            public String getIsExternal() {
                return isExternal;
            }

            public void setIsExternal(String isExternal) {
                this.isExternal = isExternal;
            }

            public String getIsSVideo() {
                return isSVideo;
            }

            public void setIsSVideo(String isSVideo) {
                this.isSVideo = isSVideo;
            }

            public String getIssueTimeStamp() {
                return issueTimeStamp;
            }

            public void setIssueTimeStamp(String issueTimeStamp) {
                this.issueTimeStamp = issueTimeStamp;
            }

            public String getLikeCount() {
                return likeCount;
            }

            public void setLikeCount(String likeCount) {
                this.likeCount = likeCount;
            }

            public String getNewsBrief() {
                return newsBrief;
            }

            public void setNewsBrief(String newsBrief) {
                this.newsBrief = newsBrief;
            }

            public String getNewsId() {
                return newsId;
            }

            public void setNewsId(String newsId) {
                this.newsId = newsId;
            }

            public String getNewsSrc() {
                return newsSrc;
            }

            public void setNewsSrc(String newsSrc) {
                this.newsSrc = newsSrc;
            }

            public String getNewsTitle() {
                return newsTitle;
            }

            public void setNewsTitle(String newsTitle) {
                this.newsTitle = newsTitle;
            }

            public String getNewsType() {
                return newsType;
            }

            public void setNewsType(String newsType) {
                this.newsType = newsType;
            }

            public String getPageUrl() {
                return pageUrl;
            }

            public void setPageUrl(String pageUrl) {
                this.pageUrl = pageUrl;
            }

            public String getShareH5() {
                return shareH5;
            }

            public void setShareH5(String shareH5) {
                this.shareH5 = shareH5;
            }

            public String getShareImg() {
                return shareImg;
            }

            public void setShareImg(String shareImg) {
                this.shareImg = shareImg;
            }

            public String getShareText() {
                return shareText;
            }

            public void setShareText(String shareText) {
                this.shareText = shareText;
            }

            public String getShowForm() {
                return showForm;
            }

            public void setShowForm(String showForm) {
                this.showForm = showForm;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getTimeDif() {
                return timeDif;
            }

            public void setTimeDif(String timeDif) {
                this.timeDif = timeDif;
            }

            public String getVideoTime() {
                return videoTime;
            }

            public void setVideoTime(String videoTime) {
                this.videoTime = videoTime;
            }

            public String getVideoUrl() {
                return videoUrl;
            }

            public void setVideoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
            }

            public String getViewCount() {
                return viewCount;
            }

            public void setViewCount(String viewCount) {
                this.viewCount = viewCount;
            }

            public String getWhetherLike() {
                return whetherLike;
            }

            public void setWhetherLike(String whetherLike) {
                this.whetherLike = whetherLike;
            }

            public List<String> getMPictures() {
                return mPictures;
            }

            public void setMPictures(List<String> mPictures) {
                this.mPictures = mPictures;
            }
        }
    }

    public static class BookMarkBean{
        private String bookmarkName;
        private String skipUrl;
        private String thumUrl;
        private String skipType;

        public String getBookmarkName() {
            return bookmarkName;
        }

        public void setBookmarkName(String bookmarkName) {
            this.bookmarkName = bookmarkName;
        }

        public String getSkipUrl() {
            return skipUrl;
        }

        public void setSkipUrl(String skipUrl) {
            this.skipUrl = skipUrl;
        }

        public String getThumUrl() {
            return thumUrl;
        }

        public void setThumUrl(String thumUrl) {
            this.thumUrl = thumUrl;
        }

        public String getSkipType() {
            return skipType;
        }

        public void setSkipType(String skipType) {
            this.skipType = skipType;
        }
    }

    public static class FocusLsBean implements Serializable {
        /**
         * columnId : 000000000000000002
         * crtDate : 2019-10-25 00:00:00
         * crtOrgCode :
         * crtUserCode : admin
         * externalUrl :
         * focusPictId : 637329379751497728
         * id : 637329379751497728
         * issueTimeStamp :
         * newsId :
         * newsSrc :
         * newsTitle : 测试关联
         * relaColumnId : 634122975527964672
         * relaType : 2
         * seq : 0
         * status : 1
         * tag :
         * thumFile : images/637329371744571392.png
         * thumUrl : http://dev-rgw.zhcs.csbtv.com/zhcs/images/637329371744571392.png?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148792763&Signature=sxhnq0e%2FpF4BFC5EJ7jhfUMlLGQ%3D
         * updDate : 2019-10-25 00:00:00
         * updOrgCode :
         * updUserCode : admin
         * viewCount : 0
         */

        private String columnId;
        private String crtDate;
        private String crtOrgCode;
        private String crtUserCode;
        private String externalUrl;
        private String focusPictId;
        private String id;
        private String issueTimeStamp;
        private String newsId;
        private String newsSrc;
        private String newsTitle;
        private String relaColumnId;
        private String relaType;
        private int seq;
        private String status;
        private String tag;
        private String thumFile;
        private String thumUrl;
        private String updDate;
        private String updOrgCode;
        private String updUserCode;
        private String viewCount;

        public String getColumnId() {
            return columnId;
        }

        public void setColumnId(String columnId) {
            this.columnId = columnId;
        }

        public String getCrtDate() {
            return crtDate;
        }

        public void setCrtDate(String crtDate) {
            this.crtDate = crtDate;
        }

        public String getCrtOrgCode() {
            return crtOrgCode;
        }

        public void setCrtOrgCode(String crtOrgCode) {
            this.crtOrgCode = crtOrgCode;
        }

        public String getCrtUserCode() {
            return crtUserCode;
        }

        public void setCrtUserCode(String crtUserCode) {
            this.crtUserCode = crtUserCode;
        }

        public String getExternalUrl() {
            return externalUrl;
        }

        public void setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
        }

        public String getFocusPictId() {
            return focusPictId;
        }

        public void setFocusPictId(String focusPictId) {
            this.focusPictId = focusPictId;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIssueTimeStamp() {
            return issueTimeStamp;
        }

        public void setIssueTimeStamp(String issueTimeStamp) {
            this.issueTimeStamp = issueTimeStamp;
        }

        public String getNewsId() {
            return newsId;
        }

        public void setNewsId(String newsId) {
            this.newsId = newsId;
        }

        public String getNewsSrc() {
            return newsSrc;
        }

        public void setNewsSrc(String newsSrc) {
            this.newsSrc = newsSrc;
        }

        public String getNewsTitle() {
            return newsTitle;
        }

        public void setNewsTitle(String newsTitle) {
            this.newsTitle = newsTitle;
        }

        public String getRelaColumnId() {
            return relaColumnId;
        }

        public void setRelaColumnId(String relaColumnId) {
            this.relaColumnId = relaColumnId;
        }

        public String getRelaType() {
            return relaType;
        }

        public void setRelaType(String relaType) {
            this.relaType = relaType;
        }

        public int getSeq() {
            return seq;
        }

        public void setSeq(int seq) {
            this.seq = seq;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getThumFile() {
            return thumFile;
        }

        public void setThumFile(String thumFile) {
            this.thumFile = thumFile;
        }

        public String getThumUrl() {
            return thumUrl;
        }

        public void setThumUrl(String thumUrl) {
            this.thumUrl = thumUrl;
        }

        public String getUpdDate() {
            return updDate;
        }

        public void setUpdDate(String updDate) {
            this.updDate = updDate;
        }

        public String getUpdOrgCode() {
            return updOrgCode;
        }

        public void setUpdOrgCode(String updOrgCode) {
            this.updOrgCode = updOrgCode;
        }

        public String getUpdUserCode() {
            return updUserCode;
        }

        public void setUpdUserCode(String updUserCode) {
            this.updUserCode = updUserCode;
        }

        public String getViewCount() {
            return viewCount;
        }

        public void setViewCount(String viewCount) {
            this.viewCount = viewCount;
        }
    }

}
