package br.com.erudio.restwithspringbootandjavaerudio;



public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double subtraction(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public Double multiplication(Double numberOne, Double numberTwo)   {
        return numberOne * numberTwo;
    }

    public Double division(Double numberOne, Double numberTwo)  {
        return numberOne /numberTwo;
    }

    public Double average(Double numberOne, Double numberTwo)   {
        return (numberOne + numberTwo) / 2;
    }
    public Double source(Double number)  {
        return Math.sqrt(number);
    }
}
