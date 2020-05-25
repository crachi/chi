import Vue from 'vue';
import VueRouter from 'vue-router';
Vue.use(VueRouter);

import ContentsMain from './components/contents/ContentsMain.vue';
import ContentsProfile from './components/contents/ContentsProfile.vue';

const routes = [
  { path:'/',component: ContentsMain },
  { path:'/profile',component: ContentsProfile }
]

export default new VueRouter({
  mode: 'history',
  routes
});
