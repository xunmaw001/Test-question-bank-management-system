const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmc975x/",
            name: "ssmc975x",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmc975x/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于Java的试题库管理系统"
        } 
    }
}
export default base
