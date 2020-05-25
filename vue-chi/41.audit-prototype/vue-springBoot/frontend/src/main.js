// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import axios from 'axios'
import VueI18n from 'vue-i18n'
import MainHeader from './components/frame/MainHeader.vue'
import MainFooter from './components/frame/MainFooter.vue'
import MainNavi from './components/frame/MainNavi.vue'
import MainBody from './components/frame/MainBody.vue'
import './css/common.css'

Vue.config.productionTip = false
Vue.prototype.$http = axios
const pageLang = require('./lang/page.json')


// import './css/iframe.css';


Vue.component('main-header', MainHeader)
Vue.component('main-footer', MainFooter)
Vue.component('main-body', MainBody)
Vue.component('main-navi', MainNavi)

Vue.use(VueI18n);
const i18n = new VueI18n({
  locale:'ko',
  messages : pageLang
});

// Vue.use(VueI18n);
// const i18n = new VueI18n({
//   locale: 'ko', // 기본언어는 ko로 유지하지만 브라우저 언어를 체크해서 변경
//   messages: data
// });


/* eslint-disable no-new */
new Vue({
  el: '#app',
  i18n: i18n,
  router,
  components: { App },
  template: '<App/>'
})
