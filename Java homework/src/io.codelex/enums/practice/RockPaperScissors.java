package io.codelex.enums.practice;

import java.util.Random;

public enum RockPaperScissors {
    ROCK('r'),
    PAPER('p'),
    SCISSORS('s'),
    QUIT('q');

    private final char move;

    RockPaperScissors(char move) {
        this.move = move;
    }

    public static RockPaperScissors getRpsByInt(int value){
        RockPaperScissors[] allMoves = RockPaperScissors.values();
        for(RockPaperScissors choice : allMoves){
            if(choice.ordinal() == value){
                return choice;
            }
        }
        return RockPaperScissors.PAPER;
    }

    public static RockPaperScissors getTheMove(char move){

        for(int i = 0; i< RockPaperScissors.values().length; i++){
            if(RockPaperScissors.values()[i].move == move){
                return RockPaperScissors.values()[i];
            }
        }
    return null;
    }




//    public static boolean doesPlayerWin(String playerMove, String computerMove){
//        return playerMove.equals(ROCK.move) && computerMove.equals(SCISSORS.move)
//                ||playerMove.equals(SCISSORS.move) && computerMove.equals(PAPER.move)
//                ||playerMove.equals(PAPER.move)&& computerMove.equals(ROCK.move);
//
//   }








}
