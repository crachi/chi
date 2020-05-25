// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import './lib/css'
import './lib/script'
import './lib/global'

import Vue from 'vue'
import App from './App'
import router from './router'
import EventBus from './lib/eventBus.js'
import axios from 'axios'
import 'vue-awesome/icons/user-o'
import 'vue-awesome/icons/user-circle-o'
import 'vue-awesome/icons/lock'
import 'vue-awesome/icons/map-marker'
import 'vue-awesome/icons/star'
import 'vue-awesome/icons/cog'
import 'vue-awesome/icons/spinner'
import 'vue-awesome/icons/check-circle-o'
import 'vue-awesome/icons/book'
import Icon from 'vue-awesome/components/Icon'
import VCalendar from 'v-calendar'
import 'v-calendar/lib/v-calendar.min.css'
import Buefy from 'buefy'
import 'buefy/dist/buefy.css'

Vue.use(Buefy)
Vue.use(VCalendar)

Vue.prototype.$bus = EventBus
Vue.prototype.$http = axios
Vue.config.productionTip = false
Vue.component('Icon', Icon)
// Vue.prototype.$http = axios

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  template: '<App/>',
  components: { App, Icon }
})
