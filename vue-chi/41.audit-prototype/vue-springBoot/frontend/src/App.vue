<template>
  <div id="app">

    <div id="wrap">
      <!-- Navi -->
      <main-navi></main-navi>
      <div id="container">
        <!-- Header -->
        <main-header></main-header>
        <!-- Body -->
        <main-body></main-body>
      </div>
    </div>

    <!-- Footer -->
    <div id="footer">
        <main-footer></main-footer>
    </div>
  </div>
</template>

<script>
</script>

<style lang="css">
/* Frame */
#wrap{overflow:hidden;width:1003px}
#footer{position:relative;overflow:hidden;border-top:1px solid #efefef;margin-top:30px;padding-top:20px;font-weight:normal}
#container{position:relative;float:right;width:718px;}

</style>