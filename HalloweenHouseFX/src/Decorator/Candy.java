package Decorator;

public abstract class Candy implements CandyBoxInterface{

        protected CandyBoxInterface tempBox;

        public Candy(CandyBoxInterface candyBox){
            tempBox = candyBox;
        }

        public String getDescription(){ return tempBox.getDescription();}

}
