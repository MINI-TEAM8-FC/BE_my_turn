<br>

<div align="center">

<img width="224" alt="오늘은 내차례" src="https://github.com/MINI-TEAM8-FC/BE_my_turn/assets/43840220/b1d3288f-b22c-4fc3-93a3-33744871fd95">

# 오늘은 내 차례! (My Turn) [🔗](https://my-turn.netlify.app)

사유는 필요없다! 당당히 손들고 오늘은 내 차례라고 말할 수 있는 연차 & 당직 관리 프로그램 

<br>

</div>

<br>

## 🧑🏻‍💻 백엔드 팀원 역할

 <table>
    <tbody>
      <tr>
        <td align="center"><a href="https://github.com/james-taeil">
          <img src="https://avatars.githubusercontent.com/u/71359732?v=4" width="200px;" alt=""/><br /><sub><b>김태일</b></sub></a><br />
        </td>
        <td align="center"><a href="https://github.com/sohn919">
          <img src="https://avatars.githubusercontent.com/u/84082544?v=4" width="200px;" alt=""/><br /><sub><b>손영준</b></sub></a><br />
        </td>
        <td align="center"><a href="https://github.com/miyounlee">
          <img src="https://avatars.githubusercontent.com/u/43840220?v=4" width="200px;" alt=""/><br /><sub><b>이미연</b></sub></a><br />
        </td>
        <td align="center"><a href="https://github.com/MebukiYamashi">
          <img src="https://avatars.githubusercontent.com/u/91310994?v=4" width="200px;" alt=""/><br /><sub><b>이성민</b></sub></a><br />
        </td>
      </tr>
      <tr>
        <td>
          회원정보 수정,<br />회원정보 조회,<br />프로젝트 초기세팅
        </td>
        <td>
          회원가입,<br />로그인,<br />JWT
        </td>
        <td>
          연차 / 당직 신청 및 취소,<br />연차 / 당직 조회,<br />서버 배포
        </td>
        <td>
          관리자 연차 / 당직 승인,<br />관리자 연차 / 당직 조회
        </td>
      </tr>
    </tbody>
  </table>
<br><br>

## 💡 프로그램 소개
### 사용자
- 메인캘린더 (모든 사원 혹은 개인 연차 & 당직 정보 조회)
- 회원가입
  - 이름, 이메일, 비밀번호 입력 후 가입
- 연차 & 당직 신청 및 취소
- 내 정보 수정
  - 이름, 비밀번호 수정 가능

### 관리자
- 모든 사원의 연차 & 당직 신청 정보 조회
- 신청된 연차 & 당직 승인 및 반려 결정

<br><br>

## ▶️ 프로젝트 시현

### 로그인 페이지

![로그인](https://github.com/MINI-TEAM8-FC/BE_my_turn/assets/43840220/8f2b31b0-0198-4a55-b357-9366dca4aa40)

<br>

### 회원 정보 수정

![회원정보수정](https://github.com/MINI-TEAM8-FC/BE_my_turn/assets/43840220/7a62bc52-ef42-4ba8-be4c-8cd256ab60a8)

<br>

### 관리자 연차 & 당직 승인 및 반려 

![관리자페이지](https://github.com/MINI-TEAM8-FC/BE_my_turn/assets/43840220/02910ea3-ad39-4b5a-bb2c-9694840c6a6f)


<br><br>

## 🛠️ 프로젝트에 사용한 기술 스택
<img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=flat-squre&logo=springboot&logoColor=white"> <img src="https://img.shields.io/badge/Spring Security-6DB33F?style=flat-squre&logo=springsecurity&logoColor=white"> 
<img src="https://img.shields.io/badge/Spring Data JPA-6DB33F?style=flat-squre&logo=spring&logoColor=white"> 

<img src="https://img.shields.io/badge/Java 11-FF160B?style=flat-squre&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/Gradle-02303A?style=flat-squre&logo=gradle&logoColor=white"> 
<img src="https://img.shields.io/badge/MySQL-4479A1?style=flat-squre&logo=mysql&logoColor=white">
<img src="https://img.shields.io/badge/Amazon AWS-41454A?style=flat-squre&logo=amazonaws&logoColor=white">

<br><br>


## 🔍 System Architecture
![Architecture](https://github.com/MINI-TEAM8-FC/BE_my_turn/assets/43840220/8af7775f-473e-40cf-8f94-9be5e373fd21)

<br><br>

## ⚙️ ERD
![erd](https://github.com/MINI-TEAM8-FC/BE_my_turn/assets/43840220/5bcd76c6-a09f-4dcb-93d3-1cfae845f18f)

<br><br>

## 📚 API 명세서
<table border="0">
	<th>기능</th>
	<th>URL</th>
  <th>Method</th>
	<tr>
	    <td>회원가입</td>
	    <td>/main</td>
      <td>GET</td>
	</tr>
	<tr>
	    <td>로그인</td>
	    <td>/user/join</td>
      <td>POST</td>
	</tr>
  <tr>
	    <td>이메일중복체크</td>
	    <td>/user/email</td>
      <td>POST</td>
	</tr>
  <tr>
	    <td>로그아웃</td>
	    <td>/user/logout</td>
      <td>POST</td>
	</tr>
  <tr>
	    <td>마이페이지</td>
	    <td>/user/myinfo</td>
      <td>GET</td>
  <tr>
	    <td>내 정보 수정</td>
	    <td>/user/myinfo</td>
      <td>PUT</td>
	</tr>
  <tr>
	    <td>연차/당직 신청</td>
	    <td>/user/event/add</td>
      <td>POST</td>
	</tr>
  <tr>
	    <td>연차/당직 신청 취소</td>
	    <td>/user/event/cancel/{id}</td>
      <td>POST</td>
	</tr>
  <tr>
	    <td>연차/당직 신청 현황</td>
	    <td>/user/event/myList</td>
      <td>GET</td>
	</tr>
  <tr>
	    <td>모든 유저 연차/당직 리스트</td>
	    <td>/user/event/list</td>
      <td>GET</td>
	</tr>
  <tr>
	    <td>연차 승인</td>
	    <td>/admin/leave/approval</td>
      <td>POST</td>
	</tr>
  <tr>
	    <td>당직 승인</td>
	    <td>/admin/duty/approval</td>
      <td>POST</td>
	</tr>
  <tr>
	    <td>연차/당직 신청 리스트</td>
	    <td>/admin/event/request</td>
      <td>GET</td>
	</tr>
</table>

