<template>
    <div>
        <div class="tle_pg">
            <h1>{{ $t("intro.경영진단팀소개")}}</h1>
            <p>
                {{ $t("intro.경영진단팀소개_내용")}}
            </p>
        </div>
        <div id="content">
            <div class="bundle">
                <h2>{{ $t("intro.사이버경영진단팀소개")}}</h2>
                <ul class="list">
                    <li>{{ $t("intro.사이버경영진단팀소개_내용1")}}
                    <br />{{ $t("intro.사이버경영진단팀소개_내용2")}}
                    <br />{{ $t("intro.사이버경영진단팀소개_내용3")}}</li>
                </ul>
            </div>
            <div v-if="$i18n.locale=='ko'" class="bundle">
                <h2>감사대상</h2>
                <ul class = "img" >
                <li style="height:207px;"></li>
                </ul>
            </div>
            <div v-if="$i18n.locale=='ko'" class="bundle">
                <h2>주요업무</h2>
                <ul class="list">
                    <li>경영컨설팅 | 부정 및 비리 감사</li>
                </ul>
            </div>
            <div class="bundle">
                <h2>{{ $t("intro.연락처")}}</h2>
                <ul class="list">
                    <li>{{ $t("intro.연락처_내용1")}}</li>
                    <li>{{ $t("intro.연락처_내용2")}}</li>
                </ul>
            </div>
        </div>
    </div>
</template>

<script>


</script>

<style lang="css">

.img {background:url(../../images/bg_introduction2.png) 100% 0 no-repeat} 

</style>
