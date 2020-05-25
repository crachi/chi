<template>
    <div class="input-group">
        <v-date-picker  mode='range' v-model='selectedDate' show-caps>
            <!-- <input type="text" name="message" placeholder="Type Message ..." class="form-control"> -->
        </v-date-picker>
        <span class="input-group-btn">
            <button type="button" @click="calendarClick" class="btn btn-warning btn-flat">Search</button>
        </span>
    </div>
</template>

<script>
export default {
  data () {
    return {
      selectedDate: {
        start: new Date(),
        end: new Date()
      },
      sendDate: {
        start: '',
        end: ''
      }
    }
  },
  methods: {
    calendarClick () {
      this.sendDate.start = toDate(this.selectedDate.start)
      this.sendDate.end = toDate(this.selectedDate.end)
      this.$bus.$emit('calendar-eventbus', this.sendDate)
    }
  }
}

function toDate (sDate) {
  var dateString = ''
  dateString += (sDate.getYear() - 100)
  dateString += pad(sDate.getMonth() + 1, 2)
  dateString += pad(sDate.getDate(), 2)

  return dateString
}

function pad (n, width) {
  n = n + ''
  return n.length >= width ? n : new Array(width - n.length + 1).join('0') + n
}
</script>
<style>
 input {
     font-size: 16px;
     /* border: 2px; */
     padding: 2px;
     padding-top: 0px;
     }
.input-group{
    position: right;
}     
.btn.btn-warning.btn-flat{
    padding: 4px 10px;
}
.input-group-btn>.btn{
    /* position: right; */
    right: 0px;
}
</style>
