<template>
  <div class="wrapper" v-bind:class="[show ? 'activeClass' : '']" >
    <div class="preload">
    </div>
    <div class="placeholder">
    </div>
		<transition name="trial" appear>
      <div class="content">
        <div class="form-wrapper image-after-login">
          <div class="flip-img-wrapper">
            <transition name="fade-profile-pic">
              <img  v-if="name === 'user'" class="user-profile" :src="imgSrc" alt="user-profile-pic" v-image />
              <icon v-if="name !== 'user'" class="user-icon image-after-login" name="user-circle-o"></icon>
            </transition>
          </div>
          <form class="animate-form">
              <div class="textbox-wrapper">
                <input  v-model="name" class="text-box" type="text" />
                    <span class="user-o-icon">
                        <icon name="user-o"></icon>
                    </span>
              </div>
              <div class="textbox-wrapper">
                <input  v-model="password" class="text-box" type="password" />
                    <span class="lock-icon">
                        <icon name="lock"></icon>
                    </span>
              </div>
              <button type="submit"  v-on:click.prevent="onSubmit" class="btn submit-btn" >
                  <span class="login-text">LOGIN</span>
              </button>
              <!-- <div class="alert-danger" v-if="{errorMessage} === ''">{errorMessage}</div> -->
                  <p class="text">Forgot your password?</p>
                  <p class="text footer-text">Have already account? Sign In</p>
          </form>
        </div>
      </div>
		</transition>
  </div>
</template>

<script>
export default {
  name: 'SignUp',
  data () {
    return {
      show: false,
      name: '',
      password: '',
      idok: 'crachi',
      pwok: 'test',
      imgSrc: require('../assets/userTwo.jpg')
    }
  },
  methods: {
    onSubmit: function () {
      console.log(this.name)
      console.log(this.password)
      if (this.name === this.idok) {
        if (this.password === this.pwok) {
          this.show = true
          setTimeout(() => {
            this.$router.push('/main')
          }, 2000)
        } else {
          alert('비밀번호가 틀립니다')
        }
      } else {
        alert('등록되지 않은 아이디입니다')
      }
    },
    customHook: function (el) {
      console.log('on render')
    }
  },
  beforeCreate: function () {
    let imageOne = new Image()
    imageOne.src = require('../assets/userOne.jpg')
    let imageTwo = new Image()
    imageTwo.src = require('../assets/userTwo.jpg')
    let imageThree = new Image()
    imageThree.src = require('../assets/userThree.jpeg')
    let imageFour = new Image()
    imageFour.src = require('../assets/eventOne.jpg')
    let imageFive = new Image()
    imageFive.src = require('../assets/eventTwo.jpg')
    let imageSix = new Image()
    imageSix.src = require('../assets/eventThree.jpeg')
  }
}
</script>

<style lang="scss" scoped>
@import "../style/designLoginPage.scss";

.wrapper {
  background: white;
}
</style>
