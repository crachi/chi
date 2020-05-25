<template>
    <div id="content">
        <div class="bundle">
            <h3 class="t_tle">
                {{ $t("unfair.부정제보_설명1")}} <br />
                {{ $t("unfair.부정제보_설명2")}}
             </h3>
        </div>
        <div class="bundle">
            <h2>{{ $t("unfair.제보원칙")}}</h2>
            <p>
                {{ $t("unfair.제보원칙_내용1")}} <br />
                {{ $t("unfair.제보원칙_내용2")}}
            </p>
        </div>
        <div class="bundle">
            <div id="bun1">
                <h2> {{ $t("unfair.제보유형")}}</h2>
                <ul class="list2">
                    <li>{{ $t("unfair.제보유형_내용1")}}</li>
                    <li>{{ $t("unfair.제보유형_내용2")}}</li>
                    <li>{{ $t("unfair.제보유형_내용3")}}</li>
                    <li>{{ $t("unfair.제보유형_내용4")}}</li>
                    <li>{{ $t("unfair.제보유형_내용5")}}</li>
                    <li>{{ $t("unfair.제보유형_내용6")}}</li>
                    <li>{{ $t("unfair.제보유형_내용7")}}</li>
                </ul>
            </div>
            <div id="bun2">
                <h2>{{ $t("unfair.제보방법")}}</h2>
                <ul class="list2">
                    <li>
                        <strong>{{ $t("unfair.메일")}}</strong>
                        {{ $t("unfair.메일_내용")}}
                        </li>
                    <!--<li><strong>전화</strong> 02-729-5561</li>
                    <li><strong>전송</strong> 02-729-5892</li>-->
                    <li>
                        <strong>{{ $t("unfair.주소")}}</strong>
                        {{ $t("unfair.주소_내용1")}}<br/>
                        {{ $t("unfair.주소_내용2")}}
                        </li>
                </ul>
                <span class="send_btn">
                    <!-- <a href="unfairness.html">지금제보하기</a> -->
                    <router-link to="report">
                        <a>{{ $t("unfair.부정제보")}}</a>
                    </router-link>
                </span>
            </div>
        </div>
    </div>
</template>

<script>

</script>

<style lang="css">

</style>
