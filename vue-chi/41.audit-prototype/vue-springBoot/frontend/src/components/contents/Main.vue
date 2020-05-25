<template>
    <div class="main">
        <div id="mtop">
            <div class="visual">
                <img src="../../images/main_visual.jpg" width="426" height="67" alt="GLOBAL CODE OF CONDUCT HANWHA AEROSPACE">
            </div>
            <div class="tle_pg">
                <h1>{{ $t("main.윤리경영")}}</h1>
                    <p> {{ $t("main.윤리경영_내용1")}} <br />
                        {{ $t("main.윤리경영_내용2")}} <br />
                        {{ $t("main.윤리경영_내용3")}} <br />
                        {{ $t("main.윤리경영_내용4")}}
                    </p>
            </div>
        
            <div id="content">
                <contents-article></contents-article>
            </div>
        </div>
    </div>
</template>

<script>
import Vue from 'vue'
import mArticle from './MainArticle.vue'

Vue.component('contents-article',mArticle);

export default {

}
</script>

<style lang="css">
#mtop{
    background:url(../../images/bg_main2.png) 100% 0 no-repeat;
    position:relative;
    float:right;
    width:718px;
    margin-top:50px
    }
.main .visual{
    position:absolute;
    /* top:100px; */
    left:0
    }
.main .tle_pg{
    margin-top:107px;
    }
.main .tle_pg h1{font-size:18px;font-weight:normal;font-family:'Nanum Gothic Bold';color:#f37421;letter-spacing:-.1em}
.main .tle_pg p{margin-top:20px;margin-bottom:35px;font-size:13px;color:#777777;font-weight:normal;line-height:1.5em;}
.main #content{margin-top:25px;position:relative;}


</style>
