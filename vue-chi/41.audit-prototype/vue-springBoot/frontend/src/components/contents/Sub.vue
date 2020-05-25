<template>
    <div class="sub">
        <img id="img_sub" src='../../images/bg_sub.png'>
        <router-view></router-view> 
    </div>
</template>

<script>

</script>

<style lang="css">


.sub .tle_pg{
    /* margin-top:200px;  */
    /* margin-top:150px;  */
    margin-bottom:30px;padding-left:20px
    }
.sub .tle_pg h1{font-size:30px;color:#f37421;margin-bottom:8px;}
.sub .tle_pg p{color:#777777;font-size:13px;font-weight:normal; letter-spacing:-.1em}
.sub #content{padding-right:20px;}


img#img_sub {
  /* float:right;  */
  padding-left:140px;
  width: 580px;
  height: 125px;
}


</style>
