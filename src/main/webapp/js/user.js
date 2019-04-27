new Vue({
    el:"#app",
    data: {
        user: {id:"",username:"",user:"",password:""},
        userList: []
    },
    methods:{
        findAll:function () {
            var _this = this;
            axios.get("/user/findAll").then(function (response) {
                _this.userList = response.data;
                console.log(_this.userList);
            }).catch(function (err) {
                console.log(err);
            });
        }
    },
    created(){
        console.log('lalal');
        this.findAll();
    }
});