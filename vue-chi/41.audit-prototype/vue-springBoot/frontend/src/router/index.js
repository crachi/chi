import Vue from 'vue'
import Router from 'vue-router'
import Main from '@/components/contents/Main.vue'
import Sub from '@/components/contents/Sub.vue'
import Intro from '@/components/contents/SubIntro.vue'
import Unfair from '@/components/contents/SubUnfair.vue'
import UnfairIndex from '@/components/contents/SubUnfairIndex.vue'
import UnfairIndexEn from '@/components/contents/SubUnfairIndex_en.vue'
import UnfairReport from '@/components/contents/SubUnfairReport.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'Main',
      component: Main
    },
    {
      path:'/sub', 
      component: Sub,
      children: [
        {
          path: 'introduce/index', 
          component: Intro
        },
        {
          path: 'unfairness',
          component: Unfair,
          children: [
            { 
              path:'index', 
              component: UnfairIndex 
            },
            { 
              path:'index_en', 
              component: UnfairIndexEn
            },
            { 
              path:'report', 
              component: UnfairReport 
            }
          ]
        }
      ]
    }
  ]
})
