package org.koreait.board.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Data
@Entity
@IdClass(BoardView2.class)
public class BoardView2 {
    @Id
    private Long seq;

    @Id
    private int uid;
}
