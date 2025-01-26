import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import ExamPaper from '../pages/exam/examPaper'
import Exam from '../pages/exam/exam'
import ExamList from '../pages/exam/examList'
import ExamRecord from '../pages/exam/examRecord'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import timuleixingList from '../pages/timuleixing/list'
import timuleixingDetail from '../pages/timuleixing/detail'
import timuleixingAdd from '../pages/timuleixing/add'
import kemuList from '../pages/kemu/list'
import kemuDetail from '../pages/kemu/detail'
import kemuAdd from '../pages/kemu/add'
import zhangjieList from '../pages/zhangjie/list'
import zhangjieDetail from '../pages/zhangjie/detail'
import zhangjieAdd from '../pages/zhangjie/add'
import shitikuList from '../pages/shitiku/list'
import shitikuDetail from '../pages/shitiku/detail'
import shitikuAdd from '../pages/shitiku/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'examPaper',
					component: ExamPaper
				},
				{
					path: 'examList',
					component:ExamList
				},
				{
					path: 'examRecord/:type',
					component:ExamRecord
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'timuleixing',
					component: timuleixingList
				},
				{
					path: 'timuleixingDetail',
					component: timuleixingDetail
				},
				{
					path: 'timuleixingAdd',
					component: timuleixingAdd
				},
				{
					path: 'kemu',
					component: kemuList
				},
				{
					path: 'kemuDetail',
					component: kemuDetail
				},
				{
					path: 'kemuAdd',
					component: kemuAdd
				},
				{
					path: 'zhangjie',
					component: zhangjieList
				},
				{
					path: 'zhangjieDetail',
					component: zhangjieDetail
				},
				{
					path: 'zhangjieAdd',
					component: zhangjieAdd
				},
				{
					path: 'shitiku',
					component: shitikuList
				},
				{
					path: 'shitikuDetail',
					component: shitikuDetail
				},
				{
					path: 'shitikuAdd',
					component: shitikuAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
		{
			path: '/exam',
			component: Exam
		}
	]
})
