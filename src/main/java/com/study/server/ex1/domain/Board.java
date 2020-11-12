package com.study.server.ex1.domain;

import javax.persistence.*;


@Entity
@Table(name = "board")
public class Board {
    @Id //행을 구별
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String title;
    @Column
    private String password;
    @Column
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", password='" + password + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
//마지막은 게임 실행 저장 -- 게임 서비스가 할 일은 게임결과 저장 및 응답=gameresult 저장할 값은 사용자가 입력한 값과 컴퓨터가 입력한값 그리고 게임 결과를 받아
// 처리한다. 그리고 변수를 하나 만들어주고 gameresult에 위의 값을 저장한 다음에 repository를 통해서 DB에 저장을 한다. =GameRepository 이미 만들어진 객체를
//주입받아 생성됨,,,? @Autowired를 통해 자동으로 설정
//DB에 저장 GameResult savedResult = gameRepository.save(gameResult;)
// return saveResult;
