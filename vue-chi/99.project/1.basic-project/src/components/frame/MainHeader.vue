<template>
  <div>
    <router-link to="/">
    <img id = "img_h1" src="../../assets/logo.jpg">
    </router-link>

    <router-link to="/profile">
      <img align="right" id = "img_h2" src="../../assets/profile.jpg">
    </router-link>
  </div>
</template>

<script>
export default {

}
</script>

<style lang="css">


img#img_h1 {
  text-align: left;
  /* padding-right: 60%; */
  /* margin-right: 60%; */
}
img#img_h2 {
  text-align: right;
  padding: 10px;
  /* width: 60px;
  height:60px; */
  /* margin-left: 60%; */

}

</style>
