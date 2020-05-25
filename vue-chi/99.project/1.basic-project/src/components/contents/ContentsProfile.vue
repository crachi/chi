<template lang="html">
  <div id="profile">
    <table>
      <tr>
        <td rowspan="3"><img id = "img_p1" src="../../assets/profileBody.jpg"></td>
        <td><h1 align="left"> crachi</h1></td>
        <td><img id = "img_p2" src="../../assets/profileEdit.jpg"></td>
      </tr>
      <tr>
        <td colspan="2"><h2 align="left">게시물 0  팔로워 1   팔로우 1</h2></td>
      </tr>
      <tr>
        <td colspan="2"><h3 align="left"><strong> 이치형</strong></h3></td>
      </tr>
    </table>

    <img id = "img_pb" src="../../assets/profileBottom.jpg">
  </div>
</template>

<script>
export default {
}
</script>

<style lang="css">
h1{
  margin : 0 px;
}

img#img_p1{
  margin-right: 50px;
}

img#img_p2{
  margin: 0px;
}

#profile{
  text-align: center;
  padding: 10px;
  padding-right: 30%;
  margin: 0 auto;
  margin-bottom: 50px;
   width: 600px;
}

table{
  /* padding-bottom: 60px; */
}
</style>
