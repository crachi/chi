<template>
  <div class="splashscreen-wrapper">
    <transition @leave="leaveEl" v-on:after-appear="leaveEl"  appear>
      <div class="logo-wrapper">
      </div>
     </transition>
    <div class="logo-letters-group">
      <span class="logo-letter" v-for="(item, index) in logoName" :key="index" v-if="item !== 'img'">{{item}}</span>
      <span class="logo-letter" v-else > <img src='../assets/logo.png' /> </span>
    </div>
  </div>
</template>
<script>
export default {
  name: 'SplashScreen',
  data () {
    return {
      show: true,
      logoName: ['H', 'A', 'N', 'W', 'H', 'A', 'img', 'A', 'C', 'C', 'E', 'S', 'S', ' ', 'C', 'O', 'N', 'T', 'R', 'O', 'L']
    }
  },
  methods: {
    leaveEl (el) {
      this.$router.push('/login')
    }
  }
}
</script>

<style lang="scss" scoped>
@import '../style/splashScreen.scss'
</style>
