import View from './View.js'

const tag = '[KeywordView]'

const KeywordView = Object.create(View)

KeywordView.setup = function(el){
    this.init(el)
    this.bindClickEvent()
    return this
}

KeywordView.render = function (data = []){
    this.el.innerHTML = data.length ? this.getKeywordsHTML(data) : "추천 검색어가 없습니다"
    this.show()
}

KeywordView.getKeywordsHTML = function(data){
    return data.reduce((html, item, index) => {
        html += `<li>
          <span class="number">${index + 1}</span>
          ${item.keyword}
        </li>`
        return html
    }, `<ul class="list">`) + '</ul>'
},

KeywordView.bindClickEvent = function(){
   Array.from(this.el.querySelectorAll('li')).forEach(li => {
       li.addEventLitener('click', e => this.onClickKeyword(e))
   }) 
}

KeywordView.onClickKeyword = function(e){
    
}

export default KeywordView

