import Vue from 'vue'
import App from './App.vue'
import router from './router'
import { store } from './store.js'

import MainHeader from './components/frame/MainHeader.vue';
import MainFooter from './components/frame/MainFooter.vue';
import MainBody from './components/frame/MainBody.vue';

Vue.component('main-header', MainHeader);
Vue.component('main-footer', MainFooter);
Vue.component('main-body', MainBody);

new Vue({
  el: '#app',
  router,
  store,
  render: h => h(App)
})
