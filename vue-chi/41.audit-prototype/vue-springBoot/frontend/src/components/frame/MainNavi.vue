<template lang="html">
  <div class="snb">
    <h1 class="logo">
        <router-link to="/">
            <strong>윤리경영</strong>
            <span>GLOBAL CODE OF CONDUCT</span>
        </router-link>
    </h1>
    <ul class="gnb">
        <li>
            <router-link to="/sub/introduce/index">
                <a>{{ $t("navi.경영진단팀소개")}}</a>
            </router-link>
        </li>
        <li v-if="$i18n.locale=='ko'">        
            <router-link to="/sub/unfairness/index">      
                <a>{{ $t("navi.부정제보")}}</a>       
            </router-link>        
        </li>
         <li v-if="$i18n.locale=='en'">        
            <router-link to="/sub/unfairness/index_en">      
                <a>{{ $t("navi.부정제보")}}</a>       
            </router-link>        
        </li>
    </ul>    
  </div>
</template>

<script>
export default {
}
</script>


<style>

  
/* Side Navigation Bar */
.snb{float:left;width:175px;min-height:820px;padding:100px 40px 0 50px; background:url(../../images/bg_shadow.png) 100% 0 no-repeat}

.snb h1{margin-bottom:68px;font-weight:normal}
.snb h1 a{display:block;margin-bottom:10px;font-size:40px;color:#f37421;}
.snb h1 span{position:absolute;top:150px; left:50px;font-size:11px;font-weight:normal;font-family:'Nanum Gothic', Arial, Helvetica; color:#939494}

  

.gnb{border-top:1px solid #efefef;font-family:'Nanum Gothic Bold';}
.gnb li {display:block;border-bottom:1px solid #efefef; font-size:16px;}
.gnb > li:hover{border-bottom:solid 1px #FFFFFF}
.gnb > li > a{display:block;width:100%; height:29px;line-height:29px;color:#f37c2f;padding-left:10px;}
.gnb > li > a > a{display:block;width:100%; height:29px;line-height:29px;color:#f37c2f;}

.gnb > li > a:hover, .gnb li a.cur{height:29px;line-height:29px;background:url(../../images/over_gnb.gif) no-repeat; color:#fff;padding-left:26px;border-bottom:solid 1px #FFFFFF}
.gnb > li > a > a:hover, .gnb li a.cur{color:#fff;}

.gnb > li > ul{display:none;margin-bottom:20px;padding-top:5px;padding-bottom:10px;border:1px solid #fab483;border-top:0;}
.gnb > li > ul > li{margin:0 15px;font-size:15px}
.gnb > li > ul > li > a{display:block;padding:5px 15px;color:#888888;background:url(../../images/off_gnb_sub.gif) 3px 50% no-repeat;}
.gnb > li > ul > li > a:hover, .gnb > li > ul > li > a.cur2{color:#f37421;background:url(../../images/over_gnb_sub.gif) 0 50% no-repeat}
.gnb > li > ul > li.last{border-bottom:0 none;}
.gnb > li > ul > li > ul { display:none; font-size:13px !important; font-family:'Nanum Gothic' }
.gnb > li > ul > li > ul li {font-size:13px; margin-top:2px;margin-bottom:2px;border:0 none; }
.gnb > li > ul > li > ul a{display:block; margin-left:15px; padding:3px 0;color:#9c9589;font-size:13px;letter-spacing:-0.05em}
.gnb > li > ul > li > ul a:hover, .gnb > li > ul > li > ul a.cur3{color:#f89a5c }


</style>
