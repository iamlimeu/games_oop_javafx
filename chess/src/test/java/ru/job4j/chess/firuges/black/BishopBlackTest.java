package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.*;

class BishopBlackTest {

    @Test
    public void whenPositionIsTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D3);
        assertThat(bishopBlack.position()).isEqualTo(Cell.D3);
    }

    @Test
    public void whenCopyIsTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Figure copyOfBP = bishopBlack.copy(Cell.E3);
        assertThat(copyOfBP.position()).isEqualTo(Cell.E3);
    }

    @Test
    public void whenWayFromC1ToG5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] way = bishopBlack.way(Cell.G5);
        assertThat(way).isEqualTo(new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5});
    }
}