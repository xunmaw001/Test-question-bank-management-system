<template>
<div class="home-preview" :style='{"width":"100%","margin":"10px auto","flexWrap":"wrap","justifyContent":"space-between","display":"flex"}'>


	<!-- 关于我们 -->
	<div :style='{"border":"0px ridge #52b646","padding":"20px 0 20px","margin":"0 auto","flexWrap":"wrap","background":"","display":"flex","width":"1200px","backgroundSize":"320px","position":"relative","height":"560px","order":"8"}'>
	  <div :style='{"color":"#5ebd47","top":"106px","textAlign":"left","left":"40px","width":"200px","lineHeight":"1.5","fontSize":"30px","position":"absolute","fontWeight":"bold","order":"2","zIndex":"9"}'>{{aboutUsDetail.title}}</div>
	  <div :style='{"margin":"0 0 10px","color":"#ccc","top":"120px","textAlign":"center","left":"200px","width":"auto","letterSpacing":"1px","lineHeight":"24px","fontSize":"24px","position":"absolute","order":"3","zIndex":"9"}'>{{aboutUsDetail.subtitle}}</div>
	  <div :style='{"padding":"0px","top":"50px","flexWrap":"wrap","display":"flex","width":"50%","position":"absolute","right":"0","height":"400px","order":"2","zIndex":"8"}'>
	    <img :style='{"width":"100%","margin":"0px","objectFit":"cover","display":"block","height":"100%"}' :src="baseUrl + aboutUsDetail.picture1">
	    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + aboutUsDetail.picture2">
	    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + aboutUsDetail.picture3">
	  </div>
	  <div :style='{"padding":"80px 90px 0 40px","boxShadow":"12px 12px 1px #eee","margin":"0 0 0px 0","borderColor":"#52b646","color":"rgb(102, 102, 102)","textIndent":"2em","top":"80px","left":"0","background":"rgba(239,249,238,.5)","borderWidth":"3px","width":"55%","lineHeight":"24px","fontSize":"16px","position":"absolute","borderStyle":"solid double solid double","order":"1","height":"400px","zIndex":"5"}' v-html="aboutUsDetail.content"></div>
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	</div>
	<!-- 系统简介 -->
	<div :style='{"padding":"20px 0","margin":"0 auto","flexWrap":"wrap","background":"none","display":"block","width":"1200px","position":"relative","justifyContent":"space-between","height":"660px","order":"4"}'>
	  <div :style='{"padding":"0 0 6px","color":"#333","top":"80px","textAlign":"center","left":"30px","background":"url(http://codegen.caihongy.cn/20221114/3385b5b1b2ee4976949806fc47f1bbe2.png) no-repeat left bottom","width":"auto","lineHeight":"1.5","fontSize":"30px","position":"absolute"}'>{{systemIntroductionDetail.title}}</div>
	  <div :style='{"margin":"0 0 10px","color":"#999","top":"136px","textAlign":"center","left":"30px","width":"auto","lineHeight":"1.5","fontSize":"22px","position":"absolute"}'>{{systemIntroductionDetail.subtitle}}</div>
	  <div :style='{"padding":"0","margin":"60px 0 0 ","flexWrap":"wrap","textAlign":"right","background":"none","display":"flex","width":"40%","position":"relative","float":"right","height":"auto"}'>
	    <img :style='{"boxShadow":"12px 12px 1px #eee","margin":"0px","objectFit":"cover","display":"block","width":"100%","position":"block","float":"right","height":"400px"}' :src="baseUrl + systemIntroductionDetail.picture1">
	    <img :style='{"margin":"0px","objectFit":"cover","top":"50px","left":"-60%","display":"block","width":"70%","position":"absolute","height":"300px"}' :src="baseUrl + systemIntroductionDetail.picture2">
	    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + systemIntroductionDetail.picture3">
	  </div>
	  <div :style='{"border":"8px ridge #52b646","padding":"110px 20px 20px","margin":"40px 0 10px 0","overflow":"hidden","color":"rgb(102, 102, 102)","background":"rgba(239,249,238,.5)","width":"30%","lineHeight":"24px","fontSize":"16px","textIndent":"2em","float":"left","height":"400px"}' v-html="systemIntroductionDetail.content"></div>
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	</div>


	
<div class="news" :style='{"width":"100%","padding":"40px 0 60px","margin":"-80px 0 10px","background":"url(http://codegen.caihongy.cn/20221114/c00cf1e06a294ac1b489822fcfae4fc9.png) no-repeat center top","order":"5"}'>
	<div v-if="false" class="idea newsIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"350px","padding":"0 0 20px","margin":"20px auto 50px","lineHeight":"50px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20221114/c321adf910ad4562a7836324481949fa.png) no-repeat center bottom"}'>
		<span :style='{"color":"#b3efa5","fontSize":"32px","fontWeight":"bold"}'>公告信息</span>
	</div>
	
	
	
	
	
	
	
	
	
	<!-- 样式八 -->
	<div v-if="newsList.length" class="list list8 index-pv1" :style='{"padding":"0px","margin":"0 auto","flexWrap":"wrap","background":"none","display":"flex","width":"1200px","justifyContent":"space-between","height":"auto"}'>
	  <div @click="toDetail('newsDetail', newsList[0])" v-if="newsList.length>0" :style='{"cursor":"pointer","padding":"0px","margin":"0 0px 24px","borderRadius":"8px","background":"#fff","display":"flex","width":"49%","height":"auto"}' class="list-item animation-box">
	    <div :style='{"padding":"20px 30px","borderRadius":"0 8px 8px 0","background":"url(http://codegen.caihongy.cn/20221115/98c8979411ac40ec84ef25dced228936.jpg) no-repeat center top","width":"100%","backgroundSize":"100% 100%","height":"210px","order":"2"}'>
	      <div :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#333","fontSize":"14px","lineHeight":"26px","textOverflow":"ellipsis","fontWeight":"bold"}'>{{newsList[0].title}}</div>
	      <div :style='{"overflow":"hidden","color":"#666","background":"none","fontSize":"14px","lineHeight":"24px","textIndent":"2em","height":"120px"}'>{{newsList[0].introduction}}</div>
	      <div :style='{"color":"#999","fontSize":"12px","lineHeight":"20px"}'>{{newsList[0].addtime.split(" ")[0]}}</div>
	    </div>
	    <img :style='{"width":"180px","objectFit":"cover","borderRadius":"8px 0 0 8px","height":"210px"}' :src="baseUrl + newsList[0].picture" >
	  </div>
	  <div @click="toDetail('newsDetail', newsList[1])" v-if="newsList.length>1" :style='{"cursor":"pointer","padding":"0px","margin":"0 0px 24px","borderRadius":"8px","background":"#fff","display":"flex","width":"49%","height":"auto"}' class="list-item animation-box">
	    <img :style='{"width":"180px","objectFit":"cover","borderRadius":"8px 0 0 8px","height":"210px"}' :src="baseUrl + newsList[1].picture" >
	    <div :style='{"width":"100%","padding":"20px 30px","backgroundSize":"100% 100%","borderRadius":"0 8px 8px 0","background":"url(http://codegen.caihongy.cn/20221115/98c8979411ac40ec84ef25dced228936.jpg) no-repeat center top","height":"210px"}'>
	      <div :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#333","fontSize":"14px","lineHeight":"26px","textOverflow":"ellipsis","fontWeight":"bold"}'>{{newsList[1].title}}</div>
	      <div :style='{"fontSize":"14px","lineHeight":"24px","overflow":"hidden","color":"#666","textIndent":"2em","height":"120px"}'>{{newsList[1].introduction}}</div>
	      <div :style='{"color":"#999","fontSize":"12px","lineHeight":"24px"}'>{{newsList[1].addtime.split(" ")[0]}}</div>
	    </div>
	  </div>
	  <div @click="toDetail('newsDetail', newsList[2])" v-if="newsList.length>2" :style='{"cursor":"pointer","padding":"0px","margin":"0 0px","borderRadius":"8px","background":"#fff","display":"flex","width":"49%","height":"auto"}' class="list-item animation-box">
	    <div :style='{"padding":"20px 30px","borderRadius":"0 8px 8px 0","background":"url(http://codegen.caihongy.cn/20221115/98c8979411ac40ec84ef25dced228936.jpg) no-repeat center top","width":"100%","backgroundSize":"100% 100%","height":"210px","order":"2"}'>
	      <div :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#333","fontSize":"14px","lineHeight":"26px","textOverflow":"ellipsis","fontWeight":"bold"}'>{{newsList[2].title}}</div>
	      <div :style='{"fontSize":"14px","lineHeight":"24px","overflow":"hidden","color":"#666","textIndent":"2em","height":"120px"}'>{{newsList[2].introduction}}</div>
	      <div :style='{"color":"#999","fontSize":"12px","lineHeight":"24px"}'>{{newsList[2].addtime.split(" ")[0]}}</div>
	    </div>
	    <img :style='{"width":"180px","objectFit":"cover","borderRadius":"8px 0 0 8px","height":"210px"}' :src="baseUrl + newsList[2].picture" >
	  </div>
	  <div @click="toDetail('newsDetail', newsList[3])" v-if="newsList.length>3" :style='{"cursor":"pointer","padding":"0px","margin":"0 0px","borderRadius":"8px","background":"#fff","display":"flex","width":"49%","height":"auto"}' class="list-item animation-box">
	    <img :style='{"width":"180px","objectFit":"cover","borderRadius":"8px 0 0 8px","height":"210px"}' :src="baseUrl + newsList[3].picture" >
	    <div :style='{"width":"100%","padding":"20px 30px","backgroundSize":"100% 100%","borderRadius":"0 8px 8px 0","background":"url(http://codegen.caihongy.cn/20221115/98c8979411ac40ec84ef25dced228936.jpg) no-repeat center top","height":"210px"}'>
	      <div :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#333","fontSize":"14px","lineHeight":"26px","textOverflow":"ellipsis","fontWeight":"bold"}'>{{newsList[3].title}}</div>
	      <div :style='{"fontSize":"14px","lineHeight":"24px","overflow":"hidden","color":"#666","textIndent":"2em","height":"120px"}'>{{newsList[3].introduction}}</div>
	      <div :style='{"color":"#999","fontSize":"12px","lineHeight":"24px"}'>{{newsList[3].addtime.split(" ")[0]}}</div>
	    </div>
	  </div>
	</div>
	
	
	
	<div @click="moreBtn('news')" :style='{"border":"0","margin":"50px auto 0","textAlign":"center","background":"url(http://codegen.caihongy.cn/20221114/e50f2911f0354a40b3c2c3d22faa088e.png) no-repeat","display":"block","width":"161px","lineHeight":"40px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"12px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#f5f5f5","fontSize":"12px"}' class="el-icon-d-arrow-right"></i>
	</div>
	
</div>




</div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        aboutUsDetail: {},
        systemIntroductionDetail: {},
        newsList: [],

      }
    },
    created() {
      this.baseUrl = this.$config.baseUrl;
      this.getNewsList();
      this.getAboutUs();
      this.getSystemIntroduction();
      this.getList();
    },
    //方法集合
    methods: {
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
      getAboutUs() {
          this.$http.get('aboutus/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.aboutUsDetail = res.data.data;
            }
          })
      },
      getSystemIntroduction() {
          this.$http.get('systemintro/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.systemIntroductionDetail = res.data.data;
            }
          })
      },
		getNewsList() {
			this.$http.get('news/list', {params: {
				page: 1,
				limit: 4,
			order: 'desc'}}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
          let autoSortUrl = "";
			
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {detailObj: JSON.stringify(item)}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
	
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1.01) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1.01) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: #52b646;
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: #52b646;
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1.01) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
</style>
