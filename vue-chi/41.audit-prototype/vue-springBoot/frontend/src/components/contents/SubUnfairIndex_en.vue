<template>
    <div id="content">
        <div class="bundle">
            <h3 class="t_tle">
                {{ $t("unfair.부정제보_설명1")}}<br/>
                {{ $t("unfair.부정제보_설명2")}}<br/>
             </h3>
        </div>
        <div class="bundle">
            <h2>{{ $t("unfair.제보원칙")}}</h2>
                <p>
                    {{ $t("unfair.제보원칙_내용1")}}<br/>
                    {{ $t("unfair.제보원칙_내용2")}}<br/>
                </p>
                <p>{{ $t("unfair.제보원칙_내용3")}}<br></p>
                <ul class="list2">
                    <li>{{ $t("unfair.제보원칙_내용4")}}</li>
                    <li>{{ $t("unfair.제보원칙_내용5")}}</li>
                    <li>{{ $t("unfair.제보원칙_내용6")}}</li>
                </ul>
                    <p>{{ $t("unfair.제보원칙_내용7")}}<br></p>
            </div>
            <div class="bundle">
                    <h2>{{ $t("unfair.제보방법")}}</h2>
                    <p>{{ $t("unfair.제보방법_내용")}}</p>
                    <br/>
                    <ul class="list2">
                        <li>
                            <strong>{{ $t("unfair.메일")}}</strong>
                            {{ $t("unfair.메일_내용")}}
                            </li>
                        <li>
                            <strong>{{ $t("unfair.주소")}}</strong>
                            {{ $t("unfair.주소_내용")}}
                         </li>
                    </ul>
                    <span class="send_btn">
                        <!-- <a href="unfairness.html">Report Now</a> -->
                         <router-link to="report">
                        <a>{{ $t("unfair.제보")}}</a>
                         </router-link>
                    </span>
                </div>
    </div>
</template>

<script>

</script>

<style lang="css">

</style>
