<template>
 <div class="main_section">      
           <div class="article1">  
             <h2>{{ $t("main.사이버경영진단팀소개")}}</h2>
                <p>
                    {{ $t("main.사이버경영진단팀소개_내용1")}}<br /> 
                    {{ $t("main.사이버경영진단팀소개_내용2")}}<br /> 
                    {{ $t("main.사이버경영진단팀소개_내용3")}}
                </p>
                <span class="btn2"><a href="/introduce/index_introduce.asp">{{ $t("main.바로가기")}}</a></span>
           </div>

            <div class="article2">
                <h2>{{ $t("main.부정제보")}}</h2>
                <p>
                    {{ $t("main.부정제보_내용1")}}<br />
                    {{ $t("main.부정제보_내용2")}}<br />
                    {{ $t("main.부정제보_내용3")}}<br />
                    {{ $t("main.부정제보_내용4")}}<br />
                    {{ $t("main.부정제보_내용5")}}<br />
                    {{ $t("main.부정제보_내용6")}}<br />
                    {{ $t("main.부정제보_내용7")}}<br />
                </p>
                <span class="btn2"><a href="/unfairness/index_unfairness.asp">{{ $t("바로가기")}}</a></span>
            </div>        
            <div class="article3">
                <h2>{{ $t("main.연락처")}}</h2>
                <p>
                    {{ $t("main.연락처_내용1")}}<br />
                    {{ $t("main.연락처_내용2")}}<br/>
                    {{ $t("main.연락처_내용3")}}
                </p>
            </div>       
        </div>
</template>

<script>

</script>

<style lang="css">

.main_section {margin-top:40px;}
.main_section > div {height:260px;position:relative;float:left;width:339px;
border-bottom:1px solid #efefef;
margin-bottom:15px;
border-right:1px solid #efefef;
margin-right:16px;
}


/* .main_section > div.article2{padding-left:30px;width:309px;border-left:1px solid #efefef}
.main_section > div.article4{padding-left:30px;width:309px;border-left:1px solid #efefef}

.main_section > div.article3{border-top:1px solid #efefef;padding-top:30px}
.main_section > div.article4{border-top:1px solid #efefef;padding-top:30px} */


.main_section > div h2 {font-size:18px;font-family:'Nanum Gothic Bold'; color:#f37421;margin-bottom:10px; padding-top:17px; background:url(../../images/bg_t_bar.png) no-repeat}
.main_section > div p{color:#6d94c7;line-height:1.5em;}


.main_section > div .btn{display:block;padding:5px 10px; border-top:1px solid #efefef;position:absolute;top:190px;left:0; background:url(../../images/ico_arrow.png) 100% 50% no-repeat}
.main_section > div .btn2{display:block;padding:5px 10px; border-top:1px solid #efefef;position:absolute;top:220px;left:0; background:url(../../images/ico_arrow.png) 100% 50% no-repeat}
/* .main_section > div .btn3{display:block;padding:5px 10px; border-top:1px solid #efefef;position:absolute;top:190px;left:30px; background:url(../../images/ico_arrow.png) 100% 50% no-repeat} */
.main_section > div .btn a{color:#666666}
.main_section > div .btn2 a{color:#666666}
.main_section > div .btn3 a{color:#666666}


.main_section > div.article1 { background:url(../../images/article3_over.png) 100% 100% no-repeat}
.main_section > div.article2 { background:url(../../images/article2_over.png) 100% 100% no-repeat}
.main_section > div.article3 { background:url(../../images/article4_over.png) 100% 100% no-repeat}
/* .main_section > div.article4 { background:url(../../images/article4_over.png) 100% 100% no-repeat} */

.main_section > div.article1:hover { background-image:url(../../images/article3_over_blue.png)}
.main_section > div.article2:hover { background-image:url(../../images/article2_over_blue.png)}
.main_section > div.article3:hover { background-image:url(../../images/article4_over_blue.png)}
/*.main_section > div.article4:hover {background-image:url(../../images/article4_over_blue.png)}*/


</style>
