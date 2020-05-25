<template lang="html">
  <div>
    <article id="contents" v-for="(instadoc,index) in instadocs" >
      <table>
        <tr>
          <td>
            <img id = "img_h" src="../../assets/hanwhaDays.jpg">
          </td>
          <td>
            <a>hanwhaDays </a>
          </td>
        </tr>
      </table>

      <img id = "img_c" :src="instadoc.url">

      <img id = "img_ht" src="../../assets/heart.jpg">
      <img id = "img_bm" src="../../assets/book_mark.jpg">

      <h3>
        <b>{{instadoc.id}}</b> {{instadoc.text}}
      </h3>

      <contents-reply v-bind:propsdata="index"></contents-reply>

      <div id='reply'>
        <input type="text" placeholder="댓글 달기.." v-model="newTodoItem" @keyup.enter="addTodo(index)" >

        <!-- <span class="addContainer" v-on:click="addTodo(index)"> -->
        <!-- <i class="addBtn fas fa-plus" aria-hidden="true"></i> -->
        <!-- </span> -->
      </div>


    </article>
  </div>
</template>

<script>
import Vue from 'vue'
import reply from './ContentsMainReple.vue'

Vue.component('contents-reply',reply);

import {  mapGetters,  mapMutations } from 'vuex'
export default {
  data() {
    return {
      instadocs: [{
          dnum : '1',
          url: 'src/assets/contents1.jpg',
          text: '👋어서와~성화봉! #63빌딩 은 처음이지?네가 온다고해서 불꽃쇼를 준비했어! 😎'
          ,id: 'hanwhadays'
        },
        {
          dnum : '2',
          url: 'src/assets/contents2.jpg',
          text: '[EVENT :: #쉬어가자그램 해시태그 이벤트]😝금요일엔 쉬어가자그램~ 추운 겨울 #이불밖은위험해 🛌바쁘게 달려온 지금을 잠시 멈추고 나만의 쉬는 순간을 공유해주세요.💕'
          ,id: 'hanwhadays'
        },
        {
          dnum : '3',
          url: 'src/assets/contents3.jpg',
          text: '무료로 체험 프로그램 할 #금손 모여라~ 👋#오늘의불꽃 #1일1불꽃 👉 #한화예술더하기 #체험프로그램'
          ,id: 'hanwhadays'
        },
        {
          dnum : '4',
          url: 'src/assets/contents4.jpg',
          text: '[4월의 불꽃 :: #봄이왔나봄 해시태그 이벤트]나를 웃음짓게 하는 따스한 봄볕☀️👉 여러분의 봄을 느낀 순간을 공유해주세요!'
          ,id: 'hanwhadays'
        },
        {
          dnum : '5',
          url: 'src/assets/contents5.jpg',
          text: '[당첨자 발표] #응원한다그램 이벤트응원과 응원이 모여 #불꽃응원 완성✨'
          ,id: 'hanwhadays'
        },
        {
          dnum : '6',
          url: 'src/assets/contents6.jpg',
          text: '[당첨자 발표] 4월의 불꽃 :: #봄이왔나봄 이벤트 이 봄의 끝을 잡고~🎶따뜻했던 4월의 봄날을 기억하며!💐'
          ,id: 'hanwhadays'
        },
      ],
      newTodoItem: '',
    }
  },

  methods: {
    addTodo(index) {
      const item = this.newTodoItem.trim();
      this.$store.commit('addOneItem', {item, index});
      this.clearInput();
    },
    clearInput() {
      this.newTodoItem = '';
    },
  },
}
</script>


<style>
#contents {
  /* text-align: center; */
  border-style: solid;
  border-width: thin;
  border-color: rgb(220, 220, 220);
  background-color: rgb(255, 255, 255);
  padding: 10px;
  margin: 0 auto;
  margin-bottom: 50px;
  width: 600px;
}

img#img_c {
  width: 600px;
  height: 600px;
}

img#img_h {
  width: 35px;
  height: 35px;
}

img#img_ht {
  text-align: left;
}

img#img_bm {
  text-align: right;
}

h3 {
  font-weight: normal;
  text-align: left;
  margin: 10px;
  margin-bottom: 30px;
}

h2 {
  font-weight: normal;
  text-align: left;
  margin: 10px;
}

a {
  /* padding: 10px; */
  margin: 5px;
  border-bottom: 5px;
  font-family: sans-serif;
}


.addContainer {
  float: right;
  background: linear-gradient(to right, #6478FB, #8763FB);
  display: block;
  width: 3rem;
  border-radius: 0 5px 5px 0;
}

#reply{
  margin-top: 10px;
  text-align: left;

}

input{
  margin: 10px;
  border-color: rgb(255,255,255);
  color: rgb(0,0,0);
  padding: 0px;
  border: 0px;
  width: 500px;
  /* height: 50px; */
  font-size: 20px;
}


</style>
