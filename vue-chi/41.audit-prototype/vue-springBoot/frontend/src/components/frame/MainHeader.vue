<template>
  <div id ="header">
    <ul class="tnb">
			<li><a href="#" v-if="$i18n.locale=='ko'" v-on:click.prevent="handleClick_changeLanguage('en')"><strong>ENG</strong></a></li>
      <li><a href="#" v-if="$i18n.locale=='en'" v-on:click.prevent="handleClick_changeLanguage('ko')"><strong>KOR</strong></a></li>
			<li class="last"><a href="/sitemap/index_sitemap.asp"><strong>SITEMAP</strong></a></li>
    </ul>
  </div>
</template>

<script>
export default {
    methods: {
      handleClick_changeLanguage(lang) {
        this.$i18n.locale = lang;
      }
    }
  }
</script>

<style lang="css">

#header{
  position:relative;
  overflow:hidden;
  border-top:1px solid #efefef;
  /* margin-bottom:30px;
  padding-bottom:20px; */
  font-weight:normal
  }

/* #header{position:relative;overflow:hidden;border-top:1px solid #efefef;padding-bottom:91px;font-weight:normal} */

/* #header{background:url(../../images/bg_sub.png) 100% 0 no-repeat} */

</style>
