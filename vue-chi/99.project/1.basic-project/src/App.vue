<template>
  <div id="app">
    <!-- Header -->
    <div class ="mHeader">
      <main-header></main-header>
    </div>

    <!-- Body -->
    <div class="mBody">
      <main-body></main-body>
    </div>

    <!-- Footer -->
    <div class ="mFooter">
      <main-footer></main-footer>
    </div>

  </div>
</template>

<script>
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
}

.mHeader{
  padding: 10px;
  border-bottom-style: solid;
  border-bottom-width: thin;
  border-bottom-color: rgb(220, 220, 220);
}

.mBody{
  background-color: rgb(250, 250, 250);
}

.mFooter{
  border-top-style: solid;
  border-top-width: thin;
  border-top-color: rgb(220, 220, 220);

  text-align: center;
  padding-top: 10px;
}

</style>
