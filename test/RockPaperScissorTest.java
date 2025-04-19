import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorTest {
    @Test
    void game1(){
        assertEquals("player1 is winner.",RockPaperScissor.findingWinner("scissor","paper"));
    }

    @Test
    void game2(){
        assertEquals("player1 is winner.",RockPaperScissor.findingWinner("paper","rock"));
    }
    @Test
    void game3(){
        assertEquals("player1 is winner.",RockPaperScissor.findingWinner("rock","scissor"));
    }

}