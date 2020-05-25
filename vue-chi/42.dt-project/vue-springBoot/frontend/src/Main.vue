<template>
  <section class="content"> 
    <!-- first row -->
    <row>
       <div class="col-md-4">
        <div class="box">
          <div class="box-body">  
            <p class='text-center'>
              <strong>월별 반출 현황</strong>
              <!-- {{this.barChartConfig.data.labels}}
              {{this.barChartConfig.data.datasets[0].data}} <br/> -->
            </p>
            <va-chart
              :chart-config='monsChartConfig'
            >
            </va-chart>
          </div> 
        </div>   
      </div>     
      <div class="col-md-4">
        <div class="box">
          <div class="box-body">  
            <p class='text-center'>
              <strong>종류별 비율</strong>
            </p>
            <va-chart
              :chart-config='labsChartConfig'
            >
            </va-chart>
          </div>  
        </div>               
      </div>
      <div class="col-md-4">  
        <div class="box">
          <div class="box-body">  
            <p class='text-center'>
              <strong>오탐률</strong>
            </p>
            <va-chart
              :chart-config='hitsChartConfig'
            >
            </va-chart>
          </div>              
        </div>
      </div>
    </row>
    <!-- second row  -->
    <row>
      <div class="col-md-8">
        <div class="box direct-chat box-primary direct-chat-primary">
          <div class="box-header with-border">
            <div class="col-md-4">
              <h3 class="box-title"><strong>일자별리스트</strong>
                    <!-- <br/> {{hits}}
                    <br/> {{labs}}
                    <br/> {{mons}} -->
              </h3> 
            </div>
            <div class="col-md-7">
              <strong>
                <v-calendar></v-calendar>
              </strong>
            </div>   
          </div>
         <div class="box-body chat id-chat-box">
            <div class="table-responsive">
              <table class="table no-margin">
                <thead>
                <tr>
                  <th>일시</th>
                  <th>검출항목</th>
                  <th>항목수</th>
                  <th>파일명</th>
                  <th>적중여부</th>
                </tr>
                </thead>
                <tbody>
                <tr v-for="(user,index) in users" :key="user.id" v-if="user.searchdate >= selectedDate.start && user.searchdate <= selectedDate.end">
                  <td>{{user.printdate,index}}</td>
                  <td>{{user.label}}</td>
                  <td> 1 </td>
                  <td @click="clickImg(user.filename)">{{user.filename}} </td>
                  <td >
                      <input type="radio" @click="clickHitY(user.hit_yn, user.filename)" v-model="user.hit_yn" value="Y">Y
                      <input type="radio" @click="clickHitN(user.hit_yn, user.filename)" v-model="user.hit_yn" value="N">N 
                  </td>
                </tr>            
                </tbody>
              </table>
            </div>
            <!-- /.table-responsive -->
          </div>
          <!-- /.box-body -->
        </div>  
      </div>
      
      <div class="col-md-4">
        <div class="box box-danger">
          <div class="box-header with-border">
            <h3 class="box-title"><strong>미리보기</strong></h3>
          </div>
         <div class="box-body">
          <img :src=img_path+clickedImg class="img-responsive pad">
         </div>
        </div>  
      </div>

    </row>
  </section>
</template>

<script>
// import VACalendar from 'widgets/VACalendar.vue'
import VAChart from 'components/VAChart'

// import FunctionalCalendar from 'vue-functional-calendar'
import FunctionalCalendar from 'components/FNCalendar.vue'
import VCalendar from 'components/VCalendar.vue'

export default {
  name: 'hello',
  data () {
    return {
      users: [],
      hits: [],
      labs: [],
      mons: [],
      img_path: '../static/img/r_img/',
      clickedImg: 'default.png',
      msgHello: 'Hello',
      msgBye: 'Bye',
      loading: false,
      selectedDate: {
        start: toDate(new Date()),
        end: toDate(new Date())
      },
      monsChartConfig: {
        type: 'bar',
        data: {
          labels: [],
          datasets: [
            {
              label: 'My First dataset',
              backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)',
                'rgba(255, 159, 64, 0.2)'
              ],
              borderColor: [
                'rgba(255,99,132,1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)',
                'rgba(153, 102, 255, 1)',
                'rgba(255, 159, 64, 1)'
              ],
              borderWidth: 1,
              data: []
            }
          ]
        },
        options: {
          scales: {
            xAxes: [{
              stacked: true
            }],
            yAxes: [{
              stacked: true
            }]
          }
        }
      },
      labsChartConfig: {
        type: 'doughnut',
        data: {
          labels: [],
          datasets: [
            {
              data: [],
              backgroundColor: [
                '#FF6384',
                '#36A2EB',
                '#FFCE56'
              ],
              hoverBackgroundColor: [
                '#FF6384',
                '#36A2EB',
                '#FFCE56'
              ]
            }]
        },
        options: {
          animation: {
            animateScale: true
          }
        }
      },
      hitsChartConfig: {
        type: 'doughnut',
        data: {
          labels: [],
          datasets: [
            {
              data: [],
              backgroundColor: [
                '#FF6384',
                '#36A2EB',
                '#FFCE56'
              ],
              hoverBackgroundColor: [
                '#FF6384',
                '#36A2EB',
                '#FFCE56'
              ]
            }]
        },
        options: {
          animation: {
            animateScale: true
          }
        }
      }
    }
  },
  methods: {
    clickBtn () {
      this.loading = !this.loading
      setTimeout(() => {
        this.loading = !this.loading
      }, 1000)
    },
    clickImg (filename) {
      this.clickedImg = filename
    },
    clickHitN (hityn, filename) {
      console.log('nhit' + hityn)
      var hitImg = filename
      this.$http.get(`/api/users/N/${hitImg}`)
    },
    clickHitY (hityn, filename) {
      console.log('yhit' + hityn)
      var hitImg = filename
      this.$http.get(`/api/users/Y/${hitImg}`)
    }
  },
  components: {
    'va-calendar': FunctionalCalendar,
    'va-chart': VAChart,
    'v-calendar': VCalendar
  },
  created () {
    this.$http.get('/api/users').then(respList => {
      this.users = respList.data.response
    })
    this.$http.get('/api/users/hits').then(respHits => {
      this.hits = respHits.data.response
      addHits(this.hitsChartConfig.data, this.hits)
    })
    this.$http.get('/api/users/labs').then(respLabs => {
      this.labs = respLabs.data.response
      addLabs(this.labsChartConfig.data, this.labs)
    })
    this.$http.get('/api/users/mons').then(respMons => {
      this.mons = respMons.data.response
      addMons(this.monsChartConfig.data, this.mons)
    })
    this.$bus.$on('calendar-eventbus', dateInfo => {
      this.selectedDate = dateInfo
    })
  },
  mounted () {
    var chatBoxElement = this.$el.querySelector('.id-chat-box')
    $(chatBoxElement).slimScroll({
      height: '306px'
    })
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

function addMons (barChartData, monsData) {
  for (var i = 0; i < monsData.length; i++) {
    barChartData.labels.push(monsData[i].v_month)
    barChartData.datasets[0].data.push(monsData[i].mon_cnt)
  }
}

function addLabs (labChartData, labsData) {
  for (var i = 0; i < labsData.length; i++) {
    labChartData.labels.push(labsData[i].label)
    labChartData.datasets[0].data.push(labsData[i].lab_cnt)
  }
}

function addHits (hitChartData, hitsData) {
  for (var i = 0; i < hitsData.length; i++) {
    hitChartData.labels.push(hitsData[i].hit_yn)
    hitChartData.datasets[0].data.push(hitsData[i].hit_cnt)
  }
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}

/* .box.box-danger{
  height: 400px;
} */

/* img{
  height: 25%;
  width: 25%;
} */
</style>
