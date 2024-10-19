유튜브 강의 참고하여 제작
================================================================

[스프링부트 기초 강좌](https://youtu.be/7t6tQ4KV37)


### JoinRequest.java
데이터베이스에 아이디, 이름, 전화번호를 출력 할때의 값을 저장

### MemberController.java
홈페이지 도메인으로 로직 호출
```
@PostMapping("/join")
    public String join(@RequestBody JoinRequest joinRequest){

        String result = memberService.join(joinRequest);

        if("success".equalsIgnoreCase(result)){
            return "success";
        }else{
            return "fail";
        }
    }
```

### Member.java
홈페이지에서 아이디, 이름, 전화번호를 입력받을 때의 값을 저장

### MemberRepository.interface
