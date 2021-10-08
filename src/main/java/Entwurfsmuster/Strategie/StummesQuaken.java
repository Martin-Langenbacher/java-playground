package Entwurfsmuster.Strategie;

import Entwurfsmuster.Strategie.QuakVerhalten;

public class StummesQuaken implements QuakVerhalten {
    public void quaken(){
        System.out.println("<<Stille>>");
    }
}
