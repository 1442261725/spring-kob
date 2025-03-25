<template>
  <div>
    <div>{{ names }}</div>
    <div>{{ translation }}</div>
  </div>
  <router-view/>
</template>

<script>
import { ref } from "vue";
import $ from "jquery";
export default {
  name : 'App',
  setup:() =>{
    let names = ref('');
    let translation = ref('');

    $.ajax({
      url: "http://localhost:3000/pk/getbotinfo/",
      type: "GET",
      success(resp){
        names.value = resp.name,
        translation.value = resp.translation
      }
    })
    return {
      names,
      translation
    }
  }


}

</script>


<style>
  body{
    background-image: url("C:\Users\hp\Desktop\临时图片\u=2346598809,776133120&fm=253&fmt=auto&app=138&f=JPEG.jpeg");
    background-size: cover;
  }
</style>
