<template lang="html">
  <section>
  <!-- <transition-group name="list" tag="ul"> -->
    <h3 v-for="(todoItem, index) in this.storedTodoItems" class="shadow" v-bind:key="todoItem.item" v-if="todoItem.index==propsdata">
     <!-- <i class="checkBtn fas fa-check" v-bind:class="{checkBtnCompleted: todoItem.completed}" v-on:click="toggleComplete(todoItem, index)"></i> -->

      <span ><b>crachi</b> {{ todoItem.item }}</span>

      <span class="removeBtn" v-on:click="removeTodo(todoItem, index)">
        <i class="removeBtn fas fa-trash-alt"></i>
      </span>

    </h3>
  <!-- </transition-group> -->
</section>
</template>

<script>
export default {
  props: ['propsdata'],
  methods: {
  removeTodo(todoItem, index) {
    this.$store.commit('removeOneItem', {todoItem, index});
  },
  toggleComplete(todoItem, index) {
    this.$store.commit('toggleOneItem', {todoItem, index});
  }
},
computed: {
  storedTodoItems() {
    // return this.$store.state.todoItems;
    return this.$store.getters.getTodoItems;
  }
}
}
</script>

<style scoped>
.fa-trash-alt:before{
  text-align: right;
}

.span{
  text-align: left;
}

h3{
  margin: 10px;
}

section{
  border-style: solid;
  border-bottom-width: thin;
  border-color: rgb(220, 220, 220);

  /* border-bottom: thin; */
  border-left: thin;
  border-top: thin;
  border-right: thin;

  /* background-color: rgb(255, 255, 255); */
}

</style>
