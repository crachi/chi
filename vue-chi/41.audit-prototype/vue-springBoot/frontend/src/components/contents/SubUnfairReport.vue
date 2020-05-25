<template>
    <div id = "content">
        <table width="95%" border="0" cellspacing="0" cellpadding="0" align="left" vertical-align="top">
            <tr>
                <td bgcolor="#FFFFFF"> 
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                      <!-- <form v-on:submint="unfairMail" action="/submit" method="post"> -->
                      <!-- <form id="myForm" > -->
                            <tr> 
                                <td>
                                    <div class="bundle">
                                        <h2>{{ $t("unfair.제보하기")}}</h2>
                                        <table cellspacing="0" class="tbl_frm">					
                                            <tr> 
                                                <th><label for="tle_form">{{ $t("unfair.회사")}}</label></th>
                                                <td width="90%" height="20"> 
                                                    <select name="COMPANY" class="i_txt sel" v-model="company">
                                                        <option value="S" selected>{{ $t("unfair.선택")}}</option>
                                                        <option value="B">{{ $t("unfair.회사목록_방산")}}</option>
                                                        <option value="M">{{ $t("unfair.회사목록_민수")}}</option>
                                                    </select>  
                                                </td>  			
                                            </tr>			
                                            <tr> 
                                                <th><label for="tle_form">{{ $t("unfair.제목")}}</label></th>
                                                <td width="90%" height="20"> 
                                                    <input type="text" name="TITLE" size="85" class="i_txt w95" MAXLENGTH=80 v-model="title">
                                                </td>
                                            </tr>
                                            <tr> 
                                                <th><label for="area_form">{{ $t("unfair.내용")}}</label></th>
                                                <td rowspan="2" height="20" valign="top"> 
                                                    <textarea name="CONTENT" rows="8" cols="84" class="skin i_txt w95" v-model="content"></textarea>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>
                                </td>
                            </tr>
                            <tr> 
                                <td>
                                    <div class="bundle">
                                        <h2>{{ $t("unfair.제보자정보")}}</h2>
                                        <table cellpadding="0" cellspacing="0" class="tbl_frm">
                                            <tr> 
                                            <th><label for="name_form">{{ $t("unfair.이름")}}</label></th>
                                            <td> 
                                                <input type="text" name="NAME" size="10" class="i_txt" MAXLENGTH=30 v-model="name">
                                            </td>  
                                            <th><label for="part_form">{{ $t("unfair.부서명")}}</label></th>
                                            <td> 
                                                <input type="text" name="PART" size="20" class="i_txt" MAXLENGTH=30 v-model="part">
                                            </td>
                                            <th><label for="phone_form">{{ $t("unfair.연락처")}}</label></th>
                                            <td> 
                                            <input type="text" name="TEL" size="25" class="i_txt" MAXLENGTH=20 v-model="tel">
                                            </td>
                                            </tr>
                                            <tr> 
                                            <th><label for="email_form">{{ $t("unfair.이메일")}}</label></th>
                                            <td colspan="5"> 
                                                <input type="text" name="EMAIL" size="50" class="i_txt" MAXLENGTH=40 v-model="email">
                                            </td>
                                            </tr>

                                        </table>
                                    </div>
                                </td>
                             </tr>
                        <!-- </form>  -->
                    </table>
                </td>
            </tr>
            <tr v-if="$i18n.locale=='ko'">
                <td bgcolor="#FFFFFF"> 
                    <div id="personinfo" class="bundle">
                        <h2>개인정보 수집 및 이용 동의서</h2>
                        <div style="text-align:right;margin:-10px 0px 10px 0px" >
                            <a href="/unfairness/unfairness_popup.html" target="_blank" style="font-size:12px;color:#666;">※동의서 상세보기</a>
                        </div>
                        <table width="95%" border="0" cellspacing="0" cellpadding="0" class="tbl_frm">
                        <tr>
                            <td width="60%" >
                                ■  회사가 개인정보 중에서 선택 항목을 수집, 이용하는 데
                            </td>
                            <td> 
                                <input type="radio" name="confirmYN" value="Y">동의합니다
                                <input type="radio" name="confirmYN" value="N" checked>동의하지 않습니다
                            </td>
                        </tr>
                        </table>
                    
                    </div>
                </td>
            </tr>
            <tr>
                <td bgcolor="#FFFFFF"> 
                    <ul class="frm_btm_area">
                        <li><span class="re_btn"><a href="#" OnClick="">{{ $t("unfair.다시쓰기")}}</a></span></li>
                        <li>
                            <span class="send_btn"><a href="#" OnClick="">{{ $t("unfair.제보하기")}}</a></span>
                        </li>
                    </ul>
                </td>
            </tr>
        </table> 
    </div>
</template>

<script>

export default {
}




</script>

<style lang="css">

.i_txt {border:1px solid #000; padding:4px;  font-size:12px; border-color:#dfdfdf #eee #eee #dfdfdf}
/* html:first-child select{height:22px;padding-right:6px} */

.sel{height: 24px}

</style>
